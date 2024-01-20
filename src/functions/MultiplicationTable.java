package com.nancheung.functions;

public class MultiplicationTable {
    public static void main(String[] args) {
        // print multiplication table, 2 loops
        // my way
        OUT:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf(" %d * %d = %d ", j, i, i * j);
                if (j >= i) {
                    System.out.print("\n");
                    continue OUT;
                }
            }
        }
        System.out.print("\n");
        System.out.print("\n");
        // another way
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("\t%d\tX\t%d\t=\t%d", j, i, i * j);
            }
            System.out.println("\n");
        }
    }
}
