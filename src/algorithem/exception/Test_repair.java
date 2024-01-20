package com.algorithem.exception;

import java.util.Scanner;

public class Test_repair {
    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("Input invalid!");
            }
        }
    }

    public static double getMoney() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input Valid Money: ");
            double money = scanner.nextDouble();
            if (money >= 0) {
                return money;
            } else {
                System.out.println("Input invalid!");
            }
        }
    }
}
