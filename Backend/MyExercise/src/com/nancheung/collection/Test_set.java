package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test_set {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        Set<Integer> set = new TreeSet<>();
        // increasing order -> TreeSet
        set.add(666);
        set.add(555);
        set.add(555);
        set.add(888);
        set.add(888);
        set.add(777);
        set.add(777);
        System.out.println(set);
        System.out.println("=============================");
        // HashSet
        Student s1 = new Student("a", 25,169.5);
        Student s2 = new Student("b", 22,166.5);
        System.out.println("Student 1's hashCode is: " + s1.hashCode());
        System.out.println("Student 1's hashCode is: " + s1.hashCode());
        System.out.println("Student 2's hashCode is: " + s2.hashCode());
        System.out.println("=============================");
        // Hash collision
        String str1 = "abc";
        String str2 = "acD";
        System.out.println("String 1's hashCode is: " + str1.hashCode());
        System.out.println("String 2's hashCode is: " + str2.hashCode());
        // before jdk8: hashMap = array + linkedList ; after jdk8: hashMap = array + linkedList + red/black tree.
        System.out.println("=============================");
        // hashset: default length: 16 , factor 0.75, table[], will enlarge when 12 (16*0.75) --> new array length * 2
        // when length >= 64 --> red/black tree
        // hashCode%length --> index
        // null ? equals() ? not save : save
        // before jdk 8: save beyond old elements ; jdk 8 : save under old elements
        Set<Student> students = new HashSet<>();
        Student s3 = new Student("e", 28, 169.6);
        Student s4 = new Student("f", 23, 169.6);
        Student s5 = new Student("f", 23, 169.6);
        Student s6 = new Student("h", 48, 169.6);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        // Override equals & hashCode to remove same element
        System.out.println(students);
    }
}
