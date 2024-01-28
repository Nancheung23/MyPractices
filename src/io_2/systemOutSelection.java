package io_2;

import java.io.PrintStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class systemOutSelection {
    public static void main(String[] args) {
        try (
            PrintStream ps = new PrintStream("C:\\Users\\zhang\\IdeaProjects\\MyPractices\\src\\io_2\\test3.txt");
        ) {
            // this line switch output target from terminal to txt file
            System.setOut(ps);

            LocalDateTime ld = LocalDateTime.now();
            System.out.println("Haloo");
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
            String str = dtf.format(ld);
            // output the current time of log
            System.out.println(str);
            System.out.println("I'm a new log");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
