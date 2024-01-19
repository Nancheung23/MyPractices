package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    // Collection<E> : List<E> : ArrayList/LinkedList ; Set<E> : HashSet : LinkedHashSet / TreeSet
    // List: has order, can repeat, has index
    // Set: no order, can't repeat, no index // LinkedHashSet: has order ; TreeSet: default increasing order
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        // add
        collection.add("Java1");
        collection.add("Java1");
        collection.add("Java2");
        collection.add("Java2");
        collection.add("Java3");
        System.out.println(collection);
        System.out.println("=============================");

        // clear
        collection.clear();
        System.out.println(collection);
        System.out.println("=============================");

        // isEmpty
        System.out.println(collection.isEmpty());
        System.out.println("=============================");

        // size
        collection.add("Java1");
        collection.add("Java1");
        collection.add("Java2");
        collection.add("Java2");
        collection.add("Java3");
        System.out.println(collection.size());
        System.out.println("=============================");

        // contains
        System.out.println(collection.contains("Java3"));
        System.out.println(collection.contains("Java4"));
        System.out.println("=============================");

        // remove (delete first one)
        System.out.println(collection);
        collection.remove("Java2");
        System.out.println(collection);
        System.out.println("=============================");

        // toArray
        System.out.println(Arrays.toString(collection.toArray()));
        System.out.println("=============================");

        // addAll
        Collection<String> c1 = new ArrayList<>();
        c1.add("Java1");
        c1.add("Java2");
        Collection<String> c2 = new ArrayList<>();
        c2.add("Java3");
        c2.add("Java4");
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println("=============================");

        // Iterator, iterator() --> first element
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        System.out.println(collection1);

        Iterator<String> it = collection1.iterator();
        while (it.hasNext()) {
//            System.out.println(it.next());
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("=============================");

        // enhanced for
        System.out.println("enhanced for output: ");
        for (String s : collection1) {
            System.out.println(s);
        }
        System.out.println("=============================");
        // lambda : forEach
        System.out.println("lambda output: ");
//        collection1.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        collection1.forEach(System.out::println);
    }
}
