package com.nancheung.api;

import java.util.Random;
import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input digits of code: ");
        System.out.printf("Verify code is: %s\n",generateCode1(scanner.nextInt()));;
    }
    public static String generateCode1(int digits){
        StringBuilder code = new StringBuilder();
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        for (int i = 0; i < digits; i++) {
            int index = random.nextInt(data.length());
//            code += data.substring(index, index+1);
            code.append(data.charAt(index));
        }
        return code.toString();
    }
    public static String generateCode2(int digits){
        String code = "";
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        Random random = new Random();
        for (int i = 0; i < digits; i++) {
            int index = random.nextInt(data.length());
//            code += data.substring(index, index+1);
            code += data.charAt(index);
        }
        return code;
    }
}
