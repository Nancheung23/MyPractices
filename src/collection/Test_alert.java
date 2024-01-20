package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_alert {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("王麻子");
        list.add("小李子");
        list.add("李爱花");
        list.add("张全蛋");
        list.add("晓李");
        list.add("李玉刚");
        System.out.println(list);
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            String name = it.next();
            if (name.contains("李")) {
                // * iterator deletes current item itself (using )
                it.remove();
            }
        }
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            String name = list.get(i);
//            if (name.contains("李")) {
//                list.remove(name);
//            }
//        }
//        System.out.println(list);
//        for (String s : list) {
//            if (s.contains("李")) {
//                list.remove(s);
//            }
//        }
        // also can :
//        list.removeIf(s -> s.contains("李"));
        System.out.println(list);
    }
}
