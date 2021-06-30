package com.limit;

/**
 * @description: 令牌桶算法
 * @author: chao.zhang
 * @create: 2021-06-17 19:21
 **/
public class TokenBucketRateLimiter {

    long capacity;                      // 桶的容量
    long rate;                          // 令牌发放速率, permits-per-second
    long currentTokenNum;               // 当前桶中的令牌数量
    long lastAddTokenTime;              // 上次补充令牌的时间

    public TokenBucketRateLimiter(long capacity, long rate) {
        this.capacity = capacity;
        this.rate = rate;
        currentTokenNum = capacity;
        lastAddTokenTime = System.currentTimeMillis();
    }

    public boolean acquire() {
        return acquire(1);
    }

    public boolean acquire(int permits) {
        //1.获取令牌数量是否足够
        if (permits > currentTokenNum) {
            long accessTime = System.currentTimeMillis();
            long durationMs = accessTime - lastAddTokenTime;
            //补充令牌数
            long newTokenNum = (long) (durationMs * rate * 1.0 / 1000);
            System.out.println("newTokenNum " + newTokenNum+"--"+currentTokenNum);
            if (newTokenNum > 0) {
                currentTokenNum = Math.min(currentTokenNum + newTokenNum, capacity);
                this.lastAddTokenTime = accessTime;
            }
            if (permits > currentTokenNum) return false;
        }
        this.currentTokenNum -= permits;
        return true;
    }


    public static void main(String[] args) {
        TokenBucketRateLimiter tokenBucketRateLimiter = new TokenBucketRateLimiter(5, 2);
        for (int i = 0; i < 10; i++) {
            boolean b = tokenBucketRateLimiter.acquire();
            System.out.println(b);
        }

    }

}
