package com.nancheung.api;

import java.util.Scanner;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Dish d1 = new Dish("利群烤鸭", 110.50, "让您见识见识北京烤鸭的真实水平，地址：北京市东城区前门东大街北翔凤胡同11号", 3);
        Dish d2 = new Dish("陈亨卤煮小肠", 32.8, "肠、肺、豆腐和火烧，下水爱好者的至爱，地址：蒲黄榆路50号", 1);
        Dish d3 = new Dish("老磁器口豆汁", 17, "一碗豆汁儿，一份儿焦圈儿，吃的真是不亦乐乎，地址：天坛北门对面(小胖包子王旁边)", 1);
        Dish d4 = new Dish("葱烧海参", 200, "仿膳饭庄 推荐：葱烧海参、抓炒里脊，地址： 北海公园北门内九龙壁前", 5);
        Dish d5 = new Dish("鲜肉馄饨", 200, "馄饨侯 推荐：鲜肉馄饨、小笼汤包、蟹肉烧麦，地址： 鼓楼东大街309号(地安门鼓楼旁)", 2);
        Dish[] dishes = {d1, d2, d3, d4, d5};
        DishOperator o1 = new DishOperator(dishes);
        Scanner scanner = new Scanner(System.in);
        OUT: while (true) {
            System.out.println("\n===This is a system for dishes searching and modifying===");
            System.out.println("1. Print all information.");
            System.out.println("2. Add information.");
            System.out.println("3. Remove information.");
            System.out.println("4. Quit system.");
            for (int i = 0; i < 57; i++) {
                System.out.print("=");
            }
            System.out.println("\n");
            System.out.print("Please select service you want: ");
            int service = scanner.nextInt();
            if (service>=1 && service<=4){
                switch (service){
                    case 1: {
                        o1.showAll();
                        break;
                    }
                    case 2: {
                        o1.addDishByAsking();
                        break;
                    }
                    case 3: {
                        System.out.print("Please input a name you want to remove: ");
                        o1.removeDish(scanner.next());
                        break;
                    }
                    case 4: {
                        System.out.println("Ready to quit system...");
                        break OUT;
                    }
                    default: {
                        System.out.println("--Detecting this bug while index out of service--");
                        break;
                    }
                }
            }else {
                System.out.println("Please input correct service number!!");
                }
            }
        }
    }
