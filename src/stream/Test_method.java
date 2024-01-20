package com.nancheung.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test_method {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
        // find score over 60 and output (filter)
        List<Double> filterResult = scores.stream().filter(score -> score >= 60).toList();
        System.out.println(filterResult);

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("a", 26, 172.5);
        Student s2 = new Student("a", 26, 172.5);
        Student s3 = new Student("b", 23, 167.6);
        Student s4 = new Student("c", 25, 169.0);
        Student s5 = new Student("d", 35, 183.3);
        Student s6 = new Student("e", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 1. find age >= 23 && age <= 30, descending age (sorted)
        students.stream().filter(student -> student.getAge() >= 23 && student.getAge() <= 30)
                .sorted((o1, o2) -> o2.getAge() - o1.getAge()).forEach(System.out::println);
        System.out.println("================================");
        // 2. find highest 3 students (limit)
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())).limit(3).forEach(System.out::println);
        System.out.println("================================");
        // 3. lowest 2 students (skip)
//        students.stream().sorted((Comparator.comparingDouble(Student::getHeight))).limit(2).forEach(System.out::println);
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())).skip(students.size() - 2).forEach(System.out::println);
        System.out.println("================================");
        // 4. names of students who are taller than 168cm, remove same name (map, distinct(for object need to override))
        students.stream().filter(student -> student.getHeight() > 168).map(Student::getName).distinct().forEach(System.out::println);
        System.out.println("================================");
        students.stream().filter(student -> student.getHeight() > 168)
                // override Student.equals()
                .distinct().forEach(System.out::println);
        System.out.println("================================");
        // 5. concat
        Stream<String> st1 = Stream.of("a","b");
        Stream<String> st2 = Stream.of("a2","b2","c2");
        Stream<String> allSt = Stream.concat(st1,st2);
        allSt.forEach(System.out::println);
    }
}
