package io_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

public class BufferedReadeTest {
    public static void main(String[] args) {
        try (
                Reader fr = new FileReader("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test.txt");
                BufferedReader bfr = new BufferedReader(fr);) {
            // char[] buffer = new char[3];
            // int len;
            // while ((len = bfr.read(buffer)) != -1) {
            //     System.out.print(new String(buffer, 0, len));
            // }
            String line;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
