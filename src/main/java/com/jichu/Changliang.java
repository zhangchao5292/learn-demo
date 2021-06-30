package com.jichu;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-27 11:27
 **/
public class Changliang {

    public static void main(String[] args) {
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2));
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
        System.out.println("i1=i4   " + (i1 == i4));
        System.out.println("i4=i5   " + (i4 == i5));
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));//因为+这个操作符不适用于Integer对象，首先i5和i6进行自动拆箱操作，进行数值相加
        System.out.println("40=i5+i6   " + (40 == i5 + i6));


    }

}
