package com.algorithem.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // 冒泡排序
        int[] arr = {5, 2, 3, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            // 冒泡次数为总长度减一，因此arr.length -1 round， 每次选取的最大值需要移到最右边
            // i = 0, 0 1 2     round 3
            // i = 1, 0 1       round 2
            // i = 2, 0         round 1
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 对比两个相邻值， “- i” 为出去后面已经排好的最大值
                // i = 0, j < 3, 需要比较三次 0 1 2
                // ...
                // i = 2, j < 1, 只需要比较一次，因为除了前两个数所有的位置都已经依次排好最大值
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("=======================================");

        // 选择排序
        int[] arr1 = {5, 1, 3, 2};
        for (int i = 0; i < arr1.length - 1; i++) {
            // i = 0, j = 1 2 3
            // i = 1, j = 2 3
            // i = 2, j = 3
            int minIndex = i;
            for (int j = i + 1; j < arr1.length; j++) {
//                if (arr1[i] > arr1[j]) {
//                    int temp = arr1[j];
//                    arr1[j] = arr1[i];
//                    arr1[i] = temp;
//                }
                if(arr1[minIndex] > arr1[j]) {
                    minIndex = j;
                }
            }
            // only exchange when i != minIndex ~ arr1[j] lower than arr1[i] !!
            if(i != minIndex) {
                int temp = arr1[i];
                arr1[i] = arr1[minIndex];
                arr1[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println("========================================");

        // searching algorithm
        int[] arrS = {7, 23, 79, 81, 103, 127, 131, 147};
        System.out.println(binarySearch(arrS, 81));
    }
    public static int binarySearch(int[] arr, int data) {
        // 2 factors : left , right
        int left = 0;
        int right = arr.length - 1;
        // loop :
        while(left <= right) {
            // mid index
            int mid = (left + right) / 2;
            // compare mid and searching num
            if (data < arr[mid]) {
                right = mid - 1;
            } else if (data > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1; // error
    }
}
