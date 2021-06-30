package com.suanfa;

import java.util.Random;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-27 21:09
 **/
public class KuHao {

    private static int random = new Random().nextInt(10);
    static final int t = random;

    public static void main(String[] args) {
        final int one = random;
        System.out.println(random);
        System.out.println(t);

    }

}
