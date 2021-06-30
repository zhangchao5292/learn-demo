package com.suanfa.sort;

import org.springframework.util.StopWatch;

/**
 * @description: 计数排序
 * @author: chao.zhang
 * @create: 2021-06-08 08:21
 **/
public class CountSort {


    public static int[] countSort(int[] array) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        int[] countArray = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        int index = 0;
        for (int j = 0; j < countArray.length; j++) {
            while (countArray[j] > 0) {
                array[index++] = j;
                countArray[j]--;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = {1, 2, 3, 2, 3, 4, 5, 6, 3};
        int[] ints = countSort(arr);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());
    }


}
