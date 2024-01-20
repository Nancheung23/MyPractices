package com.nancheung.functions;
import java.util.Random;
import java.util.Scanner;

// get: int number of digits
// return: String verify code
// need ascii table to relate char

public class VerifyCode {
    public static void main(String[] args) {
        // generate a random verify code
        System.out.print("请输入需要生成验证码的位数: ");
        Scanner scanner1 = new Scanner(System.in);
        int digit = scanner1.nextInt();
        System.out.printf("生成的随机数为: %s", generate(digit));
    }
    public static String generate(int digits) {
        StringBuilder generated = new StringBuilder();
        Random r = new Random();
        for (int i = 1; i <= digits; i++) {
            int type = r.nextInt(3);
            switch (type) {
                // nextInt(bound) --> 0 to (bound-1)
                // ASCII 48 -- 57: 0 -- 9 ; 65 -- 90: A -- Z ; 97 -- 122: a -- z
                case 0:
                    generated.append((char) (r.nextInt(10) + 48));
                    break;
                case 1:
                    generated.append((char) (r.nextInt(26) + 65));
                    break;
                case 2:
                    generated.append((char) (r.nextInt(26) + 97));
                    break;
            }
        }
        return generated.toString();
    }
}
