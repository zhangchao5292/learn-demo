package com.suanfa;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-29 08:54
 **/
public class Digui {

    public static void main(String[] args) {
        System.out.println(sum(100));

    }

    public static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

}
