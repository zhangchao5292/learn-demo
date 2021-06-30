package com.suanfa.find;

import java.util.Arrays;

/**
 * @description: 二分查找
 * @author: chao.zhang
 * @create: 2021-06-16 11:18
 **/
public class Search1 {


    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 32, 32, 67, 88};
        //二分查找
        int search = search(nums, 32);
        int target = 32;
        int leftIdx = binarySearch(nums, target - 1);
        int rightIdx = binarySearch(nums, target) - 1;
        System.out.println("idx:" + leftIdx + "--" + rightIdx);
        if (leftIdx <= rightIdx && nums[leftIdx] == target) {
            int[] ints = {leftIdx, rightIdx};
            Arrays.stream(ints).forEach(a -> System.out.println(a));
        }
        System.out.println(mySqrt(10));
    }


    //二分查找  时间复杂度：O(log(n));
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (arr[middle] > target) {
                right = middle - 1;
            } else if (arr[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    // 第一个大于 target 的数的下标
    public static int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    /**
     * 二分查找求 x的平方根
     * @param x
     * @return
     */
    public static int mySqrt(int x) {
        int index = -1;
        int left = 0;
        int right = x;
        while (left < right) {
            int middle = (left + right) / 2;
            if (middle * middle <= x) {
                index = middle;
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return index;
    }


}
