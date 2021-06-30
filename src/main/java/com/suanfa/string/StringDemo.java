package com.suanfa.string;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-09 19:10
 **/
public class StringDemo {

    /**
     * 双指针交换反转字符串
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int len = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            System.out.println(arr[i]);
            int temp = arr[i];
            arr[i] = arr[len - 1 - i];
            arr[len - 1 - i] = temp;
        }

//        for (int i = 0; i < len; i++) {
//            System.out.print(arr[i]);
//        }

        String re = reverseWords("  hello world  ");
        System.out.println(re);
        moveWords("hello world",3);


    }

    public static String reverseWords(String s) {
        String[] chars = s.trim().split(" ");
        int len = chars.length;
        StringBuffer sb = new StringBuffer();
        for (int i = len - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }

        return sb.toString();
    }

    public static String moveWords(String s, int k) {
        if (s.length() < k) {
            return "error";
        }
        String a = s.substring(0, k);
        String b = s.substring(k);
        System.out.println(b + a);
        return b + a;
    }

}
