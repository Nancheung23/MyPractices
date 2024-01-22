package io_1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class test5 {
    // make a directory -> creates files -> rename one specific file
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\zhang\\Desktop\\test";
        File target = new File(path);
        if (target.exists()) {
            createFiles(target.getAbsolutePath());
        } else {
            target.mkdir();
            createFiles(target.getAbsolutePath());
        }
        showList(path);
        System.out.println("which one you want to modify name? input the file name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("File examination: " + checkName(name,target));
        System.out.println("Rename to?");
        String newName = scanner.nextLine();
        modifyName(name, newName, target);
        System.out.println("Modify successful: " + newName);
        scanner.close();
    }

    public static boolean checkName(String name, File target) throws IOException{
        if (target.exists()) {
            if (name.contains(".")) {
                String temp = target + "\\" + name;
                File tempf = new File(temp);
                if (tempf.exists()) {
                    return true;
                } else {
                    return false;
                }
            } else {
                String temp = target + "\\" + name + ".txt";
                File tempf = new File(temp);
                if (tempf.exists()) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
    }
    public static void modifyName(String name, String newName, File directory) {
        if (directory.isDirectory()) {
            boolean flag = false;
            File[] files = directory.listFiles();
            for(File file : files) {
                String fileStr = file.getName();
                if (name.equalsIgnoreCase(fileStr)) {
                    file.renameTo(new File(directory.getAbsolutePath() + "\\" + newName));
                    flag = true;
                    break;
                } else if (fileStr.contains(name)) {
                    try {
                        String[] items = fileStr.split("\\.");
                        if (items[0].equalsIgnoreCase(name)) {
                            file.renameTo(new File(directory.getAbsolutePath() + "\\" + newName + ".txt"));
                            flag = true;
                            break;
                        }
                    } catch (ArrayIndexOutOfBoundsException e) {
                        // TODO: handle exception
                        System.out.println("Invalid method");
                    }
                }
            }
            if (flag == false) {
                System.out.println("Invalid file name, can't find");
            }
        } else {
            System.out.println("Invalid path.");
        }
    }

    public static boolean createFiles(String path) throws IOException {
        File dirPath = new File(path);
        if (dirPath.isDirectory()) {
            for (int i = 1; i <= 10; i++) {
                String temp = path + "\\" + i + ".txt";
                File file = new File(temp);
                if (!file.exists()) {
                    file.createNewFile();
                } else {
                    System.out.println("File: " + temp + "already exists");
                }
            }
            return true;
        } else {
            return false;
        }
    }

    public static void showList(String path) {
        File dirPath = new File(path);
        System.out.println("Under path " + path + " :");
        if (dirPath.isDirectory()) {
            String[] fileNames = dirPath.list();
            for(String name : fileNames) {
                System.out.print(name + " ");
            }
        }
        System.out.println();
    }
}
