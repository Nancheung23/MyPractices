package com.algorithem.re;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // regular expression
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input numbers, not null, doesn't start with 0, length in 6 ~ 20: ");
        String str = scanner.next();
        if (numbersVerifyWithRe(str)) {
            System.out.println("verify successfully");
        } else {
            System.out.println("invalid!");
        }
    }
    public static boolean numbersVerify(String numbers) {
        if (numbers == null || numbers.startsWith("0") || numbers.length() < 6 || numbers.length() > 20) {
            return false;
        } else {
            // not null, doesn't start with 0, length in 6 ~ 20
            for (int i = 0; i < numbers.length(); i++) {
                if (numbers.charAt(i) < '0' || numbers.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean numbersVerifyWithRe(String numbers) {
        // first number : 1-9 ; \\d{5,19}: from second number, will have 5 to 19 numbers totally.
        return numbers != null && numbers.matches("[1-9]\\d{5,19}");
    }
}
