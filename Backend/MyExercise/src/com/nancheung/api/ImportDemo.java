package com.nancheung.api;
import com.nancheung.objects.Student;
import com.nancheung.objects.StudentOperator;

import java.util.Random;

public class ImportDemo {
    public static void main(String[] args) {
    StudentOperator o1 = new StudentOperator(new Student("Yannan Zhang",95.0,97.2,87.5,100.0));
    o1.printAll();
    o1.printTotalScore();
    o1.printAverageScore();


    String s = new String("Yannan Zhang");
    String s1 = "Yannan Zhang";
    Random r = new Random();
    int random = r.nextInt(5);
    System.out.printf("%s %s %d\n",s,s1,random);

    // !!! if import same name programme from different packages, since second one will include whole name of package
    }
}
