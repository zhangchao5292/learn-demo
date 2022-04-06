package com.suanfa.hot;

import java.util.*;

/**
 * @description: 数组交集
 * @author: chao.zhang
 * @create: 2021-06-24 18:54
 **/
public class ArrayIntersection {


    public static void main(String[] args) {
        try {
            int[] nums1 = {1, 2, 3, 5, 7};
            int[] nums2 = {3, 5, 7, 9, 11};
//            int[] arr = arrayIntersection(nums1, nums2);
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
            arrayIntersection2(nums1, nums2);
           List<Object> objects = new ArrayList<>();
            objects.add(12);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int[] arrayIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    set.add(nums1[i]);
                }
            }
        }
        //转换int[]
        int[] res = new int[set.size()];
        int i = 0;
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            res[i] = iterator.next();
            ++i;
        }
        return res;
    }


    public static void arrayIntersection2(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }
        int[] arr = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                arr[i] = nums2[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
