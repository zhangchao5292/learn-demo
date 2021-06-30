package com.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 14:05
 **/
public class CountDownLatchDemo {

    public static void aync() throws Exception {
        // 创建 2 个线程的线程池
        Executor executor = Executors.newFixedThreadPool(2);
        // 计数器初始化为 2
        CountDownLatch latch = new CountDownLatch(2);
        // 查询未对账订单
        executor.execute(() -> {
//            pos = getPOrders();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("查询未对账订单");
            latch.countDown();
        });
        // 查询派送单
        executor.execute(() -> {
//            dos = getDOrders();
            System.out.println("查询派送单");
            latch.countDown();
        });

        // 等待两个查询操作结束
        latch.await();

        // 执行对账操作
//        diff = check(pos, dos);
        // 差异写入差异库
//        save(diff);
    }

    public static void main(String[] args) throws Exception {
        aync();
    }
}
