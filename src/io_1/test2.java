package io_1;

import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class test2 {
    public static void main(String[] args) {
        File testFile = new File("C:\\Users\\zhang\\Desktop\\apply.txt");
        System.out.println(testFile.isFile());

        File testDirecroty = new File("C:\\Users\\zhang\\Desktop");
        System.out.println(testDirecroty.isDirectory());

        System.out.println(testFile.getName());

        System.out.println(testFile.length());
        // last modified
        Instant instant = Instant.ofEpochMilli(testFile.lastModified());
        LocalDateTime ldt = LocalDateTime.ofInstant(instant,ZoneId.of("GMT+2"));
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDateTime = ldt.format(dtf);
        System.out.println(formatDateTime);

        System.out.println(testFile.getPath());

        System.out.println(testFile.getAbsolutePath());
    }
}
