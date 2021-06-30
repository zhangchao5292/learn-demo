package com.design.template;

import com.design.CookTemplate;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-25 19:14
 **/
public class CookTest extends CookTemplate {


    @Override
    public void pourVegetable() {
        System.out.println("-----小白菜------");
    }

    @Override
    public void pourSauce() {
        System.out.println("------醋-----");
    }

    public static void main(String[] args) {
        CookTest cookTest = new CookTest();
        cookTest.cookProcess();
    }
}
