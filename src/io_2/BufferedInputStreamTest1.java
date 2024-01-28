package io_2;

import java.io.*;

public class BufferedInputStreamTest1 {
    public static void main(String[] args) {
        try (
            // 8kb cache (buffered input/output stream)
                InputStream is = new FileInputStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test2.txt");
                        InputStream bis = new BufferedInputStream(is);
                OutputStream os = new FileOutputStream(
                        "C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_1\\test2Copy.txt");
                        OutputStream bos = new BufferedOutputStream(os)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("Copy completed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
