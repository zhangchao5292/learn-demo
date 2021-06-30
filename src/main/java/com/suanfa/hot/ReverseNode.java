package com.suanfa.hot;

/**
 * @description: 反转链表
 * @author: chao.zhang
 * @create: 2021-06-21 17:22
 **/
public class ReverseNode {

    public static class ListNode {

        int val;

        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public ListNode getNext() {
            return next;
        }

        public void setNext(ListNode next) {
            this.next = next;
        }
    }

//    假设链表为 1 \rightarrow 2 \rightarrow 3 \rightarrow \varnothing1→2→3→∅，我们想要把它改成 \varnothing \leftarrow 1 \leftarrow 2 \leftarrow 3∅←1←2←3。
//    在遍历链表时，将当前节点的 \textit{next}next 指针改为指向前一个节点。由于节点没有引用其前一个节点，因此必须事先存储其前一个节点。在更改引用之前，还需要存储后一个节点。最后返回新的头引用。


    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;// 上一结点
        ListNode curr = head;
        while (null != curr) {
            ListNode tmp = curr.next;//当前结点指针临时保存
            curr.next = pre;//指针向前移动
            pre = curr;
            curr = tmp;
        }
        return pre;
    }

    public static void main(String[] args) {
        ListNode node0 = new ListNode(3, null);
        ListNode node1 = new ListNode(2, node0);
        ListNode node2 = new ListNode(1, node1);
        ListNode node3 = new ListNode(0, node2);
        // 打印反转前的链表
        ListNode h = node3;
        while (null != h) {
            System.out.println("反转前：" + h.getVal() + " ");
            h = h.getNext();
        }

        ListNode listNode = reverseList(node3);
        ListNode re = listNode;
        while (null != re) {
            System.out.println("反转后：" + re.getVal() + " ");
            re = re.getNext();
        }
    }

}


