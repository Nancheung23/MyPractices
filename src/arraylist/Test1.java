package com.nancheung.arraylist;

public class Test1 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList();
        list.add("Java1");
        String ele = list.get(0);
        System.out.println(ele);

        MyClass2<String, String> c2 = new MyClass2<>();
    }
}
