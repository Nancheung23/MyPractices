package com.nancheung.api;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // add, delete, modify, search
        // 1. add 2. get 3. size 4. remove 5. set
        // JDK 1.7 -->
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("nancheung");
        a1.add(1,"is studying");
        a1.add(2,"java");

        System.out.println(a1.set(0, "everyone"));
        System.out.println(a1);

        System.out.println(a1.get(2));
        System.out.println(a1.size());

        if (a1.remove("java")){
            System.out.println("delete completed");

            a1.remove(0);
            System.out.println(a1);

        }else {
            System.out.println("cannot delete");
        }
    }
}
