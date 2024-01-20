package com.nancheung.exam_java_advance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class e01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[100];
        OUT: for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(1, 201);
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == temp) {
                    i--;
                    continue OUT;
                }
            }
            arr[i] = temp;
        }
        // 1. array
        System.out.println(Arrays.toString(arr));
        // 2. remove index %2 == 1
        LinkedList<Integer> list = new LinkedList<>();
        for (int index = arr.length - 1; index >= 0; index--) {
            if (index % 2 == 1) {
                list.push(arr[index]);
            }
        }
        System.out.println(list.toString());
        // 3. remake until one
        int remain = reduceLength(list);
        System.out.println("Remain: " + remain);

    }
    public static int reduceLength(LinkedList<Integer> origin) {
        do{
            for (int i = origin.size() - 1; i >= 0; i--) {
                if (i % 2 == 0) {
                    origin.remove(i);
                }
            }
            System.out.println(origin.toString());
        } while(origin.size() > 1);
        return origin.getFirst();
    }
}
