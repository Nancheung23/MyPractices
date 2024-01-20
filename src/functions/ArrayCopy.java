package com.nancheung.functions;

import java.util.Scanner;

public class ArrayCopy {
    public static void main(String[] args) {
        // array copy
        int[] newArray = arrayCp(getArray(getArrayLength()));
        System.out.print("the copy array is: [");
        for (int i = 0; i < newArray.length; i++) {
            // easy way: i == newArray.length-1? newArray[i] + "]" : newArray[i] + ", ";
            if(i==newArray.length-1){
                System.out.printf("%d]",newArray[i]);
                break;
            }
            System.out.printf("%d, ",newArray[i]);
        }
    }

    public static int[] arrayCp(int[] oldArray){
        int[] newArray = new int[oldArray.length];
        for (int i = 0; i < oldArray.length; i++) {
            int temp = 0;
            temp = oldArray[i];
            newArray[i] = temp;
        }
        return newArray;
    }

    public static int getArrayLength(){
        System.out.print("input number of array's length: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int[] getArray(int length){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.printf("input No.%d of this array: ",i+1);
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
