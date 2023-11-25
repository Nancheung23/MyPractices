package com.nancheung.objects;

public class StudentOperator {
    private Student student;
    public StudentOperator(Student student){
        this.student = student;
    }
    public void printTotalScore(){
        System.out.printf("%s's total score is: %.1f\n",student.getName(), (student.getChinese() + student.getMath() + student.getEnglish() + student.getProgramming()));
    }
    public void printAverageScore(){
        System.out.printf("%s's average score is: %.1f\n",student.getName(), (student.getChinese() + student.getMath() + student.getEnglish() + student.getProgramming()/4.0));
    }
    public void printAll(){
        System.out.printf("Name: %s\n",student.getName());
        System.out.printf("Chinese: %.1f\n",student.getChinese());
        System.out.printf("Math: %.1f\n",student.getMath());
        System.out.printf("English: %.1f\n",student.getEnglish());
        System.out.printf("Programming: %.1f\n",student.getProgramming());
    }
}
