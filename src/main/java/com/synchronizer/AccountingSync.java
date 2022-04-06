package com.synchronizer;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-07-02 14:59
 **/
public class AccountingSync implements Runnable {
    //共享资源(临界资源)
    static int i = 0;
    static AccountingSync instance = new AccountingSync();

    /**
     * 修饰静态方法：作用于当前类对象(Class对象，每个类都有一个Class对象)，进入同步代码前要获得当前类对象（Class对象）的锁
     */
    public static synchronized void increase() {
        i++;
    }

    /**
     * 修饰实例方法：作用于当前实例加锁，进入同步代码前要获得当前实例的锁
     * 非静态,访问时锁不一样不会发生互斥,但我们应该意识到这种情况下可能会发现线程安全问题(操作了共享静态变量i)。
     */
    public synchronized void increase4Obj() {
        i++;
    }
//
//    @Override
//    public void run() {
//        for(int j=0;j<1000;j++){
//            increase();
//            System.out.println(Thread.currentThread().getName()+"  "+i);
//        }
//    }

    //    修饰代码块：指定加锁对象，对给定对象加锁，进入同步代码库前要获得给定对象的锁。
    @Override
    public void run() {
        //省略其他耗时操作....
        //使用同步代码块对变量i进行同步操作,锁对象为instance
        synchronized (instance) {
            for (int j = 0; j < 1000000; j++) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(instance, "t1");
        Thread t2 = new Thread(instance, "t2");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(i);
    }
}
