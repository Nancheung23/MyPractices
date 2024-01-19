package com.collections;

import com.collection.Student;

import java.util.*;

public class Test_collections {
    public static void main(String[] args) {
        // 1. addAll
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "a","b","c","d");
        System.out.println(names);
        System.out.println("========================");

        // 2.shuffle
        Collections.shuffle(names);
        System.out.println(names);
        System.out.println("========================");

        // 3.sort
        Collections.sort(names);
        System.out.println(names);
        System.out.println("========================");
        List<Student> students = new ArrayList<>();
        students.add(new Student("a",23,169.7));
        students.add(new Student("b",22,169.8));
        students.add(new Student("c",26,165.5));
        students.add(new Student("d",22,183.5));
        students.sort(Comparator.comparingDouble(Student::getHeight));
        System.out.println(students);
        System.out.println("========================");
    }
}
