package com.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 11:17
 **/
public class LockDemo {

    //可重入锁
    private final Lock rtl = new ReentrantLock();

    int value;

    public int get() {
        // 获取锁
        rtl.lock();//②
        try {
            System.out.println("get "+value);
            return value;
        } finally {
            // 保证锁能释放
            rtl.unlock();
        }
    }

    public void addOne() {
        // 获取锁
        rtl.lock();//①
        try {
            value = 1 + get();
            System.out.println("addOne "+value);
        } finally {
            // 保证锁能释放
            rtl.unlock();
        }
    }

    public static void main(String[] args) {
        LockDemo lockDemo=new LockDemo();
//        当线程 T1 执行到 ① 处时，已经获取到了锁 rtl ，当在 ① 处调用 get() 方法时，会在 ② 再次对锁 rtl 执行加锁操作。此时，如果锁 rtl 是可重入的，那么线程 T1 可以再次加锁成功；
        lockDemo.addOne();
        Integer a=new Integer(12);

    }
}
