package com.jichu;

import com.entity.Person;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-26 18:25
 **/
public class EqualsAndHashCode {

    public static void main(String[] args) {
        Object a = new Object();
        Object b = new Object();
//        通过判断两个对象的地址是否相等(即，是否是同一个对象)来区分它们是否相等
//        public boolean equals(Object obj) {
//            return (this == obj);
//        }
        System.out.println(a.equals(b));
//        下面根据“类是否覆盖equals()方法”，将它分为2类。
//        (01) 若某个类没有覆盖equals()方法，当它的通过equals()比较两个对象时，实际上是比较两个对象是不是同一个对象。这时，等价于通过“==”去比较这两个对象。
//        调用的Object.java的equals()方法，即调用的 (p1==p2) 。它是比较“p1和p2是否是同一个对象”
//        (02) 我们可以覆盖类的equals()方法，来让equals()通过其它方式比较两个对象是否相等。通常的做法是：若两个对象的内容相等，则equals()方法返回true；否则，返回fasle。
        Person p1 = new Person("tom", 2);
        Person p2 = new Person("tom", 2);

        System.out.println(p1.equals(p2));

//        将一个对象的属性赋值到另一个对象的情况，这种情况就叫做拷贝
        //引用拷贝 深拷贝 浅拷贝
        Person p=p1;
        System.out.println( p==p1);//引用拷贝  引用拷贝会生成一个新的对象引用地址，但是两个最终指向依然是同一个对象

        Map<Integer,Integer> map= Maps.newHashMap();
        map.put(null,null);
        System.out.println(map);
        try {
            Map<Object, Object> objectObjectConcurrentMap = Maps.newConcurrentMap();
            objectObjectConcurrentMap.put(null,null);
            System.out.println(objectObjectConcurrentMap);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
