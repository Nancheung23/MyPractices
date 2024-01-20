package com.nancheung.functions;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeNumber {
    // get: e.g. [101-200]
    // return prime number, func: divide..
    public static void main(String[] args) {
        int[] origin = range();
        int[] array = findPrime(origin);
        int count = 0;
        System.out.printf("Prime numbers in the range %d to %d:\n", origin[0], origin[origin.length - 1]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                break;
            }
            System.out.printf("%d ", array[i]);
            count++;
        }
        System.out.printf("\n%d of prime numbers total! ", count);
    }

    public static int[] range() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the range to find prime numbers:");
        System.out.print("Input the lowest number: ");
        int numLeft = scanner.nextInt();
        System.out.print("Input the largest number: ");
        int numRight = scanner.nextInt();
        if (numRight > numLeft) {
            int[] rangeArray = new int[numRight - numLeft + 1];
            for (int i = 0; i < rangeArray.length; i++) {
                rangeArray[i] = numLeft;
                numLeft++;
            }
            return rangeArray;
        } else {
            System.out.println("Largest value must bigger than lowest");
            return null;
        }
    }

    public static int[] findPrime(int[] originArray) {
        // easier way: 1. info symbol: set boolean flag = true, if boolean == false, doesn't count
        // 2. OUT: set tag for outside loop, continue OUT; --> continue outside loop
        // 3. write method 'check', judge single data.
        int[] primeArray = new int[originArray.length];
        int index = 0;
        for (int i = 0; i < originArray.length; i++) {
            for (int j = 2; j < originArray[i]; j++) {
                if (originArray[i] % j != 0) {
                    if (j == originArray[i] - 1) {
                        primeArray[index] = originArray[i];
                        index++;
                    }
                } else {
                    break;
                }
            }
        }
        return primeArray;
    }
}
