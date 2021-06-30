package com.thread;

import com.google.common.util.concurrent.RateLimiter;

/**
 * @description: 限流
 * @author: chao.zhang
 * @create: 2021-06-17 15:35
 **/
public class RateLimiterDemo {

//    public static void main(String[] args) {
//        // 限流器流速：2 个请求 / 秒
//        RateLimiter limiter = RateLimiter.create(2);
//// 执行任务的线程池
//        ExecutorService es = Executors.newFixedThreadPool(1);
//// 记录上一次执行时间
//        final long[] prev = {System.nanoTime()};
//// 测试执行 20 次
//        for (int i = 0; i < 20; i++) {
//            // 限流器限流
//            limiter.acquire();
//            // 提交任务异步执行
//            es.execute(() -> {
//                long cur = System.nanoTime();
//                // 打印时间间隔：毫秒
//                System.out.println((cur - prev[0]) / 1000_000);
//                prev[0] = cur;
//            });
//        }
//    }


    public static void main(String[] args) {
        RateLimiter r = RateLimiter.create(2);
        while (true) {
            if (r.tryAcquire()){
                System.out.println("get 1 tokens: " + r.acquire() + "s");
            }else {
//                System.out.println("fail.....");
            }
        }
    }

}
