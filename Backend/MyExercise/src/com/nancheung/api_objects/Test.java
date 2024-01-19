package com.nancheung.api_objects;

import java.util.ArrayList;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "26";

//        System.out.println(s1.equals(s2));
        System.out.println(Objects.equals(s1, s2));
        System.out.println(Objects.isNull(s1));
        System.out.println(Objects.nonNull(s2));

//        Integer i = Integer.valueOf(26);
        Integer i = 26;
        System.out.println(Objects.equals(i, s2));

        ArrayList<Integer> a = new ArrayList<>();
        a.add(i);
        System.out.println(a.get(0));
    }
}

// 包装类
// Byte Short Integer Long Character Float Double Boolean
