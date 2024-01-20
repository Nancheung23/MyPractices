package com.nancheung.arraylist;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("java1");
        list.add("java2");
        list.add("java3");
        list.add(new Cat());

        for (int i = 0; i < list.size(); i++) {
           String e = (String) list.get(i);
            System.out.println(e);
        }

        System.out.println("===========================================");
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java1");
        list1.add("java2");
        list1.add("java3");
    }
}


class Cat{

}