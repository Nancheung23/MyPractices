package com.nancheung.functions;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // print triangle with * and space, 2 layers of loops
        int lines = askLines();
        for (int i = 0; i < lines; i++) {
            System.out.print(" ");
            for (int j = 0; j < lines-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i+1; k++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
    public static int askLines() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input triangle size: ");
        return scanner.nextInt();
    }
}
