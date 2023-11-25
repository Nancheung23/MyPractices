package com.nancheung.objects;

public class TestStudent {
    // face to object
    // create obj, seal data -->
    public static void main(String[] args) {
        Student s1 = new Student();
        StudentOperator o1 = new StudentOperator(s1);
        s1.setName("nan");
        s1.setChinese(81.0);
        s1.setMath(77.8);
        s1.setEnglish(95.2);
        s1.setProgramming(100);
        o1.printAll();
        o1.printTotalScore();
        o1.printAverageScore();

        Student s2 = new Student("cheung",81.1,
                77.9,95.3,100.1);
        StudentOperator o2 = new StudentOperator(s2);
        o2.printAll();
        o2.printTotalScore();
        o2.printAverageScore();
    }
}
