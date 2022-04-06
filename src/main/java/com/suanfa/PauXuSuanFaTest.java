package com.suanfa;

import java.util.Arrays;

import static com.suanfa.Paixu.quickSort;

/**
 * @author chao.zhang
 */
public class PauXuSuanFaTest {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 8, 4, 7, 5, 6};
        //冒泡排序 O(n*n)
        bubleSort(arr);
        System.out.println(Arrays.toString(arr));
        //选择排序 O(n*n)
        int[] arr2 = new int[]{1, 3, 8, 4, 7, 5, 6};
        selectSort(arr2);
        System.out.println(Arrays.toString(arr2));
        //归并排序(从上往下) 始终都是 O(nlogn) 的时间复杂度。代价是需要额外的内存空间。
        int[] arr3 = new int[]{1, 3, 8, 4, 7, 5, 6};
        mergeSortUpToDown(arr3, 0, 6);
        System.out.println(Arrays.toString(arr3));
        //堆排序--大顶堆  O(nlogn) 的时间复杂度  构建大顶堆，首尾交换，移除尾部
        int[] arr4 = {1, 3, 8, 4, 7, 5, 6};
        //某个节点i  parent:(i-1)/2    子节点：2i+1,2i+2
//        大顶堆：每个节点的值都大于或者等于它的左右子节点的值。
//        小顶堆：每个节点的值都小于或者等于它的左右子节点的值。
//        构建初始堆，将待排序列构成一个大顶堆(或者小顶堆)，升序大顶堆，降序小顶堆；
//        将堆顶元素与堆尾元素交换，并断开(从待排序列中移除)堆尾元素。
//        重新构建堆。
//        重复2~3，直到待排序列中只剩下一个元素(堆顶元素)。
        heapSort(arr4);
        System.out.println(Arrays.toString(arr4));

        //快速排序 O(nlgn)
//        快速排序是一种基于分而治之的排序算法，其中：
//        1、通过从数组中选择一个中心元素将数组划分成两个子数组，在划分数组时，将比中心元素小的元素放在左子数组，将比中心元素大的元素放在右子数组。
//        2、左子数组和右子数组也使用相同的方法进行划分，这个过程一直持续到每个子数组都包含一个元素为止。
//        3、最后，将元素组合在一起以形成排序的数组。
        int[] a = {72, 6, 57, 88, 60, 42, 83, 73, 48, 85};
        quickSort2(a, 0, 9);
        System.out.println(Arrays.toString(a));

    }

    /**
     * 分区过程
     * a[] 待分区数组
     * left 待分区数组最小下标
     * right 待分区数组最大下标
     */
    public static void quickSort2(int[] a, int left, int right) {
        if (left < right) {
            int temp = qSort(a, left, right);
            quickSort2(a, left, temp - 1);
            quickSort2(a, temp + 1, right);
        }
    }

    /**
     * 排序过程 https://blog.csdn.net/youzi_qiu7/article/details/107685339
     * a 待排序数组
     * left 待排序数组最小下标
     * right 待排序数组最大下标
     *
     * @return 排好序之后基准数的位置下标，方便下次的分区
     */
    public static int qSort(int[] a, int left, int right) {
        int temp = a[left];//定义基准数，默认为数组的第一个元素
        while (left < right) {//循环执行的条件
            //因为默认的基准数是在最左边，所以首先从右边开始比较进入while循环的判断条件
            //如果当前arr[right]比基准数大，则直接将右指针左移一位，当然还要保证left<right
            while (left < right && a[right] > temp) {
                right--;
            }
            //跳出循环说明当前的arr[right]比基准数要小，那么直接将当前数移动到基准数所在的位置，并且左指针向右移一位（left++）
            //这时当前数（arr[right]）所在的位置空出，需要从左边找一个比基准数大的数来填充。
            if (left < right) {
                a[left++] = a[right];
            }
            //下面的步骤是为了在左边找到比基准数大的数填充到right的位置。
            //因为现在需要填充的位置在右边，所以左边的指针移动，如果arr[left]小于或者等于基准数，则直接将左指针右移一位
            while (left < right && a[left] <= temp) {
                left++;
            }
            //跳出上一个循环说明当前的arr[left]的值大于基准数，需要将该值填充到右边空出的位置，然后当前位置空出。
            if (left < right) {
                a[right--] = a[left];
            }
        }
        //当循环结束说明左指针和右指针已经相遇。并且相遇的位置是一个空出的位置，
        //这时候将基准数填入该位置，并返回该位置的下标，为分区做准备。
        a[left] = temp;
        return left;
    }

    private static void heapSort(int[] arr4) {
        if (arr4 == null || arr4.length == 0) {
            return;
        }
        int len = arr4.length;
        //构建大顶堆，这里其实就是把待排序序列，变成一个大顶堆结构的数组
        for (int i = (int) Math.floor(len / 2) - 1; i >= 0; i--) {
            heapify(arr4, i, len);
        }

        // 交换堆顶和当前末尾的节点，重置大顶堆
        for (int i = len - 1; i > 0; i--) {
            swap(arr4, 0, i);
            len--;
            heapify(arr4, 0, len);
        }
    }

    public static void heapify(int[] arr, int i, int len) {
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        // 默认当前节点（父节点）是最大值。
        int max = i;
        if (c1 < len && arr[c1] > arr[max]) {
            max = c1;
        }
        if (c2 < len && arr[c2] > arr[max]) {
            max = c2;
        }
        //存在最大值做交换
        if (max != i) {
            // 如果最大值不是当前非叶子节点的值，那么就把当前节点和最大值的子节点值互换
            swap(arr, i, max);
            // 因为互换之后，子节点的值变了，如果该子节点也有自己的子节点，仍需要再次调整。
            heapify(arr, max, len);
        }

    }

    public static void swap(int[] arr, int i, int max) {
        int temp = arr[i];
        arr[i] = arr[max];
        arr[max] = temp;
    }


//    private static void heapSortBig(int[] arr4) {
//        PriorityQueue queue = new PriorityQueue();
//        for (int i = 0; i < arr4.length; i++) {
//            queue.add(arr4[i]);
//        }
//        int k=0;
//        while (!queue.isEmpty()) {
//            Integer ele = (Integer) queue.poll();
//            arr4[k++]=ele;
//        }
//
//    }

    private static void mergeSortUpToDown(int[] arr, int start, int end) {
        if (arr == null || start >= end) {
            return;
        }
        //分成左右连个数组
        int mid = (start + end) / 2;
        //递归排序
        mergeSortUpToDown(arr, start, mid);//递归排序a[start...mid]
        mergeSortUpToDown(arr, mid + 1, end);//递归排序a[mid+1...end]
        merge(arr, start, mid, end);

    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] tempArr = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        // 把较小的数先移到新数组中
        while (i <= mid && j <= end) {
            if (arr[i] > arr[j]) {
                tempArr[k++] = arr[j++];
            } else {
                tempArr[k++] = arr[i++];
            }
        }
        // 把左边剩余的数移入数组
        while (i <= mid) {
            tempArr[k++] = arr[i++];
        }

        while (j <= end) {
            tempArr[k++] = arr[j++];
        }
        // 把新数组中的数覆盖nums数组
        for (int l = 0; l < tempArr.length; l++) {
            arr[start + l] = tempArr[l];
        }


    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            //经过一轮比较后换位
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }

    private static void bubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }


    }
}
