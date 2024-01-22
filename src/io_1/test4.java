package io_1;

import java.io.File;

public class test4 {
    public static void main(String[] args) {
        // list
        File iteratorFile = new File("C:\\Users\\zhang\\Desktop");
        String[] list = iteratorFile.list();
        for(String fileName : list) {
            System.out.print(fileName + " ");
        }
        System.out.println("\n");

        // list file
        File[] listFile = iteratorFile.listFiles();
        for(File file : listFile) {
            System.out.print(file.getName() + " : " + file.length() + " Byte ");
        }

        // if is file, listFile == null
        // if file[] is empty, listFile == new File[0]
        // * normal: level 1 layer in File[] (file and directory)
        // * can show hidden file
        // if no auth, return null
    }
}
