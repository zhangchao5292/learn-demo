package com.thread;



import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 16:45
 **/
public class TokenBucketLimiter {
    //上一次令牌发放的时间
    public static long lastTime = System.currentTimeMillis();
    //桶的容量
    public static int capacity = 2;
    //令牌生成速度个/秒
    public static int rate = 2;
    //当前令牌的数量
    public static int tokens;

    //返回值说明

    /**
     * false:没有被限制
     * true:被限流
     *
     * @param taskId
     * @return
     */
    public static synchronized boolean tryAcquire(long taskId, int applyCount) {
        long now = System.currentTimeMillis();
        //时间间隔
        long gap = now - lastTime;
        //当前令牌数
        tokens = Math.min(capacity, (int) (tokens + gap * rate / 1000));
//        log.info("tokens {} capacity {} gap {}", tokens, capacity, gap);
        if (tokens < applyCount) {
//            log.info("被限流了.. {} ,applyCount:{}", taskId, applyCount);
            return true;
        } else {
            tokens -= applyCount;
            lastTime = now;
//            log.info("剩余令牌.." + tokens);
            return false;
        }
    }

    private static ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void testLimit() {
        AtomicInteger limited = new AtomicInteger(0);
        final int threads = 2;
        final int turns = 20;
        CountDownLatch countDownLatch = new CountDownLatch(threads);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threads; i++) {
            pool.submit(() -> {
                try {
                    for (int j = 0; j < turns; j++) {
                        long taskId = Thread.currentThread().getId();
                        boolean isLimited = tryAcquire(taskId, 1);
                        if (isLimited) {
                            limited.getAndIncrement();
                        }
                        Thread.sleep(200);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        float time = (System.currentTimeMillis() - start) / 1000F;
//        log.info("限制次数为：" + limited.get() + "，通过次数为:" + (threads * turns - limited.get()));
//        log.info("限制比例为：" + (float) limited.get() / ((float) threads * turns));
//        log.info("运行时长：" + time);
    }

    public static void main(String[] args) {
        testLimit();
    }
}
