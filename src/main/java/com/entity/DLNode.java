package com.entity;

/**
 * @description: 双向链表结点 https://zihengcat.github.io/2019/05/15/java-data-structure-and-algorithm-linked-list/
 * @author: chao.zhang
 * @create: 2021-06-11 10:15
 **/
public class DLNode<E> {

    private E elem;

    private DLNode<E> prev;

    private DLNode<E> next;

    public DLNode(E elem, DLNode<E> prev, DLNode<E> next) {
        this.elem = elem;
        this.prev = prev;
        this.next = next;
    }

    public E getElem() {
        return elem;
    }

    public void setElem(E elem) {
        this.elem = elem;
    }

    public DLNode<E> getPrev() {
        return prev;
    }

    public void setPrev(DLNode<E> prev) {
        this.prev = prev;
    }

    public DLNode<E> getNext() {
        return next;
    }

    public void setNext(DLNode<E> next) {
        this.next = next;
    }
}
