package com.suanfa;

/**
 * @description:双指针
 * 初始时两个指针分别指向第一个元素位置和最后一个元素的位置。每次计算两个指针指向的两个元素之和，并和目标值比较。如果两个元素之和等于目标值，则发现了唯一解。如果两个元素之和小于目标值，则将左侧指针右移一位。如果两个元素之和大于目标值，则将右侧指针左移一位。移动指针之后，重复上述操作，直到找到答案
 *
 * 作者：LeetCode-Solution
 * 链接：https://leetcode-cn.com/problems/two-sum-ii-input-array-is-sorted/solution/liang-shu-zhi-he-ii-shu-ru-you-xu-shu-zu-by-leet-2/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 * @author: chao.zhang
 * @create: 2021-06-10 16:18
 **/
public class ShuangZhiZhen {

    public static void main(String[] args) {
        try {
            int[] ints = twoSum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 10);
            System.out.println(ints[0] + "--" + ints[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length-1;
        while (i < j) {
            int sum = numbers[i] + numbers[j];
            if (target > sum) {
                i++;
            } else if (target < sum) {
                j--;
            } else {
                return new int[]{numbers[i], numbers[j]};
            }
        }
        return null;
    }


}
