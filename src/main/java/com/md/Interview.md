# **Interview**

## **Level 1**

### Java基础

1. 重载和重写的区别？

override（重写）

1、方法名、参数、返回值相同。

2、子类方法不能缩小父类方法的访问权限。

3、子类方法不能抛出比父类方法更多的异常(但子类方法可以不抛出异常)。

4、存在于父类和子类之间。

5、方法被定义为final不能被重写。

overload（重载）

1、参数类型、个数、顺序至少有一个不相同。

2、不能重载只有返回值不同的方法名。

3、存在于父类和子类、同类中。


2. String 和 StringBuffer、StringBuilder 的区别是什么？String 为什么是不可变的？

String是字符串常量，是不可改变的，对该字符串操作都会产生一个新的字符串常量。
StringBuffer和StringBuilder（JDK5.0之后）是字符串变量，每次操作是对本身的字符串操作，前者是线程安全，后者是线程不安全，由这点可以知道，前者的效率会比后者的效率低。
String的本质是一个char数组，是对字符串数组的封装，并且是被final修饰的，创建后不可改变。
https://www.cnblogs.com/wkfvawl/p/11693260.html 

3. 自动装箱与拆箱？
装箱就是  自动将基本数据类型转换为包装器类型；拆箱就是  自动将包装器类型转换为基本数据类型。
在通过valueOf方法创建Integer对象的时候，如果数值在[-128,127]之间，便返回指向IntegerCache.cache中已经存在的对象的引用；否则创建一个新的Integer对象。
上面的代码中i1和i2的数值为100，因此会直接从cache中取已经存在的对象，所以i1和i2指向的是同一个对象，而i3和i4则是分别指向不同的对象。

 Integer i1 = 100;
        Integer i2 = 100;
        Integer i3 = 200;
        Integer i4 = 200;
         
        System.out.println(i1==i2);
        System.out.println(i3==i4);

4. == 与 equals区别？

1、equals()：用来检测两个对象是否相等，即两个对象的内容是否相等。

2、==：用于比较引用和比较基本数据类型时具有不同的功能，具体如下：

（1）、基础数据类型：比较的是他们的值是否相等，比如两个int类型的变量，比较的是变量的值是否一样。

（2）、引用数据类型：比较的是引用的地址是否相同，比如说新建了两个User对象，比较的是两个User的地址是否一样。


5. final关键字是怎样使用的？
　　在Java中，final关键字可以用来修饰类、方法和变量（包括成员变量和局部变量）。下面就从这三个方面来了解一下final关键字的基本用法。

　　对于一个final变量，如果是基本数据类型的变量，则其数值一旦在初始化之后便不能更改；如果是引用类型的变量，则在对其初始化之后便不能再让其指向另一个对象。


6. Object有哪些方法？
7. 有没有重写过hashcode方法？为什么
8. Java中的异常
9. try catch finally执行，finally什么时候不会执行？
10. 接口和抽象类的区别是什么？
11. NIO和BIO和AIO有什么区别？

### Java集合

1. Arraylist 与 LinkedList的区别
2. HashMap底层实现
3. HashMap的长度为什么是2的幂次方
4. HashMap多线程操作导致的死循环问题是什么
5. HashSet和HashMap区别
6. ConcurrentHashMap的底层实现

### Java多线程

1. Java实现多线程的几种方式
2. sleep和wait方法的区别？
3. Synchronized关键字是怎么使用的
4. Synchronized关键字的底层原理
5. JDK1.6之后Synchronized的优化
6. Concurrent包下面都用过什么？
7. Synchronized和Lock的区别
8. Java内存模型
9. Synchronized关键字和Volatile关键字区别
10. volatile关键字是如何保证内存可见性的？
11. 为什么要使用线程池
12. 线程池的参数
13. Atomic原子类原理
14. AQS原理

### JVM

1. JVM运行时数据区
2. Java中的垃圾回收算法
3. Java中的垃圾回收器介绍
4. CMS和G1有什么区别？
5. 类加载机制？
6. 为什么要有双亲委派机制？

### 网络协议

1. TCP和UDP区别
2. TCP如何保证可靠性传输？
3. TCP三次握手和四次挥手
4. 为什么要三次握手和四次挥手
5. 浏览器中输入url显示主页的过程

### Mysql

1. MyISAM与InnoDB有什么区别
2. 索引的优点
3. 使用索引的注意事项
4. 建立索引需要哪些原则
5. B+树索引
6. Mysql事务的特性
7. Mysql有哪些锁

### Redis

1. 使用的数据结构有哪些
2. 内部的数据结构有哪些
3. key的过期策略有哪些
4. 内存淘汰机制有哪些
5. Redis持久化方式有哪些
6. 什么是缓存穿透？
7. 什么是缓存雪崩？
8. 什么是缓存击穿？

### Spring

1. IOC原理
2. AOP原理
3. JDK动态代理和CGlib动态代理的区别
4. Spring MVC工作流程

### 消息队列

1. 消息队列有什么好处
2. ActiveMQ和RabbitMQ和Kakfa和RocketMQ的区别以及选择
3. 如何保证消息不被重复消费？
4. 如何保证消息可靠性传输？
5. 如何保证从消息队列里面的数据按照顺序执行？
6. 如何解决消息队列的延迟问题以及过期失效问题？

### 操作系统

1. 进程和线程有什么区别？
2. 进程间通信方式？

## **Level 2**

### **Java基础**

