package com.nancheung.api_Date;

import java.util.Calendar;
import java.util.Date;

public class Test_Calender {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();
        System.out.println(now);

        int year = now.get(Calendar.YEAR);
        System.out.println(year);

        int days = now.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);

        Date d = now.getTime();
        System.out.println(d);

        System.out.println(now.getTimeInMillis());

        now.set(Calendar.MONTH, 1);
        System.out.println(now);

        now.add(Calendar.DAY_OF_YEAR, 100);
        now.add(Calendar.DAY_OF_YEAR, -10);
        System.out.println(now);
    }
}
