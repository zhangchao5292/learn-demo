package com.thread;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-17 11:56
 **/
public class JoinDemo {

    /**
     * 通过join保证线程执行有序性
     *
     * @throws Exception
     */
    public static void get() throws Exception {
        Runnable a = () -> {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread 1 start");
        };
        Runnable b = () -> System.out.println("Thread 2 start");
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t1.join();
        t2.start();
        t2.join();

    }

    public static void main(String[] args) throws Exception {
        get();
    }

}
