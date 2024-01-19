package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test_list {
    public static void main(String[] args) {
        // list feature :
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        // 1. add
        list.add(2,"e");
        System.out.println("=======================");
        // 2. remove, return deleted data
        System.out.println(list.remove(2));
        System.out.println("=======================");
        // 3. get
        System.out.println(list.get(2));
        System.out.println("=======================");
        // 4. set, return previous data
        System.out.println(list.set(2, "f"));
        System.out.println("=======================");
        // loop
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=======================");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("=======================");
        list.forEach(System.out::println);
        System.out.println("=======================");
        // ArrayList -> fast search (according to index) / slow delete and very slow add(need to move everything ahead or behind)
        // LinkedList -> slow search / fast add and delete
        List<String> items = new LinkedList<>();
        // 1. addFirst/Last
        // 2. getFirst/Last
        // 2. removeFirst/Last
        // can design queue, stack
        items.addLast("a");
        items.addLast("b");
        items.addLast("c");
        items.addLast("d");
        items.addLast("e");
        for (String item : items) {
            System.out.println(item);
        }
        System.out.println("=======================");
        System.out.println(items.getFirst());
        System.out.println("=======================");
        System.out.println(items.removeLast());
        items.forEach(System.out::println);

        System.out.println("=======================");
        // push, pop
        LinkedList<String> bullets = new LinkedList<>();
        bullets.push("1");
        bullets.push("2");
        bullets.push("3");
        bullets.push("4");
        bullets.push("5");
        for (int i = 0; i < 5; i++) {
            System.out.println(bullets.pop());
        }
    }
}
