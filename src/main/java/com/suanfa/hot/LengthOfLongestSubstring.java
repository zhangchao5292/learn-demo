package com.suanfa.hot;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @description: 最长子字符串
 * 定义一个 map 数据结构存储 (k, v)，其中 key 值为字符，value 值为字符位置 +1，加 1 表示从字符位置后一个才开始不重复
 * @author: chao.zhang
 * @create: 2021-06-23 16:42
 **/
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        // 特判
        if (len < 2) {
            return len;
        }
        int left = 0;
        // 非空的时候，结果至少是 1 ，因此初值可以设置成为 1
        int res = 1;
        //  key 为字符，val 记录了当前读到的字符的索引，在每轮循环的最后更新
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < len; right++) {
            // 右边界没有重复的时候，直接向右边扩张就好了
            // 右边界有重复的时候，只要在滑动窗口内，我们就得更新
            // 如果在滑动窗口之外，一定是之前被计算过的
            if (map.containsKey(s.charAt(right))) {
                if (map.get(s.charAt(right)) >= left) {
                    // 下一个不重复的子串至少在之前重复的那个位置之后
                    // 【特别注意】快在这个地方，左边界直接跳到之前重复的那个位置之后
                    left = map.get(s.charAt(right)) + 1;
                }
            }
            // 此时滑动窗口内一定没有重复元素
            res = Math.max(res, right - left + 1);
            // 无论如何都更新位置
            map.put(s.charAt(right), right);
        }
        return res;
    }

    public static int lengthOfLongestSubstring2(String s) {
        int res = 0;
        String zi = "";
        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                res = Math.max(res, j - i + 1);
                String sub = s.substring(i, j + 1);
                if (sub.length() > zi.length()) {
                    zi = sub;
                }
                set.add(s.charAt(j));
            }
        }
        System.out.println("子字符串 " + zi);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("processResources"));
        System.out.println(lengthOfLongestSubstring2("processResources"));
        String a = "12";
        StringBuffer sb = new StringBuffer();

    }

}
