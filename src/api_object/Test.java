package com.nancheung.api_object;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException{
        Student s1 = new Student("nan", 26);
        System.out.println(s1);

        Student s2 = new Student("nan", 26);
        System.out.println(s2.equals(s1));

        Student s3 = (Student) s1.clone();
        System.out.println(s3.getName());
        System.out.println(s3.getAge());

        System.out.println(s1.equals(s3));
    }
}
