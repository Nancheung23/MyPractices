package com.nancheung.functions;

import java.util.Scanner;

// every number of digits, x = (x+5)%10
// get: origin number
// return: reverse number x
public class DigitalPassword {
    public static void main(String[] args) {
        // processed num
        System.out.println("==please input a number that system will return a password==");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.print("result: ");
        int[] finalArray = numberArray(number);
        for (int i=0; i<finalArray.length;i++) {
            System.out.print(finalArray[i]);
        }
    }

    public static int[] numberArray(int inputNum){
        // easy way: public static int[] split(int number){} -> create method of split
        String numString = Integer.toString(inputNum);
        int digits = numString.length();
        int[] array = new int[digits];
        char[] oldArray = numString.toCharArray();
        // easy way: digits.fori --> to create for loop
        for(int i=0;i<digits;i++){
            //digits - i - 1; reverse
            int value = Character.getNumericValue(oldArray[digits - i - 1]);
            array[i] = decimalProcess(value);
        }
        return array;
    }
    public static int decimalProcess (int number) {
        number += 5;
        number %= 10;
        return number;
    }

}
