package com.nancheung.api_Math_System_Runtime;

public class Test_System {
    public static void main(String[] args) {
//        System.exit(0);
        System.out.println("========================================");

        long time = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("Output:" + i);
        }
        long time_final = System.currentTimeMillis();
        System.out.println("Time diff:" + (time_final - time) / 1000.0 + "s");
    }
}
