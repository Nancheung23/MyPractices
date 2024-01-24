package io_1;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.util.List;

public class recursionTest4 {
    public static void main(String[] args) throws StackOverflowError, IOException {
        System.out.println("Search file: ");
        String dirStr = "C:\\Users\\zhang\\Desktop";
        File dir = new File(dirStr);
        searchFile("job", dir);
    }

    /**
     * Search a file under specific directory 
     * @param fileName directory
     * @param directory file name
     * @throws IOException 
     */
    public static void searchFile(String fileName, File directory) throws IOException, StackOverflowError {
        // invalid params
        if (directory == null || !directory.exists() || directory.isFile()) {
            return;
        }
        File[] files = directory.listFiles();
        // check if has auth and exists
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().contains(fileName)) {
                        System.out.println("File found: " + file.getAbsolutePath());
                        // read file, if .exe, can use runtime to execute
                        List<String> strs = Files.readAllLines(file.toPath());
                        for (String str : strs) {
                            System.out.println(str);
                        };
                    }
                } else {
                    searchFile(fileName, file);
                }
            }
        }
    }
}
