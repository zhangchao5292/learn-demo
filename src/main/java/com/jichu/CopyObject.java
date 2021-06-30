package com.jichu;

import com.entity.Person;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-16 15:47
 **/
public class CopyObject {

    public static void main(String[] args) {
        Person person = new Person();
//        引用拷贝:创建一个指向对象的引用变量的拷贝。
        Person p2 = person;//引用拷贝，地址值一样
        System.out.println(person == p2);

//        对象拷贝: 创建了新的对象， 而不是把原对象的地址赋给了一个新的引用变量,这就叫做对象拷贝。注：深拷贝和浅拷贝都是对象拷贝


    }

}
