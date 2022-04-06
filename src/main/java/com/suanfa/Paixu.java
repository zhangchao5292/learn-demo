package com.suanfa;

import java.util.Arrays;

/**
 * 冒泡、选择、插入 排序需要两个for循环，每次只关注一个元素，平均时间复杂度为O(n²)）（一遍找元素O(n)，一遍找位置O(n)）
 * 快速、归并、希尔、堆排 基于二分思想，log以2为底，平均时间复杂度为O(nlogn)（一遍找元素O(n)，一遍找位置O(logn)）
 **/
public class Paixu {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 2, 6, 5, 8, 4};
//        maoPao(arr);//冒泡排序
//        xuanze(arr);//选择排序
        quickSort(arr, 0, arr.length - 1);//快速排序
        Arrays.stream(arr).forEach(a -> System.out.println(a));
//        mergeSort(arr,0,arr.length-1);
    }

    //快速排序
    public static void quickSort(int[] arr, int startIndex, int endIndex) {
        //递归条件
        if (startIndex >= endIndex) {
            return;
        }
        //得到基准元素
        int pivotIndex = partition(arr, startIndex, endIndex);
        System.out.println("pivotIndex:" + pivotIndex);
        //根据基准元素分成两部分排序
        quickSort(arr, startIndex, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, endIndex);
    }

    private static int partition(int[] arr, int startIndex, int endIndex) {
        //取第一个元素作为基准
        int pivot = arr[startIndex];
        int mark = startIndex;
        for (int i = startIndex + 1; i <= endIndex; i++) {
            if (arr[i] < pivot) {
                mark++;
                int p = arr[mark];
                arr[mark] = arr[i];
                arr[i] = p;
            }
        }
        arr[startIndex] = arr[mark];
        arr[mark] = pivot;
        return mark;
    }

    /**
     * 冒泡排序
     *
     * @param arr
     * @return
     */
    public static int[] maoPao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    /**
     * 选择排序
     * 在序列中找到最小（大）元素，放到序列的起始位置作为已排序序列；
     * 再从剩余未排序元素中继续寻找最小（大）元素，放到已排序序列的末尾。
     * param arr
     */
    public static int[] xuanze(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] < arr[j]) {
                    max = j;
                }
            }
            //换位
            swap(arr, i, max);
        }
        return arr;

    }

    /**
     * 换位
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

//    链接：https://segmentfault.com/a/1190000013960582
//            ① 初始化堆: 将数列a[1...n]构造成最大堆。
//            ② 交换数据:
//            将a[1]和a[n]交换，使a[n]是a[1...n]中的最大值；
//            然后将a[1...n-1]重新调整为最大堆。
//    接着，将a[1]和a[n-1]交换，使a[n-1]是a[1...n-1]中的最大值；然后将a[1...n-2]重新调整为最大值。
//    依次类推，直到整个数列都是有序的。
//    性质一: 索引为i的左孩子的索引是 (2*i+1);
//    性质二: 索引为i的右孩子的索引是 (2*i+2);
//    性质三: 索引为i的父结点的索引是 floor((i-1)/2);

    /**
     * 建堆
     *
     * @param arrays          看作是完全二叉树
     * @param currentRootNode 当前父节点位置
     * @param size            节点总数
     */
    public static void heapify(int[] arrays, int currentRootNode, int size) {
        if (currentRootNode < size) {
            //左子树和右字数的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            //把当前父节点位置看成是最大的
            int max = currentRootNode;

            if (left < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[left]) {
                    max = left;
                }
            }
            if (right < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[right]) {
                    max = right;
                }
            }
            //如果最大的不是根元素位置，那么就交换
            if (max != currentRootNode) {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;
                //继续比较，直到完成一次建堆
                heapify(arrays, max, size);
            }
        }
    }


    /**
     * 完成一次建堆，最大值在堆的顶部(根节点)
     */
    public static void maxHeapify(int[] arrays, int size) {
        // 从数组的尾部开始，直到第一个元素(角标为0)
        for (int i = size - 1; i >= 0; i--) {
            heapify(arrays, i, size);
        }
    }


    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        //找出中间索引
        int mid = (start + end) / 2;
        // 对左边数组进行递归
        mergeSort(arr, start, mid);
        // 对右边数组进行递归
        mergeSort(arr, mid + 1, end);
        // 合并
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        System.out.println("mid " + mid + "," + start + "==" + end);
        int[] tmpArr=new int[arr.length];
        int start1 = start, end1 = mid, start2 = mid + 1, end2 = end;
        // 创建一个下标
        int pos = start1;
        // 缓存左边数组的第一个元素的索引
        int tmp = start1;
        while (start1 <= end1 && start2 <= end2) {
            // 从两个数组中取出最小的放入临时数组
            if (arr[start1] <= arr[start2])
                tmpArr[pos++] = arr[start1++];
            else
                tmpArr[pos++] = arr[start2++];
        }
        // 剩余部分依次放入临时数组，实际上下面两个 while 只会执行其中一个
        while (start1 <= end1) {
            tmpArr[pos++] = arr[start1++];
        }
        while (start2 <= end2) {
            tmpArr[pos++] = arr[start2++];
        }
        // 将临时数组中的内容拷贝回原来的数组中
        while (tmp <= end) {
            arr[tmp] = tmpArr[tmp++];
        }

    }


}



