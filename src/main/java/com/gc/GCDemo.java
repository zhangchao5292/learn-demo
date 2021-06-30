package com.gc;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-16 06:37
 **/
public class GCDemo {

    private static final int _10MB = 1024 * 1024;

    public static void main(String[] args) {
        try {
            byte[] bytes = new byte[2 * _10MB];
            byte[] b2 = new byte[200 * _10MB];
            byte[] b3 = new byte[500 * _10MB];
            // 通知垃圾回收器回收垃圾
//            System.gc();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
