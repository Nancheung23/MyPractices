package com.nancheung.functions;
// scores: [0 - 100], remove highest, lowest, calculate average
// get: scores array
// return: average score

import java.util.Scanner;

public class RatingSystem {
    public static void main(String[] args) {
        // get an array
        // judge if is decimal *
        int number = numberAsk();
        while(number < 3) {
            System.out.println("input number is wrong, try again!!!");
            number = numberAsk();
        }
        int[] num = arrayList(number);
        System.out.println("average is : " + average(num));
    }
    public static int numberAsk(){
        // ask number of people
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter how many people will give rates: ");
        return scanner.nextInt();
    }
    public static int[] arrayList(int number) {
        // create array
        int[] array = new int[number];
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < number; i++) {
            System.out.printf("please enter %d rating score: ", i+1);
            int rate = scanner1.nextInt();
            if (rate<0 || rate >100) {
                System.out.println("wrong rating score, try again!");
                i--;
                continue;
            } else {
                array[i] = rate;
            }
        }
        scanner1.close();
        return array;
    }
    public static double average(int array[]) {
        int len = array.length;
        // sort
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++){
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        // remove biggest and lowest, then sum
        double sum = 0;
        int[] newArray = new int[array.length-2];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i+1];
            sum += newArray[i];
        }
        // calculate average
        double average =  sum / newArray.length;
        return average;
    }
}
