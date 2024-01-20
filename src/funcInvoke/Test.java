package com.nancheung.funcInvoke;

import com.nancheung.api_arrays.Student;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        students[0] = new Student("a", 169.5, 23);
        students[1] = new Student("b", 163.8, 26);
        students[2] = new Student("c", 163.8, 26);
        students[3] = new Student("d", 167.5, 24);

//        Arrays.sort(students, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
//        Arrays.sort(students, Comparator.comparingInt(Student::getAge));
//        实例方法引用
        Arrays.sort(students, Comparator.comparingDouble(Student::getHeight));
        System.out.println(Arrays.toString(students));

        String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
