package com.suanfa;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-29 08:54
 **/
public class Digui {

    public static void main(String[] args) {
        System.out.println(sum(10));

    }

    public static int sum(int n) {
        if (n <= 2) {
            return 1;
        }
        System.out.println(n);
        return sum(n - 1) + sum(n - 2);
    }

}
