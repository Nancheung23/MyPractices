package com.nancheung.api;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        // use java.lang.String
        // constructor: 1. String() 2. String(String original) 3. String(char[] chars) 4. String(byte[] bytes)
        // 1.
//        String name = "yannan zhang";
//        // 2.
//        String t1 = new String();
//        String t2 = new String("Yannan Zhang");
//        // 3
//        char[] chars = {'a','b','c'};
//        String t3 = new String(chars);
//        //4. (byte-->Ascii table)
//        byte[] bytes = {78,65,78,33};
//        String t4 = new String(bytes);

        // methods: 1. length 2. chatAt 3. toCharArray 4. equals(+IgnoreCase) 5. substring([int beginIndex, int endIndex] or int beginIndex)
        // 6. replace 7. contains 8. startsWith 9. split

        String trueName = "nan";
        String truePass = "123456";
        String[] verifyInfo = {trueName,truePass,null,null};
        for (int i = 0; i < 3; i++) {
            String[] temp = askInput();
            verifyInfo[2] = temp[0] ;
            verifyInfo[3] = temp[1] ;
            if (verify(verifyInfo)){
                System.out.println("welcome login system");
                break;
            }else {
                if ((2-i)>0){
                    System.out.printf("login error, remain %d times of chance, retry: \n", 2-i);
                }else {
                    System.out.println("system lock, good bye!");
                }
            }
        }
    }
    public static String[] askInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Please input username: ");
        String tempName = scanner.nextLine();
        System.out.println("Please input password: ");
        String tempPass = scanner.nextLine();
        return new String[] {tempName,tempPass};
    }
    public static boolean verify (String[] verifyInfo) {
        return verifyInfo[0].equals(verifyInfo[2]) && verifyInfo[1].equals(verifyInfo[3]);
    }
}