1. [什么是面向对象？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%EF%BC%9F)
2. [JDK、JRE、JVM 分别是什么关系？](http://svip.iocoder.cn/Java/Core/Interview/#JDK%E3%80%81JRE%E3%80%81JVM-%E5%88%86%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88%E5%85%B3%E7%B3%BB%EF%BC%9F)
3. [什么是字节码？采用字节码的最大好处是什么？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%AD%97%E8%8A%82%E7%A0%81%EF%BC%9F%E9%87%87%E7%94%A8%E5%AD%97%E8%8A%82%E7%A0%81%E7%9A%84%E6%9C%80%E5%A4%A7%E5%A5%BD%E5%A4%84%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
4. [Java 中的几种基本数据类型是什么？各自占用多少字节？](http://svip.iocoder.cn/Java/Core/Interview/#Java-%E4%B8%AD%E7%9A%84%E5%87%A0%E7%A7%8D%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F%E5%90%84%E8%87%AA%E5%8D%A0%E7%94%A8%E5%A4%9A%E5%B0%91%E5%AD%97%E8%8A%82%EF%BC%9F)
5. [String、StringBuffer、StringBuilder 的区别？](http://svip.iocoder.cn/Java/Core/Interview/#String%E3%80%81StringBuffer%E3%80%81StringBuilder-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
6. [什么是自动拆装箱？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E8%87%AA%E5%8A%A8%E6%8B%86%E8%A3%85%E7%AE%B1%EF%BC%9F)
7. [equals 与 == 的区别？](http://svip.iocoder.cn/Java/Core/Interview/#equals-%E4%B8%8E-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
8. [final、finally、finalize 的区别？](http://svip.iocoder.cn/Java/Core/Interview/#final%E3%80%81finally%E3%80%81finalize-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
9. [抽象类和接口有什么区别？](http://svip.iocoder.cn/Java/Core/Interview/#%E6%8A%BD%E8%B1%A1%E7%B1%BB%E5%92%8C%E6%8E%A5%E5%8F%A3%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
10. [讲讲类的实例化顺序？](http://svip.iocoder.cn/Java/Core/Interview/#%E8%AE%B2%E8%AE%B2%E7%B1%BB%E7%9A%84%E5%AE%9E%E4%BE%8B%E5%8C%96%E9%A1%BA%E5%BA%8F%EF%BC%9F)
11. [什么是内部类？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%86%85%E9%83%A8%E7%B1%BB%EF%BC%9F)
12. [什么是 Java IO ？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Java-IO-%EF%BC%9F)
13. [什么是 Java 序列化？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Java-%E5%BA%8F%E5%88%97%E5%8C%96%EF%BC%9F)
14. [如何实现对象克隆？](http://svip.iocoder.cn/Java/Core/Interview/#%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E5%AF%B9%E8%B1%A1%E5%85%8B%E9%9A%86%EF%BC%9F)
15. [error 和 exception 有什么区别？CheckedException 和 RuntimeException 有什么区别？](http://svip.iocoder.cn/Java/Core/Interview/#error-%E5%92%8C-exception-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9FCheckedException-%E5%92%8C-RuntimeException-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
16. [说说反射的用途及实现？](http://svip.iocoder.cn/Java/Core/Interview/#%E8%AF%B4%E8%AF%B4%E5%8F%8D%E5%B0%84%E7%9A%84%E7%94%A8%E9%80%94%E5%8F%8A%E5%AE%9E%E7%8E%B0%EF%BC%9F)
17. [什么是注解？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%B3%A8%E8%A7%A3%EF%BC%9F)
18. [什么时候用断言（assert）？](http://svip.iocoder.cn/Java/Core/Interview/#%E4%BB%80%E4%B9%88%E6%97%B6%E5%80%99%E7%94%A8%E6%96%AD%E8%A8%80%EF%BC%88assert%EF%BC%89%EF%BC%9F)
19. [Java 对象创建的方式？](http://svip.iocoder.cn/Java/Core/Interview/#Java-%E5%AF%B9%E8%B1%A1%E5%88%9B%E5%BB%BA%E7%9A%84%E6%96%B9%E5%BC%8F%EF%BC%9F)
20. [彩蛋](http://svip.iocoder.cn/Java/Core/Interview/#%E5%BD%A9%E8%9B%8B)

### **Java集合**

1. [Java 集合框架有哪些？](http://svip.iocoder.cn/Java/Collection/Interview/#Java-%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
2. [Java 集合框架的基础接口有哪些？](http://svip.iocoder.cn/Java/Collection/Interview/#Java-%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6%E7%9A%84%E5%9F%BA%E7%A1%80%E6%8E%A5%E5%8F%A3%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
3. [什么是迭代器(Iterator)？](http://svip.iocoder.cn/Java/Collection/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E8%BF%AD%E4%BB%A3%E5%99%A8-Iterator-%EF%BC%9F)
4. [Comparable 和 Comparator 的区别?](http://svip.iocoder.cn/Java/Collection/Interview/#Comparable-%E5%92%8C-Comparator-%E7%9A%84%E5%8C%BA%E5%88%AB)
5. [有哪些关于 Java 集合框架的最佳实践？](http://svip.iocoder.cn/Java/Collection/Interview/#%E6%9C%89%E5%93%AA%E4%BA%9B%E5%85%B3%E4%BA%8E-Java-%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6%E7%9A%84%E6%9C%80%E4%BD%B3%E5%AE%9E%E8%B7%B5%EF%BC%9F)

#### [区别](http://svip.iocoder.cn/Java/Collection/Interview/#%E5%8C%BA%E5%88%AB)

1. [List 和 Set 区别？](http://svip.iocoder.cn/Java/Collection/Interview/#List-%E5%92%8C-Set-%E5%8C%BA%E5%88%AB%EF%BC%9F)
2. [List 和 Map 区别？](http://svip.iocoder.cn/Java/Collection/Interview/#List-%E5%92%8C-Map-%E5%8C%BA%E5%88%AB%EF%BC%9F)
3. [Array 和 ArrayList 有何区别？什么时候更适合用 Array？](http://svip.iocoder.cn/Java/Collection/Interview/#Array-%E5%92%8C-ArrayList-%E6%9C%89%E4%BD%95%E5%8C%BA%E5%88%AB%EF%BC%9F%E4%BB%80%E4%B9%88%E6%97%B6%E5%80%99%E6%9B%B4%E9%80%82%E5%90%88%E7%94%A8-Array%EF%BC%9F)
4. [ArrayList 与 LinkedList 区别？](http://svip.iocoder.cn/Java/Collection/Interview/#ArrayList-%E4%B8%8E-LinkedList-%E5%8C%BA%E5%88%AB%EF%BC%9F)
5. [ArrayList 与 Vector 区别？](http://svip.iocoder.cn/Java/Collection/Interview/#ArrayList-%E4%B8%8E-Vector-%E5%8C%BA%E5%88%AB%EF%BC%9F)
6. [HashMap 和 Hashtable 的区别？](http://svip.iocoder.cn/Java/Collection/Interview/#HashMap-%E5%92%8C-Hashtable-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
7. [HashSet 和 HashMap 的区别？](http://svip.iocoder.cn/Java/Collection/Interview/#HashSet-%E5%92%8C-HashMap-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
8. [HashSet 和 TreeSet 的区别？](http://svip.iocoder.cn/Java/Collection/Interview/#HashSet-%E5%92%8C-TreeSet-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
9. [HashMap 和 ConcurrentHashMap 的区别？](http://svip.iocoder.cn/Java/Collection/Interview/#HashMap-%E5%92%8C-ConcurrentHashMap-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
10. [队列和栈是什么，列出它们的区别？](http://svip.iocoder.cn/Java/Collection/Interview/#%E9%98%9F%E5%88%97%E5%92%8C%E6%A0%88%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%8C%E5%88%97%E5%87%BA%E5%AE%83%E4%BB%AC%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)

#### [原理](http://svip.iocoder.cn/Java/Collection/Interview/#%E5%8E%9F%E7%90%86)

1. [HashMap 的工作原理是什么？](http://svip.iocoder.cn/Java/Collection/Interview/#HashMap-%E7%9A%84%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [HashSet 的工作原理是什么？](http://svip.iocoder.cn/Java/Collection/Interview/#HashSet-%E7%9A%84%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [EnumSet 是什么？](http://svip.iocoder.cn/Java/Collection/Interview/#EnumSet-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
4. [TODO TreeMap 原理](http://svip.iocoder.cn/Java/Collection/Interview/#TODO-TreeMap-%E5%8E%9F%E7%90%86)
5. [Java Priority Queue 是什么?](http://svip.iocoder.cn/Java/Collection/Interview/#Java-Priority-Queue-%E6%98%AF%E4%BB%80%E4%B9%88)
6. [彩蛋](http://svip.iocoder.cn/Java/Collection/Interview/#%E5%BD%A9%E8%9B%8B)

### **Java并发**

1. [简述线程、进程、程序的基本概念？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E7%AE%80%E8%BF%B0%E7%BA%BF%E7%A8%8B%E3%80%81%E8%BF%9B%E7%A8%8B%E3%80%81%E7%A8%8B%E5%BA%8F%E7%9A%84%E5%9F%BA%E6%9C%AC%E6%A6%82%E5%BF%B5%EF%BC%9F)
2. [什么是多线程上下文切换？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%A4%9A%E7%BA%BF%E7%A8%8B%E4%B8%8A%E4%B8%8B%E6%96%87%E5%88%87%E6%8D%A2%EF%BC%9F)
3. [线程的生命周期？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E7%BA%BF%E7%A8%8B%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F%EF%BC%9F)
4. [创建线程的方式及实现？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%88%9B%E5%BB%BA%E7%BA%BF%E7%A8%8B%E7%9A%84%E6%96%B9%E5%BC%8F%E5%8F%8A%E5%AE%9E%E7%8E%B0%EF%BC%9F)
5. [如何使用 wait + notify 实现通知机制？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-wait-notify-%E5%AE%9E%E7%8E%B0%E9%80%9A%E7%9F%A5%E6%9C%BA%E5%88%B6%EF%BC%9F)
6. [sleep、join、yield 方法有什么区别？](http://svip.iocoder.cn/Java/Concurrent/Interview/#sleep%E3%80%81join%E3%80%81yield-%E6%96%B9%E6%B3%95%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
7. [interrupted 和 isInterrupted 方法的区别？](http://svip.iocoder.cn/Java/Concurrent/Interview/#interrupted-%E5%92%8C-isInterrupted-%E6%96%B9%E6%B3%95%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
8. [什么叫线程安全？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E5%8F%AB%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8%EF%BC%9F)
9. [多线程同步和互斥有几种实现方法，都是什么？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%90%8C%E6%AD%A5%E5%92%8C%E4%BA%92%E6%96%A5%E6%9C%89%E5%87%A0%E7%A7%8D%E5%AE%9E%E7%8E%B0%E6%96%B9%E6%B3%95%EF%BC%8C%E9%83%BD%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
10. [什么是 ThreadLocal 变量？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-ThreadLocal-%E5%8F%98%E9%87%8F%EF%BC%9F)
11. [如何在 Java 中获取线程堆栈？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%A6%82%E4%BD%95%E5%9C%A8-Java-%E4%B8%AD%E8%8E%B7%E5%8F%96%E7%BA%BF%E7%A8%8B%E5%A0%86%E6%A0%88%EF%BC%9F)
12. [什么是Java Timer 类？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AFJava-Timer-%E7%B1%BB%EF%BC%9F)
13. [你有哪些多线程开发良好的实践？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BD%A0%E6%9C%89%E5%93%AA%E4%BA%9B%E5%A4%9A%E7%BA%BF%E7%A8%8B%E5%BC%80%E5%8F%91%E8%89%AF%E5%A5%BD%E7%9A%84%E5%AE%9E%E8%B7%B5%EF%BC%9F)
14. [并发编程和并行编程有什么区别？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%B9%B6%E5%8F%91%E7%BC%96%E7%A8%8B%E5%92%8C%E5%B9%B6%E8%A1%8C%E7%BC%96%E7%A8%8B%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
15. [同步和异步有何异同，在什么情况下分别使用他们？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%90%8C%E6%AD%A5%E5%92%8C%E5%BC%82%E6%AD%A5%E6%9C%89%E4%BD%95%E5%BC%82%E5%90%8C%EF%BC%8C%E5%9C%A8%E4%BB%80%E4%B9%88%E6%83%85%E5%86%B5%E4%B8%8B%E5%88%86%E5%88%AB%E4%BD%BF%E7%94%A8%E4%BB%96%E4%BB%AC%EF%BC%9F)

#### [Java 锁](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E9%94%81)

1. [synchronized 的原理是什么?](http://svip.iocoder.cn/Java/Concurrent/Interview/#synchronized-%E7%9A%84%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88)
2. [volatile 实现原理](http://svip.iocoder.cn/Java/Concurrent/Interview/#volatile-%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86)
3. [什么是死锁、活锁？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%AD%BB%E9%94%81%E3%80%81%E6%B4%BB%E9%94%81%EF%BC%9F)
4. [什么是悲观锁、乐观锁？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%82%B2%E8%A7%82%E9%94%81%E3%80%81%E4%B9%90%E8%A7%82%E9%94%81%EF%BC%9F)

#### [Java Lock 接口](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-Lock-%E6%8E%A5%E5%8F%A3)

1. [Java AQS](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-AQS)
2. [什么是 Java Lock 接口？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Java-Lock-%E6%8E%A5%E5%8F%A3%EF%BC%9F)
3. [什么是可重入锁（ReentrantLock）？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%AF%E9%87%8D%E5%85%A5%E9%94%81%EF%BC%88ReentrantLock%EF%BC%89%EF%BC%9F)
4. [ReadWriteLock 是什么？](http://svip.iocoder.cn/Java/Concurrent/Interview/#ReadWriteLock-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
5. [Condition 是什么？](http://svip.iocoder.cn/Java/Concurrent/Interview/#Condition-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
6. [LockSupport 是什么？](http://svip.iocoder.cn/Java/Concurrent/Interview/#LockSupport-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)

#### [Java 内存模型](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B)

1. [什么是 Java 内存模型？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Java-%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B%EF%BC%9F)
2. [两个线程之间是如何通信的呢？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%B8%A4%E4%B8%AA%E7%BA%BF%E7%A8%8B%E4%B9%8B%E9%97%B4%E6%98%AF%E5%A6%82%E4%BD%95%E9%80%9A%E4%BF%A1%E7%9A%84%E5%91%A2%EF%BC%9F)
3. [为什么代码会重排序？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BB%A3%E7%A0%81%E4%BC%9A%E9%87%8D%E6%8E%92%E5%BA%8F%EF%BC%9F)
4. [什么是内存模型的 happens-before 呢？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%86%85%E5%AD%98%E6%A8%A1%E5%9E%8B%E7%9A%84-happens-before-%E5%91%A2%EF%BC%9F)
5. [什么是内存屏障？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%86%85%E5%AD%98%E5%B1%8F%E9%9A%9C%EF%BC%9F)

#### [Java 并发容器](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E5%B9%B6%E5%8F%91%E5%AE%B9%E5%99%A8)

1. [什么是并发容器的实现？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%B9%B6%E5%8F%91%E5%AE%B9%E5%99%A8%E7%9A%84%E5%AE%9E%E7%8E%B0%EF%BC%9F)
2. [SynchronizedMap 和 ConcurrentHashMap 有什么区别？](http://svip.iocoder.cn/Java/Concurrent/Interview/#SynchronizedMap-%E5%92%8C-ConcurrentHashMap-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
3. [CopyOnWriteArrayList 可以用于什么应用场景？](http://svip.iocoder.cn/Java/Concurrent/Interview/#CopyOnWriteArrayList-%E5%8F%AF%E4%BB%A5%E7%94%A8%E4%BA%8E%E4%BB%80%E4%B9%88%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF%EF%BC%9F)

#### [Java 阻塞队列](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E9%98%BB%E5%A1%9E%E9%98%9F%E5%88%97)

1. [什么是阻塞队列？有什么适用场景？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E9%98%BB%E5%A1%9E%E9%98%9F%E5%88%97%EF%BC%9F%E6%9C%89%E4%BB%80%E4%B9%88%E9%80%82%E7%94%A8%E5%9C%BA%E6%99%AF%EF%BC%9F)
2. [Java 提供了哪些阻塞队列的实现？](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E6%8F%90%E4%BE%9B%E4%BA%86%E5%93%AA%E4%BA%9B%E9%98%BB%E5%A1%9E%E9%98%9F%E5%88%97%E7%9A%84%E5%AE%9E%E7%8E%B0%EF%BC%9F)
3. [什么是双端队列？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%8C%E7%AB%AF%E9%98%9F%E5%88%97%EF%BC%9F)
4. [延迟队列的实现方式，DelayQueue 和时间轮算法的异同？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%BB%B6%E8%BF%9F%E9%98%9F%E5%88%97%E7%9A%84%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F%EF%BC%8CDelayQueue-%E5%92%8C%E6%97%B6%E9%97%B4%E8%BD%AE%E7%AE%97%E6%B3%95%E7%9A%84%E5%BC%82%E5%90%8C%EF%BC%9F)
5. [简述 ConcurrentLinkedQueue 和 LinkedBlockingQueue 的用处和不同之处？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E7%AE%80%E8%BF%B0-ConcurrentLinkedQueue-%E5%92%8C-LinkedBlockingQueue-%E7%9A%84%E7%94%A8%E5%A4%84%E5%92%8C%E4%B8%8D%E5%90%8C%E4%B9%8B%E5%A4%84%EF%BC%9F)

#### [Java 原子操作类](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E5%8E%9F%E5%AD%90%E6%93%8D%E4%BD%9C%E7%B1%BB)

1. [什么是原子操作？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8E%9F%E5%AD%90%E6%93%8D%E4%BD%9C%EF%BC%9F)
2. [CAS 操作有什么缺点？](http://svip.iocoder.cn/Java/Concurrent/Interview/#CAS-%E6%93%8D%E4%BD%9C%E6%9C%89%E4%BB%80%E4%B9%88%E7%BC%BA%E7%82%B9%EF%BC%9F)

#### [Java 并发工具类](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E5%B9%B6%E5%8F%91%E5%B7%A5%E5%85%B7%E7%B1%BB)

1. [Semaphore 是什么？](http://svip.iocoder.cn/Java/Concurrent/Interview/#Semaphore-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [说说 CountDownLatch 原理](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E8%AF%B4%E8%AF%B4-CountDownLatch-%E5%8E%9F%E7%90%86)
3. [说说 CyclicBarrier 原理](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E8%AF%B4%E8%AF%B4-CyclicBarrier-%E5%8E%9F%E7%90%86)
4. [说说 Exchanger 原理](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E8%AF%B4%E8%AF%B4-Exchanger-%E5%8E%9F%E7%90%86)
5. [CyclicBarrier 和 CountdownLatch 有什么区别？](http://svip.iocoder.cn/Java/Concurrent/Interview/#CyclicBarrier-%E5%92%8C-CountdownLatch-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)

#### [Java 线程池](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E7%BA%BF%E7%A8%8B%E6%B1%A0)

1. [什么是 Executor 框架？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Executor-%E6%A1%86%E6%9E%B6%EF%BC%9F)
2. [讲讲线程池的实现原理](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E8%AE%B2%E8%AE%B2%E7%BA%BF%E7%A8%8B%E6%B1%A0%E7%9A%84%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86)
3. [创建线程池的几种方式？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%88%9B%E5%BB%BA%E7%BA%BF%E7%A8%8B%E6%B1%A0%E7%9A%84%E5%87%A0%E7%A7%8D%E6%96%B9%E5%BC%8F%EF%BC%9F)
4. [线程池的关闭方式有几种？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E7%BA%BF%E7%A8%8B%E6%B1%A0%E7%9A%84%E5%85%B3%E9%97%AD%E6%96%B9%E5%BC%8F%E6%9C%89%E5%87%A0%E7%A7%8D%EF%BC%9F)
5. [Java 线程池大小为何会大多被设置成 CPU 核心数 +1 ？](http://svip.iocoder.cn/Java/Concurrent/Interview/#Java-%E7%BA%BF%E7%A8%8B%E6%B1%A0%E5%A4%A7%E5%B0%8F%E4%B8%BA%E4%BD%95%E4%BC%9A%E5%A4%A7%E5%A4%9A%E8%A2%AB%E8%AE%BE%E7%BD%AE%E6%88%90-CPU-%E6%A0%B8%E5%BF%83%E6%95%B0-1-%EF%BC%9F)
6. [什么是 Callable、Future、FutureTask ？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Callable%E3%80%81Future%E3%80%81FutureTask-%EF%BC%9F)
7. [线程池执行任务的过程？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E7%BA%BF%E7%A8%8B%E6%B1%A0%E6%89%A7%E8%A1%8C%E4%BB%BB%E5%8A%A1%E7%9A%84%E8%BF%87%E7%A8%8B%EF%BC%9F)
8. [Fork/Join 框架是什么？](http://svip.iocoder.cn/Java/Concurrent/Interview/#Fork-Join-%E6%A1%86%E6%9E%B6%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
9. [如何让一段程序并发的执行，并最终汇总结果？](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%A6%82%E4%BD%95%E8%AE%A9%E4%B8%80%E6%AE%B5%E7%A8%8B%E5%BA%8F%E5%B9%B6%E5%8F%91%E7%9A%84%E6%89%A7%E8%A1%8C%EF%BC%8C%E5%B9%B6%E6%9C%80%E7%BB%88%E6%B1%87%E6%80%BB%E7%BB%93%E6%9E%9C%EF%BC%9F)
10. [彩蛋](http://svip.iocoder.cn/Java/Concurrent/Interview/#%E5%BD%A9%E8%9B%8B)

### **Java虚拟机**

1. [什么是虚拟机？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E8%99%9A%E6%8B%9F%E6%9C%BA%EF%BC%9F)
2. [JVM 由哪些部分组成？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JVM-%E7%94%B1%E5%93%AA%E4%BA%9B%E9%83%A8%E5%88%86%E7%BB%84%E6%88%90%EF%BC%9F)
3. [怎样通过 Java 程序来判断 JVM 是 32 位 还是 64 位？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E6%80%8E%E6%A0%B7%E9%80%9A%E8%BF%87-Java-%E7%A8%8B%E5%BA%8F%E6%9D%A5%E5%88%A4%E6%96%AD-JVM-%E6%98%AF-32-%E4%BD%8D-%E8%BF%98%E6%98%AF-64-%E4%BD%8D%EF%BC%9F)

#### [Java 内存区域与内存溢出异常](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#Java-%E5%86%85%E5%AD%98%E5%8C%BA%E5%9F%9F%E4%B8%8E%E5%86%85%E5%AD%98%E6%BA%A2%E5%87%BA%E5%BC%82%E5%B8%B8)

1. [JVM 运行内存的分类？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JVM-%E8%BF%90%E8%A1%8C%E5%86%85%E5%AD%98%E7%9A%84%E5%88%86%E7%B1%BB%EF%BC%9F)
2. [Java 内存堆和栈区别？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#Java-%E5%86%85%E5%AD%98%E5%A0%86%E5%92%8C%E6%A0%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
3. [JAVA 对象创建的过程？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JAVA-%E5%AF%B9%E8%B1%A1%E5%88%9B%E5%BB%BA%E7%9A%84%E8%BF%87%E7%A8%8B%EF%BC%9F)
4. [对象的内存布局是怎样的？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%AF%B9%E8%B1%A1%E7%9A%84%E5%86%85%E5%AD%98%E5%B8%83%E5%B1%80%E6%98%AF%E6%80%8E%E6%A0%B7%E7%9A%84%EF%BC%9F)
5. [对象是如何定位访问的？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%AF%B9%E8%B1%A1%E6%98%AF%E5%A6%82%E4%BD%95%E5%AE%9A%E4%BD%8D%E8%AE%BF%E9%97%AE%E7%9A%84%EF%BC%9F)
6. [有哪些 OutOfMemoryError 异常？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E6%9C%89%E5%93%AA%E4%BA%9B-OutOfMemoryError-%E5%BC%82%E5%B8%B8%EF%BC%9F)
7. [Java 中会存在内存泄漏吗？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#Java-%E4%B8%AD%E4%BC%9A%E5%AD%98%E5%9C%A8%E5%86%85%E5%AD%98%E6%B3%84%E6%BC%8F%E5%90%97%EF%BC%9F)

#### [垃圾收集器与内存分配策略](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%9E%83%E5%9C%BE%E6%94%B6%E9%9B%86%E5%99%A8%E4%B8%8E%E5%86%85%E5%AD%98%E5%88%86%E9%85%8D%E7%AD%96%E7%95%A5)

1. [什么是垃圾回收机制？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%9E%83%E5%9C%BE%E5%9B%9E%E6%94%B6%E6%9C%BA%E5%88%B6%EF%BC%9F)
2. [如何判断一个对象是否已经死去？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%A6%82%E4%BD%95%E5%88%A4%E6%96%AD%E4%B8%80%E4%B8%AA%E5%AF%B9%E8%B1%A1%E6%98%AF%E5%90%A6%E5%B7%B2%E7%BB%8F%E6%AD%BB%E5%8E%BB%EF%BC%9F)
3. [Java 对象有哪些引用类型？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#Java-%E5%AF%B9%E8%B1%A1%E6%9C%89%E5%93%AA%E4%BA%9B%E5%BC%95%E7%94%A8%E7%B1%BB%E5%9E%8B%EF%BC%9F)
4. [JVM 垃圾回收算法？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JVM-%E5%9E%83%E5%9C%BE%E5%9B%9E%E6%94%B6%E7%AE%97%E6%B3%95%EF%BC%9F)
5. [什么是安全点？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%AE%89%E5%85%A8%E7%82%B9%EF%BC%9F)
6. [JVM 垃圾收集器有哪些？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JVM-%E5%9E%83%E5%9C%BE%E6%94%B6%E9%9B%86%E5%99%A8%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
7. [对象分配规则是什么？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%AF%B9%E8%B1%A1%E5%88%86%E9%85%8D%E8%A7%84%E5%88%99%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
8. [什么是新生代 GC 和老年代 GC？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%96%B0%E7%94%9F%E4%BB%A3-GC-%E5%92%8C%E8%80%81%E5%B9%B4%E4%BB%A3-GC%EF%BC%9F)

#### [虚拟机性能监控与故障处理工具](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E8%99%9A%E6%8B%9F%E6%9C%BA%E6%80%A7%E8%83%BD%E7%9B%91%E6%8E%A7%E4%B8%8E%E6%95%85%E9%9A%9C%E5%A4%84%E7%90%86%E5%B7%A5%E5%85%B7)

1. [JDK 的命令行工具有哪些可以监控虚拟机？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JDK-%E7%9A%84%E5%91%BD%E4%BB%A4%E8%A1%8C%E5%B7%A5%E5%85%B7%E6%9C%89%E5%93%AA%E4%BA%9B%E5%8F%AF%E4%BB%A5%E7%9B%91%E6%8E%A7%E8%99%9A%E6%8B%9F%E6%9C%BA%EF%BC%9F)
2. [JDK 的可视化工具有哪些可以监控虚拟机？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#JDK-%E7%9A%84%E5%8F%AF%E8%A7%86%E5%8C%96%E5%B7%A5%E5%85%B7%E6%9C%89%E5%93%AA%E4%BA%9B%E5%8F%AF%E4%BB%A5%E7%9B%91%E6%8E%A7%E8%99%9A%E6%8B%9F%E6%9C%BA%EF%BC%9F)
3. [怎么获取 Java 程序使用的内存？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E6%80%8E%E4%B9%88%E8%8E%B7%E5%8F%96-Java-%E7%A8%8B%E5%BA%8F%E4%BD%BF%E7%94%A8%E7%9A%84%E5%86%85%E5%AD%98%EF%BC%9F)

#### [调优案例分析与实战](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E8%B0%83%E4%BC%98%E6%A1%88%E4%BE%8B%E5%88%86%E6%9E%90%E4%B8%8E%E5%AE%9E%E6%88%98)

1. [常见 GC 的优化配置？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%B8%B8%E8%A7%81-GC-%E7%9A%84%E4%BC%98%E5%8C%96%E9%85%8D%E7%BD%AE%EF%BC%9F)
2. [如何排查线程 Full GC 频繁的问题？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E5%A6%82%E4%BD%95%E6%8E%92%E6%9F%A5%E7%BA%BF%E7%A8%8B-Full-GC-%E9%A2%91%E7%B9%81%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)
3. [有看过 GC 日志么？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E6%9C%89%E7%9C%8B%E8%BF%87-GC-%E6%97%A5%E5%BF%97%E4%B9%88%EF%BC%9F)
4. [TODO JVM 线程案例](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-JVM-%E7%BA%BF%E7%A8%8B%E6%A1%88%E4%BE%8B)
5. [TODO 类文件结构](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-%E7%B1%BB%E6%96%87%E4%BB%B6%E7%BB%93%E6%9E%84)

#### [TODO 虚拟机类加载机制](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-%E8%99%9A%E6%8B%9F%E6%9C%BA%E7%B1%BB%E5%8A%A0%E8%BD%BD%E6%9C%BA%E5%88%B6)

1. [类加载器是有了解吗？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E7%B1%BB%E5%8A%A0%E8%BD%BD%E5%99%A8%E6%98%AF%E6%9C%89%E4%BA%86%E8%A7%A3%E5%90%97%EF%BC%9F)
2. [类加载发生的时机是什么时候？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E7%B1%BB%E5%8A%A0%E8%BD%BD%E5%8F%91%E7%94%9F%E7%9A%84%E6%97%B6%E6%9C%BA%E6%98%AF%E4%BB%80%E4%B9%88%E6%97%B6%E5%80%99%EF%BC%9F)
3. [类加载器是如何加载 Class 文件的？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E7%B1%BB%E5%8A%A0%E8%BD%BD%E5%99%A8%E6%98%AF%E5%A6%82%E4%BD%95%E5%8A%A0%E8%BD%BD-Class-%E6%96%87%E4%BB%B6%E7%9A%84%EF%BC%9F)
4. [什么是双亲委派模型（Parent Delegation Model）？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%8C%E4%BA%B2%E5%A7%94%E6%B4%BE%E6%A8%A1%E5%9E%8B%EF%BC%88Parent-Delegation-Model%EF%BC%89%EF%BC%9F)
5. [什么是破坏双亲委托模型？](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%A0%B4%E5%9D%8F%E5%8F%8C%E4%BA%B2%E5%A7%94%E6%89%98%E6%A8%A1%E5%9E%8B%EF%BC%9F)
6. [TODO 虚拟机字节码执行引擎](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-%E8%99%9A%E6%8B%9F%E6%9C%BA%E5%AD%97%E8%8A%82%E7%A0%81%E6%89%A7%E8%A1%8C%E5%BC%95%E6%93%8E)
7. [TODO 早期（编译期）优化](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-%E6%97%A9%E6%9C%9F%EF%BC%88%E7%BC%96%E8%AF%91%E6%9C%9F%EF%BC%89%E4%BC%98%E5%8C%96)
   1. [TODO JIT](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-JIT)
8. [TODO 晚期（运行期）优化](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#TODO-%E6%99%9A%E6%9C%9F%EF%BC%88%E8%BF%90%E8%A1%8C%E6%9C%9F%EF%BC%89%E4%BC%98%E5%8C%96)
9. [666. 彩蛋](http://svip.iocoder.cn/Java/VirtualMachine/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Dubbo**

1. [Dubbo 有几种配置方式？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%9C%89%E5%87%A0%E7%A7%8D%E9%85%8D%E7%BD%AE%E6%96%B9%E5%BC%8F%EF%BC%9F)
2. [Dubbo 如何和 Spring Boot 进行集成？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E5%92%8C-Spring-Boot-%E8%BF%9B%E8%A1%8C%E9%9B%86%E6%88%90%EF%BC%9F)
3. [Dubbo 框架的分层设计](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%A1%86%E6%9E%B6%E7%9A%84%E5%88%86%E5%B1%82%E8%AE%BE%E8%AE%A1)
4. [Dubbo 调用流程](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E8%B0%83%E7%94%A8%E6%B5%81%E7%A8%8B)
5. [Dubbo 调用是同步的吗？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E8%B0%83%E7%94%A8%E6%98%AF%E5%90%8C%E6%AD%A5%E7%9A%84%E5%90%97%EF%BC%9F)
6. [谈谈对 Dubbo 的异常处理机制？](http://svip.iocoder.cn/Dubbo/Interview/#%E8%B0%88%E8%B0%88%E5%AF%B9-Dubbo-%E7%9A%84%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%E6%9C%BA%E5%88%B6%EF%BC%9F)
7. [Dubbo 如何做参数校验？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E5%81%9A%E5%8F%82%E6%95%B0%E6%A0%A1%E9%AA%8C%EF%BC%9F)
8. [Dubbo 可以对调用结果进行缓存吗?](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%8F%AF%E4%BB%A5%E5%AF%B9%E8%B0%83%E7%94%A8%E7%BB%93%E6%9E%9C%E8%BF%9B%E8%A1%8C%E7%BC%93%E5%AD%98%E5%90%97)
9. [注册中心挂了还可以通信吗？](http://svip.iocoder.cn/Dubbo/Interview/#%E6%B3%A8%E5%86%8C%E4%B8%AD%E5%BF%83%E6%8C%82%E4%BA%86%E8%BF%98%E5%8F%AF%E4%BB%A5%E9%80%9A%E4%BF%A1%E5%90%97%EF%BC%9F)
10. [Dubbo 在 Zookeeper 存储了哪些信息？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%9C%A8-Zookeeper-%E5%AD%98%E5%82%A8%E4%BA%86%E5%93%AA%E4%BA%9B%E4%BF%A1%E6%81%AF%EF%BC%9F)
11. [Dubbo Provider 如何实现优雅停机？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-Provider-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E4%BC%98%E9%9B%85%E5%81%9C%E6%9C%BA%EF%BC%9F)
12. [Dubbo Provider 异步关闭时，如何从注册中心下线？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-Provider-%E5%BC%82%E6%AD%A5%E5%85%B3%E9%97%AD%E6%97%B6%EF%BC%8C%E5%A6%82%E4%BD%95%E4%BB%8E%E6%B3%A8%E5%86%8C%E4%B8%AD%E5%BF%83%E4%B8%8B%E7%BA%BF%EF%BC%9F)
13. [Dubbo Consumer 只能调用从注册中心获取的 Provider 么？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-Consumer-%E5%8F%AA%E8%83%BD%E8%B0%83%E7%94%A8%E4%BB%8E%E6%B3%A8%E5%86%8C%E4%B8%AD%E5%BF%83%E8%8E%B7%E5%8F%96%E7%9A%84-Provider-%E4%B9%88%EF%BC%9F)
14. [Dubbo 支持哪些通信协议？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%94%AF%E6%8C%81%E5%93%AA%E4%BA%9B%E9%80%9A%E4%BF%A1%E5%8D%8F%E8%AE%AE%EF%BC%9F)
15. [什么是本地暴露和远程暴露，他们的区别？](http://svip.iocoder.cn/Dubbo/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%9C%AC%E5%9C%B0%E6%9A%B4%E9%9C%B2%E5%92%8C%E8%BF%9C%E7%A8%8B%E6%9A%B4%E9%9C%B2%EF%BC%8C%E4%BB%96%E4%BB%AC%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
16. [Dubbo 使用什么通信框架？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E4%BD%BF%E7%94%A8%E4%BB%80%E4%B9%88%E9%80%9A%E4%BF%A1%E6%A1%86%E6%9E%B6%EF%BC%9F)
17. [Dubbo 支持哪些序列化方式？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%94%AF%E6%8C%81%E5%93%AA%E4%BA%9B%E5%BA%8F%E5%88%97%E5%8C%96%E6%96%B9%E5%BC%8F%EF%BC%9F)
18. [Dubbo 有哪些负载均衡策略？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%9C%89%E5%93%AA%E4%BA%9B%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%E7%AD%96%E7%95%A5%EF%BC%9F)
19. [Dubbo 有哪些集群容错策略？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%9C%89%E5%93%AA%E4%BA%9B%E9%9B%86%E7%BE%A4%E5%AE%B9%E9%94%99%E7%AD%96%E7%95%A5%EF%BC%9F)
20. [Dubbo 有哪些动态代理策略？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%9C%89%E5%93%AA%E4%BA%9B%E5%8A%A8%E6%80%81%E4%BB%A3%E7%90%86%E7%AD%96%E7%95%A5%EF%BC%9F)
21. [Dubbo SPI 的设计思想是什么？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-SPI-%E7%9A%84%E8%AE%BE%E8%AE%A1%E6%80%9D%E6%83%B3%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
22. [Dubbo 服务如何监控和管理？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%9C%8D%E5%8A%A1%E5%A6%82%E4%BD%95%E7%9B%91%E6%8E%A7%E5%92%8C%E7%AE%A1%E7%90%86%EF%BC%9F)
23. [Dubbo 服务如何做降级？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%9C%8D%E5%8A%A1%E5%A6%82%E4%BD%95%E5%81%9A%E9%99%8D%E7%BA%A7%EF%BC%9F)
24. [Dubbo 如何做限流？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E5%81%9A%E9%99%90%E6%B5%81%EF%BC%9F)
25. [Dubbo 的失败重试是什么？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E7%9A%84%E5%A4%B1%E8%B4%A5%E9%87%8D%E8%AF%95%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
26. [Dubbo 支持哪些注册中心？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%94%AF%E6%8C%81%E5%93%AA%E4%BA%9B%E6%B3%A8%E5%86%8C%E4%B8%AD%E5%BF%83%EF%BC%9F)
27. [Dubbo 接口如何实现幂等性？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E6%8E%A5%E5%8F%A3%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E5%B9%82%E7%AD%89%E6%80%A7%EF%BC%9F)
28. [Dubbo 如何升级接口？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E5%8D%87%E7%BA%A7%E6%8E%A5%E5%8F%A3%EF%BC%9F)
29. [Dubbo 在安全机制方面是如何解决的？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%9C%A8%E5%AE%89%E5%85%A8%E6%9C%BA%E5%88%B6%E6%96%B9%E9%9D%A2%E6%98%AF%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E7%9A%84%EF%BC%9F)
30. [Dubbo 需要 Web 容器吗？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E9%9C%80%E8%A6%81-Web-%E5%AE%B9%E5%99%A8%E5%90%97%EF%BC%9F)
31. [为什么要将系统进行拆分？](http://svip.iocoder.cn/Dubbo/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E5%B0%86%E7%B3%BB%E7%BB%9F%E8%BF%9B%E8%A1%8C%E6%8B%86%E5%88%86%EF%BC%9F)
32. [Dubbo 如何集成配置中心？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83%EF%BC%9F)
33. [Dubbo 如何实现分布式事务？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%EF%BC%9F)
34. [Dubbo 如何集成网关服务？](http://svip.iocoder.cn/Dubbo/Interview/#Dubbo-%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90%E7%BD%91%E5%85%B3%E6%9C%8D%E5%8A%A1%EF%BC%9F)
35. [如何进行系统拆分？](http://svip.iocoder.cn/Dubbo/Interview/#%E5%A6%82%E4%BD%95%E8%BF%9B%E8%A1%8C%E7%B3%BB%E7%BB%9F%E6%8B%86%E5%88%86%EF%BC%9F)
36. [拆分后不用 Dubbo 可以吗？](http://svip.iocoder.cn/Dubbo/Interview/#%E6%8B%86%E5%88%86%E5%90%8E%E4%B8%8D%E7%94%A8-Dubbo-%E5%8F%AF%E4%BB%A5%E5%90%97%EF%BC%9F)
37. [Spring Cloud 与 Dubbo 怎么选择？](http://svip.iocoder.cn/Dubbo/Interview/#Spring-Cloud-%E4%B8%8E-Dubbo-%E6%80%8E%E4%B9%88%E9%80%89%E6%8B%A9%EF%BC%9F)
38. [如何自己设计一个类似 Dubbo 的 RPC 框架？](http://svip.iocoder.cn/Dubbo/Interview/#%E5%A6%82%E4%BD%95%E8%87%AA%E5%B7%B1%E8%AE%BE%E8%AE%A1%E4%B8%80%E4%B8%AA%E7%B1%BB%E4%BC%BC-Dubbo-%E7%9A%84-RPC-%E6%A1%86%E6%9E%B6%EF%BC%9F)
39. [其他问题](http://svip.iocoder.cn/Dubbo/Interview/#%E5%85%B6%E4%BB%96%E9%97%AE%E9%A2%98)
40. [666. 彩蛋](http://svip.iocoder.cn/Dubbo/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Netty**

1. [BIO 是什么？](http://svip.iocoder.cn/Netty/Interview/#BIO-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [NIO 是什么？](http://svip.iocoder.cn/Netty/Interview/#NIO-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [AIO 是什么？](http://svip.iocoder.cn/Netty/Interview/#AIO-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
4. [BIO、NIO 有什么区别？](http://svip.iocoder.cn/Netty/Interview/#BIO%E3%80%81NIO-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
5. [什么是 Netty ？](http://svip.iocoder.cn/Netty/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Netty-%EF%BC%9F)
6. [为什么选择 Netty ？](http://svip.iocoder.cn/Netty/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E9%80%89%E6%8B%A9-Netty-%EF%BC%9F)
7. [为什么说 Netty 使用简单？](http://svip.iocoder.cn/Netty/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%AF%B4-Netty-%E4%BD%BF%E7%94%A8%E7%AE%80%E5%8D%95%EF%BC%9F)
8. [说说业务中 Netty 的使用场景？](http://svip.iocoder.cn/Netty/Interview/#%E8%AF%B4%E8%AF%B4%E4%B8%9A%E5%8A%A1%E4%B8%AD-Netty-%E7%9A%84%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF%EF%BC%9F)
9. [说说 Netty 如何实现高性能？](http://svip.iocoder.cn/Netty/Interview/#%E8%AF%B4%E8%AF%B4-Netty-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E9%AB%98%E6%80%A7%E8%83%BD%EF%BC%9F)
10. [Netty 的高性能如何体现？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E7%9A%84%E9%AB%98%E6%80%A7%E8%83%BD%E5%A6%82%E4%BD%95%E4%BD%93%E7%8E%B0%EF%BC%9F)
11. [Netty 的高可靠如何体现？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E7%9A%84%E9%AB%98%E5%8F%AF%E9%9D%A0%E5%A6%82%E4%BD%95%E4%BD%93%E7%8E%B0%EF%BC%9F)
12. [Netty 的可扩展如何体现？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E7%9A%84%E5%8F%AF%E6%89%A9%E5%B1%95%E5%A6%82%E4%BD%95%E4%BD%93%E7%8E%B0%EF%BC%9F)
13. [简单介绍 Netty 的核心组件？](http://svip.iocoder.cn/Netty/Interview/#%E7%AE%80%E5%8D%95%E4%BB%8B%E7%BB%8D-Netty-%E7%9A%84%E6%A0%B8%E5%BF%83%E7%BB%84%E4%BB%B6%EF%BC%9F)
14. [说说 Netty 的逻辑架构？](http://svip.iocoder.cn/Netty/Interview/#%E8%AF%B4%E8%AF%B4-Netty-%E7%9A%84%E9%80%BB%E8%BE%91%E6%9E%B6%E6%9E%84%EF%BC%9F)
15. [什么是 Reactor 模型？](http://svip.iocoder.cn/Netty/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Reactor-%E6%A8%A1%E5%9E%8B%EF%BC%9F)
16. [请介绍 Netty 的线程模型？](http://svip.iocoder.cn/Netty/Interview/#%E8%AF%B7%E4%BB%8B%E7%BB%8D-Netty-%E7%9A%84%E7%BA%BF%E7%A8%8B%E6%A8%A1%E5%9E%8B%EF%BC%9F)
17. [什么是业务线程池？](http://svip.iocoder.cn/Netty/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%B8%9A%E5%8A%A1%E7%BA%BF%E7%A8%8B%E6%B1%A0%EF%BC%9F)
18. [TCP 粘包 / 拆包的原因？应该这么解决？](http://svip.iocoder.cn/Netty/Interview/#TCP-%E7%B2%98%E5%8C%85-%E6%8B%86%E5%8C%85%E7%9A%84%E5%8E%9F%E5%9B%A0%EF%BC%9F%E5%BA%94%E8%AF%A5%E8%BF%99%E4%B9%88%E8%A7%A3%E5%86%B3%EF%BC%9F)
19. [了解哪几种序列化协议？](http://svip.iocoder.cn/Netty/Interview/#%E4%BA%86%E8%A7%A3%E5%93%AA%E5%87%A0%E7%A7%8D%E5%BA%8F%E5%88%97%E5%8C%96%E5%8D%8F%E8%AE%AE%EF%BC%9F)
20. [Netty 的零拷贝实现？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E7%9A%84%E9%9B%B6%E6%8B%B7%E8%B4%9D%E5%AE%9E%E7%8E%B0%EF%BC%9F)
21. [原生的 NIO 存在 Epoll Bug 是什么？Netty 是怎么解决的？](http://svip.iocoder.cn/Netty/Interview/#%E5%8E%9F%E7%94%9F%E7%9A%84-NIO-%E5%AD%98%E5%9C%A8-Epoll-Bug-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9FNetty-%E6%98%AF%E6%80%8E%E4%B9%88%E8%A7%A3%E5%86%B3%E7%9A%84%EF%BC%9F)
22. [什么是 Netty 空闲检测？](http://svip.iocoder.cn/Netty/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Netty-%E7%A9%BA%E9%97%B2%E6%A3%80%E6%B5%8B%EF%BC%9F)
23. [Netty 如何实现重连？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E9%87%8D%E8%BF%9E%EF%BC%9F)
24. [Netty 自己实现的 ByteBuf 有什么优点？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E8%87%AA%E5%B7%B1%E5%AE%9E%E7%8E%B0%E7%9A%84-ByteBuf-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%82%B9%EF%BC%9F)
25. [Netty 为什么要实现内存管理？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E5%AE%9E%E7%8E%B0%E5%86%85%E5%AD%98%E7%AE%A1%E7%90%86%EF%BC%9F)
26. [Netty 如何实心内存管理？](http://svip.iocoder.cn/Netty/Interview/#Netty-%E5%A6%82%E4%BD%95%E5%AE%9E%E5%BF%83%E5%86%85%E5%AD%98%E7%AE%A1%E7%90%86%EF%BC%9F)
27. [什么是 Netty 的内存泄露检测？是如何进行实现的？](http://svip.iocoder.cn/Netty/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Netty-%E7%9A%84%E5%86%85%E5%AD%98%E6%B3%84%E9%9C%B2%E6%A3%80%E6%B5%8B%EF%BC%9F%E6%98%AF%E5%A6%82%E4%BD%95%E8%BF%9B%E8%A1%8C%E5%AE%9E%E7%8E%B0%E7%9A%84%EF%BC%9F)
28. [666. 彩蛋](http://svip.iocoder.cn/Netty/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Spring**

1. [什么是 Spring Framework？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Spring-Framework%EF%BC%9F)
2. [Spring Framework 中有多少个模块，它们分别是什么？](http://svip.iocoder.cn/Spring/Interview/#Spring-Framework-%E4%B8%AD%E6%9C%89%E5%A4%9A%E5%B0%91%E4%B8%AA%E6%A8%A1%E5%9D%97%EF%BC%8C%E5%AE%83%E4%BB%AC%E5%88%86%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [使用 Spring 框架能带来哪些好处？](http://svip.iocoder.cn/Spring/Interview/#%E4%BD%BF%E7%94%A8-Spring-%E6%A1%86%E6%9E%B6%E8%83%BD%E5%B8%A6%E6%9D%A5%E5%93%AA%E4%BA%9B%E5%A5%BD%E5%A4%84%EF%BC%9F)
4. [Spring 框架中都用到了哪些设计模式？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%A1%86%E6%9E%B6%E4%B8%AD%E9%83%BD%E7%94%A8%E5%88%B0%E4%BA%86%E5%93%AA%E4%BA%9B%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F%EF%BC%9F)

#### [Spring IoC](http://svip.iocoder.cn/Spring/Interview/#Spring-IoC)

1. [什么是 Spring IoC 容器？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Spring-IoC-%E5%AE%B9%E5%99%A8%EF%BC%9F)
2. [什么是依赖注入？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BE%9D%E8%B5%96%E6%B3%A8%E5%85%A5%EF%BC%9F)
3. [IoC 和 DI 有什么区别？](http://svip.iocoder.cn/Spring/Interview/#IoC-%E5%92%8C-DI-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
4. [可以通过多少种方式完成依赖注入？](http://svip.iocoder.cn/Spring/Interview/#%E5%8F%AF%E4%BB%A5%E9%80%9A%E8%BF%87%E5%A4%9A%E5%B0%91%E7%A7%8D%E6%96%B9%E5%BC%8F%E5%AE%8C%E6%88%90%E4%BE%9D%E8%B5%96%E6%B3%A8%E5%85%A5%EF%BC%9F)
5. [Spring 中有多少种 IoC 容器？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E4%B8%AD%E6%9C%89%E5%A4%9A%E5%B0%91%E7%A7%8D-IoC-%E5%AE%B9%E5%99%A8%EF%BC%9F)
6. [请介绍下常用的 BeanFactory 容器？](http://svip.iocoder.cn/Spring/Interview/#%E8%AF%B7%E4%BB%8B%E7%BB%8D%E4%B8%8B%E5%B8%B8%E7%94%A8%E7%9A%84-BeanFactory-%E5%AE%B9%E5%99%A8%EF%BC%9F)
7. [请介绍下常用的 ApplicationContext 容器？](http://svip.iocoder.cn/Spring/Interview/#%E8%AF%B7%E4%BB%8B%E7%BB%8D%E4%B8%8B%E5%B8%B8%E7%94%A8%E7%9A%84-ApplicationContext-%E5%AE%B9%E5%99%A8%EF%BC%9F)
8. [列举一些 IoC 的一些好处？](http://svip.iocoder.cn/Spring/Interview/#%E5%88%97%E4%B8%BE%E4%B8%80%E4%BA%9B-IoC-%E7%9A%84%E4%B8%80%E4%BA%9B%E5%A5%BD%E5%A4%84%EF%BC%9F)
9. [简述 Spring IoC 的实现机制？](http://svip.iocoder.cn/Spring/Interview/#%E7%AE%80%E8%BF%B0-Spring-IoC-%E7%9A%84%E5%AE%9E%E7%8E%B0%E6%9C%BA%E5%88%B6%EF%BC%9F)
10. [Spring 框架中有哪些不同类型的事件？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%A1%86%E6%9E%B6%E4%B8%AD%E6%9C%89%E5%93%AA%E4%BA%9B%E4%B8%8D%E5%90%8C%E7%B1%BB%E5%9E%8B%E7%9A%84%E4%BA%8B%E4%BB%B6%EF%BC%9F)

#### [Spring Bean](http://svip.iocoder.cn/Spring/Interview/#Spring-Bean)

1. [什么是 Spring Bean ？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Spring-Bean-%EF%BC%9F)
2. [Spring 有哪些配置方式](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%9C%89%E5%93%AA%E4%BA%9B%E9%85%8D%E7%BD%AE%E6%96%B9%E5%BC%8F)
3. [Spring 支持几种 Bean Scope ？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%94%AF%E6%8C%81%E5%87%A0%E7%A7%8D-Bean-Scope-%EF%BC%9F)
4. [Spring Bean 在容器的生命周期是什么样的？](http://svip.iocoder.cn/Spring/Interview/#Spring-Bean-%E5%9C%A8%E5%AE%B9%E5%99%A8%E7%9A%84%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F%E6%98%AF%E4%BB%80%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
5. [什么是 Spring 的内部 bean？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Spring-%E7%9A%84%E5%86%85%E9%83%A8-bean%EF%BC%9F)
6. [什么是 Spring 装配？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Spring-%E8%A3%85%E9%85%8D%EF%BC%9F)
7. [解释什么叫延迟加载？](http://svip.iocoder.cn/Spring/Interview/#%E8%A7%A3%E9%87%8A%E4%BB%80%E4%B9%88%E5%8F%AB%E5%BB%B6%E8%BF%9F%E5%8A%A0%E8%BD%BD%EF%BC%9F)
8. [Spring 框架中的单例 Bean 是线程安全的么？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%A1%86%E6%9E%B6%E4%B8%AD%E7%9A%84%E5%8D%95%E4%BE%8B-Bean-%E6%98%AF%E7%BA%BF%E7%A8%8B%E5%AE%89%E5%85%A8%E7%9A%84%E4%B9%88%EF%BC%9F)
9. [Spring Bean 怎么解决循环依赖的问题？](http://svip.iocoder.cn/Spring/Interview/#Spring-Bean-%E6%80%8E%E4%B9%88%E8%A7%A3%E5%86%B3%E5%BE%AA%E7%8E%AF%E4%BE%9D%E8%B5%96%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)

#### [Spring 注解](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%B3%A8%E8%A7%A3)

1. [什么是基于注解的容器配置？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%9F%BA%E4%BA%8E%E6%B3%A8%E8%A7%A3%E7%9A%84%E5%AE%B9%E5%99%A8%E9%85%8D%E7%BD%AE%EF%BC%9F)
2. [如何在 Spring 中启动注解装配？](http://svip.iocoder.cn/Spring/Interview/#%E5%A6%82%E4%BD%95%E5%9C%A8-Spring-%E4%B8%AD%E5%90%AF%E5%8A%A8%E6%B3%A8%E8%A7%A3%E8%A3%85%E9%85%8D%EF%BC%9F)
3. [@Component, @Controller, @Repository, @Service 有何区别？](http://svip.iocoder.cn/Spring/Interview/#Component-Controller-Repository-Service-%E6%9C%89%E4%BD%95%E5%8C%BA%E5%88%AB%EF%BC%9F)
4. [@Required 注解有什么用？](http://svip.iocoder.cn/Spring/Interview/#Required-%E6%B3%A8%E8%A7%A3%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%EF%BC%9F)
5. [@Autowired 注解有什么用？](http://svip.iocoder.cn/Spring/Interview/#Autowired-%E6%B3%A8%E8%A7%A3%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%EF%BC%9F)
6. [@Qualifier 注解有什么用？](http://svip.iocoder.cn/Spring/Interview/#Qualifier-%E6%B3%A8%E8%A7%A3%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%EF%BC%9F)

#### [Spring AOP](http://svip.iocoder.cn/Spring/Interview/#Spring-AOP)

1. [什么是 AOP ？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-AOP-%EF%BC%9F)
2. [什么是 Aspect ？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Aspect-%EF%BC%9F)
3. [什么是 JoinPoint ?](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-JoinPoint)
4. [什么是 PointCut ？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-PointCut-%EF%BC%9F)
5. [关于 JoinPoint 和 PointCut 的区别](http://svip.iocoder.cn/Spring/Interview/#%E5%85%B3%E4%BA%8E-JoinPoint-%E5%92%8C-PointCut-%E7%9A%84%E5%8C%BA%E5%88%AB)
6. [什么是 Advice ？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Advice-%EF%BC%9F)
7. [什么是 Target ？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Target-%EF%BC%9F)
8. [AOP 有哪些实现方式？](http://svip.iocoder.cn/Spring/Interview/#AOP-%E6%9C%89%E5%93%AA%E4%BA%9B%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F%EF%BC%9F)
9. [Spring AOP and AspectJ AOP 有什么区别？](http://svip.iocoder.cn/Spring/Interview/#Spring-AOP-and-AspectJ-AOP-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
10. [什么是编织（Weaving）？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%BC%96%E7%BB%87%EF%BC%88Weaving%EF%BC%89%EF%BC%9F)
11. [Spring 如何使用 AOP 切面？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-AOP-%E5%88%87%E9%9D%A2%EF%BC%9F)

#### [Spring Transaction](http://svip.iocoder.cn/Spring/Interview/#Spring-Transaction)

1. [什么是事务？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1%EF%BC%9F)
2. [事务的特性指的是？](http://svip.iocoder.cn/Spring/Interview/#%E4%BA%8B%E5%8A%A1%E7%9A%84%E7%89%B9%E6%80%A7%E6%8C%87%E7%9A%84%E6%98%AF%EF%BC%9F)
3. [列举 Spring 支持的事务管理类型？](http://svip.iocoder.cn/Spring/Interview/#%E5%88%97%E4%B8%BE-Spring-%E6%94%AF%E6%8C%81%E7%9A%84%E4%BA%8B%E5%8A%A1%E7%AE%A1%E7%90%86%E7%B1%BB%E5%9E%8B%EF%BC%9F)
4. [Spring 事务如何和不同的数据持久层框架做集成？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E4%BA%8B%E5%8A%A1%E5%A6%82%E4%BD%95%E5%92%8C%E4%B8%8D%E5%90%8C%E7%9A%84%E6%95%B0%E6%8D%AE%E6%8C%81%E4%B9%85%E5%B1%82%E6%A1%86%E6%9E%B6%E5%81%9A%E9%9B%86%E6%88%90%EF%BC%9F)
5. [为什么在 Spring 事务中不能切换数据源？](http://svip.iocoder.cn/Spring/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E5%9C%A8-Spring-%E4%BA%8B%E5%8A%A1%E4%B8%AD%E4%B8%8D%E8%83%BD%E5%88%87%E6%8D%A2%E6%95%B0%E6%8D%AE%E6%BA%90%EF%BC%9F)
6. [@Transactional 注解有哪些属性？如何使用？](http://svip.iocoder.cn/Spring/Interview/#Transactional-%E6%B3%A8%E8%A7%A3%E6%9C%89%E5%93%AA%E4%BA%9B%E5%B1%9E%E6%80%A7%EF%BC%9F%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8%EF%BC%9F)
7. [什么是事务的隔离级别？分成哪些隔离级别？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1%E7%9A%84%E9%9A%94%E7%A6%BB%E7%BA%A7%E5%88%AB%EF%BC%9F%E5%88%86%E6%88%90%E5%93%AA%E4%BA%9B%E9%9A%94%E7%A6%BB%E7%BA%A7%E5%88%AB%EF%BC%9F)
8. [什么是事务的传播级别？分成哪些传播级别？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1%E7%9A%84%E4%BC%A0%E6%92%AD%E7%BA%A7%E5%88%AB%EF%BC%9F%E5%88%86%E6%88%90%E5%93%AA%E4%BA%9B%E4%BC%A0%E6%92%AD%E7%BA%A7%E5%88%AB%EF%BC%9F)
9. [什么是事务的超时属性？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1%E7%9A%84%E8%B6%85%E6%97%B6%E5%B1%9E%E6%80%A7%EF%BC%9F)
10. [什么是事务的只读属性？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1%E7%9A%84%E5%8F%AA%E8%AF%BB%E5%B1%9E%E6%80%A7%EF%BC%9F)
11. [什么是事务的回滚规则？](http://svip.iocoder.cn/Spring/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%BA%8B%E5%8A%A1%E7%9A%84%E5%9B%9E%E6%BB%9A%E8%A7%84%E5%88%99%EF%BC%9F)
12. [简单介绍 TransactionStatus ？](http://svip.iocoder.cn/Spring/Interview/#%E7%AE%80%E5%8D%95%E4%BB%8B%E7%BB%8D-TransactionStatus-%EF%BC%9F)
13. [使用 Spring 事务有什么优点？](http://svip.iocoder.cn/Spring/Interview/#%E4%BD%BF%E7%94%A8-Spring-%E4%BA%8B%E5%8A%A1%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%82%B9%EF%BC%9F)

#### [Spring Data Access](http://svip.iocoder.cn/Spring/Interview/#Spring-Data-Access)

1. [Spring 支持哪些 ORM 框架？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%94%AF%E6%8C%81%E5%93%AA%E4%BA%9B-ORM-%E6%A1%86%E6%9E%B6%EF%BC%9F)
2. [在 Spring 框架中如何更有效地使用 JDBC ？](http://svip.iocoder.cn/Spring/Interview/#%E5%9C%A8-Spring-%E6%A1%86%E6%9E%B6%E4%B8%AD%E5%A6%82%E4%BD%95%E6%9B%B4%E6%9C%89%E6%95%88%E5%9C%B0%E4%BD%BF%E7%94%A8-JDBC-%EF%BC%9F)
3. [Spring 数据数据访问层有哪些异常？](http://svip.iocoder.cn/Spring/Interview/#Spring-%E6%95%B0%E6%8D%AE%E6%95%B0%E6%8D%AE%E8%AE%BF%E9%97%AE%E5%B1%82%E6%9C%89%E5%93%AA%E4%BA%9B%E5%BC%82%E5%B8%B8%EF%BC%9F)
4. [使用 Spring 访问 Hibernate 的方法有哪些？](http://svip.iocoder.cn/Spring/Interview/#%E4%BD%BF%E7%94%A8-Spring-%E8%AE%BF%E9%97%AE-Hibernate-%E7%9A%84%E6%96%B9%E6%B3%95%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
5. [666. 彩蛋](http://svip.iocoder.cn/Spring/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Spring MVC**

1. [Spring MVC 框架有什么用？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E6%A1%86%E6%9E%B6%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%EF%BC%9F)
2. [介绍下 Spring MVC 的核心组件？](http://svip.iocoder.cn/Spring-MVC/Interview/#%E4%BB%8B%E7%BB%8D%E4%B8%8B-Spring-MVC-%E7%9A%84%E6%A0%B8%E5%BF%83%E7%BB%84%E4%BB%B6%EF%BC%9F)
3. [描述一下 DispatcherServlet 的工作流程？](http://svip.iocoder.cn/Spring-MVC/Interview/#%E6%8F%8F%E8%BF%B0%E4%B8%80%E4%B8%8B-DispatcherServlet-%E7%9A%84%E5%B7%A5%E4%BD%9C%E6%B5%81%E7%A8%8B%EF%BC%9F)
4. [@Controller 注解有什么用？](http://svip.iocoder.cn/Spring-MVC/Interview/#Controller-%E6%B3%A8%E8%A7%A3%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%EF%BC%9F)
5. [@RestController 和 @Controller 有什么区别？](http://svip.iocoder.cn/Spring-MVC/Interview/#RestController-%E5%92%8C-Controller-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
6. [@RequestMapping 注解有什么用？](http://svip.iocoder.cn/Spring-MVC/Interview/#RequestMapping-%E6%B3%A8%E8%A7%A3%E6%9C%89%E4%BB%80%E4%B9%88%E7%94%A8%EF%BC%9F)
7. [@RequestMapping 和 @GetMapping 注解的不同之处在哪里？](http://svip.iocoder.cn/Spring-MVC/Interview/#RequestMapping-%E5%92%8C-GetMapping-%E6%B3%A8%E8%A7%A3%E7%9A%84%E4%B8%8D%E5%90%8C%E4%B9%8B%E5%A4%84%E5%9C%A8%E5%93%AA%E9%87%8C%EF%BC%9F)
8. [返回 JSON 格式使用什么注解？](http://svip.iocoder.cn/Spring-MVC/Interview/#%E8%BF%94%E5%9B%9E-JSON-%E6%A0%BC%E5%BC%8F%E4%BD%BF%E7%94%A8%E4%BB%80%E4%B9%88%E6%B3%A8%E8%A7%A3%EF%BC%9F)
9. [介绍一下 WebApplicationContext ？](http://svip.iocoder.cn/Spring-MVC/Interview/#%E4%BB%8B%E7%BB%8D%E4%B8%80%E4%B8%8B-WebApplicationContext-%EF%BC%9F)
10. [Spring MVC 的异常处理？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E7%9A%84%E5%BC%82%E5%B8%B8%E5%A4%84%E7%90%86%EF%BC%9F)
11. [Spring MVC 有什么优点？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%82%B9%EF%BC%9F)
12. [Spring MVC 怎样设定重定向和转发 ？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E6%80%8E%E6%A0%B7%E8%AE%BE%E5%AE%9A%E9%87%8D%E5%AE%9A%E5%90%91%E5%92%8C%E8%BD%AC%E5%8F%91-%EF%BC%9F)
13. [Spring MVC 的 Controller 是不是单例？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E7%9A%84-Controller-%E6%98%AF%E4%B8%8D%E6%98%AF%E5%8D%95%E4%BE%8B%EF%BC%9F)
14. [Spring MVC 和 Struts2 的异同？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E5%92%8C-Struts2-%E7%9A%84%E5%BC%82%E5%90%8C%EF%BC%9F)
15. [详细介绍下 Spring MVC 拦截器？](http://svip.iocoder.cn/Spring-MVC/Interview/#%E8%AF%A6%E7%BB%86%E4%BB%8B%E7%BB%8D%E4%B8%8B-Spring-MVC-%E6%8B%A6%E6%88%AA%E5%99%A8%EF%BC%9F)
16. [Spring MVC 的拦截器可以做哪些事情？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E7%9A%84%E6%8B%A6%E6%88%AA%E5%99%A8%E5%8F%AF%E4%BB%A5%E5%81%9A%E5%93%AA%E4%BA%9B%E4%BA%8B%E6%83%85%EF%BC%9F)
17. [Spring MVC 的拦截器和 Filter 过滤器有什么差别？](http://svip.iocoder.cn/Spring-MVC/Interview/#Spring-MVC-%E7%9A%84%E6%8B%A6%E6%88%AA%E5%99%A8%E5%92%8C-Filter-%E8%BF%87%E6%BB%A4%E5%99%A8%E6%9C%89%E4%BB%80%E4%B9%88%E5%B7%AE%E5%88%AB%EF%BC%9F)

### **REST**

1. [REST 代表着什么?](http://svip.iocoder.cn/Spring-MVC/Interview/#REST-%E4%BB%A3%E8%A1%A8%E7%9D%80%E4%BB%80%E4%B9%88)
2. [资源是什么?](http://svip.iocoder.cn/Spring-MVC/Interview/#%E8%B5%84%E6%BA%90%E6%98%AF%E4%BB%80%E4%B9%88)
3. [什么是安全的 REST 操作?](http://svip.iocoder.cn/Spring-MVC/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%AE%89%E5%85%A8%E7%9A%84-REST-%E6%93%8D%E4%BD%9C)
4. [什么是幂等操作? 为什么幂等操作如此重要?](http://svip.iocoder.cn/Spring-MVC/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%B9%82%E7%AD%89%E6%93%8D%E4%BD%9C-%E4%B8%BA%E4%BB%80%E4%B9%88%E5%B9%82%E7%AD%89%E6%93%8D%E4%BD%9C%E5%A6%82%E6%AD%A4%E9%87%8D%E8%A6%81)
5. [REST 是可扩展的或说是协同的吗?](http://svip.iocoder.cn/Spring-MVC/Interview/#REST-%E6%98%AF%E5%8F%AF%E6%89%A9%E5%B1%95%E7%9A%84%E6%88%96%E8%AF%B4%E6%98%AF%E5%8D%8F%E5%90%8C%E7%9A%84%E5%90%97)
6. [REST 用哪种 HTTP 方法呢?](http://svip.iocoder.cn/Spring-MVC/Interview/#REST-%E7%94%A8%E5%93%AA%E7%A7%8D-HTTP-%E6%96%B9%E6%B3%95%E5%91%A2)
7. [删除的 HTTP 状态返回码是什么 ?](http://svip.iocoder.cn/Spring-MVC/Interview/#%E5%88%A0%E9%99%A4%E7%9A%84-HTTP-%E7%8A%B6%E6%80%81%E8%BF%94%E5%9B%9E%E7%A0%81%E6%98%AF%E4%BB%80%E4%B9%88)
8. [REST API 是无状态的吗?](http://svip.iocoder.cn/Spring-MVC/Interview/#REST-API-%E6%98%AF%E6%97%A0%E7%8A%B6%E6%80%81%E7%9A%84%E5%90%97)
9. [REST安全吗? 你能做什么来保护它?](http://svip.iocoder.cn/Spring-MVC/Interview/#REST%E5%AE%89%E5%85%A8%E5%90%97-%E4%BD%A0%E8%83%BD%E5%81%9A%E4%BB%80%E4%B9%88%E6%9D%A5%E4%BF%9D%E6%8A%A4%E5%AE%83)
10. [RestTemplate 的优势是什么?](http://svip.iocoder.cn/Spring-MVC/Interview/#RestTemplate-%E7%9A%84%E4%BC%98%E5%8A%BF%E6%98%AF%E4%BB%80%E4%B9%88)
11. [HttpMessageConverter 在 Spring REST 中代表什么?](http://svip.iocoder.cn/Spring-MVC/Interview/#HttpMessageConverter-%E5%9C%A8-Spring-REST-%E4%B8%AD%E4%BB%A3%E8%A1%A8%E4%BB%80%E4%B9%88)
12. [如何创建 HttpMessageConverter 的自定义实现来支持一种新的请求/响应？](http://svip.iocoder.cn/Spring-MVC/Interview/#%E5%A6%82%E4%BD%95%E5%88%9B%E5%BB%BA-HttpMessageConverter-%E7%9A%84%E8%87%AA%E5%AE%9A%E4%B9%89%E5%AE%9E%E7%8E%B0%E6%9D%A5%E6%94%AF%E6%8C%81%E4%B8%80%E7%A7%8D%E6%96%B0%E7%9A%84%E8%AF%B7%E6%B1%82-%E5%93%8D%E5%BA%94%EF%BC%9F)
13. [@PathVariable 注解，在 Spring MVC 做了什么? 为什么 REST 在 Spring 中如此有用？](http://svip.iocoder.cn/Spring-MVC/Interview/#PathVariable-%E6%B3%A8%E8%A7%A3%EF%BC%8C%E5%9C%A8-Spring-MVC-%E5%81%9A%E4%BA%86%E4%BB%80%E4%B9%88-%E4%B8%BA%E4%BB%80%E4%B9%88-REST-%E5%9C%A8-Spring-%E4%B8%AD%E5%A6%82%E6%AD%A4%E6%9C%89%E7%94%A8%EF%BC%9F)
14. [666. 彩蛋](http://svip.iocoder.cn/Spring-MVC/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Spring Boot**

1. [Spring Boot 是什么？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [Spring Boot 提供了哪些核心功能？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E6%8F%90%E4%BE%9B%E4%BA%86%E5%93%AA%E4%BA%9B%E6%A0%B8%E5%BF%83%E5%8A%9F%E8%83%BD%EF%BC%9F)
3. [Spring Boot 有什么优缺点？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%BC%BA%E7%82%B9%EF%BC%9F)
4. [Spring Boot、Spring MVC 和 Spring 有什么区别？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot%E3%80%81Spring-MVC-%E5%92%8C-Spring-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
5. [Spring Boot 中的 Starter 是什么？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E4%B8%AD%E7%9A%84-Starter-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
6. [Spring Boot 常用的 Starter 有哪些？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E5%B8%B8%E7%94%A8%E7%9A%84-Starter-%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
7. [创建一个 Spring Boot Project 的最简单的方法是什么？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%88%9B%E5%BB%BA%E4%B8%80%E4%B8%AA-Spring-Boot-Project-%E7%9A%84%E6%9C%80%E7%AE%80%E5%8D%95%E7%9A%84%E6%96%B9%E6%B3%95%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
8. [如何统一引入 Spring Boot 版本？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E7%BB%9F%E4%B8%80%E5%BC%95%E5%85%A5-Spring-Boot-%E7%89%88%E6%9C%AC%EF%BC%9F)
9. [运行 Spring Boot 有哪几种方式？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E8%BF%90%E8%A1%8C-Spring-Boot-%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E6%96%B9%E5%BC%8F%EF%BC%9F)
10. [如何打包 Spring Boot 项目？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E6%89%93%E5%8C%85-Spring-Boot-%E9%A1%B9%E7%9B%AE%EF%BC%9F)
11. [如果更改内嵌 Tomcat 的端口？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E6%9E%9C%E6%9B%B4%E6%94%B9%E5%86%85%E5%B5%8C-Tomcat-%E7%9A%84%E7%AB%AF%E5%8F%A3%EF%BC%9F)
12. [如何重新加载 Spring Boot 上的更改，而无需重新启动服务器？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%87%8D%E6%96%B0%E5%8A%A0%E8%BD%BD-Spring-Boot-%E4%B8%8A%E7%9A%84%E6%9B%B4%E6%94%B9%EF%BC%8C%E8%80%8C%E6%97%A0%E9%9C%80%E9%87%8D%E6%96%B0%E5%90%AF%E5%8A%A8%E6%9C%8D%E5%8A%A1%E5%99%A8%EF%BC%9F)
13. [Spring Boot 的配置文件有哪几种格式？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E7%9A%84%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E6%A0%BC%E5%BC%8F%EF%BC%9F)
14. [Spring Boot 默认配置文件是什么？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E9%BB%98%E8%AE%A4%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
15. [Spring Boot 如何定义多套不同环境配置？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E5%A6%82%E4%BD%95%E5%AE%9A%E4%B9%89%E5%A4%9A%E5%A5%97%E4%B8%8D%E5%90%8C%E7%8E%AF%E5%A2%83%E9%85%8D%E7%BD%AE%EF%BC%9F)
16. [Spring Boot 配置加载顺序？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E9%85%8D%E7%BD%AE%E5%8A%A0%E8%BD%BD%E9%A1%BA%E5%BA%8F%EF%BC%9F)
17. [Spring Boot 有哪些配置方式？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E6%9C%89%E5%93%AA%E4%BA%9B%E9%85%8D%E7%BD%AE%E6%96%B9%E5%BC%8F%EF%BC%9F)
18. [Spring Boot 的核心注解是哪个？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E7%9A%84%E6%A0%B8%E5%BF%83%E6%B3%A8%E8%A7%A3%E6%98%AF%E5%93%AA%E4%B8%AA%EF%BC%9F)
19. [什么是 Spring Boot 自动配置？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Spring-Boot-%E8%87%AA%E5%8A%A8%E9%85%8D%E7%BD%AE%EF%BC%9F)
20. [Spring Boot 有哪几种读取配置的方式？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E8%AF%BB%E5%8F%96%E9%85%8D%E7%BD%AE%E7%9A%84%E6%96%B9%E5%BC%8F%EF%BC%9F)
21. [使用 Spring Boot 后，项目结构是怎么样的呢？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E4%BD%BF%E7%94%A8-Spring-Boot-%E5%90%8E%EF%BC%8C%E9%A1%B9%E7%9B%AE%E7%BB%93%E6%9E%84%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%E5%91%A2%EF%BC%9F)
22. [如何在 Spring Boot 启动的时候运行一些特殊的代码？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E5%9C%A8-Spring-Boot-%E5%90%AF%E5%8A%A8%E7%9A%84%E6%97%B6%E5%80%99%E8%BF%90%E8%A1%8C%E4%B8%80%E4%BA%9B%E7%89%B9%E6%AE%8A%E7%9A%84%E4%BB%A3%E7%A0%81%EF%BC%9F)
23. [Spring Boot 2.X 有什么新特性？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-2-X-%E6%9C%89%E4%BB%80%E4%B9%88%E6%96%B0%E7%89%B9%E6%80%A7%EF%BC%9F)

#### [整合篇](http://svip.iocoder.cn/Spring-Boot/Interview/#%E6%95%B4%E5%90%88%E7%AF%87)

1. [如何将内嵌服务器换成 Jetty ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E5%B0%86%E5%86%85%E5%B5%8C%E6%9C%8D%E5%8A%A1%E5%99%A8%E6%8D%A2%E6%88%90-Jetty-%EF%BC%9F)
2. [Spring Boot 中的监视器 Actuator 是什么？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E4%B8%AD%E7%9A%84%E7%9B%91%E8%A7%86%E5%99%A8-Actuator-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [如何集成 Spring Boot 和 Spring MVC ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-Spring-MVC-%EF%BC%9F)
4. [如何集成 Spring Boot 和 Spring Security ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-Spring-Security-%EF%BC%9F)
5. [如何集成 Spring Boot 和 Spring Security OAuth2 ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-Spring-Security-OAuth2-%EF%BC%9F)
6. [如何集成 Spring Boot 和 JPA ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-JPA-%EF%BC%9F)
7. [如何集成 Spring Boot 和 MyBatis ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-MyBatis-%EF%BC%9F)
8. [如何集成 Spring Boot 和 RabbitMQ ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-RabbitMQ-%EF%BC%9F)
9. [如何集成 Spring Boot 和 Kafka ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-Kafka-%EF%BC%9F)
10. [如何集成 Spring Boot 和 RocketMQ ？](http://svip.iocoder.cn/Spring-Boot/Interview/#%E5%A6%82%E4%BD%95%E9%9B%86%E6%88%90-Spring-Boot-%E5%92%8C-RocketMQ-%EF%BC%9F)
11. [Spring Boot 支持哪些日志框架？](http://svip.iocoder.cn/Spring-Boot/Interview/#Spring-Boot-%E6%94%AF%E6%8C%81%E5%93%AA%E4%BA%9B%E6%97%A5%E5%BF%97%E6%A1%86%E6%9E%B6%EF%BC%9F)
12. [666. 彩蛋](http://svip.iocoder.cn/Spring-Boot/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Spring Cloud**

1. [Spring Cloud 核心功能是什么？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-%E6%A0%B8%E5%BF%83%E5%8A%9F%E8%83%BD%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [Spring Cloud 有哪些组件？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-%E6%9C%89%E5%93%AA%E4%BA%9B%E7%BB%84%E4%BB%B6%EF%BC%9F)
3. [Spring Cloud 和 Spring Boot 的区别和关系？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-%E5%92%8C-Spring-Boot-%E7%9A%84%E5%8C%BA%E5%88%AB%E5%92%8C%E5%85%B3%E7%B3%BB%EF%BC%9F)
4. [Spring Cloud 和 Dubbo 的区别？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-%E5%92%8C-Dubbo-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)

#### [什么是微服务？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%BE%AE%E6%9C%8D%E5%8A%A1%EF%BC%9F)

1. [微服务的优缺点分别是什么？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E5%BE%AE%E6%9C%8D%E5%8A%A1%E7%9A%84%E4%BC%98%E7%BC%BA%E7%82%B9%E5%88%86%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)

#### [注册中心](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E6%B3%A8%E5%86%8C%E4%B8%AD%E5%BF%83)

1. [为什么要使用服务发现？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E4%BD%BF%E7%94%A8%E6%9C%8D%E5%8A%A1%E5%8F%91%E7%8E%B0%EF%BC%9F)

#### [Eureka](http://svip.iocoder.cn/Spring-Cloud/Interview/#Eureka)

1. [Eureka 如何实现集群？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Eureka-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E9%9B%86%E7%BE%A4%EF%BC%9F)
2. [聊聊 Eureka 缓存机制？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E8%81%8A%E8%81%8A-Eureka-%E7%BC%93%E5%AD%98%E6%9C%BA%E5%88%B6%EF%BC%9F)
3. [什么是 Eureka 自我保护机制？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Eureka-%E8%87%AA%E6%88%91%E4%BF%9D%E6%8A%A4%E6%9C%BA%E5%88%B6%EF%BC%9F)

#### [负载均衡](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1)

1. [为什么要负载均衡？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%EF%BC%9F)
2. [Ribbon](http://svip.iocoder.cn/Spring-Cloud/Interview/#Ribbon)
   1. [Ribbon 有哪些负载均衡算法？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Ribbon-%E6%9C%89%E5%93%AA%E4%BA%9B%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%E7%AE%97%E6%B3%95%EF%BC%9F)
   2. [聊聊 Ribbon 缓存机制？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E8%81%8A%E8%81%8A-Ribbon-%E7%BC%93%E5%AD%98%E6%9C%BA%E5%88%B6%EF%BC%9F)
   3. [聊聊 Ribbon 重试机制？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E8%81%8A%E8%81%8A-Ribbon-%E9%87%8D%E8%AF%95%E6%9C%BA%E5%88%B6%EF%BC%9F)
   4. [Ribbon 是怎么和 Eureka 整合的？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Ribbon-%E6%98%AF%E6%80%8E%E4%B9%88%E5%92%8C-Eureka-%E6%95%B4%E5%90%88%E7%9A%84%EF%BC%9F)

   #### [声明式调用](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E5%A3%B0%E6%98%8E%E5%BC%8F%E8%B0%83%E7%94%A8)

1. [Feign](http://svip.iocoder.cn/Spring-Cloud/Interview/#Feign)
   1. [Feign 实现原理？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Feign-%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86%EF%BC%9F)
   2. [Feign 和 Ribbon 的区别？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Feign-%E5%92%8C-Ribbon-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
   3. [Feign 是怎么和 Ribbon、Eureka 整合的？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Feign-%E6%98%AF%E6%80%8E%E4%B9%88%E5%92%8C-Ribbon%E3%80%81Eureka-%E6%95%B4%E5%90%88%E7%9A%84%EF%BC%9F)
   4. [聊聊 Feign 重试机制？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E8%81%8A%E8%81%8A-Feign-%E9%87%8D%E8%AF%95%E6%9C%BA%E5%88%B6%EF%BC%9F)

   #### [服务保障](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E6%9C%8D%E5%8A%A1%E4%BF%9D%E9%9A%9C)

1. [为什么要使用服务保障？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E4%BD%BF%E7%94%A8%E6%9C%8D%E5%8A%A1%E4%BF%9D%E9%9A%9C%EF%BC%9F)
2. [Hystrix](http://svip.iocoder.cn/Spring-Cloud/Interview/#Hystrix)
   1. [Hystrix 隔离策略？](http://svip.iocoder.cn/Spring-Cloud/Interview/#Hystrix-%E9%9A%94%E7%A6%BB%E7%AD%96%E7%95%A5%EF%BC%9F)
   2. [聊聊 Hystrix 缓存机制？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E8%81%8A%E8%81%8A-Hystrix-%E7%BC%93%E5%AD%98%E6%9C%BA%E5%88%B6%EF%BC%9F)
   3. [什么是 Hystrix 断路器？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Hystrix-%E6%96%AD%E8%B7%AF%E5%99%A8%EF%BC%9F)
   4. [什么是 Hystrix 服务降级？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Hystrix-%E6%9C%8D%E5%8A%A1%E9%99%8D%E7%BA%A7%EF%BC%9F)

   #### [网关服务](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E7%BD%91%E5%85%B3%E6%9C%8D%E5%8A%A1)

1. [为什么要网关服务？](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E7%BD%91%E5%85%B3%E6%9C%8D%E5%8A%A1%EF%BC%9F)
2. [Zuul](http://svip.iocoder.cn/Spring-Cloud/Interview/#Zuul)
3. [Spring Cloud Gateway](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-Gateway)

#### [配置中心](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E9%85%8D%E7%BD%AE%E4%B8%AD%E5%BF%83)

1. [Spring Cloud Config](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-Config)
2. [Apollo](http://svip.iocoder.cn/Spring-Cloud/Interview/#Apollo)

#### [链路追踪](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E9%93%BE%E8%B7%AF%E8%BF%BD%E8%B8%AA)

1. [SkyWalking](http://svip.iocoder.cn/Spring-Cloud/Interview/#SkyWalking)
2. [Spring Cloud Sleuth](http://svip.iocoder.cn/Spring-Cloud/Interview/#Spring-Cloud-Sleuth)
3. [TODO 消息队列](http://svip.iocoder.cn/Spring-Cloud/Interview/#TODO-%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97)
4. [彩蛋](http://svip.iocoder.cn/Spring-Cloud/Interview/#%E5%BD%A9%E8%9B%8B)

### **MyBatis**

1. [MyBatis 编程步骤](http://svip.iocoder.cn/MyBatis/Interview/#MyBatis-%E7%BC%96%E7%A8%8B%E6%AD%A5%E9%AA%A4)
2. [\#{} 和 ${} 的区别是什么？](http://svip.iocoder.cn/MyBatis/Interview/#%E5%92%8C-%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [当实体类中的属性名和表中的字段名不一样 ，怎么办？](http://svip.iocoder.cn/MyBatis/Interview/#%E5%BD%93%E5%AE%9E%E4%BD%93%E7%B1%BB%E4%B8%AD%E7%9A%84%E5%B1%9E%E6%80%A7%E5%90%8D%E5%92%8C%E8%A1%A8%E4%B8%AD%E7%9A%84%E5%AD%97%E6%AE%B5%E5%90%8D%E4%B8%8D%E4%B8%80%E6%A0%B7-%EF%BC%8C%E6%80%8E%E4%B9%88%E5%8A%9E%EF%BC%9F)
4. [XML 映射文件中，除了常见的 select | insert | update | delete标 签之外，还有哪些标签？](http://svip.iocoder.cn/MyBatis/Interview/#XML-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E4%B8%AD%EF%BC%8C%E9%99%A4%E4%BA%86%E5%B8%B8%E8%A7%81%E7%9A%84-select-insert-update-delete%E6%A0%87-%E7%AD%BE%E4%B9%8B%E5%A4%96%EF%BC%8C%E8%BF%98%E6%9C%89%E5%93%AA%E4%BA%9B%E6%A0%87%E7%AD%BE%EF%BC%9F)
5. [Mybatis 动态 SQL 是做什么的？都有哪些动态 SQL ？能简述一下动态 SQL 的执行原理吗？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E5%8A%A8%E6%80%81-SQL-%E6%98%AF%E5%81%9A%E4%BB%80%E4%B9%88%E7%9A%84%EF%BC%9F%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E5%8A%A8%E6%80%81-SQL-%EF%BC%9F%E8%83%BD%E7%AE%80%E8%BF%B0%E4%B8%80%E4%B8%8B%E5%8A%A8%E6%80%81-SQL-%E7%9A%84%E6%89%A7%E8%A1%8C%E5%8E%9F%E7%90%86%E5%90%97%EF%BC%9F)
6. [最佳实践中，通常一个 XML 映射文件，都会写一个 Mapper 接口与之对应。请问，这个 Mapper 接口的工作原理是什么？Mapper 接口里的方法，参数不同时，方法能重载吗？](http://svip.iocoder.cn/MyBatis/Interview/#%E6%9C%80%E4%BD%B3%E5%AE%9E%E8%B7%B5%E4%B8%AD%EF%BC%8C%E9%80%9A%E5%B8%B8%E4%B8%80%E4%B8%AA-XML-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%EF%BC%8C%E9%83%BD%E4%BC%9A%E5%86%99%E4%B8%80%E4%B8%AA-Mapper-%E6%8E%A5%E5%8F%A3%E4%B8%8E%E4%B9%8B%E5%AF%B9%E5%BA%94%E3%80%82%E8%AF%B7%E9%97%AE%EF%BC%8C%E8%BF%99%E4%B8%AA-Mapper-%E6%8E%A5%E5%8F%A3%E7%9A%84%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9FMapper-%E6%8E%A5%E5%8F%A3%E9%87%8C%E7%9A%84%E6%96%B9%E6%B3%95%EF%BC%8C%E5%8F%82%E6%95%B0%E4%B8%8D%E5%90%8C%E6%97%B6%EF%BC%8C%E6%96%B9%E6%B3%95%E8%83%BD%E9%87%8D%E8%BD%BD%E5%90%97%EF%BC%9F)
7. [Mapper 接口绑定有几种实现方式,分别是怎么实现的?](http://svip.iocoder.cn/MyBatis/Interview/#Mapper-%E6%8E%A5%E5%8F%A3%E7%BB%91%E5%AE%9A%E6%9C%89%E5%87%A0%E7%A7%8D%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F-%E5%88%86%E5%88%AB%E6%98%AF%E6%80%8E%E4%B9%88%E5%AE%9E%E7%8E%B0%E7%9A%84)
8. [Mybatis 的 XML Mapper文件中，不同的 XML 映射文件，id 是否可以重复？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E7%9A%84-XML-Mapper%E6%96%87%E4%BB%B6%E4%B8%AD%EF%BC%8C%E4%B8%8D%E5%90%8C%E7%9A%84-XML-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%EF%BC%8Cid-%E6%98%AF%E5%90%A6%E5%8F%AF%E4%BB%A5%E9%87%8D%E5%A4%8D%EF%BC%9F)
9. [如何获取自动生成的(主)键值?](http://svip.iocoder.cn/MyBatis/Interview/#%E5%A6%82%E4%BD%95%E8%8E%B7%E5%8F%96%E8%87%AA%E5%8A%A8%E7%94%9F%E6%88%90%E7%9A%84-%E4%B8%BB-%E9%94%AE%E5%80%BC)
10. [Mybatis 执行批量插入，能返回数据库主键列表吗？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E6%89%A7%E8%A1%8C%E6%89%B9%E9%87%8F%E6%8F%92%E5%85%A5%EF%BC%8C%E8%83%BD%E8%BF%94%E5%9B%9E%E6%95%B0%E6%8D%AE%E5%BA%93%E4%B8%BB%E9%94%AE%E5%88%97%E8%A1%A8%E5%90%97%EF%BC%9F)
11. [在 Mapper 中如何传递多个参数?](http://svip.iocoder.cn/MyBatis/Interview/#%E5%9C%A8-Mapper-%E4%B8%AD%E5%A6%82%E4%BD%95%E4%BC%A0%E9%80%92%E5%A4%9A%E4%B8%AA%E5%8F%82%E6%95%B0)
12. [Mybatis 是否可以映射 Enum 枚举类？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E6%98%AF%E5%90%A6%E5%8F%AF%E4%BB%A5%E6%98%A0%E5%B0%84-Enum-%E6%9E%9A%E4%B8%BE%E7%B1%BB%EF%BC%9F)
13. [Mybatis 都有哪些 Executor 执行器？它们之间的区别是什么？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B-Executor-%E6%89%A7%E8%A1%8C%E5%99%A8%EF%BC%9F%E5%AE%83%E4%BB%AC%E4%B9%8B%E9%97%B4%E7%9A%84%E5%8C%BA%E5%88%AB%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
14. [MyBatis 如何执行批量插入?](http://svip.iocoder.cn/MyBatis/Interview/#MyBatis-%E5%A6%82%E4%BD%95%E6%89%A7%E8%A1%8C%E6%89%B9%E9%87%8F%E6%8F%92%E5%85%A5)
15. [介绍 MyBatis 的一级缓存和二级缓存的概念和实现原理？](http://svip.iocoder.cn/MyBatis/Interview/#%E4%BB%8B%E7%BB%8D-MyBatis-%E7%9A%84%E4%B8%80%E7%BA%A7%E7%BC%93%E5%AD%98%E5%92%8C%E4%BA%8C%E7%BA%A7%E7%BC%93%E5%AD%98%E7%9A%84%E6%A6%82%E5%BF%B5%E5%92%8C%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86%EF%BC%9F)
16. [Mybatis 是否支持延迟加载？如果支持，它的实现原理是什么？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E6%98%AF%E5%90%A6%E6%94%AF%E6%8C%81%E5%BB%B6%E8%BF%9F%E5%8A%A0%E8%BD%BD%EF%BC%9F%E5%A6%82%E6%9E%9C%E6%94%AF%E6%8C%81%EF%BC%8C%E5%AE%83%E7%9A%84%E5%AE%9E%E7%8E%B0%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
17. [Mybatis 能否执行一对一、一对多的关联查询吗？都有哪些实现方式，以及它们之间的区别。](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E8%83%BD%E5%90%A6%E6%89%A7%E8%A1%8C%E4%B8%80%E5%AF%B9%E4%B8%80%E3%80%81%E4%B8%80%E5%AF%B9%E5%A4%9A%E7%9A%84%E5%85%B3%E8%81%94%E6%9F%A5%E8%AF%A2%E5%90%97%EF%BC%9F%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F%EF%BC%8C%E4%BB%A5%E5%8F%8A%E5%AE%83%E4%BB%AC%E4%B9%8B%E9%97%B4%E7%9A%84%E5%8C%BA%E5%88%AB%E3%80%82)
18. [简述 Mybatis 的插件运行原理？以及如何编写一个插件？](http://svip.iocoder.cn/MyBatis/Interview/#%E7%AE%80%E8%BF%B0-Mybatis-%E7%9A%84%E6%8F%92%E4%BB%B6%E8%BF%90%E8%A1%8C%E5%8E%9F%E7%90%86%EF%BC%9F%E4%BB%A5%E5%8F%8A%E5%A6%82%E4%BD%95%E7%BC%96%E5%86%99%E4%B8%80%E4%B8%AA%E6%8F%92%E4%BB%B6%EF%BC%9F)
19. [Mybatis 是如何进行分页的？分页插件的原理是什么？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E6%98%AF%E5%A6%82%E4%BD%95%E8%BF%9B%E8%A1%8C%E5%88%86%E9%A1%B5%E7%9A%84%EF%BC%9F%E5%88%86%E9%A1%B5%E6%8F%92%E4%BB%B6%E7%9A%84%E5%8E%9F%E7%90%86%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
20. [MyBatis 与 Hibernate 有哪些不同？](http://svip.iocoder.cn/MyBatis/Interview/#MyBatis-%E4%B8%8E-Hibernate-%E6%9C%89%E5%93%AA%E4%BA%9B%E4%B8%8D%E5%90%8C%EF%BC%9F)
21. [JDBC 编程有哪些不足之处，MyBatis是如何解决这些问题的？](http://svip.iocoder.cn/MyBatis/Interview/#JDBC-%E7%BC%96%E7%A8%8B%E6%9C%89%E5%93%AA%E4%BA%9B%E4%B8%8D%E8%B6%B3%E4%B9%8B%E5%A4%84%EF%BC%8CMyBatis%E6%98%AF%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E8%BF%99%E4%BA%9B%E9%97%AE%E9%A2%98%E7%9A%84%EF%BC%9F)
22. [Mybatis 比 IBatis 比较大的几个改进是什么？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E6%AF%94-IBatis-%E6%AF%94%E8%BE%83%E5%A4%A7%E7%9A%84%E5%87%A0%E4%B8%AA%E6%94%B9%E8%BF%9B%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
23. [Mybatis 映射文件中，如果 A 标签通过 include 引用了B标签的内容，请问，B 标签能否定义在 A 标签的后面，还是说必须定义在A标签的前面？](http://svip.iocoder.cn/MyBatis/Interview/#Mybatis-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E4%B8%AD%EF%BC%8C%E5%A6%82%E6%9E%9C-A-%E6%A0%87%E7%AD%BE%E9%80%9A%E8%BF%87-include-%E5%BC%95%E7%94%A8%E4%BA%86B%E6%A0%87%E7%AD%BE%E7%9A%84%E5%86%85%E5%AE%B9%EF%BC%8C%E8%AF%B7%E9%97%AE%EF%BC%8CB-%E6%A0%87%E7%AD%BE%E8%83%BD%E5%90%A6%E5%AE%9A%E4%B9%89%E5%9C%A8-A-%E6%A0%87%E7%AD%BE%E7%9A%84%E5%90%8E%E9%9D%A2%EF%BC%8C%E8%BF%98%E6%98%AF%E8%AF%B4%E5%BF%85%E9%A1%BB%E5%AE%9A%E4%B9%89%E5%9C%A8A%E6%A0%87%E7%AD%BE%E7%9A%84%E5%89%8D%E9%9D%A2%EF%BC%9F)
24. [简述 Mybatis 的 XML 映射文件和 Mybatis 内部数据结构之间的映射关系？](http://svip.iocoder.cn/MyBatis/Interview/#%E7%AE%80%E8%BF%B0-Mybatis-%E7%9A%84-XML-%E6%98%A0%E5%B0%84%E6%96%87%E4%BB%B6%E5%92%8C-Mybatis-%E5%86%85%E9%83%A8%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E4%B9%8B%E9%97%B4%E7%9A%84%E6%98%A0%E5%B0%84%E5%85%B3%E7%B3%BB%EF%BC%9F)
25. [666. 彩蛋](http://svip.iocoder.cn/MyBatis/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **消息队列**

1. [什么是消息队列？](http://svip.iocoder.cn/MQ/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%EF%BC%9F)
2. [消息队列由哪些角色组成？](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E7%94%B1%E5%93%AA%E4%BA%9B%E8%A7%92%E8%89%B2%E7%BB%84%E6%88%90%EF%BC%9F)
3. [消息队列有哪些使用场景？](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E6%9C%89%E5%93%AA%E4%BA%9B%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF%EF%BC%9F)
4. [为什么使用消息队列进行应用解耦？](http://svip.iocoder.cn/MQ/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BD%BF%E7%94%A8%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E8%BF%9B%E8%A1%8C%E5%BA%94%E7%94%A8%E8%A7%A3%E8%80%A6%EF%BC%9F)
5. [为什么使用消息队列进行异步处理？](http://svip.iocoder.cn/MQ/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BD%BF%E7%94%A8%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E8%BF%9B%E8%A1%8C%E5%BC%82%E6%AD%A5%E5%A4%84%E7%90%86%EF%BC%9F)
6. [为什么使用消息队列进行流量消峰？](http://svip.iocoder.cn/MQ/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BD%BF%E7%94%A8%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E8%BF%9B%E8%A1%8C%E6%B5%81%E9%87%8F%E6%B6%88%E5%B3%B0%EF%BC%9F)
7. [为什么使用消息队列进行消息通信？](http://svip.iocoder.cn/MQ/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BD%BF%E7%94%A8%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E8%BF%9B%E8%A1%8C%E6%B6%88%E6%81%AF%E9%80%9A%E4%BF%A1%EF%BC%9F)
8. [如何使用消息队列进行日志处理？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E8%BF%9B%E8%A1%8C%E6%97%A5%E5%BF%97%E5%A4%84%E7%90%86%EF%BC%9F)
9. [消息队列有什么优缺点？](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%BC%BA%E7%82%B9%EF%BC%9F)
10. [消息队列有几种消费语义？](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E6%9C%89%E5%87%A0%E7%A7%8D%E6%B6%88%E8%B4%B9%E8%AF%AD%E4%B9%89%EF%BC%9F)
11. [消息队列有几种投递方式？分别有什么优缺点](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E6%9C%89%E5%87%A0%E7%A7%8D%E6%8A%95%E9%80%92%E6%96%B9%E5%BC%8F%EF%BC%9F%E5%88%86%E5%88%AB%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%BC%BA%E7%82%B9)
12. [如何保证消费者的消费消息的幂等性？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E4%BF%9D%E8%AF%81%E6%B6%88%E8%B4%B9%E8%80%85%E7%9A%84%E6%B6%88%E8%B4%B9%E6%B6%88%E6%81%AF%E7%9A%84%E5%B9%82%E7%AD%89%E6%80%A7%EF%BC%9F)
13. [如何保证生产者的发送消息的可靠性？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E4%BF%9D%E8%AF%81%E7%94%9F%E4%BA%A7%E8%80%85%E7%9A%84%E5%8F%91%E9%80%81%E6%B6%88%E6%81%AF%E7%9A%84%E5%8F%AF%E9%9D%A0%E6%80%A7%EF%BC%9F)
14. [如何保证消息的顺序性？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E4%BF%9D%E8%AF%81%E6%B6%88%E6%81%AF%E7%9A%84%E9%A1%BA%E5%BA%8F%E6%80%A7%EF%BC%9F)
15. [如何解决消息积压的问题？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E6%B6%88%E6%81%AF%E7%A7%AF%E5%8E%8B%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)
16. [如何解决消息过期的问题？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E6%B6%88%E6%81%AF%E8%BF%87%E6%9C%9F%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)
17. [消息队列如何实现高可用？](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E9%AB%98%E5%8F%AF%E7%94%A8%EF%BC%9F)
18. [Kafka、ActiveMQ、RabbitMQ、RocketMQ 有什么优缺点？](http://svip.iocoder.cn/MQ/Interview/#Kafka%E3%80%81ActiveMQ%E3%80%81RabbitMQ%E3%80%81RocketMQ-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%BC%BA%E7%82%B9%EF%BC%9F)
19. [消息队列的一般存储方式有哪些？](http://svip.iocoder.cn/MQ/Interview/#%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%E7%9A%84%E4%B8%80%E8%88%AC%E5%AD%98%E5%82%A8%E6%96%B9%E5%BC%8F%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
20. [如何自己设计消息队列？](http://svip.iocoder.cn/MQ/Interview/#%E5%A6%82%E4%BD%95%E8%87%AA%E5%B7%B1%E8%AE%BE%E8%AE%A1%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%EF%BC%9F)
21. [666. 彩蛋](http://svip.iocoder.cn/MQ/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **RabbitMQ**

1. [RabbitMQ 是什么？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [RabbitMQ 中的 Broker 是指什么？Cluster 又是指什么？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E4%B8%AD%E7%9A%84-Broker-%E6%98%AF%E6%8C%87%E4%BB%80%E4%B9%88%EF%BC%9FCluster-%E5%8F%88%E6%98%AF%E6%8C%87%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [什么是元数据？元数据分为哪些类型？包括哪些内容？](http://svip.iocoder.cn/RabbitMQ/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%85%83%E6%95%B0%E6%8D%AE%EF%BC%9F%E5%85%83%E6%95%B0%E6%8D%AE%E5%88%86%E4%B8%BA%E5%93%AA%E4%BA%9B%E7%B1%BB%E5%9E%8B%EF%BC%9F%E5%8C%85%E6%8B%AC%E5%93%AA%E4%BA%9B%E5%86%85%E5%AE%B9%EF%BC%9F)
4. [RabbitMQ 概念里的 channel、exchange 和 queue 是什么？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E6%A6%82%E5%BF%B5%E9%87%8C%E7%9A%84-channel%E3%80%81exchange-%E5%92%8C-queue-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
5. [如何确保消息正确地发送至 RabbitMQ？](http://svip.iocoder.cn/RabbitMQ/Interview/#%E5%A6%82%E4%BD%95%E7%A1%AE%E4%BF%9D%E6%B6%88%E6%81%AF%E6%AD%A3%E7%A1%AE%E5%9C%B0%E5%8F%91%E9%80%81%E8%87%B3-RabbitMQ%EF%BC%9F)
6. [如何确保消息接收方消费了消息？](http://svip.iocoder.cn/RabbitMQ/Interview/#%E5%A6%82%E4%BD%95%E7%A1%AE%E4%BF%9D%E6%B6%88%E6%81%AF%E6%8E%A5%E6%94%B6%E6%96%B9%E6%B6%88%E8%B4%B9%E4%BA%86%E6%B6%88%E6%81%AF%EF%BC%9F)
7. [为什么不应该对所有的 message 都使用持久化机制？](http://svip.iocoder.cn/RabbitMQ/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%B8%8D%E5%BA%94%E8%AF%A5%E5%AF%B9%E6%89%80%E6%9C%89%E7%9A%84-message-%E9%83%BD%E4%BD%BF%E7%94%A8%E6%8C%81%E4%B9%85%E5%8C%96%E6%9C%BA%E5%88%B6%EF%BC%9F)
8. [什么是死信队列？](http://svip.iocoder.cn/RabbitMQ/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E6%AD%BB%E4%BF%A1%E9%98%9F%E5%88%97%EF%BC%9F)
9. [RabbitMQ 中的 cluster、mirrored queue，以及 warrens 机制分别用于解决什么问题？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E4%B8%AD%E7%9A%84-cluster%E3%80%81mirrored-queue%EF%BC%8C%E4%BB%A5%E5%8F%8A-warrens-%E6%9C%BA%E5%88%B6%E5%88%86%E5%88%AB%E7%94%A8%E4%BA%8E%E8%A7%A3%E5%86%B3%E4%BB%80%E4%B9%88%E9%97%AE%E9%A2%98%EF%BC%9F)
10. [RabbitMQ 如何实现高可用？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E9%AB%98%E5%8F%AF%E7%94%A8%EF%BC%9F)
11. [如何使用 RabbitMQ 实现 RPC](http://svip.iocoder.cn/RabbitMQ/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-RabbitMQ-%E5%AE%9E%E7%8E%B0-RPC)
12. [RabbitMQ 是否会弄丢数据？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E6%98%AF%E5%90%A6%E4%BC%9A%E5%BC%84%E4%B8%A2%E6%95%B0%E6%8D%AE%EF%BC%9F)
13. [RabbitMQ 如何保证消息的顺序性？](http://svip.iocoder.cn/RabbitMQ/Interview/#RabbitMQ-%E5%A6%82%E4%BD%95%E4%BF%9D%E8%AF%81%E6%B6%88%E6%81%AF%E7%9A%84%E9%A1%BA%E5%BA%8F%E6%80%A7%EF%BC%9F)
14. [666. 彩蛋](http://svip.iocoder.cn/RabbitMQ/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **缓存**

1. [什么是缓存？](http://svip.iocoder.cn/Cache/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%BC%93%E5%AD%98%EF%BC%9F)
2. [为什么要用缓存？](http://svip.iocoder.cn/Cache/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E8%A6%81%E7%94%A8%E7%BC%93%E5%AD%98%EF%BC%9F)
3. [请说说有哪些缓存算法？是否能手写一下 LRU 代码的实现？](http://svip.iocoder.cn/Cache/Interview/#%E8%AF%B7%E8%AF%B4%E8%AF%B4%E6%9C%89%E5%93%AA%E4%BA%9B%E7%BC%93%E5%AD%98%E7%AE%97%E6%B3%95%EF%BC%9F%E6%98%AF%E5%90%A6%E8%83%BD%E6%89%8B%E5%86%99%E4%B8%80%E4%B8%8B-LRU-%E4%BB%A3%E7%A0%81%E7%9A%84%E5%AE%9E%E7%8E%B0%EF%BC%9F)
4. [常见的常见的缓存工具和框架有哪些？](http://svip.iocoder.cn/Cache/Interview/#%E5%B8%B8%E8%A7%81%E7%9A%84%E5%B8%B8%E8%A7%81%E7%9A%84%E7%BC%93%E5%AD%98%E5%B7%A5%E5%85%B7%E5%92%8C%E6%A1%86%E6%9E%B6%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
5. [用了缓存之后，有哪些常见问题？](http://svip.iocoder.cn/Cache/Interview/#%E7%94%A8%E4%BA%86%E7%BC%93%E5%AD%98%E4%B9%8B%E5%90%8E%EF%BC%8C%E6%9C%89%E5%93%AA%E4%BA%9B%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98%EF%BC%9F)
6. [当查询缓存报错，怎么提高可用性？](http://svip.iocoder.cn/Cache/Interview/#%E5%BD%93%E6%9F%A5%E8%AF%A2%E7%BC%93%E5%AD%98%E6%8A%A5%E9%94%99%EF%BC%8C%E6%80%8E%E4%B9%88%E6%8F%90%E9%AB%98%E5%8F%AF%E7%94%A8%E6%80%A7%EF%BC%9F)
7. [如果避免缓存”穿透”的问题？](http://svip.iocoder.cn/Cache/Interview/#%E5%A6%82%E6%9E%9C%E9%81%BF%E5%85%8D%E7%BC%93%E5%AD%98%E2%80%9D%E7%A9%BF%E9%80%8F%E2%80%9D%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)
8. [如何避免缓存”雪崩”的问题？](http://svip.iocoder.cn/Cache/Interview/#%E5%A6%82%E4%BD%95%E9%81%BF%E5%85%8D%E7%BC%93%E5%AD%98%E2%80%9D%E9%9B%AA%E5%B4%A9%E2%80%9D%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)
9. [如果避免缓存”击穿”的问题？](http://svip.iocoder.cn/Cache/Interview/#%E5%A6%82%E6%9E%9C%E9%81%BF%E5%85%8D%E7%BC%93%E5%AD%98%E2%80%9D%E5%87%BB%E7%A9%BF%E2%80%9D%E7%9A%84%E9%97%AE%E9%A2%98%EF%BC%9F)
10. [缓存和 DB 的一致性如何保证？](http://svip.iocoder.cn/Cache/Interview/#%E7%BC%93%E5%AD%98%E5%92%8C-DB-%E7%9A%84%E4%B8%80%E8%87%B4%E6%80%A7%E5%A6%82%E4%BD%95%E4%BF%9D%E8%AF%81%EF%BC%9F)
11. [什么是缓存预热？如何实现缓存预热？](http://svip.iocoder.cn/Cache/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%BC%93%E5%AD%98%E9%A2%84%E7%83%AD%EF%BC%9F%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E7%BC%93%E5%AD%98%E9%A2%84%E7%83%AD%EF%BC%9F)
12. [缓存数据的淘汰策略有哪些？](http://svip.iocoder.cn/Cache/Interview/#%E7%BC%93%E5%AD%98%E6%95%B0%E6%8D%AE%E7%9A%84%E6%B7%98%E6%B1%B0%E7%AD%96%E7%95%A5%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
13. [缓存如何存储 POJO 对象？](http://svip.iocoder.cn/Cache/Interview/#%E7%BC%93%E5%AD%98%E5%A6%82%E4%BD%95%E5%AD%98%E5%82%A8-POJO-%E5%AF%B9%E8%B1%A1%EF%BC%9F)
14. [666. 彩蛋](http://svip.iocoder.cn/Cache/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Redis**

1. [什么是 Redis ？](http://svip.iocoder.cn/Redis/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Redis-%EF%BC%9F)
2. [Redis 有什么优点？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E4%BB%80%E4%B9%88%E4%BC%98%E7%82%B9%EF%BC%9F)
3. [Redis 有什么缺点？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E4%BB%80%E4%B9%88%E7%BC%BA%E7%82%B9%EF%BC%9F)
4. [Redis 和 Memcached 的区别有哪些？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E5%92%8C-Memcached-%E7%9A%84%E5%8C%BA%E5%88%AB%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
5. [请说说 Redis 的线程模型？](http://svip.iocoder.cn/Redis/Interview/#%E8%AF%B7%E8%AF%B4%E8%AF%B4-Redis-%E7%9A%84%E7%BA%BF%E7%A8%8B%E6%A8%A1%E5%9E%8B%EF%BC%9F)
6. [为什么 Redis 单线程模型也能效率这么高？](http://svip.iocoder.cn/Redis/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88-Redis-%E5%8D%95%E7%BA%BF%E7%A8%8B%E6%A8%A1%E5%9E%8B%E4%B9%9F%E8%83%BD%E6%95%88%E7%8E%87%E8%BF%99%E4%B9%88%E9%AB%98%EF%BC%9F)
7. [Redis 是单线程的，如何提高多核 CPU 的利用率？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%98%AF%E5%8D%95%E7%BA%BF%E7%A8%8B%E7%9A%84%EF%BC%8C%E5%A6%82%E4%BD%95%E6%8F%90%E9%AB%98%E5%A4%9A%E6%A0%B8-CPU-%E7%9A%84%E5%88%A9%E7%94%A8%E7%8E%87%EF%BC%9F)
8. [Redis 有几种持久化方式？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E5%87%A0%E7%A7%8D%E6%8C%81%E4%B9%85%E5%8C%96%E6%96%B9%E5%BC%8F%EF%BC%9F)
9. [Redis 有几种数据“过期”策略？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E5%87%A0%E7%A7%8D%E6%95%B0%E6%8D%AE%E2%80%9C%E8%BF%87%E6%9C%9F%E2%80%9D%E7%AD%96%E7%95%A5%EF%BC%9F)
10. [Redis 有哪几种数据“淘汰”策略？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E6%95%B0%E6%8D%AE%E2%80%9C%E6%B7%98%E6%B1%B0%E2%80%9D%E7%AD%96%E7%95%A5%EF%BC%9F)
11. [如果有大量的 key 需要设置同一时间过期，一般需要注意什么？](http://svip.iocoder.cn/Redis/Interview/#%E5%A6%82%E6%9E%9C%E6%9C%89%E5%A4%A7%E9%87%8F%E7%9A%84-key-%E9%9C%80%E8%A6%81%E8%AE%BE%E7%BD%AE%E5%90%8C%E4%B8%80%E6%97%B6%E9%97%B4%E8%BF%87%E6%9C%9F%EF%BC%8C%E4%B8%80%E8%88%AC%E9%9C%80%E8%A6%81%E6%B3%A8%E6%84%8F%E4%BB%80%E4%B9%88%EF%BC%9F)
12. [Redis 有哪些数据结构？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E5%93%AA%E4%BA%9B%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%EF%BC%9F)
13. [聊聊 Redis 使用场景](http://svip.iocoder.cn/Redis/Interview/#%E8%81%8A%E8%81%8A-Redis-%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF)
14. [Redis 支持的 Java 客户端都有哪些？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%94%AF%E6%8C%81%E7%9A%84-Java-%E5%AE%A2%E6%88%B7%E7%AB%AF%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F)
15. [如何使用 Redis 实现分布式锁？](http://svip.iocoder.cn/Redis/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-Redis-%E5%AE%9E%E7%8E%B0%E5%88%86%E5%B8%83%E5%BC%8F%E9%94%81%EF%BC%9F)
16. [如何使用 Redis 实现分布式限流？](http://svip.iocoder.cn/Redis/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-Redis-%E5%AE%9E%E7%8E%B0%E5%88%86%E5%B8%83%E5%BC%8F%E9%99%90%E6%B5%81%EF%BC%9F)
17. [如何使用 Redis 实现消息队列？](http://svip.iocoder.cn/Redis/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-Redis-%E5%AE%9E%E7%8E%B0%E6%B6%88%E6%81%AF%E9%98%9F%E5%88%97%EF%BC%9F)
18. [什么是 Redis Pipelining ？](http://svip.iocoder.cn/Redis/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Redis-Pipelining-%EF%BC%9F)
19. [什么是 Redis 事务？](http://svip.iocoder.cn/Redis/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Redis-%E4%BA%8B%E5%8A%A1%EF%BC%9F)
20. [Redis 集群都有哪些方案？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E9%9B%86%E7%BE%A4%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%E6%96%B9%E6%A1%88%EF%BC%9F)
21. [什么是 Redis 主从同步？](http://svip.iocoder.cn/Redis/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Redis-%E4%B8%BB%E4%BB%8E%E5%90%8C%E6%AD%A5%EF%BC%9F)
22. [如何使用 Redis Sentinel 实现高可用？](http://svip.iocoder.cn/Redis/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E7%94%A8-Redis-Sentinel-%E5%AE%9E%E7%8E%B0%E9%AB%98%E5%8F%AF%E7%94%A8%EF%BC%9F)
23. [如果使用 Redis Cluster 实现高可用？](http://svip.iocoder.cn/Redis/Interview/#%E5%A6%82%E6%9E%9C%E4%BD%BF%E7%94%A8-Redis-Cluster-%E5%AE%9E%E7%8E%B0%E9%AB%98%E5%8F%AF%E7%94%A8%EF%BC%9F)
24. [什么是 Redis 分区？](http://svip.iocoder.cn/Redis/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Redis-%E5%88%86%E5%8C%BA%EF%BC%9F)
25. [Redis 有哪些重要的健康指标？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E6%9C%89%E5%93%AA%E4%BA%9B%E9%87%8D%E8%A6%81%E7%9A%84%E5%81%A5%E5%BA%B7%E6%8C%87%E6%A0%87%EF%BC%9F)
26. [怎么优化 Redis 的内存占用？](http://svip.iocoder.cn/Redis/Interview/#%E6%80%8E%E4%B9%88%E4%BC%98%E5%8C%96-Redis-%E7%9A%84%E5%86%85%E5%AD%98%E5%8D%A0%E7%94%A8%EF%BC%9F)
27. [Redis 常见的性能问题都有哪些？如何解决？](http://svip.iocoder.cn/Redis/Interview/#Redis-%E5%B8%B8%E8%A7%81%E7%9A%84%E6%80%A7%E8%83%BD%E9%97%AE%E9%A2%98%E9%83%BD%E6%9C%89%E5%93%AA%E4%BA%9B%EF%BC%9F%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%EF%BC%9F)
28. [修改配置不重启 Redis 会实时生效吗？](http://svip.iocoder.cn/Redis/Interview/#%E4%BF%AE%E6%94%B9%E9%85%8D%E7%BD%AE%E4%B8%8D%E9%87%8D%E5%90%AF-Redis-%E4%BC%9A%E5%AE%9E%E6%97%B6%E7%94%9F%E6%95%88%E5%90%97%EF%BC%9F)
29. [其他问题](http://svip.iocoder.cn/Redis/Interview/#%E5%85%B6%E4%BB%96%E9%97%AE%E9%A2%98)
30. [666. 彩蛋](http://svip.iocoder.cn/Redis/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **MySQL**

1. [为什么互联网公司一般选择 MySQL 而不是 Oracle?](http://svip.iocoder.cn/MySQL/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BA%92%E8%81%94%E7%BD%91%E5%85%AC%E5%8F%B8%E4%B8%80%E8%88%AC%E9%80%89%E6%8B%A9-MySQL-%E8%80%8C%E4%B8%8D%E6%98%AF-Oracle)
2. [数据库的三范式是什么？什么是反模式？](http://svip.iocoder.cn/MySQL/Interview/#%E6%95%B0%E6%8D%AE%E5%BA%93%E7%9A%84%E4%B8%89%E8%8C%83%E5%BC%8F%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F%E4%BB%80%E4%B9%88%E6%98%AF%E5%8F%8D%E6%A8%A1%E5%BC%8F%EF%BC%9F)
3. [MySQL 有哪些数据类型？](http://svip.iocoder.cn/MySQL/Interview/#MySQL-%E6%9C%89%E5%93%AA%E4%BA%9B%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%EF%BC%9F)
4. [MySQL 有哪些存储引擎？](http://svip.iocoder.cn/MySQL/Interview/#MySQL-%E6%9C%89%E5%93%AA%E4%BA%9B%E5%AD%98%E5%82%A8%E5%BC%95%E6%93%8E%EF%BC%9F)
5. [【重点】什么是索引？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E9%87%8D%E7%82%B9%E3%80%91%E4%BB%80%E4%B9%88%E6%98%AF%E7%B4%A2%E5%BC%95%EF%BC%9F)
6. [【重点】MySQL 索引的原理？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E9%87%8D%E7%82%B9%E3%80%91MySQL-%E7%B4%A2%E5%BC%95%E7%9A%84%E5%8E%9F%E7%90%86%EF%BC%9F)
7. [【重点】请说说 MySQL 的四种事务隔离级别？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E9%87%8D%E7%82%B9%E3%80%91%E8%AF%B7%E8%AF%B4%E8%AF%B4-MySQL-%E7%9A%84%E5%9B%9B%E7%A7%8D%E4%BA%8B%E5%8A%A1%E9%9A%94%E7%A6%BB%E7%BA%A7%E5%88%AB%EF%BC%9F)
8. [【重点】请说说 MySQL 的锁机制？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E9%87%8D%E7%82%B9%E3%80%91%E8%AF%B7%E8%AF%B4%E8%AF%B4-MySQL-%E7%9A%84%E9%94%81%E6%9C%BA%E5%88%B6%EF%BC%9F)
9. [【重要】MySQL 查询执行顺序？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91MySQL-%E6%9F%A5%E8%AF%A2%E6%89%A7%E8%A1%8C%E9%A1%BA%E5%BA%8F%EF%BC%9F)
10. [【重要】聊聊 MySQL SQL 优化？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91%E8%81%8A%E8%81%8A-MySQL-SQL-%E4%BC%98%E5%8C%96%EF%BC%9F)
11. [【加分】什么是 MVCC ？](http://svip.iocoder.cn/MySQL/Interview/#%E3%80%90%E5%8A%A0%E5%88%86%E3%80%91%E4%BB%80%E4%B9%88%E6%98%AF-MVCC-%EF%BC%9F)
12. [编写 SQL 查询语句的考题合集](http://svip.iocoder.cn/MySQL/Interview/#%E7%BC%96%E5%86%99-SQL-%E6%9F%A5%E8%AF%A2%E8%AF%AD%E5%8F%A5%E7%9A%84%E8%80%83%E9%A2%98%E5%90%88%E9%9B%86)
13. [MySQL 数据库 CPU 飙升到 500% 的话，怎么处理？](http://svip.iocoder.cn/MySQL/Interview/#MySQL-%E6%95%B0%E6%8D%AE%E5%BA%93-CPU-%E9%A3%99%E5%8D%87%E5%88%B0-500-%E7%9A%84%E8%AF%9D%EF%BC%8C%E6%80%8E%E4%B9%88%E5%A4%84%E7%90%86%EF%BC%9F)

#### [运维](http://svip.iocoder.cn/MySQL/Interview/#%E8%BF%90%E7%BB%B4)

1. [Innodb 的事务与日志的实现方式](http://svip.iocoder.cn/MySQL/Interview/#Innodb-%E7%9A%84%E4%BA%8B%E5%8A%A1%E4%B8%8E%E6%97%A5%E5%BF%97%E7%9A%84%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F)
2. [MySQL binlog 的几种日志录入格式以及区别](http://svip.iocoder.cn/MySQL/Interview/#MySQL-binlog-%E7%9A%84%E5%87%A0%E7%A7%8D%E6%97%A5%E5%BF%97%E5%BD%95%E5%85%A5%E6%A0%BC%E5%BC%8F%E4%BB%A5%E5%8F%8A%E5%8C%BA%E5%88%AB)
3. [MySQL 主从复制的流程是怎么样的？](http://svip.iocoder.cn/MySQL/Interview/#MySQL-%E4%B8%BB%E4%BB%8E%E5%A4%8D%E5%88%B6%E7%9A%84%E6%B5%81%E7%A8%8B%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
4. [聊聊 MySQL 备份方式？备份策略是怎么样的？](http://svip.iocoder.cn/MySQL/Interview/#%E8%81%8A%E8%81%8A-MySQL-%E5%A4%87%E4%BB%BD%E6%96%B9%E5%BC%8F%EF%BC%9F%E5%A4%87%E4%BB%BD%E7%AD%96%E7%95%A5%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
5. [聊聊 MySQL 集群?](http://svip.iocoder.cn/MySQL/Interview/#%E8%81%8A%E8%81%8A-MySQL-%E9%9B%86%E7%BE%A4)
6. [聊聊 MySQL 安全？](http://svip.iocoder.cn/MySQL/Interview/#%E8%81%8A%E8%81%8A-MySQL-%E5%AE%89%E5%85%A8%EF%BC%9F)
7. [MySQL 有哪些日志？](http://svip.iocoder.cn/MySQL/Interview/#MySQL-%E6%9C%89%E5%93%AA%E4%BA%9B%E6%97%A5%E5%BF%97%EF%BC%9F)
8. [聊聊 MySQL 监控？](http://svip.iocoder.cn/MySQL/Interview/#%E8%81%8A%E8%81%8A-MySQL-%E7%9B%91%E6%8E%A7%EF%BC%9F)
9. [对一个大表做在线 DDL ，怎么进行实施的才能尽可能降低影响？](http://svip.iocoder.cn/MySQL/Interview/#%E5%AF%B9%E4%B8%80%E4%B8%AA%E5%A4%A7%E8%A1%A8%E5%81%9A%E5%9C%A8%E7%BA%BF-DDL-%EF%BC%8C%E6%80%8E%E4%B9%88%E8%BF%9B%E8%A1%8C%E5%AE%9E%E6%96%BD%E7%9A%84%E6%89%8D%E8%83%BD%E5%B0%BD%E5%8F%AF%E8%83%BD%E9%99%8D%E4%BD%8E%E5%BD%B1%E5%93%8D%EF%BC%9F)
10. [彩蛋](http://svip.iocoder.cn/MySQL/Interview/#%E5%BD%A9%E8%9B%8B)

### **分库分表**

1. [为什么使用分库分表？](http://svip.iocoder.cn/database-sharding/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BD%BF%E7%94%A8%E5%88%86%E5%BA%93%E5%88%86%E8%A1%A8%EF%BC%9F)
2. [什么是分库分表？](http://svip.iocoder.cn/database-sharding/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%88%86%E5%BA%93%E5%88%86%E8%A1%A8%EF%BC%9F)
3. [用了分库分表之后，有哪些常见问题？](http://svip.iocoder.cn/database-sharding/Interview/#%E7%94%A8%E4%BA%86%E5%88%86%E5%BA%93%E5%88%86%E8%A1%A8%E4%B9%8B%E5%90%8E%EF%BC%8C%E6%9C%89%E5%93%AA%E4%BA%9B%E5%B8%B8%E8%A7%81%E9%97%AE%E9%A2%98%EF%BC%9F)
4. [了解和使用过哪些分库分表中间件？](http://svip.iocoder.cn/database-sharding/Interview/#%E4%BA%86%E8%A7%A3%E5%92%8C%E4%BD%BF%E7%94%A8%E8%BF%87%E5%93%AA%E4%BA%9B%E5%88%86%E5%BA%93%E5%88%86%E8%A1%A8%E4%B8%AD%E9%97%B4%E4%BB%B6%EF%BC%9F)
5. [如何迁移到分库分表？](http://svip.iocoder.cn/database-sharding/Interview/#%E5%A6%82%E4%BD%95%E8%BF%81%E7%A7%BB%E5%88%B0%E5%88%86%E5%BA%93%E5%88%86%E8%A1%A8%EF%BC%9F)
6. [什么是分布式主键？怎么实现？](http://svip.iocoder.cn/database-sharding/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%88%86%E5%B8%83%E5%BC%8F%E4%B8%BB%E9%94%AE%EF%BC%9F%E6%80%8E%E4%B9%88%E5%AE%9E%E7%8E%B0%EF%BC%9F)
7. [分片键的选择？](http://svip.iocoder.cn/database-sharding/Interview/#%E5%88%86%E7%89%87%E9%94%AE%E7%9A%84%E9%80%89%E6%8B%A9%EF%BC%9F)
8. [如何解决分布式事务？](http://svip.iocoder.cn/database-sharding/Interview/#%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%EF%BC%9F)
9. [彩蛋](http://svip.iocoder.cn/database-sharding/Interview/#%E5%BD%A9%E8%9B%8B)

### **分布式事务**

1. [什么是分布式事务？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%EF%BC%9F)
2. [为什么会有分布式事务？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E4%BC%9A%E6%9C%89%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%EF%BC%9F)
3. [分布式事务的基础？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%E7%9A%84%E5%9F%BA%E7%A1%80%EF%BC%9F)
4. [分布式事务的实现主要有哪些方案？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%E7%9A%84%E5%AE%9E%E7%8E%B0%E4%B8%BB%E8%A6%81%E6%9C%89%E5%93%AA%E4%BA%9B%E6%96%B9%E6%A1%88%EF%BC%9F)
5. [聊聊 XA 方案？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%81%8A%E8%81%8A-XA-%E6%96%B9%E6%A1%88%EF%BC%9F)
   1. [弱 XA](http://svip.iocoder.cn/distributed-transaction/Interview/#%E5%BC%B1-XA)
   2. [强 XA](http://svip.iocoder.cn/distributed-transaction/Interview/#%E5%BC%BA-XA)
   3. [应用场景](http://svip.iocoder.cn/distributed-transaction/Interview/#%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF)
6. [聊聊 TCC 方案？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%81%8A%E8%81%8A-TCC-%E6%96%B9%E6%A1%88%EF%BC%9F)
7. [聊聊本地消息表？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%81%8A%E8%81%8A%E6%9C%AC%E5%9C%B0%E6%B6%88%E6%81%AF%E8%A1%A8%EF%BC%9F)
8. [聊聊可靠消息最终一致性方案？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%81%8A%E8%81%8A%E5%8F%AF%E9%9D%A0%E6%B6%88%E6%81%AF%E6%9C%80%E7%BB%88%E4%B8%80%E8%87%B4%E6%80%A7%E6%96%B9%E6%A1%88%EF%BC%9F)
9. [聊聊最大努力通知方案？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%81%8A%E8%81%8A%E6%9C%80%E5%A4%A7%E5%8A%AA%E5%8A%9B%E9%80%9A%E7%9F%A5%E6%96%B9%E6%A1%88%EF%BC%9F)
   1. [解释一](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%A7%A3%E9%87%8A%E4%B8%80)
   2. [解释二](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%A7%A3%E9%87%8A%E4%BA%8C)
10. [聊聊 Saga 方案？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E8%81%8A%E8%81%8A-Saga-%E6%96%B9%E6%A1%88%EF%BC%9F)
11. [你们公司是如何处理分布式事务的？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E4%BD%A0%E4%BB%AC%E5%85%AC%E5%8F%B8%E6%98%AF%E5%A6%82%E4%BD%95%E5%A4%84%E7%90%86%E5%88%86%E5%B8%83%E5%BC%8F%E4%BA%8B%E5%8A%A1%E7%9A%84%EF%BC%9F)
12. [什么是三阶段协议？](http://svip.iocoder.cn/distributed-transaction/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E4%B8%89%E9%98%B6%E6%AE%B5%E5%8D%8F%E8%AE%AE%EF%BC%9F)
13. [事务解决方案的对比总结](http://svip.iocoder.cn/distributed-transaction/Interview/#%E4%BA%8B%E5%8A%A1%E8%A7%A3%E5%86%B3%E6%96%B9%E6%A1%88%E7%9A%84%E5%AF%B9%E6%AF%94%E6%80%BB%E7%BB%93)
14. [彩蛋](http://svip.iocoder.cn/distributed-transaction/Interview/#%E5%BD%A9%E8%9B%8B)

### **Maven**

1. [Maven 是什么？](http://svip.iocoder.cn/Maven/Interview/#Maven-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [Maven 常用命令](http://svip.iocoder.cn/Maven/Interview/#Maven-%E5%B8%B8%E7%94%A8%E5%91%BD%E4%BB%A4)
3. [Maven 有哪些优点和缺点](http://svip.iocoder.cn/Maven/Interview/#Maven-%E6%9C%89%E5%93%AA%E4%BA%9B%E4%BC%98%E7%82%B9%E5%92%8C%E7%BC%BA%E7%82%B9)
4. [对比其它构建工具](http://svip.iocoder.cn/Maven/Interview/#%E5%AF%B9%E6%AF%94%E5%85%B6%E5%AE%83%E6%9E%84%E5%BB%BA%E5%B7%A5%E5%85%B7)
5. [Maven 坐标的含义？](http://svip.iocoder.cn/Maven/Interview/#Maven-%E5%9D%90%E6%A0%87%E7%9A%84%E5%90%AB%E4%B9%89%EF%BC%9F)
6. [Maven 是什么？](http://svip.iocoder.cn/Maven/Interview/#Maven-lt-dependencie-gt-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
7. [Maven 依赖的解析机制是怎么样的？](http://svip.iocoder.cn/Maven/Interview/#Maven-%E4%BE%9D%E8%B5%96%E7%9A%84%E8%A7%A3%E6%9E%90%E6%9C%BA%E5%88%B6%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
8. [Maven 生命周期是怎么样的？](http://svip.iocoder.cn/Maven/Interview/#Maven-%E7%94%9F%E5%91%BD%E5%91%A8%E6%9C%9F%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
9. [什么是 Maven 插件？](http://svip.iocoder.cn/Maven/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Maven-%E6%8F%92%E4%BB%B6%EF%BC%9F)
10. [什么是 Maven 仓库？](http://svip.iocoder.cn/Maven/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Maven-%E4%BB%93%E5%BA%93%EF%BC%9F)
11. [彩蛋](http://svip.iocoder.cn/Maven/Interview/#%E5%BD%A9%E8%9B%8B)

### **Jenkins**

1. [持续集成是什么？](http://svip.iocoder.cn/Jenkins/Interview/#%E6%8C%81%E7%BB%AD%E9%9B%86%E6%88%90%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [简单介绍 Jenkins 是什么？](http://svip.iocoder.cn/Jenkins/Interview/#%E7%AE%80%E5%8D%95%E4%BB%8B%E7%BB%8D-Jenkins-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
3. [Jenkins 你都用了哪些插件？](http://svip.iocoder.cn/Jenkins/Interview/#Jenkins-%E4%BD%A0%E9%83%BD%E7%94%A8%E4%BA%86%E5%93%AA%E4%BA%9B%E6%8F%92%E4%BB%B6%EF%BC%9F)
4. [Jenkins 如何实现发布和回滚？](http://svip.iocoder.cn/Jenkins/Interview/#Jenkins-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E5%8F%91%E5%B8%83%E5%92%8C%E5%9B%9E%E6%BB%9A%EF%BC%9F)
5. [Jenkins 怎么做备份与恢复？](http://svip.iocoder.cn/Jenkins/Interview/#Jenkins-%E6%80%8E%E4%B9%88%E5%81%9A%E5%A4%87%E4%BB%BD%E4%B8%8E%E6%81%A2%E5%A4%8D%EF%BC%9F)
6. [Jenkins 如何删除历史构建数据？](http://svip.iocoder.cn/Jenkins/Interview/#Jenkins-%E5%A6%82%E4%BD%95%E5%88%A0%E9%99%A4%E5%8E%86%E5%8F%B2%E6%9E%84%E5%BB%BA%E6%95%B0%E6%8D%AE%EF%BC%9F)
7. [彩蛋](http://svip.iocoder.cn/Jenkins/Interview/#%E5%BD%A9%E8%9B%8B)

### **Zookeeper**

1. [Zookeeper 是什么？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [Zookeeper 的设计目标？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E8%AE%BE%E8%AE%A1%E7%9B%AE%E6%A0%87%EF%BC%9F)
3. [Zookeeper 有哪些应用场景？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E6%9C%89%E5%93%AA%E4%BA%9B%E5%BA%94%E7%94%A8%E5%9C%BA%E6%99%AF%EF%BC%9F)
4. [Zookeeper 提供了什么？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E6%8F%90%E4%BE%9B%E4%BA%86%E4%BB%80%E4%B9%88%EF%BC%9F)
5. [Zookeeper 的文件系统是什么？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E6%96%87%E4%BB%B6%E7%B3%BB%E7%BB%9F%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
6. [Zookeeper 的通知机制是什么？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E9%80%9A%E7%9F%A5%E6%9C%BA%E5%88%B6%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
7. [Zookeeper 采用什么权限控制机制？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E9%87%87%E7%94%A8%E4%BB%80%E4%B9%88%E6%9D%83%E9%99%90%E6%8E%A7%E5%88%B6%E6%9C%BA%E5%88%B6%EF%BC%9F)
8. [Zookeeper 的会话管理是怎么样的？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E4%BC%9A%E8%AF%9D%E7%AE%A1%E7%90%86%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
9. [Zookeeper 的部署方式？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E9%83%A8%E7%BD%B2%E6%96%B9%E5%BC%8F%EF%BC%9F)
10. [ZooKeeper 的工作原理？](http://svip.iocoder.cn/Zookeeper/Interview/#ZooKeeper-%E7%9A%84%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%EF%BC%9F)
11. [Zookeeper 的选举过程？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E9%80%89%E4%B8%BE%E8%BF%87%E7%A8%8B%EF%BC%9F)
12. [Zookeeper 的同步流程？](http://svip.iocoder.cn/Zookeeper/Interview/#Zookeeper-%E7%9A%84%E5%90%8C%E6%AD%A5%E6%B5%81%E7%A8%8B%EF%BC%9F)
13. [666. 彩蛋](http://svip.iocoder.cn/Zookeeper/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Nginx**

1. [请解释一下什么是 Nginx ？](http://svip.iocoder.cn/Nginx/Interview/#%E8%AF%B7%E8%A7%A3%E9%87%8A%E4%B8%80%E4%B8%8B%E4%BB%80%E4%B9%88%E6%98%AF-Nginx-%EF%BC%9F)
2. [Nginx 常用命令？](http://svip.iocoder.cn/Nginx/Interview/#Nginx-%E5%B8%B8%E7%94%A8%E5%91%BD%E4%BB%A4%EF%BC%9F)
3. [Nginx 常用配置？](http://svip.iocoder.cn/Nginx/Interview/#Nginx-%E5%B8%B8%E7%94%A8%E9%85%8D%E7%BD%AE%EF%BC%9F)
4. [Nginx 有哪些优点？](http://svip.iocoder.cn/Nginx/Interview/#Nginx-%E6%9C%89%E5%93%AA%E4%BA%9B%E4%BC%98%E7%82%B9%EF%BC%9F)
5. [使用“反向代理服务器”的优点是什么？](http://svip.iocoder.cn/Nginx/Interview/#%E4%BD%BF%E7%94%A8%E2%80%9C%E5%8F%8D%E5%90%91%E4%BB%A3%E7%90%86%E6%9C%8D%E5%8A%A1%E5%99%A8%E2%80%9D%E7%9A%84%E4%BC%98%E7%82%B9%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
6. [请解释 Nginx 如何处理 HTTP 请求？](http://svip.iocoder.cn/Nginx/Interview/#%E8%AF%B7%E8%A7%A3%E9%87%8A-Nginx-%E5%A6%82%E4%BD%95%E5%A4%84%E7%90%86-HTTP-%E8%AF%B7%E6%B1%82%EF%BC%9F)
7. [什么是动态资源、静态资源分离？](http://svip.iocoder.cn/Nginx/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8A%A8%E6%80%81%E8%B5%84%E6%BA%90%E3%80%81%E9%9D%99%E6%80%81%E8%B5%84%E6%BA%90%E5%88%86%E7%A6%BB%EF%BC%9F)
8. [Nginx 有哪些负载均衡策略？](http://svip.iocoder.cn/Nginx/Interview/#Nginx-%E6%9C%89%E5%93%AA%E4%BA%9B%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%E7%AD%96%E7%95%A5%EF%BC%9F)
9. [Nginx 如何实现后端服务的健康检查？](http://svip.iocoder.cn/Nginx/Interview/#Nginx-%E5%A6%82%E4%BD%95%E5%AE%9E%E7%8E%B0%E5%90%8E%E7%AB%AF%E6%9C%8D%E5%8A%A1%E7%9A%84%E5%81%A5%E5%BA%B7%E6%A3%80%E6%9F%A5%EF%BC%9F)
10. [Nginx 如何开启压缩？](http://svip.iocoder.cn/Nginx/Interview/#Nginx-%E5%A6%82%E4%BD%95%E5%BC%80%E5%90%AF%E5%8E%8B%E7%BC%A9%EF%BC%9F)
11. [666. 彩蛋](http://svip.iocoder.cn/Nginx/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **计算机网络**

#### [网络体系结构](http://svip.iocoder.cn/Net/Interview/#%E7%BD%91%E7%BB%9C%E4%BD%93%E7%B3%BB%E7%BB%93%E6%9E%84)

1. [简述 OSI 七层体系结构](http://svip.iocoder.cn/Net/Interview/#%E7%AE%80%E8%BF%B0-OSI-%E4%B8%83%E5%B1%82%E4%BD%93%E7%B3%BB%E7%BB%93%E6%9E%84)
2. [简述 TCP/IP 四层体系结构](http://svip.iocoder.cn/Net/Interview/#%E7%AE%80%E8%BF%B0-TCP-IP-%E5%9B%9B%E5%B1%82%E4%BD%93%E7%B3%BB%E7%BB%93%E6%9E%84)
3. [知道各个层使用的是哪个数据交换设备？](http://svip.iocoder.cn/Net/Interview/#%E7%9F%A5%E9%81%93%E5%90%84%E4%B8%AA%E5%B1%82%E4%BD%BF%E7%94%A8%E7%9A%84%E6%98%AF%E5%93%AA%E4%B8%AA%E6%95%B0%E6%8D%AE%E4%BA%A4%E6%8D%A2%E8%AE%BE%E5%A4%87%EF%BC%9F)

#### [IP](http://svip.iocoder.cn/Net/Interview/#IP)

1. [IP 地址的分类？](http://svip.iocoder.cn/Net/Interview/#IP-%E5%9C%B0%E5%9D%80%E7%9A%84%E5%88%86%E7%B1%BB%EF%BC%9F)
2. [网络层的 ARP 协议工作原理？](http://svip.iocoder.cn/Net/Interview/#%E7%BD%91%E7%BB%9C%E5%B1%82%E7%9A%84-ARP-%E5%8D%8F%E8%AE%AE%E5%B7%A5%E4%BD%9C%E5%8E%9F%E7%90%86%EF%BC%9F)
3. [如何划分子网、超网？](http://svip.iocoder.cn/Net/Interview/#%E5%A6%82%E4%BD%95%E5%88%92%E5%88%86%E5%AD%90%E7%BD%91%E3%80%81%E8%B6%85%E7%BD%91%EF%BC%9F)
4. [什么是单播、组播(多播)、广播、任播？](http://svip.iocoder.cn/Net/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8D%95%E6%92%AD%E3%80%81%E7%BB%84%E6%92%AD-%E5%A4%9A%E6%92%AD-%E3%80%81%E5%B9%BF%E6%92%AD%E3%80%81%E4%BB%BB%E6%92%AD%EF%BC%9F)
5. [区别 IPv4 和 IPv6 ？](http://svip.iocoder.cn/Net/Interview/#%E5%8C%BA%E5%88%AB-IPv4-%E5%92%8C-IPv6-%EF%BC%9F)

#### [ICMP](http://svip.iocoder.cn/Net/Interview/#ICMP)

1. [ICMP 协议的主要功能？](http://svip.iocoder.cn/Net/Interview/#ICMP-%E5%8D%8F%E8%AE%AE%E7%9A%84%E4%B8%BB%E8%A6%81%E5%8A%9F%E8%83%BD%EF%BC%9F)
2. [简述一下 ping 的原理？](http://svip.iocoder.cn/Net/Interview/#%E7%AE%80%E8%BF%B0%E4%B8%80%E4%B8%8B-ping-%E7%9A%84%E5%8E%9F%E7%90%86%EF%BC%9F)
3. [什么是 Traceroute ？](http://svip.iocoder.cn/Net/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Traceroute-%EF%BC%9F)

#### [TCP](http://svip.iocoder.cn/Net/Interview/#TCP)

1. [TCP 是什么？](http://svip.iocoder.cn/Net/Interview/#TCP-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [TCP 对应的应用层协议？](http://svip.iocoder.cn/Net/Interview/#TCP-%E5%AF%B9%E5%BA%94%E7%9A%84%E5%BA%94%E7%94%A8%E5%B1%82%E5%8D%8F%E8%AE%AE%EF%BC%9F)
3. [TCP 头部是怎么样的？](http://svip.iocoder.cn/Net/Interview/#TCP-%E5%A4%B4%E9%83%A8%E6%98%AF%E6%80%8E%E4%B9%88%E6%A0%B7%E7%9A%84%EF%BC%9F)
4. [【重要】什么是 TCP 三次握手？](http://svip.iocoder.cn/Net/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91%E4%BB%80%E4%B9%88%E6%98%AF-TCP-%E4%B8%89%E6%AC%A1%E6%8F%A1%E6%89%8B%EF%BC%9F)
5. [【重要】什么是 TCP 四次挥手？](http://svip.iocoder.cn/Net/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91%E4%BB%80%E4%B9%88%E6%98%AF-TCP-%E5%9B%9B%E6%AC%A1%E6%8C%A5%E6%89%8B%EF%BC%9F)
6. [【重要】TCP 数据如何传输？](http://svip.iocoder.cn/Net/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91TCP-%E6%95%B0%E6%8D%AE%E5%A6%82%E4%BD%95%E4%BC%A0%E8%BE%93%EF%BC%9F)
7. [【重要】什么是 TCP 滑动窗口？](http://svip.iocoder.cn/Net/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91%E4%BB%80%E4%B9%88%E6%98%AF-TCP-%E6%BB%91%E5%8A%A8%E7%AA%97%E5%8F%A3%EF%BC%9F)
8. [TCP 协议如何来保证传输的可靠性？](http://svip.iocoder.cn/Net/Interview/#TCP-%E5%8D%8F%E8%AE%AE%E5%A6%82%E4%BD%95%E6%9D%A5%E4%BF%9D%E8%AF%81%E4%BC%A0%E8%BE%93%E7%9A%84%E5%8F%AF%E9%9D%A0%E6%80%A7%EF%BC%9F)
9. [什么是 TCP 拥堵？](http://svip.iocoder.cn/Net/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-TCP-%E6%8B%A5%E5%A0%B5%EF%BC%9F)

#### [UDP](http://svip.iocoder.cn/Net/Interview/#UDP)

1. [UDP 是什么？](http://svip.iocoder.cn/Net/Interview/#UDP-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [UDP 对应的应用层协议？](http://svip.iocoder.cn/Net/Interview/#UDP-%E5%AF%B9%E5%BA%94%E7%9A%84%E5%BA%94%E7%94%A8%E5%B1%82%E5%8D%8F%E8%AE%AE%EF%BC%9F)
3. [【重要】TCP 与 UDP 的区别](http://svip.iocoder.cn/Net/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91TCP-%E4%B8%8E-UDP-%E7%9A%84%E5%8C%BA%E5%88%AB)
4. [UDP 报文的格式](http://svip.iocoder.cn/Net/Interview/#UDP-%E6%8A%A5%E6%96%87%E7%9A%84%E6%A0%BC%E5%BC%8F)

#### [DNS](http://svip.iocoder.cn/Net/Interview/#DNS)

1. [DNS 是什么？](http://svip.iocoder.cn/Net/Interview/#DNS-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [主机解析域名的顺序？](http://svip.iocoder.cn/Net/Interview/#%E4%B8%BB%E6%9C%BA%E8%A7%A3%E6%9E%90%E5%9F%9F%E5%90%8D%E7%9A%84%E9%A1%BA%E5%BA%8F%EF%BC%9F)
3. [DNS 使用什么协议？](http://svip.iocoder.cn/Net/Interview/#DNS-%E4%BD%BF%E7%94%A8%E4%BB%80%E4%B9%88%E5%8D%8F%E8%AE%AE%EF%BC%9F)

#### [HTTP](http://svip.iocoder.cn/Net/Interview/#HTTP)

1. [HTTP 是什么？](http://svip.iocoder.cn/Net/Interview/#HTTP-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [HTTP 基本格式](http://svip.iocoder.cn/Net/Interview/#HTTP-%E5%9F%BA%E6%9C%AC%E6%A0%BC%E5%BC%8F)
3. [HTTP 协议包括哪些请求？](http://svip.iocoder.cn/Net/Interview/#HTTP-%E5%8D%8F%E8%AE%AE%E5%8C%85%E6%8B%AC%E5%93%AA%E4%BA%9B%E8%AF%B7%E6%B1%82%EF%BC%9F)
4. [HTTP 有哪些状态码？](http://svip.iocoder.cn/Net/Interview/#HTTP-%E6%9C%89%E5%93%AA%E4%BA%9B%E7%8A%B6%E6%80%81%E7%A0%81%EF%BC%9F)
5. [HTTP、TCP、Socket 的关系是什么？](http://svip.iocoder.cn/Net/Interview/#HTTP%E3%80%81TCP%E3%80%81Socket-%E7%9A%84%E5%85%B3%E7%B3%BB%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
6. [Cookies 和 Session 的区别](http://svip.iocoder.cn/Net/Interview/#Cookies-%E5%92%8C-Session-%E7%9A%84%E5%8C%BA%E5%88%AB)
7. [【重要】一次完整的 HTTP 请求所经历的步骤](http://svip.iocoder.cn/Net/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91%E4%B8%80%E6%AC%A1%E5%AE%8C%E6%95%B4%E7%9A%84-HTTP-%E8%AF%B7%E6%B1%82%E6%89%80%E7%BB%8F%E5%8E%86%E7%9A%84%E6%AD%A5%E9%AA%A4)
8. [HTTP1.0 和 HTTP1.1 有什么区别？](http://svip.iocoder.cn/Net/Interview/#HTTP1-0-%E5%92%8C-HTTP1-1-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
9. [SPDY 是什么？](http://svip.iocoder.cn/Net/Interview/#SPDY-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)

#### [HTTPS](http://svip.iocoder.cn/Net/Interview/#HTTPS)

1. [HTTPS 是什么？](http://svip.iocoder.cn/Net/Interview/#HTTPS-%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
2. [HTTP 和 HTTPS 的区别？](http://svip.iocoder.cn/Net/Interview/#HTTP-%E5%92%8C-HTTPS-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
3. [SSL 加密方式是什么？](http://svip.iocoder.cn/Net/Interview/#SSL-%E5%8A%A0%E5%AF%86%E6%96%B9%E5%BC%8F%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
4. [什么是单向认证、双向认证？](http://svip.iocoder.cn/Net/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E5%8D%95%E5%90%91%E8%AE%A4%E8%AF%81%E3%80%81%E5%8F%8C%E5%90%91%E8%AE%A4%E8%AF%81%EF%BC%9F)
5. [为什么抓包工具还能抓到 HTTPS 数据包并解密成功呢](http://svip.iocoder.cn/Net/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E6%8A%93%E5%8C%85%E5%B7%A5%E5%85%B7%E8%BF%98%E8%83%BD%E6%8A%93%E5%88%B0-HTTPS-%E6%95%B0%E6%8D%AE%E5%8C%85%E5%B9%B6%E8%A7%A3%E5%AF%86%E6%88%90%E5%8A%9F%E5%91%A2)
6. [HTTPS 握手会影响性能么？](http://svip.iocoder.cn/Net/Interview/#HTTPS-%E6%8F%A1%E6%89%8B%E4%BC%9A%E5%BD%B1%E5%93%8D%E6%80%A7%E8%83%BD%E4%B9%88%EF%BC%9F)

#### [HTTP2](http://svip.iocoder.cn/Net/Interview/#HTTP2)

1. [什么是 HTTP2.0 ？](http://svip.iocoder.cn/Net/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-HTTP2-0-%EF%BC%9F)
2. [HTTP2.0 和 HTTP1.X 相比的新特性？](http://svip.iocoder.cn/Net/Interview/#HTTP2-0-%E5%92%8C-HTTP1-X-%E7%9B%B8%E6%AF%94%E7%9A%84%E6%96%B0%E7%89%B9%E6%80%A7%EF%BC%9F)
3. [Nginx 怎么做 HTTP2.0 的升级改造？](http://svip.iocoder.cn/Net/Interview/#Nginx-%E6%80%8E%E4%B9%88%E5%81%9A-HTTP2-0-%E7%9A%84%E5%8D%87%E7%BA%A7%E6%94%B9%E9%80%A0%EF%BC%9F)
4. [HTTP2.0 的多路复用和 HTTP1.X 中的长连接复用有什么区别？](http://svip.iocoder.cn/Net/Interview/#HTTP2-0-%E7%9A%84%E5%A4%9A%E8%B7%AF%E5%A4%8D%E7%94%A8%E5%92%8C-HTTP1-X-%E4%B8%AD%E7%9A%84%E9%95%BF%E8%BF%9E%E6%8E%A5%E5%A4%8D%E7%94%A8%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
5. [服务器推送到底是什么？](http://svip.iocoder.cn/Net/Interview/#%E6%9C%8D%E5%8A%A1%E5%99%A8%E6%8E%A8%E9%80%81%E5%88%B0%E5%BA%95%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)
6. [为什么需要头部(header)压缩？](http://svip.iocoder.cn/Net/Interview/#%E4%B8%BA%E4%BB%80%E4%B9%88%E9%9C%80%E8%A6%81%E5%A4%B4%E9%83%A8-header-%E5%8E%8B%E7%BC%A9%EF%BC%9F)
7. [彩蛋](http://svip.iocoder.cn/Net/Interview/#%E5%BD%A9%E8%9B%8B)

### **Linux**

#### [目录相关](http://svip.iocoder.cn/Linux/Interview/#%E7%9B%AE%E5%BD%95%E7%9B%B8%E5%85%B3)

1. [find 命令](http://svip.iocoder.cn/Linux/Interview/#find-%E5%91%BD%E4%BB%A4)
2. [ls 命令](http://svip.iocoder.cn/Linux/Interview/#ls-%E5%91%BD%E4%BB%A4)
3. [pwd 命令](http://svip.iocoder.cn/Linux/Interview/#pwd-%E5%91%BD%E4%BB%A4)
4. [cd 命令](http://svip.iocoder.cn/Linux/Interview/#cd-%E5%91%BD%E4%BB%A4)

#### [mkdir 命令](http://svip.iocoder.cn/Linux/Interview/#mkdir-%E5%91%BD%E4%BB%A4)

1. [df 命令](http://svip.iocoder.cn/Linux/Interview/#df-%E5%91%BD%E4%BB%A4)
2. [rm 命令](http://svip.iocoder.cn/Linux/Interview/#rm-%E5%91%BD%E4%BB%A4)
3. [mv 命令](http://svip.iocoder.cn/Linux/Interview/#mv-%E5%91%BD%E4%BB%A4)
4. [cp 命令](http://svip.iocoder.cn/Linux/Interview/#cp-%E5%91%BD%E4%BB%A4)
5. [mount 命令](http://svip.iocoder.cn/Linux/Interview/#mount-%E5%91%BD%E4%BB%A4)
6. [cat 命令](http://svip.iocoder.cn/Linux/Interview/#cat-%E5%91%BD%E4%BB%A4)
7. [tail 命令](http://svip.iocoder.cn/Linux/Interview/#tail-%E5%91%BD%E4%BB%A4)
8. [less 命令](http://svip.iocoder.cn/Linux/Interview/#less-%E5%91%BD%E4%BB%A4)

#### [通用命令](http://svip.iocoder.cn/Linux/Interview/#%E9%80%9A%E7%94%A8%E5%91%BD%E4%BB%A4)

1. [grep 命令](http://svip.iocoder.cn/Linux/Interview/#grep-%E5%91%BD%E4%BB%A4)
2. [sed 命令](http://svip.iocoder.cn/Linux/Interview/#sed-%E5%91%BD%E4%BB%A4)
3. [awk 命令](http://svip.iocoder.cn/Linux/Interview/#awk-%E5%91%BD%E4%BB%A4)
4. [vim 命令](http://svip.iocoder.cn/Linux/Interview/#vim-%E5%91%BD%E4%BB%A4)
5. [diff 命令](http://svip.iocoder.cn/Linux/Interview/#diff-%E5%91%BD%E4%BB%A4)
6. [sort 命令](http://svip.iocoder.cn/Linux/Interview/#sort-%E5%91%BD%E4%BB%A4)
7. [xargs 命令](http://svip.iocoder.cn/Linux/Interview/#xargs-%E5%91%BD%E4%BB%A4)

#### [压缩相关](http://svip.iocoder.cn/Linux/Interview/#%E5%8E%8B%E7%BC%A9%E7%9B%B8%E5%85%B3)

1. [tar 命令](http://svip.iocoder.cn/Linux/Interview/#tar-%E5%91%BD%E4%BB%A4)
2. [gzip 命令](http://svip.iocoder.cn/Linux/Interview/#gzip-%E5%91%BD%E4%BB%A4)
3. [bzip2 命令](http://svip.iocoder.cn/Linux/Interview/#bzip2-%E5%91%BD%E4%BB%A4)
4. [unzip 命令](http://svip.iocoder.cn/Linux/Interview/#unzip-%E5%91%BD%E4%BB%A4)

#### [系统命令](http://svip.iocoder.cn/Linux/Interview/#%E7%B3%BB%E7%BB%9F%E5%91%BD%E4%BB%A4)

1. [export 命令](http://svip.iocoder.cn/Linux/Interview/#export-%E5%91%BD%E4%BB%A4)
2. [kill 命令](http://svip.iocoder.cn/Linux/Interview/#kill-%E5%91%BD%E4%BB%A4)
3. [passwd 命令](http://svip.iocoder.cn/Linux/Interview/#passwd-%E5%91%BD%E4%BB%A4)
4. [su 命令](http://svip.iocoder.cn/Linux/Interview/#su-%E5%91%BD%E4%BB%A4)
5. [yum 命令](http://svip.iocoder.cn/Linux/Interview/#yum-%E5%91%BD%E4%BB%A4)
6. [rpm 命令](http://svip.iocoder.cn/Linux/Interview/#rpm-%E5%91%BD%E4%BB%A4)
7. [shutdown 命令](http://svip.iocoder.cn/Linux/Interview/#shutdown-%E5%91%BD%E4%BB%A4)
8. [crontab 命令](http://svip.iocoder.cn/Linux/Interview/#crontab-%E5%91%BD%E4%BB%A4)
9. [service 命令](http://svip.iocoder.cn/Linux/Interview/#service-%E5%91%BD%E4%BB%A4)
10. [chmod 命令](http://svip.iocoder.cn/Linux/Interview/#chmod-%E5%91%BD%E4%BB%A4)
11. [chown 命令](http://svip.iocoder.cn/Linux/Interview/#chown-%E5%91%BD%E4%BB%A4)
12. [uname 命令](http://svip.iocoder.cn/Linux/Interview/#uname-%E5%91%BD%E4%BB%A4)
13. [whereis 命令](http://svip.iocoder.cn/Linux/Interview/#whereis-%E5%91%BD%E4%BB%A4)
14. [locate 命令](http://svip.iocoder.cn/Linux/Interview/#locate-%E5%91%BD%E4%BB%A4)
15. [man 命令](http://svip.iocoder.cn/Linux/Interview/#man-%E5%91%BD%E4%BB%A4)

#### [网络相关](http://svip.iocoder.cn/Linux/Interview/#%E7%BD%91%E7%BB%9C%E7%9B%B8%E5%85%B3)

1. [ifconfig 命令](http://svip.iocoder.cn/Linux/Interview/#ifconfig-%E5%91%BD%E4%BB%A4)
2. [ping 命令](http://svip.iocoder.cn/Linux/Interview/#ping-%E5%91%BD%E4%BB%A4)
3. [curl 命令](http://svip.iocoder.cn/Linux/Interview/#curl-%E5%91%BD%E4%BB%A4)
4. [wget 命令](http://svip.iocoder.cn/Linux/Interview/#wget-%E5%91%BD%E4%BB%A4)
5. [ftp 命令](http://svip.iocoder.cn/Linux/Interview/#ftp-%E5%91%BD%E4%BB%A4)
6. [ssh 命令](http://svip.iocoder.cn/Linux/Interview/#ssh-%E5%91%BD%E4%BB%A4)
7. [ps 命令](http://svip.iocoder.cn/Linux/Interview/#ps-%E5%91%BD%E4%BB%A4)
8. [uptime 命令](http://svip.iocoder.cn/Linux/Interview/#uptime-%E5%91%BD%E4%BB%A4)
9. [dmesg 命令](http://svip.iocoder.cn/Linux/Interview/#dmesg-%E5%91%BD%E4%BB%A4)
10. [vmstat 命令](http://svip.iocoder.cn/Linux/Interview/#vmstat-%E5%91%BD%E4%BB%A4)
11. [mpstat 命令](http://svip.iocoder.cn/Linux/Interview/#mpstat-%E5%91%BD%E4%BB%A4)
12. [pidstat 命令](http://svip.iocoder.cn/Linux/Interview/#pidstat-%E5%91%BD%E4%BB%A4)
13. [iostat 命令](http://svip.iocoder.cn/Linux/Interview/#iostat-%E5%91%BD%E4%BB%A4)
14. [free 命令](http://svip.iocoder.cn/Linux/Interview/#free-%E5%91%BD%E4%BB%A4)
15. [sar 命令](http://svip.iocoder.cn/Linux/Interview/#sar-%E5%91%BD%E4%BB%A4)
16. [top 命令](http://svip.iocoder.cn/Linux/Interview/#top-%E5%91%BD%E4%BB%A4)
17. [netstat 命令](http://svip.iocoder.cn/Linux/Interview/#netstat-%E5%91%BD%E4%BB%A4)

#### [Linux 概述](http://svip.iocoder.cn/Linux/Interview/#Linux-%E6%A6%82%E8%BF%B0)

1. [Linux 的体系结构](http://svip.iocoder.cn/Linux/Interview/#Linux-%E7%9A%84%E4%BD%93%E7%B3%BB%E7%BB%93%E6%9E%84)
2. [什么是 Linux 内核？](http://svip.iocoder.cn/Linux/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-Linux-%E5%86%85%E6%A0%B8%EF%BC%9F)
3. [Linux 开机启动过程？](http://svip.iocoder.cn/Linux/Interview/#Linux-%E5%BC%80%E6%9C%BA%E5%90%AF%E5%8A%A8%E8%BF%87%E7%A8%8B%EF%BC%9F)
4. [Linux 使用的进程间通信方式？](http://svip.iocoder.cn/Linux/Interview/#Linux-%E4%BD%BF%E7%94%A8%E7%9A%84%E8%BF%9B%E7%A8%8B%E9%97%B4%E9%80%9A%E4%BF%A1%E6%96%B9%E5%BC%8F%EF%BC%9F)
5. [Linux 有哪些系统日志文件？](http://svip.iocoder.cn/Linux/Interview/#Linux-%E6%9C%89%E5%93%AA%E4%BA%9B%E7%B3%BB%E7%BB%9F%E6%97%A5%E5%BF%97%E6%96%87%E4%BB%B6%EF%BC%9F)
6. [Linux 虚拟内存是什么？](http://svip.iocoder.cn/Linux/Interview/#Linux-%E8%99%9A%E6%8B%9F%E5%86%85%E5%AD%98%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)

#### [磁盘、目录、文件](http://svip.iocoder.cn/Linux/Interview/#%E7%A3%81%E7%9B%98%E3%80%81%E7%9B%AE%E5%BD%95%E3%80%81%E6%96%87%E4%BB%B6)

1. [简单 Linux 文件系统？](http://svip.iocoder.cn/Linux/Interview/#%E7%AE%80%E5%8D%95-Linux-%E6%96%87%E4%BB%B6%E7%B3%BB%E7%BB%9F%EF%BC%9F)
2. [Linux 的目录结构是怎样的？](http://svip.iocoder.cn/Linux/Interview/#Linux-%E7%9A%84%E7%9B%AE%E5%BD%95%E7%BB%93%E6%9E%84%E6%98%AF%E6%80%8E%E6%A0%B7%E7%9A%84%EF%BC%9F)
3. [什么是 inode ？](http://svip.iocoder.cn/Linux/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-inode-%EF%BC%9F)
4. [什么是硬链接和软链接？](http://svip.iocoder.cn/Linux/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%A1%AC%E9%93%BE%E6%8E%A5%E5%92%8C%E8%BD%AF%E9%93%BE%E6%8E%A5%EF%BC%9F)
5. [RAID 是什么?](http://svip.iocoder.cn/Linux/Interview/#RAID-%E6%98%AF%E4%BB%80%E4%B9%88)

#### [网络](http://svip.iocoder.cn/Linux/Interview/#%E7%BD%91%E7%BB%9C)

1. [iptables 命令](http://svip.iocoder.cn/Linux/Interview/#iptables-%E5%91%BD%E4%BB%A4)
2. [route 命令](http://svip.iocoder.cn/Linux/Interview/#route-%E5%91%BD%E4%BB%A4)
3. [tcpdump 命令](http://svip.iocoder.cn/Linux/Interview/#tcpdump-%E5%91%BD%E4%BB%A4)
4. [如何配置静态 IP ？](http://svip.iocoder.cn/Linux/Interview/#%E5%A6%82%E4%BD%95%E9%85%8D%E7%BD%AE%E9%9D%99%E6%80%81-IP-%EF%BC%9F)
5. [设置 DNS 需要修改哪个配置文件？](http://svip.iocoder.cn/Linux/Interview/#%E8%AE%BE%E7%BD%AE-DNS-%E9%9C%80%E8%A6%81%E4%BF%AE%E6%94%B9%E5%93%AA%E4%B8%AA%E9%85%8D%E7%BD%AE%E6%96%87%E4%BB%B6%EF%BC%9F)

#### [安全](http://svip.iocoder.cn/Linux/Interview/#%E5%AE%89%E5%85%A8)

1. [一台 Linux 系统初始化环境后需要做一些什么安全工作？](http://svip.iocoder.cn/Linux/Interview/#%E4%B8%80%E5%8F%B0-Linux-%E7%B3%BB%E7%BB%9F%E5%88%9D%E5%A7%8B%E5%8C%96%E7%8E%AF%E5%A2%83%E5%90%8E%E9%9C%80%E8%A6%81%E5%81%9A%E4%B8%80%E4%BA%9B%E4%BB%80%E4%B9%88%E5%AE%89%E5%85%A8%E5%B7%A5%E4%BD%9C%EF%BC%9F)
2. [什么叫 CC 攻击？什么叫 DDOS 攻击？](http://svip.iocoder.cn/Linux/Interview/#%E4%BB%80%E4%B9%88%E5%8F%AB-CC-%E6%94%BB%E5%87%BB%EF%BC%9F%E4%BB%80%E4%B9%88%E5%8F%AB-DDOS-%E6%94%BB%E5%87%BB%EF%BC%9F)
3. [什么是网站数据库注入？](http://svip.iocoder.cn/Linux/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF%E7%BD%91%E7%AB%99%E6%95%B0%E6%8D%AE%E5%BA%93%E6%B3%A8%E5%85%A5%EF%BC%9F)

### **Shell**

#### [Shell 脚本是什么？](http://svip.iocoder.cn/Linux/Interview/#Shell-%E8%84%9A%E6%9C%AC%E6%98%AF%E4%BB%80%E4%B9%88%EF%BC%9F)

#### [语法级](http://svip.iocoder.cn/Linux/Interview/#%E8%AF%AD%E6%B3%95%E7%BA%A7)

1. [可以在 Shell 脚本中使用哪些类型的变量？](http://svip.iocoder.cn/Linux/Interview/#%E5%8F%AF%E4%BB%A5%E5%9C%A8-Shell-%E8%84%9A%E6%9C%AC%E4%B8%AD%E4%BD%BF%E7%94%A8%E5%93%AA%E4%BA%9B%E7%B1%BB%E5%9E%8B%E7%9A%84%E5%8F%98%E9%87%8F%EF%BC%9F)
2. [Shell 脚本中 if 语法如何嵌套?](http://svip.iocoder.cn/Linux/Interview/#Shell-%E8%84%9A%E6%9C%AC%E4%B8%AD-if-%E8%AF%AD%E6%B3%95%E5%A6%82%E4%BD%95%E5%B5%8C%E5%A5%97)
3. [Shell 脚本中 case 语句的语法?](http://svip.iocoder.cn/Linux/Interview/#Shell-%E8%84%9A%E6%9C%AC%E4%B8%AD-case-%E8%AF%AD%E5%8F%A5%E7%9A%84%E8%AF%AD%E6%B3%95)
4. [Shell 脚本中 for 循环语法？](http://svip.iocoder.cn/Linux/Interview/#Shell-%E8%84%9A%E6%9C%AC%E4%B8%AD-for-%E5%BE%AA%E7%8E%AF%E8%AF%AD%E6%B3%95%EF%BC%9F)
5. [Shell 脚本中 while 循环语法？](http://svip.iocoder.cn/Linux/Interview/#Shell-%E8%84%9A%E6%9C%AC%E4%B8%AD-while-%E5%BE%AA%E7%8E%AF%E8%AF%AD%E6%B3%95%EF%BC%9F)
6. [如何使脚本可执行?](http://svip.iocoder.cn/Linux/Interview/#%E5%A6%82%E4%BD%95%E4%BD%BF%E8%84%9A%E6%9C%AC%E5%8F%AF%E6%89%A7%E8%A1%8C)
7. [在 Shell 脚本如何定义函数呢？](http://svip.iocoder.cn/Linux/Interview/#%E5%9C%A8-Shell-%E8%84%9A%E6%9C%AC%E5%A6%82%E4%BD%95%E5%AE%9A%E4%B9%89%E5%87%BD%E6%95%B0%E5%91%A2%EF%BC%9F)

#### [编程题](http://svip.iocoder.cn/Linux/Interview/#%E7%BC%96%E7%A8%8B%E9%A2%98)

1. [判断一文件是不是字符设备文件，如果是将其拷贝到 /dev 目录下？](http://svip.iocoder.cn/Linux/Interview/#%E5%88%A4%E6%96%AD%E4%B8%80%E6%96%87%E4%BB%B6%E6%98%AF%E4%B8%8D%E6%98%AF%E5%AD%97%E7%AC%A6%E8%AE%BE%E5%A4%87%E6%96%87%E4%BB%B6%EF%BC%8C%E5%A6%82%E6%9E%9C%E6%98%AF%E5%B0%86%E5%85%B6%E6%8B%B7%E8%B4%9D%E5%88%B0-dev-%E7%9B%AE%E5%BD%95%E4%B8%8B%EF%BC%9F)
2. [添加一个新组为 class1 ，然后添加属于这个组的 30 个用户，用户名的形式为 stdxx ，其中 xx 从 01 到 30 ？](http://svip.iocoder.cn/Linux/Interview/#%E6%B7%BB%E5%8A%A0%E4%B8%80%E4%B8%AA%E6%96%B0%E7%BB%84%E4%B8%BA-class1-%EF%BC%8C%E7%84%B6%E5%90%8E%E6%B7%BB%E5%8A%A0%E5%B1%9E%E4%BA%8E%E8%BF%99%E4%B8%AA%E7%BB%84%E7%9A%84-30-%E4%B8%AA%E7%94%A8%E6%88%B7%EF%BC%8C%E7%94%A8%E6%88%B7%E5%90%8D%E7%9A%84%E5%BD%A2%E5%BC%8F%E4%B8%BA-stdxx-%EF%BC%8C%E5%85%B6%E4%B8%AD-xx-%E4%BB%8E-01-%E5%88%B0-30-%EF%BC%9F)
3. [写一个 sed 命令，修改 /tmp/input.txt 文件的内容？](http://svip.iocoder.cn/Linux/Interview/#%E5%86%99%E4%B8%80%E4%B8%AA-sed-%E5%91%BD%E4%BB%A4%EF%BC%8C%E4%BF%AE%E6%94%B9-tmp-input-txt-%E6%96%87%E4%BB%B6%E7%9A%84%E5%86%85%E5%AE%B9%EF%BC%9F)

#### [实战](http://svip.iocoder.cn/Linux/Interview/#%E5%AE%9E%E6%88%98)

1. [如何选择 Linux 操作系统版本?](http://svip.iocoder.cn/Linux/Interview/#%E5%A6%82%E4%BD%95%E9%80%89%E6%8B%A9-Linux-%E6%93%8D%E4%BD%9C%E7%B3%BB%E7%BB%9F%E7%89%88%E6%9C%AC)
2. [如何规划一台 Linux 主机，步骤是怎样？](http://svip.iocoder.cn/Linux/Interview/#%E5%A6%82%E4%BD%95%E8%A7%84%E5%88%92%E4%B8%80%E5%8F%B0-Linux-%E4%B8%BB%E6%9C%BA%EF%BC%8C%E6%AD%A5%E9%AA%A4%E6%98%AF%E6%80%8E%E6%A0%B7%EF%BC%9F)
3. [请问当用户反馈网站访问慢，你会如何处理？](http://svip.iocoder.cn/Linux/Interview/#%E8%AF%B7%E9%97%AE%E5%BD%93%E7%94%A8%E6%88%B7%E5%8F%8D%E9%A6%88%E7%BD%91%E7%AB%99%E8%AE%BF%E9%97%AE%E6%85%A2%EF%BC%8C%E4%BD%A0%E4%BC%9A%E5%A6%82%E4%BD%95%E5%A4%84%E7%90%86%EF%BC%9F)
4. [如何排查 CPU load 过高问题？](http://svip.iocoder.cn/Linux/Interview/#%E5%A6%82%E4%BD%95%E6%8E%92%E6%9F%A5-CPU-load-%E8%BF%87%E9%AB%98%E9%97%AE%E9%A2%98%EF%BC%9F)
5. [Linux 性能调优都有哪几种方法？](http://svip.iocoder.cn/Linux/Interview/#Linux-%E6%80%A7%E8%83%BD%E8%B0%83%E4%BC%98%E9%83%BD%E6%9C%89%E5%93%AA%E5%87%A0%E7%A7%8D%E6%96%B9%E6%B3%95%EF%BC%9F)
6. [666. 彩蛋](http://svip.iocoder.cn/Linux/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **Git**

#### [基础](http://svip.iocoder.cn/Git/Interview/#%E5%9F%BA%E7%A1%80)

1. [Git 的一些常用命令？](http://svip.iocoder.cn/Git/Interview/#Git-%E7%9A%84%E4%B8%80%E4%BA%9B%E5%B8%B8%E7%94%A8%E5%91%BD%E4%BB%A4%EF%BC%9F)
2. [平时使用什么 Git 工具？](http://svip.iocoder.cn/Git/Interview/#%E5%B9%B3%E6%97%B6%E4%BD%BF%E7%94%A8%E4%BB%80%E4%B9%88-Git-%E5%B7%A5%E5%85%B7%EF%BC%9F)
3. [Git 和 SVN 的优缺点？](http://svip.iocoder.cn/Git/Interview/#Git-%E5%92%8C-SVN-%E7%9A%84%E4%BC%98%E7%BC%BA%E7%82%B9%EF%BC%9F)
4. [说说创建分支的步骤？](http://svip.iocoder.cn/Git/Interview/#%E8%AF%B4%E8%AF%B4%E5%88%9B%E5%BB%BA%E5%88%86%E6%94%AF%E7%9A%84%E6%AD%A5%E9%AA%A4%EF%BC%9F)
5. [add 和 stage 有什么区别？](http://svip.iocoder.cn/Git/Interview/#add-%E5%92%8C-stage-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
6. [merge 和 rebase 的有什么区别？](http://svip.iocoder.cn/Git/Interview/#merge-%E5%92%8C-rebase-%E7%9A%84%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
7. [Git 如何解决代码冲突？](http://svip.iocoder.cn/Git/Interview/#Git-%E5%A6%82%E4%BD%95%E8%A7%A3%E5%86%B3%E4%BB%A3%E7%A0%81%E5%86%B2%E7%AA%81%EF%BC%9F)
8. [pull 与 fetch 有什么区别？](http://svip.iocoder.cn/Git/Interview/#pull-%E4%B8%8E-fetch-%E6%9C%89%E4%BB%80%E4%B9%88%E5%8C%BA%E5%88%AB%EF%BC%9F)
9. [什么是 fork 操作？](http://svip.iocoder.cn/Git/Interview/#%E4%BB%80%E4%B9%88%E6%98%AF-fork-%E6%93%8D%E4%BD%9C%EF%BC%9F)
10. [Git 服务器](http://svip.iocoder.cn/Git/Interview/#Git-%E6%9C%8D%E5%8A%A1%E5%99%A8)

#### [【重要】Git 工作流](http://svip.iocoder.cn/Git/Interview/#%E3%80%90%E9%87%8D%E8%A6%81%E3%80%91Git-%E5%B7%A5%E4%BD%9C%E6%B5%81)

1. [Git 集中式工作流](http://svip.iocoder.cn/Git/Interview/#Git-%E9%9B%86%E4%B8%AD%E5%BC%8F%E5%B7%A5%E4%BD%9C%E6%B5%81)
2. [Git 功能分支工作流](http://svip.iocoder.cn/Git/Interview/#Git-%E5%8A%9F%E8%83%BD%E5%88%86%E6%94%AF%E5%B7%A5%E4%BD%9C%E6%B5%81)
3. [Gitflow 工作流](http://svip.iocoder.cn/Git/Interview/#Gitflow-%E5%B7%A5%E4%BD%9C%E6%B5%81)
4. [Forking 工作流程](http://svip.iocoder.cn/Git/Interview/#Forking-%E5%B7%A5%E4%BD%9C%E6%B5%81%E7%A8%8B)
5. [解释下 PR 和 MR 的区别？](http://svip.iocoder.cn/Git/Interview/#%E8%A7%A3%E9%87%8A%E4%B8%8B-PR-%E5%92%8C-MR-%E7%9A%84%E5%8C%BA%E5%88%AB%EF%BC%9F)
6. [666. 彩蛋](http://svip.iocoder.cn/Git/Interview/#666-%E5%BD%A9%E8%9B%8B)

### **数据结构与算法**

1. [001. 两数之和](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#001-%E4%B8%A4%E6%95%B0%E4%B9%8B%E5%92%8C)
2. [011. 盛最多水的容器](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#011-%E7%9B%9B%E6%9C%80%E5%A4%9A%E6%B0%B4%E7%9A%84%E5%AE%B9%E5%99%A8)
3. [283. 移动零](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#283-%E7%A7%BB%E5%8A%A8%E9%9B%B6)
4. [485. 最大连续 1 的个数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#485-%E6%9C%80%E5%A4%A7%E8%BF%9E%E7%BB%AD-1-%E7%9A%84%E4%B8%AA%E6%95%B0)
5. [645. 错误的集合](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#645-%E9%94%99%E8%AF%AF%E7%9A%84%E9%9B%86%E5%90%88)
6. [667. 优美的排列 II](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#667-%E4%BC%98%E7%BE%8E%E7%9A%84%E6%8E%92%E5%88%97-II)
7. [697. 数组的度](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#697-%E6%95%B0%E7%BB%84%E7%9A%84%E5%BA%A6)
8. [565. 嵌套数组](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#565-%E5%B5%8C%E5%A5%97%E6%95%B0%E7%BB%84)
9. [769. 最多能完成排序的块](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#769-%E6%9C%80%E5%A4%9A%E8%83%BD%E5%AE%8C%E6%88%90%E6%8E%92%E5%BA%8F%E7%9A%84%E5%9D%97)
10. [977. 有序数组的平方](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#977-%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E7%9A%84%E5%B9%B3%E6%96%B9)
11. [118. 杨辉三角](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#118-%E6%9D%A8%E8%BE%89%E4%B8%89%E8%A7%92)
12. [189. 旋转数组](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#189-%E6%97%8B%E8%BD%AC%E6%95%B0%E7%BB%84)
13. [238. 除自身以外数组的乘积](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#238-%E9%99%A4%E8%87%AA%E8%BA%AB%E4%BB%A5%E5%A4%96%E6%95%B0%E7%BB%84%E7%9A%84%E4%B9%98%E7%A7%AF)

#### [矩阵](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E7%9F%A9%E9%98%B5)

1. [766. 托普利茨矩阵](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#766-%E6%89%98%E6%99%AE%E5%88%A9%E8%8C%A8%E7%9F%A9%E9%98%B5)
2. [566. 重塑矩阵](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#566-%E9%87%8D%E5%A1%91%E7%9F%A9%E9%98%B5)
3. [074. 搜索二维矩阵](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#074-%E6%90%9C%E7%B4%A2%E4%BA%8C%E7%BB%B4%E7%9F%A9%E9%98%B5)
4. [240. 搜索二维矩阵 II](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#240-%E6%90%9C%E7%B4%A2%E4%BA%8C%E7%BB%B4%E7%9F%A9%E9%98%B5-II)
5. [054. 螺旋矩阵](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#054-%E8%9E%BA%E6%97%8B%E7%9F%A9%E9%98%B5)
6. [073. 矩阵置零](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#073-%E7%9F%A9%E9%98%B5%E7%BD%AE%E9%9B%B6)

#### [字符串](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%AD%97%E7%AC%A6%E4%B8%B2)

1. [028. 实现 strStr()](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#028-%E5%AE%9E%E7%8E%B0-strStr)
2. [242. 有效的字母异位词](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#242-%E6%9C%89%E6%95%88%E7%9A%84%E5%AD%97%E6%AF%8D%E5%BC%82%E4%BD%8D%E8%AF%8D)
3. [205. 字符串同构](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#205-%E5%AD%97%E7%AC%A6%E4%B8%B2%E5%90%8C%E6%9E%84)
4. [125. 验证回文串](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#125-%E9%AA%8C%E8%AF%81%E5%9B%9E%E6%96%87%E4%B8%B2)
5. [344. 反转字符串](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#344-%E5%8F%8D%E8%BD%AC%E5%AD%97%E7%AC%A6%E4%B8%B2)
6. [524. 通过删除字母匹配到字典里最长单词](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#524-%E9%80%9A%E8%BF%87%E5%88%A0%E9%99%A4%E5%AD%97%E6%AF%8D%E5%8C%B9%E9%85%8D%E5%88%B0%E5%AD%97%E5%85%B8%E9%87%8C%E6%9C%80%E9%95%BF%E5%8D%95%E8%AF%8D)
7. [003. 无重复字符的最长子串](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#003-%E6%97%A0%E9%87%8D%E5%A4%8D%E5%AD%97%E7%AC%A6%E7%9A%84%E6%9C%80%E9%95%BF%E5%AD%90%E4%B8%B2)
8. [696. 计数二进制子串](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#696-%E8%AE%A1%E6%95%B0%E4%BA%8C%E8%BF%9B%E5%88%B6%E5%AD%90%E4%B8%B2)
9. [151. 翻转字符串里的单词](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#151-%E7%BF%BB%E8%BD%AC%E5%AD%97%E7%AC%A6%E4%B8%B2%E9%87%8C%E7%9A%84%E5%8D%95%E8%AF%8D)
10. [008. 字符串转换整数 (atoi)](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#008-%E5%AD%97%E7%AC%A6%E4%B8%B2%E8%BD%AC%E6%8D%A2%E6%95%B4%E6%95%B0-atoi)

#### [链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E9%93%BE%E8%A1%A8)

1. [707. 设计链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#707-%E8%AE%BE%E8%AE%A1%E9%93%BE%E8%A1%A8)
2. [002. 两数相加](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#002-%E4%B8%A4%E6%95%B0%E7%9B%B8%E5%8A%A0)
3. [024. 两两交换链表中的节点](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#024-%E4%B8%A4%E4%B8%A4%E4%BA%A4%E6%8D%A2%E9%93%BE%E8%A1%A8%E4%B8%AD%E7%9A%84%E8%8A%82%E7%82%B9)
4. [083. 删除排序链表中的重复元素](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#083-%E5%88%A0%E9%99%A4%E6%8E%92%E5%BA%8F%E9%93%BE%E8%A1%A8%E4%B8%AD%E7%9A%84%E9%87%8D%E5%A4%8D%E5%85%83%E7%B4%A0)
5. [160. 相交链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#160-%E7%9B%B8%E4%BA%A4%E9%93%BE%E8%A1%A8)
6. [148. 排序链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#148-%E6%8E%92%E5%BA%8F%E9%93%BE%E8%A1%A8)
7. [021. 合并两个有序链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#021-%E5%90%88%E5%B9%B6%E4%B8%A4%E4%B8%AA%E6%9C%89%E5%BA%8F%E9%93%BE%E8%A1%A8)
8. [725. 分隔链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#725-%E5%88%86%E9%9A%94%E9%93%BE%E8%A1%A8)
9. [725. 分隔链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#725-%E5%88%86%E9%9A%94%E9%93%BE%E8%A1%A8-1)
10. [086. 分隔链表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#086-%E5%88%86%E9%9A%94%E9%93%BE%E8%A1%A8)

#### [二分查找](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E4%BA%8C%E5%88%86%E6%9F%A5%E6%89%BE)

1. [287. 寻找重复数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#287-%E5%AF%BB%E6%89%BE%E9%87%8D%E5%A4%8D%E6%95%B0)
2. [035. 搜索插入位置](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#035-%E6%90%9C%E7%B4%A2%E6%8F%92%E5%85%A5%E4%BD%8D%E7%BD%AE)
3. [153. 寻找旋转排序数组中的最小值](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#153-%E5%AF%BB%E6%89%BE%E6%97%8B%E8%BD%AC%E6%8E%92%E5%BA%8F%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E6%9C%80%E5%B0%8F%E5%80%BC)
4. [852. 山脉数组的峰顶索引](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#852-%E5%B1%B1%E8%84%89%E6%95%B0%E7%BB%84%E7%9A%84%E5%B3%B0%E9%A1%B6%E7%B4%A2%E5%BC%95)
5. [069. x 的平方根](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#069-x-%E7%9A%84%E5%B9%B3%E6%96%B9%E6%A0%B9)

#### [栈和队列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E6%A0%88%E5%92%8C%E9%98%9F%E5%88%97)

1. [232. 用队列实现栈](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#232-%E7%94%A8%E9%98%9F%E5%88%97%E5%AE%9E%E7%8E%B0%E6%A0%88)
2. [155. 最小栈](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#155-%E6%9C%80%E5%B0%8F%E6%A0%88)
3. [020. 有效的括号](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#020-%E6%9C%89%E6%95%88%E7%9A%84%E6%8B%AC%E5%8F%B7)
4. [496. 下一个更大元素 I](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#496-%E4%B8%8B%E4%B8%80%E4%B8%AA%E6%9B%B4%E5%A4%A7%E5%85%83%E7%B4%A0-I)

#### [递归](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E9%80%92%E5%BD%92)

1. [856. 括号的分数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#856-%E6%8B%AC%E5%8F%B7%E7%9A%84%E5%88%86%E6%95%B0)
2. [394. 字符串解码](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#394-%E5%AD%97%E7%AC%A6%E4%B8%B2%E8%A7%A3%E7%A0%81)

#### [排序](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E6%8E%92%E5%BA%8F)

1. [215. 数组中的第 K 个最大元素](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#215-%E6%95%B0%E7%BB%84%E4%B8%AD%E7%9A%84%E7%AC%AC-K-%E4%B8%AA%E6%9C%80%E5%A4%A7%E5%85%83%E7%B4%A0)
2. [347. 前 K 个高频元素](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#347-%E5%89%8D-K-%E4%B8%AA%E9%AB%98%E9%A2%91%E5%85%83%E7%B4%A0)
3. [075. 颜色分类](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#075-%E9%A2%9C%E8%89%B2%E5%88%86%E7%B1%BB)

#### [哈希表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%93%88%E5%B8%8C%E8%A1%A8)

1. [217. 存在重复元素](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#217-%E5%AD%98%E5%9C%A8%E9%87%8D%E5%A4%8D%E5%85%83%E7%B4%A0)
2. [594. 最长和谐子序列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#594-%E6%9C%80%E9%95%BF%E5%92%8C%E8%B0%90%E5%AD%90%E5%BA%8F%E5%88%97)
3. [128. 最长连续序列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#128-%E6%9C%80%E9%95%BF%E8%BF%9E%E7%BB%AD%E5%BA%8F%E5%88%97)
4. [387. 字符串中的第一个唯一字符](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#387-%E5%AD%97%E7%AC%A6%E4%B8%B2%E4%B8%AD%E7%9A%84%E7%AC%AC%E4%B8%80%E4%B8%AA%E5%94%AF%E4%B8%80%E5%AD%97%E7%AC%A6)

#### [树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E6%A0%91)

1. [104. 二叉树的最大深度](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#104-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%9C%80%E5%A4%A7%E6%B7%B1%E5%BA%A6)
2. [112. 路径总和](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#112-%E8%B7%AF%E5%BE%84%E6%80%BB%E5%92%8C)
3. [226. 翻转二叉树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#226-%E7%BF%BB%E8%BD%AC%E4%BA%8C%E5%8F%89%E6%A0%91)
4. [617. 合并二叉树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#617-%E5%90%88%E5%B9%B6%E4%BA%8C%E5%8F%89%E6%A0%91)
5. [572. 另一个树的子树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#572-%E5%8F%A6%E4%B8%80%E4%B8%AA%E6%A0%91%E7%9A%84%E5%AD%90%E6%A0%91)
6. [337. 打家劫舍 III](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#337-%E6%89%93%E5%AE%B6%E5%8A%AB%E8%88%8D-III)
7. [671. 二叉树中第二小的节点](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#671-%E4%BA%8C%E5%8F%89%E6%A0%91%E4%B8%AD%E7%AC%AC%E4%BA%8C%E5%B0%8F%E7%9A%84%E8%8A%82%E7%82%B9)
8. [637. 二叉树的层平均值](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#637-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%B1%82%E5%B9%B3%E5%9D%87%E5%80%BC)
9. [517. 找树左下角的值](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#517-%E6%89%BE%E6%A0%91%E5%B7%A6%E4%B8%8B%E8%A7%92%E7%9A%84%E5%80%BC)
10. [144. 二叉树的前序遍历](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#144-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%89%8D%E5%BA%8F%E9%81%8D%E5%8E%86)
11. [297. 二叉树的序列化与反序列化](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#297-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E5%BA%8F%E5%88%97%E5%8C%96%E4%B8%8E%E5%8F%8D%E5%BA%8F%E5%88%97%E5%8C%96)
12. [236. 二叉树的最近公共祖先](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#236-%E4%BA%8C%E5%8F%89%E6%A0%91%E7%9A%84%E6%9C%80%E8%BF%91%E5%85%AC%E5%85%B1%E7%A5%96%E5%85%88)
13. [814. 二叉树剪枝](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#814-%E4%BA%8C%E5%8F%89%E6%A0%91%E5%89%AA%E6%9E%9D)

#### [二叉搜索树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91)

1. [501. 二叉搜索树中的众数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#501-%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91%E4%B8%AD%E7%9A%84%E4%BC%97%E6%95%B0)
2. [108. 将有序数组转换为二叉搜索树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#108-%E5%B0%86%E6%9C%89%E5%BA%8F%E6%95%B0%E7%BB%84%E8%BD%AC%E6%8D%A2%E4%B8%BA%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91)
3. [700. 二叉搜索树中的搜索](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#700-%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91%E4%B8%AD%E7%9A%84%E6%90%9C%E7%B4%A2)
4. [099. 恢复二叉搜索树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#099-%E6%81%A2%E5%A4%8D%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91)

#### [字典树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%AD%97%E5%85%B8%E6%A0%91)

1. [208. 实现 Trie (前缀树)](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#208-%E5%AE%9E%E7%8E%B0-Trie-%E5%89%8D%E7%BC%80%E6%A0%91)

#### [BFS && DFS](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#BFS-amp-amp-DFS)

1. [785. 判断二分图](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#785-%E5%88%A4%E6%96%AD%E4%BA%8C%E5%88%86%E5%9B%BE)
2. [133. 克隆图](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#133-%E5%85%8B%E9%9A%86%E5%9B%BE)
3. [733. 图像渲染](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#733-%E5%9B%BE%E5%83%8F%E6%B8%B2%E6%9F%93)
4. [279. 完全平方数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#279-%E5%AE%8C%E5%85%A8%E5%B9%B3%E6%96%B9%E6%95%B0)
5. [127. 单词接龙](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#127-%E5%8D%95%E8%AF%8D%E6%8E%A5%E9%BE%99)
6. [695. 岛屿的最大面积](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#695-%E5%B2%9B%E5%B1%BF%E7%9A%84%E6%9C%80%E5%A4%A7%E9%9D%A2%E7%A7%AF)
7. [547. 朋友圈](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#547-%E6%9C%8B%E5%8F%8B%E5%9C%88)
8. [417. 太平洋大西洋水流问题](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#417-%E5%A4%AA%E5%B9%B3%E6%B4%8B%E5%A4%A7%E8%A5%BF%E6%B4%8B%E6%B0%B4%E6%B5%81%E9%97%AE%E9%A2%98)
9. [841. 钥匙和房间](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#841-%E9%92%A5%E5%8C%99%E5%92%8C%E6%88%BF%E9%97%B4)
10. [542. 01 矩阵](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#542-01-%E7%9F%A9%E9%98%B5)

#### [并查集](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%B9%B6%E6%9F%A5%E9%9B%86)

1. [684. 冗余连接](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#684-%E5%86%97%E4%BD%99%E8%BF%9E%E6%8E%A5)

#### [拓扑排序](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E6%8B%93%E6%89%91%E6%8E%92%E5%BA%8F)

1. [207. 课程表](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#207-%E8%AF%BE%E7%A8%8B%E8%A1%A8)
2. [802. 找到最终的安全状态](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#802-%E6%89%BE%E5%88%B0%E6%9C%80%E7%BB%88%E7%9A%84%E5%AE%89%E5%85%A8%E7%8A%B6%E6%80%81)

#### [回溯算法](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%9B%9E%E6%BA%AF%E7%AE%97%E6%B3%95)

1. [017. 电话号码的字母组合](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#017-%E7%94%B5%E8%AF%9D%E5%8F%B7%E7%A0%81%E7%9A%84%E5%AD%97%E6%AF%8D%E7%BB%84%E5%90%88)
2. [093. 复原IP地址](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#093-%E5%A4%8D%E5%8E%9FIP%E5%9C%B0%E5%9D%80)
3. [079. 单词搜索](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#079-%E5%8D%95%E8%AF%8D%E6%90%9C%E7%B4%A2)
4. [046. 全排列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#046-%E5%85%A8%E6%8E%92%E5%88%97)
5. [078. 子集](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#078-%E5%AD%90%E9%9B%86)
6. [131. 分割回文串](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#131-%E5%88%86%E5%89%B2%E5%9B%9E%E6%96%87%E4%B8%B2)
7. [842. 将数组拆分成斐波那契序列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#842-%E5%B0%86%E6%95%B0%E7%BB%84%E6%8B%86%E5%88%86%E6%88%90%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E5%BA%8F%E5%88%97)
8. [037. 解数独](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#037-%E8%A7%A3%E6%95%B0%E7%8B%AC)

#### [分治算法](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%88%86%E6%B2%BB%E7%AE%97%E6%B3%95)

1. [241. 为运算表达式设计优先级](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#241-%E4%B8%BA%E8%BF%90%E7%AE%97%E8%A1%A8%E8%BE%BE%E5%BC%8F%E8%AE%BE%E8%AE%A1%E4%BC%98%E5%85%88%E7%BA%A7)
2. [096. 不同的二叉搜索树](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#096-%E4%B8%8D%E5%90%8C%E7%9A%84%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91)
3. [169. 求众数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#169-%E6%B1%82%E4%BC%97%E6%95%B0)

#### [贪心算法](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E8%B4%AA%E5%BF%83%E7%AE%97%E6%B3%95)

1. [455. 分发饼干](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#455-%E5%88%86%E5%8F%91%E9%A5%BC%E5%B9%B2)
2. [435. 无重叠区间](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#435-%E6%97%A0%E9%87%8D%E5%8F%A0%E5%8C%BA%E9%97%B4)
3. [406. 根据身高重建队列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#406-%E6%A0%B9%E6%8D%AE%E8%BA%AB%E9%AB%98%E9%87%8D%E5%BB%BA%E9%98%9F%E5%88%97)
4. [121. 买卖股票的最佳时机](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#121-%E4%B9%B0%E5%8D%96%E8%82%A1%E7%A5%A8%E7%9A%84%E6%9C%80%E4%BD%B3%E6%97%B6%E6%9C%BA)
5. [392. 判断子序列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#392-%E5%88%A4%E6%96%AD%E5%AD%90%E5%BA%8F%E5%88%97)
6. [055. 跳跃游戏](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#055-%E8%B7%B3%E8%B7%83%E6%B8%B8%E6%88%8F)
7. [763. 划分字母区间](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#763-%E5%88%92%E5%88%86%E5%AD%97%E6%AF%8D%E5%8C%BA%E9%97%B4)
8. [055. 跳跃游戏](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#055-%E8%B7%B3%E8%B7%83%E6%B8%B8%E6%88%8F-1)

#### [动态规划 DOING](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E5%8A%A8%E6%80%81%E8%A7%84%E5%88%92-DOING)

1. [509. 斐波那契数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#509-%E6%96%90%E6%B3%A2%E9%82%A3%E5%A5%91%E6%95%B0)
2. [198. 打家劫舍](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#198-%E6%89%93%E5%AE%B6%E5%8A%AB%E8%88%8D)
3. [064. 最小路径和](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#064-%E6%9C%80%E5%B0%8F%E8%B7%AF%E5%BE%84%E5%92%8C)
4. [303. 区域和检索 - 数组不可变](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#303-%E5%8C%BA%E5%9F%9F%E5%92%8C%E6%A3%80%E7%B4%A2-%E6%95%B0%E7%BB%84%E4%B8%8D%E5%8F%AF%E5%8F%98)
5. [413. 等差数列划分](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#413-%E7%AD%89%E5%B7%AE%E6%95%B0%E5%88%97%E5%88%92%E5%88%86)
6. [343. 整数拆分](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#343-%E6%95%B4%E6%95%B0%E6%8B%86%E5%88%86)
7. [091. 解码方法](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#091-%E8%A7%A3%E7%A0%81%E6%96%B9%E6%B3%95)
8. [416. 分割等和子集](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#416-%E5%88%86%E5%89%B2%E7%AD%89%E5%92%8C%E5%AD%90%E9%9B%86)
9. [494. 目标和](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#494-%E7%9B%AE%E6%A0%87%E5%92%8C)
10. [474. 一和零](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#474-%E4%B8%80%E5%92%8C%E9%9B%B6)
11. [322. 零钱兑换](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#322-%E9%9B%B6%E9%92%B1%E5%85%91%E6%8D%A2)
12. [139. 单词拆分](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#139-%E5%8D%95%E8%AF%8D%E6%8B%86%E5%88%86)
13. [309. 最佳买卖股票时机含冷冻期](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#309-%E6%9C%80%E4%BD%B3%E4%B9%B0%E5%8D%96%E8%82%A1%E7%A5%A8%E6%97%B6%E6%9C%BA%E5%90%AB%E5%86%B7%E5%86%BB%E6%9C%9F)
14. [221. 最大正方形](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#221-%E6%9C%80%E5%A4%A7%E6%AD%A3%E6%96%B9%E5%BD%A2)
15. [152. 乘积最大子序列](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#152-%E4%B9%98%E7%A7%AF%E6%9C%80%E5%A4%A7%E5%AD%90%E5%BA%8F%E5%88%97)

#### [位运算](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E4%BD%8D%E8%BF%90%E7%AE%97)

1. [461. 汉明距离](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#461-%E6%B1%89%E6%98%8E%E8%B7%9D%E7%A6%BB)
2. [136. 只出现一次的数字](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#136-%E5%8F%AA%E5%87%BA%E7%8E%B0%E4%B8%80%E6%AC%A1%E7%9A%84%E6%95%B0%E5%AD%97)
3. [190. 颠倒二进制位](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#190-%E9%A2%A0%E5%80%92%E4%BA%8C%E8%BF%9B%E5%88%B6%E4%BD%8D)
4. [231. 2 的幂](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#231-2-%E7%9A%84%E5%B9%82)
5. [693. 交替位二进制数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#693-%E4%BA%A4%E6%9B%BF%E4%BD%8D%E4%BA%8C%E8%BF%9B%E5%88%B6%E6%95%B0)
6. [476. 数字的补数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#476-%E6%95%B0%E5%AD%97%E7%9A%84%E8%A1%A5%E6%95%B0)
7. [371. 两整数之和](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#371-%E4%B8%A4%E6%95%B4%E6%95%B0%E4%B9%8B%E5%92%8C)
8. [318. 最大单词长度乘积](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#318-%E6%9C%80%E5%A4%A7%E5%8D%95%E8%AF%8D%E9%95%BF%E5%BA%A6%E4%B9%98%E7%A7%AF)
9. [191. 位1的个数](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#191-%E4%BD%8D1%E7%9A%84%E4%B8%AA%E6%95%B0)
10. [数学 TODO](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#%E6%95%B0%E5%AD%A6-TODO)
11. [TODO](http://svip.iocoder.cn/Data-Structures-and-Algorithms/Interview/#TODO)

#### Level 3

#### Level 4

