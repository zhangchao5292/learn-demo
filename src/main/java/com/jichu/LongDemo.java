package com.jichu;

/**
 * @author chao.zhang
 */
public class LongDemo {
    public static void main(String[] args) {
        Long l1 = 12334343L;
        Long l2 = 12334343L;
        Long l3 = 12L;
        Long l4 = 12L;
        System.out.println(l1 == l2);
        System.out.println(l3 == l4);
//        对于Long类型的对比，不要用“==”，尽量避免Long类型的直接对比
//        将Long转换成基本类型再进行比较：a.longValue() == b.longValue()，或者0 == Long.compare(a, b)；
//        缓冲[-128~127]之间的数字实际就是系统初始的时候，创建了[-128~127]之间的一个缓冲数组，
//        当调用valueOf()的时候，首先检查是否在[-128~127]之间，如果在这个范围则直接从缓冲数组中拿出已经建好的对象，
//        如果不在这个范围则创建新的Integer对象

    }
}

