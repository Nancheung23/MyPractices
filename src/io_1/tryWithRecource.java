package io_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class tryWithRecource {
    public static void main(String[] args) {
        // after JDK 7
        // put stream in try(), automatically close.
        try (
            // can only put resources (AutoCloseable interface)
                InputStream is = new FileInputStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test2.txt");
                OutputStream os = new FileOutputStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test2Copy.txt");) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }
            System.out.println("Copy completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
