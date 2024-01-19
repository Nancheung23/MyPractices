package com.nancheung.api_Date;

import java.util.Date;

public class Test_Date {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

        long time = d.getTime();
        System.out.println(time);

        time += 2 * 1000;
//        Date timeFinal = new Date(time);
        Date timeFinal = new Date();
        timeFinal.setTime(time);
        System.out.println(timeFinal);


    }
}
