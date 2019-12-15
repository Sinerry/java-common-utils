package com.zeroten.common.util;

public class ArrayUtils {

    public static int[] sort(int[]arr) {
        // 冒泡排序
        for(int i = 0,len = arr.length; i < len - 1; i++) {
            for(int j = 0; j < len - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

        // 选择排序
    }
}
