package com.nancheung.api_StringBuilder;

import java.util.StringJoiner;

public class Test {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        System.out.println(s.append("nancheung"));
        System.out.println(s.reverse());
        System.out.println(s.length());
        System.out.println(s.toString());
        System.out.println(s.append(666).append('ä').append(13.14).reverse());
        String context = s.toString();
        System.out.println(context);

        System.out.println("===========================================");
//        String rs = "";
//        for (int i = 0; i < 1000000; i++) {
//            rs = rs + "abc";
//        }
//        System.out.println(rs);
//        StringBuilder rs = new StringBuilder();
//        rs.append("abc".repeat(1000000));
//        System.out.println(rs);

        System.out.println("=================================");
        // multi-user scenario
        StringBuffer tp = new StringBuffer();
        System.out.println(tp.append("123").append(123));

        System.out.println("=================================");
        int[] test = {11,22,33};
        System.out.println(dataSet(test));

        System.out.println("=====================================");
        // delimiter, prefix, suffix, for combine String elements.
        StringJoiner s2 = new StringJoiner(", ","[", "]");
        System.out.println(s2.add("Java1").add("Java2").add("Java3"));
    }

    public static String dataSet(int[] ints) {
        // check if it's null
        if (ints == null) {
            return null;
        }
        // better use StringJoiner !!!
        StringBuilder rs = new StringBuilder();
        rs.append('[');
        for (int i = 0; i < ints.length; i++) {
            if (i < ints.length-1) {
                rs.append(ints[i]).append(',');
            }
            else {
                rs.append(ints[i]).append(']');
            }
        }
        return rs.toString();
    }


}
