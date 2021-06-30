package com.thread;

import java.util.concurrent.*;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 15:14
 **/
public class FutureDemo {


    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task2 task = new Task2();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);
        executor.submit(futureTask);
        executor.shutdown();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("主线程在执行任务");

        try {
            System.out.println("task运行结果 " + futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("所有任务执行完毕");
    }

    static class Task2 implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            System.out.println("子线程在进行计算");
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                sum += i;
            }
            return sum;
        }
    }
}
