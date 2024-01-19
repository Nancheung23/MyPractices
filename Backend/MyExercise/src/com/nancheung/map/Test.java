package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        // map : key -> value
        Map<String, Integer> mapTest = new HashMap<>();
        mapTest.put("Java",10);
        mapTest.put("JavaScript",5);
        mapTest.put("HTML",3);
        mapTest.put("Job",8);
        System.out.println(mapTest);
        mapTest.forEach((s, integer) -> System.out.println("key: " + s + ", value: " + integer));
        mapTest.remove("JavaScript");
        System.out.println(mapTest.size());
        Random random = new Random();
        int inputMsg = random.nextInt(3);
        System.out.println("Compute result: " + mapTest.compute("Job", (k, v) -> {
            if ((v != null)) {
                return mapTest.hashCode();
            }
            return inputMsg;
        }));
        System.out.println(mapTest.isEmpty());
    }
}
