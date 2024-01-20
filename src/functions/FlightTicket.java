package com.nancheung.functions;
import java.util.Scanner;
// 5-10 holiday season, first class 90% discount, economic class 85%
// 11-4 non-holiday season, first class 70% discount, economic class 65%
// get: origin price/month/class
// return: final price


public class FlightTicket {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        System.out.print("请依次输入机票相关信息:\n1. 价格: ");
        double originPrice = scanner1.nextDouble();
        System.out.print("2. 月份(输入 1 - 12 的数字): ");
        int originMonth = scanner2.nextInt();
        System.out.print("3. 请选择舱类型(1:头等舱, 2:经济舱): ");
        int originClass = scanner3.nextInt();
        String className = (originClass == 2) ? "economic" : "first";
        System.out.printf("您的折后机票价格为: %.2f", calculate(originPrice,originMonth,className));
        scanner1.close();
        scanner2.close();
        scanner3.close();
    }

    public static double calculate(double price, int month, String type) {
        double finalPrice = 0;
        switch (type){
            case "first":
                if (month<=10 && month >=5) {
                    finalPrice = price * 0.9;
                } else {
                    finalPrice = price * 0.7;
                }
                break;
            case "economic":
                if (month<=10 && month >=5) {
                    finalPrice = price * 0.85;
                } else {
                    finalPrice = price * 0.65;
                }
                break;
            default: finalPrice = price;
        }
        return finalPrice;
    }
}
