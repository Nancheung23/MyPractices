package com.algorithem.exception;

public class Test_modify {
    public static void main(String[] args) {
        try {
            saveAge(23);
            saveAge2(150);
            System.out.println("Run successfully!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Run fail");
        }
    }
    public static void saveAge(int age) {
        if (age > 0 && age < 150) {
            System.out.printf("Age %d saved successfully!\n", age);
        } else {
            throw new AgeIllegalRuntimeException("/age is illegal, your age is " + age);
        }
    }
    public static void saveAge2 (int age) throws AgeIllegalException{
        if (age > 0 && age < 150) {
            System.out.printf("Age %d saved successfully!\n", age);
        } else {
            throw new AgeIllegalException("/age is illegal, your age is " + age);
        }
    }
}
