package com.nancheung.api_arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntUnaryOperator;

public class Test {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(arr));
        int[] arrNew = Arrays.copyOfRange(arr, 1, 4);
        System.out.println(Arrays.toString(arrNew));

        System.out.println("==================");
        int[] arr2 = Arrays.copyOf(arrNew, 10);
        System.out.println(Arrays.toString(arr2)); // 0, 0 ,0 ...

        System.out.println("==================");
/*        Arrays.setAll(arr, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return arr[operand] * 10 - 5;
            }
        });*/
        // lambda
        Arrays.setAll(arr, operand -> arr[operand] * 10 -5);

        System.out.println(Arrays.toString(arr));

        System.out.println("==================");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("==================");
        Student[] students = new Student[4];
        students[0] = new Student("a", 169.5, 23);
        students[1] = new Student("b", 163.8, 26);
        students[2] = new Student("c", 163.8, 26);
        students[3] = new Student("d", 167.5, 24);

//        Arrays.sort(students);
//        System.out.println(Arrays.toString(students));

//        Arrays.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(), o2.getHeight());
//            }
//        });
        Arrays.sort(students, Comparator.comparingDouble(Student::getHeight));
        System.out.println(Arrays.toString(students));
    }
}
