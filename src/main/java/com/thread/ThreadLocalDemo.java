package com.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @description:  https://segmentfault.com/a/1190000022335329
 * @author: chao.zhang
 * @create: 2021-06-27 07:36
 **/
public class ThreadLocalDemo {


//    成员变量会产生线程安全问题，局部变量不会有线程安全问题，因为局部变量是线程私有的，而成员变量是线程共享的。
//    高并发的时候，调用一些公有的对象资源的时候，会有线程安全的问题。解决线程安全问题：
//            （1）对成员变量进行加锁，这样的话其他线程要使用的话，就必须等待，耗时；
//            （2）把成员变量变成局部方法变量，很显然，这样的话不合理，设置为局部变量，就不能在各个方法中使用了。
//    这个时候可以使用ThreadLocal来解决。ThreadLocal是并发场景下用来解决变量共享问题的类，
//    它能使原本线程间共享的对象进行线程隔离，即一个对象只对一个线程可见，特别适用于各个线程依赖不同的变量值完成操作的场景。
    private static ThreadLocal<String> threadLocal=new ThreadLocal<>();
    private static ExecutorService pool = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
//        同一个ThreadLocal变量在父线程中被设置值后，在子线程中是获取不到的，因为threadLocals中为当前调用线程对应的本地变量。
//        如果子线程要访问父线程的本地变量怎么办呢？可以使用InheritableThreadLocal来解决，
//        InheritableThreadLocal类继承了ThreadLocal，并且重写了childValue、getMap、createMap三个方法。

        //主线程设置
        threadLocal.set("xiaowang");
        System.out.println(threadLocal.get());
        threadLocal.remove();
        //子线程设置，主线程获取不到变量
        pool.execute(()->threadLocal.set("小王"));
        System.out.println(threadLocal.get());

        pool.execute(()->{
            threadLocal.set("小王");
            System.out.println(threadLocal.get());
        });






    }


}
