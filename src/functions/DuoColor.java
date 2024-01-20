package com.nancheung.functions;

import java.util.Random;
import java.util.Scanner;

public class DuoColor {
    // 6 red balls(1-33), 1 blue ball(1-16)
    // 6+1: 10,000,000 RMB; 6+0: 5,000,000 RMB; 5+1: 3,000 RMB; 5+0/4+1: 200 RMB; 4+0/3+1/2+1: 10 RMB; 1+1/0+1: 5 RMB;
    // get: user input numbers; return: prize result
    // func: 1.get user numbers 2.random number as result 3.decide prize
    public static void main(String[] args) {
        int[] userInput = getNum();
        int[] prize = getRandom();
        int[] money = prizeDecision(userInput, prize);
        System.out.print("your guessing numbers are: ");
        for (int i = 0; i < userInput.length; i++) {
            System.out.print(userInput[i] + " ");
        }
        System.out.print("\n");
        System.out.print("First prize's numbers are: ");
        for (int i = 0; i < prize.length; i++) {
            System.out.print(prize[i] + " ");
        }
        System.out.print("\n");
        if (money[0] != 0) {
            System.out.printf("Congratulations you earn level %d prize!!!, total: %d RMB", money[0],money[1]);
        } else {
            System.out.print("Sorry, you didn't earn any prize, good luck next time!");
        }
    }

    public static int[] getNum() {
        int[] input = new int[7];
        Scanner scanner = new Scanner(System.in);
        boolean indicator = true;
        for (int i = 0; i < input.length; i++) {
            if (indicator) {
                System.out.printf("Please input No.%d red ball number(1-33): ", i + 1);
                int temp = scanner.nextInt();
                if (temp >= 1 && temp <= 33) {
                    input[i] = temp;
                } else {
                    System.out.println("Wrong value, try again!");
                    i--;
                    continue;
                }
                if (i == 5) {
                    indicator = false;
                }
            } else {
                System.out.print("Please input blue ball number(1-16): ");
                int temp = scanner.nextInt();
                if (temp >= 1 && temp <= 16) {
                    input[i] = temp;
                } else {
                    System.out.println("Wrong value, try again!");
                    i--;
                }
            }
        }
        return input;
    }

    public static int[] getRandom() {
        Random num = new Random();
        int[] prizes = new int[7];
        for (int i = 0; i < prizes.length - 1; i++) {
            prizes[i] = num.nextInt(33) + 1;
        }
        prizes[6] = num.nextInt(16) + 1;
        return prizes;
    }

    public static int[] prizeDecision(int[] input, int[] prize) {
        int length = input.length;
        boolean blueIndicator = false;
        int countRed = 0;
        if (input[length - 1] == prize[length - 1]) {
            blueIndicator = true;
        }
        // count red balls
        int arrayLen = length - 1;
//        int[] prize1 = prize;
        OUT:
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < arrayLen; j++) {
                if (input[i] == prize[j]) {
//                if (input[i] == prize1[j]) {
                    countRed++;
                    // create new prize array, remove the equal num --> easy to get out of index, dangerous
                    int[] tempArray = new int[arrayLen];
                    for (int k = 0; k < arrayLen--; k++) {
                        if (prize[k] != prize[j]) {
                            tempArray[k] = prize[k];
                        }
                    }
                    prize = tempArray;
//                    // very useful, if just check don't need to remove, just change a value let them ain't equal again
//                    prize1[j] = -1;
                    continue OUT;
                }
            }
        }
        switch (countRed) {
            case 6:
                if (blueIndicator) {
                    return new int[]{1, 10000000};
                } else {
                    return new int[]{2, 5000000};
                }
            case 5:
                if (blueIndicator) {
                    return new int[]{3, 3000};
                } else {
                    return new int[]{4, 200};
                }
            case 4:
                if (blueIndicator) {
                    return new int[]{4, 200};
                } else {
                    return new int[]{5, 10};
                }
            case 3:
                if (blueIndicator) {
                    return new int[]{5, 10};
                } else {
                    return new int[]{0};
                }
            case 2, 0, 1:
                if (blueIndicator) {
                    return new int[]{6, 5};
                } else {
                    return new int[]{0};
                }
            default:
                return new int[]{0};
        }
    }
}
