package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 三个线程交替执行
 * @author chao.zhang
 */
public class PrintABCUsingLock {

    private int num;
    private static final Object LOCK = new Object();

    private void printLetter(int targetNum) {
        for (int i = 0; i < 10; i++) {
            synchronized (LOCK) {
                while (num % 3 != targetNum) {
                    try {
                        LOCK.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                num++;
                System.out.print(Thread.currentThread().getName());
                LOCK.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        PrintABCUsingLock loopThread = new PrintABCUsingLock();
        new Thread(() -> {
            loopThread.printLetter(0);
        }, "A").start();

        new Thread(() -> {
            loopThread.printLetter( 1);
        }, "B").start();

        new Thread(() -> {
            loopThread.printLetter(2);
        }, "C").start();
    }
}
