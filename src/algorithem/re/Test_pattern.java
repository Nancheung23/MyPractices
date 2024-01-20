package com.algorithem.re;

import java.util.Scanner;

public class Test_pattern {
    public static void main(String[] args) {
        System.out.println("1".matches("\\d"));
        System.out.println("12".matches("\\d{2}"));

        System.out.println(" ".matches("\\s"));
        System.out.println("  ".matches("\\s{2}"));

        System.out.println("a".matches("\\w"));
        System.out.println("a".matches("\\W"));

        System.out.println("d".matches("[abc]"));
        System.out.println("d".matches("[^abc]"));

        // aba123fn daj1
        System.out.println("aba123fn daj1".matches("\\w{8}\\s\\w{4}"));
        System.out.println("aba123Fn daj1".matches("[a-z]{3}\\d{3}(?i)[A-Z][a-z]\\s[a-z]{3}\\d*"));

        // ? * + {n} {n, } {n, m} ?i
        checkEmail();
        checkPhone();
    }

    public static void checkPhone() {
        while (true) {
            System.out.println("Please input your Phone Number: ");
            Scanner scanner = new Scanner(System.in);
            String phone = scanner.nextLine();
            // +358 417234832
            if (phone.matches("([+]\\d{3}\\s)?\\d{7,10}")) {
                System.out.println("Format of phone number is right!");
                return;
            } else {
                System.out.println("Wrong format of phone number!");
            }
        }
    }

    public static void checkEmail() {
        while (true) {
            System.out.println("Please input your Email address: ");
            Scanner scanner = new Scanner(System.in);
            String email = scanner.nextLine();
            // zhangyannan199744@outlook.com
            if (email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")) {
                System.out.println("Format of email is right!");
                return;
            } else {
                System.out.println("Wrong format of email!");
            }
        }
    }
}
