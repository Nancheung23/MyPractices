package com.algorithem.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_deal {
    public static void main(String[] args) {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("File cannot find!");
            throw new RuntimeException(e);
        } catch (ParseException e) {
            System.out.println("Date format invalid!");
            throw new RuntimeException(e);
        }
    }
    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24:24");
        System.out.println(d);
        test2();
    }

    private static void test2() throws FileNotFoundException {
        InputStream is = new FileInputStream("D://abc.txt");
    }
}
