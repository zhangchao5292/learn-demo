package com.suanfa;

import com.entity.Node;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: chao.zhang
 * @create: 2021-06-07 10:23
 **/
public class ArrayToTree {

    public static List<Node> list = Lists.newArrayList();

    public static void createTree(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            list.add(new Node(arr[i], null, null));
        }

        // 构建二叉树
        if (list.size() > 0) {
            for (int i = 0; i < arr.length / 2 - 1; i++) {
                if (list.get(2 * i + 1) != null) {
                    list.get(i).left = list.get(2 * i + 1);
                }
                if (list.get(2 * i + 2) != null) {
                    list.get(i).right = list.get(2 * i + 2);
                }
            }
            // 判断最后一个根结点：因为最后一个根结点可能没有右结点，所以单独拿出来处理
            int lastIndex = arr.length / 2 - 1;
            // 左结点
            list.get(lastIndex).left = list.get(lastIndex * 2 + 1);
            // 右结点，如果数组的长度为奇数才有右结点
            if (arr.length % 2 == 1) {
                list.get(lastIndex).right = list.get(lastIndex * 2 + 2);
            }
        }
    }

    // 遍历，先序遍历
    public static void print(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            print(node.left);
            print(node.right);
        }
    }

    public static void main(String[] args) {
//        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        createTree(array);
//        print(list.get(0));

        char[] array = {'d', 'a', 'b', 'c', 'c', 'b'};
        Map<Object, Object> map = new HashMap<>();
        int index = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (map.containsKey(array[i])) {
                int count = (Integer) map.get(array[i]);
                map.put(array[i], count + 1);
                index = i;
            } else {
                map.put(array[i], 1);
            }
        }
        System.out.println(index);

    }

}
