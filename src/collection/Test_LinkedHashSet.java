package com.collection;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test_LinkedHashSet {
    public static void main(String[] args) {
        // has orders, double lists for address
        // cost more RAM
        Set<Integer> set = new LinkedHashSet<>();
        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);
        System.out.println("======================");
        // TreeSet (red/black tree)
        Set<Integer> set1 = new TreeSet<>();
        set1.add(6);
        set1.add(5);
        set1.add(5);
        set1.add(7);
        System.out.println(set1);
        System.out.println("======================");
        Set<Student> students = new TreeSet<>(Comparator.comparingDouble(Student::getHeight));
        // select comparator rather than comparable override func in Class
        students.add(new Student("a",23,169.7));
        students.add(new Student("b",22,169.8));
        students.add(new Student("c",26,165.5));
        students.add(new Student("d",22,183.5));
        System.out.println(students);
    }
}
