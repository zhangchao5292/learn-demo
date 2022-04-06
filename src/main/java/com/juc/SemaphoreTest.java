package com.juc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @description: 信号量
 * @author: chao.zhang
 * @create: 2021-07-01 08:48
 **/
public class SemaphoreTest {
    //初始化为1,互斥信号量
    private final static Semaphore mutex = new Semaphore(1);

    public static void main(String[] args) {
        // 线程池
        ExecutorService exec = Executors.newCachedThreadPool();
        //设置信号量同时执行的线程数是5
        final Semaphore semp = new Semaphore(2);
        // 模拟20个客户端访问
        for (int index = 0; index < 20; index++) {
            final int NO = index;
            Runnable run = () -> {
                try {
                    //使用acquire()获取锁
                    mutex.acquire();
                    System.out.println("Accessing: " + NO);
                    //睡眠1秒
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //使用完成释放锁
                    mutex.release();
                }
            };
            exec.execute(run);
//            在创建Semaphore时初始化5个许可，这也就意味着同一个时间点允许5个线程进行共享资源访问，使用acquire()方法为每个线程获取许可，
//            并进行休眠1秒，如果5个许可已被分配完，新到来的线程将进入等待状态。如果线程顺利完成操作将通过release()方法释放许可，我们执行代码，可以发现每隔1秒几乎同一时间出现5条线程访
        }
        // 退出线程池
        exec.shutdown();
    }
}
