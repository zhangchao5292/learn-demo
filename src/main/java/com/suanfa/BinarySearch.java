package com.suanfa;

/**
 * @description: 二分搜索(折半搜索)----是一种在有序数组中查找某一特定元素的搜索算法。
 * <p>
 * 从数组的中间元素开始，如果中间元素正好是要查找的元素，则搜索过程结束；
 * 如果某一特定元素大于或者小于中间元素，则在数组大于或小于中间元素的那一半中查找，而且跟开始一样从中间元素开始比较。
 * 如果在某一步骤数组为空，则代表找不到。这种搜索算法每一次比较都使搜索范围缩小一半。
 * @author: chao.zhang
 * @create: 2021-05-24 09:56
 **/
public class BinarySearch {
//    给定一个有序的数组，查找 value 是否在数组中，不存在返回 -1。


    public static int getBinarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 7, 9, 12, 23};
        System.out.println("index: " + getBinarySearch(arr, 2));
    }
}
