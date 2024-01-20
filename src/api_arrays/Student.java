package com.nancheung.api_arrays;

public class Student implements Comparable<Student>{
    private String name;
    private double height;
    private int age;

    @Override
    public String toString() {
        return ("Name: " + this.name + " Height: " + this.height + " Age: " + this.age);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.age, o.age);
    }

    public Student() {

    }

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
