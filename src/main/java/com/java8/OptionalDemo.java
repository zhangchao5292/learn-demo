package com.java8;

import com.alibaba.fastjson.JSON;
import com.entity.Person;

import java.util.Optional;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-10 14:25
 **/
public class OptionalDemo {

    public static void main(String[] args) {
//        of() 为非 null 的值创建一个 Optional 实例
//        isPresent() 如果值存在，返回 true，否则返回 false
//        get() 返回该对象，有可能返回 null
//        OfNullable() 如果指定的值为 null，返回一个空的 Optional


        Person person = null;
        Person tom = Optional.ofNullable(person)
                .filter(a -> a.getAge() > 0)
                .orElseGet(() -> new Person("tom", 2));
        System.out.println(JSON.toJSON(tom));

        Optional<Person> p = Optional.ofNullable(person);//该方法和 of 方法的区别在于，传入的参数可以为 null
        System.out.println(p.isPresent());

        try {
            Optional<Person> person1 = Optional.of(person);//非 null 的 value 来构造一个 Optional，
            Person person2 = person1.get();

            person1.ifPresent(a -> {//如果option对象保存的值不是null，则调用consumer对象，否则不调用
                System.out.println("test");
            });
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
