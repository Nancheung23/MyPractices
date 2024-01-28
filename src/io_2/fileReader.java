package io_2;

import java.io.FileReader;
import java.io.Reader;

public class fileReader {
    public static void main(String[] args) {
        // create
        try (
                Reader fr = new FileReader("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test.txt");) {
                    // int c;
                    // while ((c = fr.read()) != -1) {
                    //     System.out.print((char) c);
                    // }
                    char[] buffer = new char[3];
                    int len;
                    while ((len = fr.read(buffer)) != -1) {
                        System.out.print(new String(buffer, 0, len));
                    }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
