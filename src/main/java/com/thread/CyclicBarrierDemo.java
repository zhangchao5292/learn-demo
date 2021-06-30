package com.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 14:18
 **/
public class CyclicBarrierDemo {

    public static void aync() throws Exception {
        // 创建 2 个线程的线程池
        Executor executor = Executors.newFixedThreadPool(2);
        // 计数器初始化为 2
        CyclicBarrier cb = new CyclicBarrier(2, new Runnable() {
            @Override
            public void run() {
                System.out.println("回调执行。。。");
            }
        });
        // 查询未对账订单
        executor.execute(() -> {
//            pos = getPOrders();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("查询未对账订单");
            try {
                cb.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });
        // 查询派送单
        executor.execute(() -> {
//            dos = getDOrders();
            System.out.println("查询派送单");
            try {
                cb.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        });

        // 执行对账操作
//        diff = check(pos, dos);
        // 差异写入差异库
//        save(diff);
    }

    public static void main(String[] args) throws Exception {
        aync();
    }


}
