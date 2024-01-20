package com.nancheung.objects;

public class Student {
    private String name;
    private double chinese;
    private double math;
    private double english;
    private double programming;
    public Student(){}
    public Student(String name,double chinese,double math,double english,double programming){
        this.name = name;
        this.chinese= chinese;
        this.math = math;
        this.english = english;
        this.programming = programming;
    }

    public String getName() {
        return name;
    }

    public double getChinese() {
        return chinese;
    }

    public double getMath() {
        return math;
    }

    public double getEnglish() {
        return english;
    }

    public double getProgramming() {
        return programming;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setChinese(double chinese) {
        if (chinese>=0 && chinese<=100){
            this.chinese = chinese;
        } else {
            System.out.println("invalid value set");
        }
    }

    public void setMath(double math) {
        if (math>=0 && math<=100){
            this.math = math;
        } else {
            System.out.println("invalid value set");
        }
    }

    public void setEnglish(double english) {
        if (english>=0 && english<=100){
            this.english = english;
        } else {
            System.out.println("invalid value set");
        }
    }

    public void setProgramming(double programming) {
        if (programming>=0 && programming<=100){
            this.programming = programming;
        } else {
            System.out.println("invalid value set");
        }
    }
}
