package com.collections;

import java.util.Arrays;

public class Test_param {
    public static void main(String[] args) {
        test();
        test(10);
        test(10,20,30);
        test(10,20,30);
        test(new int[]{10,20,30,40});
    }
    public static void test(int...nums) {
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
        System.out.println("=============================");
    }
}
