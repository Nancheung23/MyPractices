package com.nancheung.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Test_end {
    public static void main(String[] args) {
        // forEach, count, max, min
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("a", 26, 172.5);
        Student s2 = new Student("a", 26, 172.5);
        Student s3 = new Student("b", 23, 167.6);
        Student s4 = new Student("c", 25, 169.0);
        Student s5 = new Student("d", 35, 183.3);
        Student s6 = new Student("e", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // height > 168
        System.out.println("number:" + students.stream().filter(s -> s.getHeight() > 168).count());
        System.out.println("================================");
        // highest
        System.out.println("max: " + students.stream().max(Comparator.comparingDouble(Student::getHeight)).get());
        System.out.println("================================");
        // lowest
        System.out.println("min: " + students.stream().min(Comparator.comparingDouble(Student::getHeight)).get());
        System.out.println("================================");
        // > 170 --> new collection (!!stream can only collect once, similar to iterator)
        List<Student> filterStudents = students.stream().filter(student -> student.getHeight() > 170).toList();
        System.out.println(filterStudents);
        System.out.println("================================");
        // > 170 (name,height)--> map
        Map<String, Double> map = students.stream().filter(student -> student.getHeight() > 170).distinct().collect(Collectors.toMap(Student::getName, Student::getHeight));
        System.out.println(map);
        // to array
        Student[] arr = students.stream().filter(student -> student.getHeight() > 170).toArray(Student[]::new);
        System.out.println(Arrays.toString(arr));
    }
}
