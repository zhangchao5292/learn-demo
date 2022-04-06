package com.md;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-08 19:50
 **/
public class Sing {
    /**
     * Java内存模型：volatile
     * synchronized
     * 双重检查
     */

    private static volatile Sing sing = null;

    public Sing() {

    }

    /**
     * 双重检查：
     * 如果单例已经创建了，直接调用sjuynchronized加锁比较耗性能。所以首先判断有没有创建，没创建再加锁。
     * 第二层非空检查的原因是在同时多个线程调用时，A线程获得锁并创建成功实例，之后释放锁，前面一起竞争的B线程获得锁，首先判断非空，代表已经创建了，所以不会继续去创建实例
     * @return
     */
    public static Sing getInstance() {
        if (null == sing) {
            synchronized (Sing.class) {
                if (null == sing) {
                    sing = new Sing();
                }
            }
        }
        return sing;
    }

    public static void main(String[] args) {
        System.out.println(Sing.getInstance());
        System.out.println(Sing.getInstance());

        for (;;){
            System.out.println(1);
        }
    }
}
