package com.nancheung.staticcount;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        ArrayList <User> users = new ArrayList<>();
        while (true) {
            System.out.println("== Auto generate users ==");
            System.out.println("1.create user");
            System.out.println("2.delete user");
            System.out.println("3.quit");
            int selection = scanner.nextInt();
            if (selection == 1) {
                System.out.print("please input user name: ");
                String tempName = scanner.next();
                System.out.print("please input user age: ");
                int tempAge = scanner.nextInt();
                users.add(new User(tempName, tempAge));
            } else if (selection == 2) {
                boolean indicator = false;
                System.out.print("please input the user name you want to delete: ");
                String tempName = scanner.next();
                for (int i = users.size() - 1; i >= 0 ; i--) {
                    if (users.get(i).getUserName().equalsIgnoreCase(tempName)) {
                        users.remove(i);
                        System.out.println("deleted successfully !");
                        indicator = true;
                        break;
                    }
                }
                if (!indicator) {
                    System.out.println("cannot find user !");
                }
            }
            else {
                break;
            }
        }
    }
}