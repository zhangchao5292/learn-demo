package com.suanfa;

import com.google.common.base.Joiner;

import java.util.*;

/**
 * @description: 二叉树 https://juejin.cn/post/6844903792371040263
 * 二叉树遍历（前序、中序、后序、层次遍历、深度优先、广度优先）
 * @author: chao.zhang
 * @create: 2021-05-24 20:14
 **/
public class BinaryTree {

    public static TreeNode rootNode = null;

    class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }
    }

    /**
     * 前序遍历
     *
     * @param node
     */
    public void pre(TreeNode node) {
        System.out.println(node.val);
        pre(node.left);
        pre(node.right);
    }

    /**
     * 中序遍历
     *
     * @param node
     */
    public void midle(TreeNode node) {
        pre(node.left);
        System.out.println(node.val);
        pre(node.right);
    }

    /**
     * 后序遍历
     *
     * @param node
     */
    public void after(TreeNode node) {
        pre(node.left);
        pre(node.right);
        System.out.println(node.val);
    }

    /**
     * 以下展示广度优先遍历，利用了Java的Queue队列先进先出的特性：
     * @param tree
     */
    public static void broadFirstSearch(TreeNode tree) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(tree);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            // queue先进先出，所以先左后右
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        System.out.println();
    }

    /**
     * 查找
     * @param value
     * @return
     */
    public TreeNode get(int value) {
        TreeNode currentRoot = rootNode;
        while (true) {
            if (currentRoot == null) {
                return null;
            }
            if (value == currentRoot.val) {
                return currentRoot;
            } else if (value < currentRoot.val) {
                currentRoot = currentRoot.left;
            } else {
                currentRoot = currentRoot.right;
            }
        }
    }


    /**
     * 插入元素
     *
     * @param value
     * @return
     */
    public TreeNode insert(int value) {
        TreeNode currentRoot = rootNode;
        TreeNode newNode = new TreeNode(value);
        while (true) {
            if (value == currentRoot.val) {
                return null;
            } else if (value < currentRoot.val) {
                if (currentRoot.left != null) {
                    currentRoot = currentRoot.left;
                } else {
                    return currentRoot.left = newNode;
                }
            } else {
                if (currentRoot.right != null) {
                    currentRoot = currentRoot.right;
                } else {
                    return currentRoot.right = newNode;
                }
            }
        }
    }


    public static void main(String[] args) {


//
//        String s="abbce";
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(2));
//        System.out.println(s.charAt(3));

        int[] arr = {0, 1, 0, 3, 12};
//        System.out.println(arr[2]);
        Integer[] arr2 = new Integer[arr.length];
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr2[t] = arr[i];
                t++;
//                System.out.println(t);
            }
        }
        for (int j = t; j < arr.length; j++) {
            arr2[j] = 0;
        }
        String join = Joiner.on(",").join(arr2);
//        System.out.println("[" + join + "]");


//        输入：nums = [2,7,11,15], target = 9
//        输出：[0,1]
//        解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

        int target = 13;
        int[] nums = {2, 7, 11, 11, 15};
        System.out.println(highCount(nums, 2));
    }


    // 时间复杂度：O(n)
// 空间复杂度：O(n)
// 空间换时间
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(target - key)) {
                return new int[]{i, map.get(target - key)};
            }
            map.put(key, i);
        }
        return new int[0];
    }

    /**
     * 字符串反转
     *
     * @param str
     * @return
     */
    public static String reverse(String str) {
        //异常情况处理
        if (str == null || str.length() <= 1) {
            return str;
        }
        System.out.println(str);
        return reverse(str.substring(1)) + str.charAt(0);
    }

    /**
     * 字符串反转
     *
     * @param str
     * @return
     */
    public static String reverse2(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);
    }

//    JAVA算法：寻找出现频率最高的K个元素（JAVA版本）
//
//    给定一个非空的整数数组，返回其中出现频率前 k 高的元素。
//
//    示例 1:
//
//    输入: nums = [1,1,1,2,2,3], k = 2
//    输出: [1,2]
//    示例 2:

    public static int highCount(int[] nums, int k) {
        if (k == 1) {
            return nums[0];
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = 1;
            if (hashMap.containsKey(nums[i])) {
                val = hashMap.get(nums[i]) + 1;
            }
            hashMap.put(nums[i], val);
        }
        System.out.println(hashMap);
        Set<Integer> integers = hashMap.keySet();
        int maxCount = 1;
        int maxVal = 0;
        for (Integer i : integers) {
            int tempVal = hashMap.get(i);
            if (tempVal > maxCount) {
                maxCount = tempVal;
                maxVal = i;
            }
        }
        return maxVal;

    }

}


