package com.design.template;

import com.design.CookTemplate;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-25 19:14
 **/
public class CookTest2 extends CookTemplate {


    @Override
    public void pourVegetable() {
        System.out.println("-----青椒鸡蛋------");
    }

    @Override
    public void pourSauce() {
        System.out.println("------十三香-----");
    }

    public static void main(String[] args) {
        CookTest2 cookTest = new CookTest2();
        cookTest.cookProcess();
    }
}
