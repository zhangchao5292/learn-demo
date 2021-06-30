package com.entity;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-07 10:22
 **/
public class Node {
    public int data;      //自己本身值
    public Node left;     //左结点
    public Node right;     //右结点

    public Node() {
    }

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
