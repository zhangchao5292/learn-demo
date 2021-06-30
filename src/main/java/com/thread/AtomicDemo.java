package com.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 14:42
 **/
public class AtomicDemo {


    public static void main(String[] args) {
        Executor executor = Executors.newFixedThreadPool(2);
        AtomicInteger atomicInteger = new AtomicInteger(10);
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                int c = atomicInteger.decrementAndGet();
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("runable A " + c);
            });
        }
        for (int i = 0; i < 5; i++) {
            executor.execute(() -> {
                int t = atomicInteger.decrementAndGet();//解决 ABA 问题的思路其实很简单，增加一个版本号维度就可以了
                System.out.println("runable B " + t);
            });
        }

    }

}
