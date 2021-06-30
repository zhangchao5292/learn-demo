package com.suanfa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @description: 贪心算法
 * @author: chao.zhang
 * @create: 2021-05-18 10:04
 **/
public class Tanxin {

    public static void main(String[] args) {
//        testArrangeActivity();

        int[] arr = {12, 3, 57, 6, 32, 8};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        String a = "jack";
        String b = "wang";
        String c = "jackwang";
        String e = "jackwang";
        String f = "jack" + "wang";//+两边都是字符常量来说，java在编译期就将+两边拼接合并了而不会等到运行时再
        String d = a + b;//* 接着说字符串，既然都是变量，跟多态的原理一样，java会在运行的时候去处理+号两边的变量。但是具体的方式不一样，
        //如果是变量 ，那么java会先new出一个StringBuilder(在JDK6.0之前是StringBuffer),然后调用append()方法,来将+号两遍的字符串拼接起来(底层就是char数组的拼接),
        // 然后toString()之后返回给=号左边的变量，也就是说，最后得到的
        // 是一个new出来的字符串，那么这个字符串必然是在堆中了。结果就必然会是false了。
        System.out.println(f == e);


    }

    /**
     * [活动安排问题]
     * <p>
     * 设有n个活动的集合e={1，2，…，n}，其中每个活动都要求使用同一资源，如演讲会场等，而在同一时间内只有一个活动能使用这一资源。
     * 每个活动i都有一个要求使用该资源的起始时间si和一个结束时间fi,且si< fi。如果选择了活动i，则它在半开时间区间[si，fi]内占用资源。
     * 若区间[si，fi]与区间[sj，fj]不相交，则称活动i与活动j是相容的。也就是说，当si≥fi或sj≥fj时，活动i与活动j相容。
     * 活动安排问题就是要在所给的活动集合中选出最大的相容活动子集合。
     */


    public static void testArrangeActivity() {
        int[] start = {1, 3, 0, 5, 3, 5, 6, 8, 8, 2, 12};
        int[] end = {4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        List<Integer> results = arrangeActivity(start, end);
        for (int i = 0; i < results.size(); i++) {
            int index = results.get(i);
            System.out.println("开始时间:" + start[index] + ",结束时间:" + end[index]);
        }
    }

    /**
     * 活动安排
     *
     * @param s 开始时间
     * @param e 结束时间
     * @return
     */
    public static List<Integer> arrangeActivity(int[] s, int[] e) {
        int total = s.length;
        int endFlag = e[0];
        List<Integer> results = new ArrayList<>();
        results.add(0);
        for (int i = 0; i < total; i++) {
            if (s[i] > endFlag) {
                results.add(i);
                endFlag = e[i];
            }
        }
        return results;
    }

}
