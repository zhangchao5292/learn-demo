package com.limit;

/**
 * @description: 固定窗口算法
 * @author: chao.zhang
 * @create: 2021-06-17 17:28
 **/
public class CounterRateLimiter extends MyRateLimiter {
    /**
     * 每秒限制请求数
     */
    private final long permitsPerSecond;
    /**
     * 上一个窗口的开始时间
     */
    public long timestamp = System.currentTimeMillis();
    /**
     * 计数器
     */
    private int counter;

    public CounterRateLimiter(long permitsPerSecond, int counter) {
        this.permitsPerSecond = permitsPerSecond;
        this.counter = counter;
    }

    @Override
    public synchronized boolean tryAcquire() {
        long now = System.currentTimeMillis();
        // 窗口内请求数量小于阈值，更新计数放行，否则拒绝请求
        if (now - timestamp < 1000) {
            if (counter < permitsPerSecond) {
                counter++;
                return true;
            } else {
                return false;
            }
        } else {
            // 时间窗口过期，重置计数器和时间戳
            counter = 0;
            timestamp = now;
            return true;

        }
    }
}
