package com.suanfa;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-05-27 20:40
 **/
public class Kao {

    static class TreeNode {
        TreeNode left;
        TreeNode right;
        Integer val;

        public TreeNode(Integer val) {
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

        public Integer getVal() {
            return val;
        }

        public void setVal(Integer val) {
            this.val = val;
        }

    }

    public static TreeNode createBinaryTree(LinkedList<Integer> inputList) {
        TreeNode node = null;
        if (inputList == null || inputList.isEmpty()) {
            return null;
        }
        Integer data = inputList.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.left = createBinaryTree(inputList);
            node.right = createBinaryTree(inputList);
        }
        return node;
    }

    /**
     * 前序遍历
     *
     * @param node
     */
    public static void pre(TreeNode node) {
        if (node == null) {
            return;
        }
        pre(node.left);
        System.out.println(node.val);
        pre(node.right);
    }

    public static void main(String[] args) {
        //初始化二叉树
        LinkedList<Integer> inputList = new LinkedList<Integer>(Arrays.asList(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4}));
        TreeNode treeNode = createBinaryTree(inputList);
        //遍历
        pre(treeNode);
    }
}
