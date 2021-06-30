package com.suanfa;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 优先队列的作用是能保证每次取出的元素都是队列中权值最小的,基于优先堆的一个无界队列
 * Java中PriorityQueue实现了Queue接口，不允许放入null元素；其通过堆实现，
 * 具体说是通过完全二叉树（complete binary tree）实现的小顶堆
 *
 * @author: chao.zhang
 * @create: 2021-06-09 16:07
 **/
public class PriorityQueueDemo {

    static Queue<Integer> q;

    public static void main(String[] args) {
        try {
            KthLargest(1, new int[]{12, 43, 56, 2, 4, 8, 22, 40});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void KthLargest(int k, int[] a) {
        q = new PriorityQueue<Integer>(k);
        for (int i = 0; i < a.length; i++) {
            int ss = addEle(a[i], k);
            System.out.println(ss);
        }
    }

    private static int addEle(int n, int k) {
        if (q.size() < k) {
            q.add(n);
        } else if (q.peek() < n) {
            q.poll();
            q.add(n);
        }
        return q.peek();
    }


}
