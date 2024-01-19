package com.nancheung.api_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);
        // * check api book
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE a");
        System.out.println(s1.format(time));

        System.out.println("==========================");
        String dateStr = "1997-04-04 04:12:11";
        SimpleDateFormat s2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(s2.parse(dateStr));
    }
}
