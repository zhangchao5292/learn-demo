package com.datastructure;

import com.entity.DLNode;

/**
 * 双向链表（Double Linked List）
 * 可以做到双向遍历（头节点 <–> 尾节点），因为双向链表的节点（DLNode）包含数据域和两个指针域（前驱与后继）。
 *
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-11 10:10
 **/
public class DoubleLinkedList<E> {
//    双向链表包含一枚头节点head与一枚尾节点tail，头尾结点均不存储数据，而是指向实际存储数据的节点；
//    头节点前驱节点为null，尾节点后继节点为null。
    /**
     * 链表头节点
     */
    private DLNode<E> head;
    /**
     * 链表尾节点
     */
    private DLNode<E> tail;


    /**
     * 插入
     *
     * @param index
     * @param elem
     */
    public void insert(int index, E elem) {
        DLNode<E> node = new DLNode<E>(elem, null, null);
        DLNode<E> current = head;
        while (index >= 0) {
            current = current.getNext();
            index--;
        }
        //设置node指针
        node.setPrev(current.getPrev());
        node.setNext(current);
        //指针关联
        current.setPrev(node);
        current.getPrev().setNext(node);
    }


    /**
     * 删除
     *
     * @param index
     * @param elem
     */
    public void remove(int index, E elem) {
        /* head <--> elem(1) <--> elem(2) <--> elem(3) <--> tail */
        DLNode<E> current = head.getNext();
        while (index >= 0) {
            current = current.getNext();
            index--;
        }
        //指针关联
        current.getNext().setPrev(current.getPrev());
        current.getPrev().setNext(current.getNext());
        current.setPrev(null);
        current.setNext(null);
    }

    /**
     * 获取双向链表指定索引位置的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        DLNode<E> next = head.getNext();
        while (index > 0) {
            next = next.getNext();
            index--;
        }
        return next.getElem();
    }


    public Boolean checkCycle() {
        DLNode<E> current = head;
        DLNode<E> current2 = head.getNext();
        while (head.getNext() != null) {
            current = current.getNext();
            current2 = current2.getNext().getNext();
            if (current2 == current) {
                return true;
            }
        }
        return false;
    }



}
