package com.jichu;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-27 10:50
 **/
public class StringDemo {

//    https://www.jianshu.com/p/c7f47de2ee80

    public static void main(String[] args) {
        String a = "Hello world!";//常量池中拿对象
        String b = "Hello world!";
        String c = "Hello" + " world!";
        String d1 = "Hello";
        String d2 = " world!";
        String d = d1 + d2;
        String e = new String("Hello world!");//堆内存空间创建一个新的对象
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(d == a);
        System.out.println(a.equals(b));
        System.out.println(a.equals(e));
        System.out.println(a==e);//第一种方式是在常量池中拿对象，第二种方式是直接在堆内存空间创建一个新的对象。

//        String s1 = new String("xyz"); **创建了几个对象？

        StringBuffer stringBuffer=new StringBuffer();//final
        stringBuffer.append("a").append("c");//synchronized
        System.out.println(stringBuffer.toString());




    }
}
