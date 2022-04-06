package com.springmy.proxy;

/**
 * @author chao.zhang
 */
public class PersonClass implements PersonInterface{

    @Override
    public void sayHello() {
        System.out.println("Hi,Hi,Hi");
    }
}
