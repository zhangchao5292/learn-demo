package com.entity;

/**
 * @description: 单链表节点（Node）
 * @author: chao.zhang
 * @create: 2021-06-11 09:26
 **/
public class NodeDan<E> {

    /**
     * 数据域
     */
    private E elem;

    /**
     * 指针域
     */
    private NodeDan<E> next;

    /**
     * 构造方法
     *
     * @param elem
     * @param next
     */
    public NodeDan(E elem, NodeDan<E> next) {
        this.elem = elem;
        this.next = next;
    }

    public NodeDan() {
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    public NodeDan<E> getNext() {
        return next;
    }

    public void setNext(NodeDan<E> next) {
        this.next = next;
    }
}
