package com.suanfa.hot;

/**
 * @author chao.zhang
 */
public class BAT {

    public static void main(String[] args) {
        String num1 = "1234";
        String num2 = "3456";
        System.out.println((int) num1.charAt(0));
        System.out.println((int) '1');
        String sum = getSum(num1, num2);
        System.out.println(getSumInt(100));
    }

    private static String getSum(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer sb = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = x + y + add;
            sb.append(sum % 10);
            add = sum / 10;
            i--;
            j--;
        }
        sb.reverse();
        return sb.toString();
    }

    public static int getSumInt(int number) {
        if (number < 0) {
            return 0;
        }
        return number + getSumInt(number - 1);
    }

//    链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/solution/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-b-61/

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode dummy = new ListNode(0, head);
//        int length = getLength(head);
//        ListNode cur = dummy;
//        for (int i = 1; i < length - n + 1; ++i) {
//            cur = cur.next;
//        }
//        cur.next = cur.next.next;
//        ListNode ans = dummy.next;
//        return ans;
//    }
//
//    public int getLength(ListNode head) {
//        int length = 0;
//        while (head != null) {
//            ++length;
//            head = head.next;
//        }
//        return length;
//    }
}

