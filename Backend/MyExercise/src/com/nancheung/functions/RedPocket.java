package com.nancheung.functions;

import java.util.Random;
import java.util.Scanner;

public class RedPocket {
    // input: random name
    // get: item in array then pop out
    // no return, so select() is void func
    // more ways: 1. set 0 when selected, 2. mix as random order first then select 3. random select then array delete (similar like pop() in python) ...
    public static void main(String[] args) {
        int[] redPocket = {9, 666, 188, 520, 99999};
        select(redPocket);
    }

    public static void select(int[] redPocket){
        Scanner scanner = new Scanner(System.in);
        int length = redPocket.length;
        for (int i = 0; i < length; i++) {
            System.out.print("Insert your name to join: ");
            String name = scanner.nextLine();
            //when there length is 1, random class can't work
            if(redPocket.length!=1){
                int value = selectRandom(redPocket);
                System.out.printf("Congrats %s, you earned %d money redPocket\n",name , value);
                redPocket = delete(redPocket,value);
            }else {
                int value = redPocket[0];
                System.out.printf("Congrats %s, you earned %d money redPocket\n",name , value);
            }
        }
        System.out.println("This event is over!!!");
    }

    public static int selectRandom(int[] redPocket){
        Random random = new Random();
        return redPocket[random.nextInt(redPocket.length-1)];
    }

    public static int[] delete(int[] redPocket, int item) {
        int length = redPocket.length;
        int[] newArray = new int[length - 1];
        int indexNew = 0;
        for (int i = 0; i < length; i++) {
            if(redPocket[i] != item){
                // newArray is distributed values by origin array, when '!=' index++, when '==' index doesn't move
                newArray[indexNew] = redPocket[i];
                indexNew++;
            }
        }
        return newArray;
    }
}
