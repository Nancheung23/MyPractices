package com.nancheung.api;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> goods = new ArrayList<>();
        goods.add("Java入门");
        goods.add("宁夏枸杞");
        goods.add("黑枸杞");
        goods.add("人字拖");
        goods.add("特级枸杞");
        goods.add("枸杞子");
        // start method
        System.out.print("批量删除前：");
        System.out.println(goods);
        System.out.print("批量删除后：");
        deleteAllKey("枸杞",goods);
    }
    public static void deleteAllKey(String key, ArrayList<String> arrayList) {
        // delete from ending --> will not miss anything
//        for (int i = arrayList.size()-1; i >= 0; i--) {
        for (int i = 0; i < arrayList.size(); i++) {
            String temp = arrayList.get(i);
            if (temp.contains(key)){
                arrayList.remove(temp);
                // index balance
                i--;
            }
        }
        System.out.println(arrayList);
    }
}
