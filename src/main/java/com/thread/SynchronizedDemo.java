package com.thread;

import com.entity.Person;
import org.checkerframework.checker.units.qual.A;

import java.util.Arrays;

/**
 * @author chao.zhang
 */
public class SynchronizedDemo {

    public synchronized String getA() {
        while (true) {
            System.out.println("----");
        }
    }

    public synchronized String getB() {
        while (true) {
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }

    public static void main(String[] args) {
//        Person person = new Person();
        SynchronizedDemo a = new SynchronizedDemo();
        a.test();
    }

    public void test(){
        Person person = null;
        setAttribute(person);
        System.out.println(person);
    }
    private void setAttribute(Person b) {
       b= new Person();
       b.setAge(12);
       b.setName("abd");
    }

}