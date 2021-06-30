package com.datastructure;

import com.entity.NodeDan;

import java.util.NoSuchElementException;

/**
 * @description: 单链表（Single Linked List）结构
 * 1。构建Node 结点(数据域，指针)
 * 2。构建但链表
 * @author: chao.zhang
 * @create: 2021-06-11 09:35
 **/
public class SingleLinkedList<E> {

//    单链表包含一枚头节点（Head），头结点不存储数据，而是指向第一个实际存储数据的节点；尾节点可以被定义为指针域为null的最后一枚节点。

    /**
     * 链表头节点
     */
    private NodeDan<E> head;

    /**
     * 构造方法：创建空链表
     */
    public SingleLinkedList() {
        this.head = new NodeDan<E>();
    }


    /**
     * 向链表尾部添加一个新的元素（尾插法）
     *
     * @param elem
     */
    public void addLast(E elem) {
        NodeDan<E> eNodeDan = new NodeDan<>(elem, null);
        NodeDan<E> tail = head;
        while (head.getNext() != null) {
            tail = tail.getNext();
        }
        tail.setNext(eNodeDan);
    }

    public void addFirst(E elem) {
//        根据新元素构建一枚新节点
//        将新节点指针域置为头节点指向的节点
//        头节点指向新节点
        NodeDan<E> eNodeDan = new NodeDan<>(elem, null);
        eNodeDan.setNext(head.getNext());
        head.setNext(eNodeDan);
    }

    /**
     * 取得链表头部第一个元素，链表为空则抛出异常。
     *
     * @return
     */
    public E getFirst() {
        if (head.getNext() == null) {
            throw new NoSuchElementException();
        }
        return head.getNext().getElem();
    }

    /**
     * 取得链表尾部最后一个元素，链表为空则抛出异常
     *
     * @return
     */
    public E getLast() {
        if (head.getNext() == null) {
            throw new NoSuchElementException();
        }
        NodeDan<E> nodeDan = head;
        while (head.getNext() != null) {
            nodeDan = nodeDan.getNext();
        }
        return nodeDan.getElem();
    }

    /**
     * 判断是否包含
     *
     * @param elem
     * @return
     */
    public Boolean contains(E elem) {
        NodeDan<E> nex = head;
        while (head.getNext() != null) {
            if (nex.getNext().getElem().equals(elem)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 获取链表指定索引的元素
     *
     * @param index
     * @return
     */
    public E get(int index) {
        int i = 0;
        while (head.getNext() != null) {
            if (i == index) {
                return head.getNext().getElem();
            }
            i++;
        }
        return null;
    }

    /**
     * 为链表指定索引位置的元素设新值。
     *
     * @param index
     * @param element
     * @return Previous element in the index.
     * @throws IndexOutOfBoundsException
     */
    public E set(int index, E element) throws IndexOutOfBoundsException {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }
        NodeDan<E> n = head.getNext();
        while (index > 0) {
            n = n.getNext();
            --index;
        }
        E oldValue = n.getElem();
        n.setElem(element);
        return oldValue;
    }

    /**
     * 移除链表指定索引下标元素。
     * @param index
     * @return
     */
    public E remove(int index) {
        NodeDan<E> pre = head;
        while (index > 0) {
            pre = pre.getNext();
            index--;
        }
        NodeDan<E> next = pre.getNext();
        NodeDan<E> current = next.getNext();
        pre.setNext(current);
        return current.getElem();
    }

    public void  list(){
        while (head.getNext()!=null){
            NodeDan<E> next = head.getNext();
            System.out.println(next.getElem());
        }
    }




}
