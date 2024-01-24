package io_1;

import java.io.File;
import java.io.IOException;

public class recursionTest5 {
    public static void main(String[] args) throws StackOverflowError, IOException {
        File dir = new File("C:\\Users\\zhang\\Desktop\\test");
        deleteDir(dir);
    }

    /**
     * Method to delete everything under the path including the directory
     * 
     * @param dir root directory you want to delete
     * @throws IOException        Accesibility of file
     * @throws StackOverflowError Recursion func
     */
    public static void deleteDir(File dir) throws IOException {
        if (dir == null || !dir.exists()) {
            return;
        }

        if (dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        file.delete();
                    } else if (file.isDirectory()) {
                        if (!file.delete()) {
                            deleteDir(file); // Recursively delete each file/subdirectory
                        } else {
                            file.delete();
                        }

                    }
                }
            }
        }
        // After clearing all contents, delete the directory
        dir.delete();
    }
}
