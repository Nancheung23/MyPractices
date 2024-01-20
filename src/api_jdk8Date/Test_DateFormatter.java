package com.nancheung.api_jdk8Date;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test_DateFormatter {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(dateTimeFormatter.format(ldt));

        System.out.println("==============================");
        String dateStr = "2024-01-01 09:34:26";
        LocalDateTime ldtOld = LocalDateTime.parse(dateStr,dateTimeFormatter);
        System.out.println(ldtOld);

        System.out.println("==============================");
        LocalDate ld1 = LocalDate.of(1997,4,4);
        LocalDate ld2 = LocalDate.of(2024,1,1);
        Period period = Period.between(ld1,ld2);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println("==============================");
        LocalDateTime start = LocalDateTime.of(1997,4,4,4,30,15);
        LocalDateTime end = LocalDateTime.now();
        Duration between = Duration.between(start, end);
        System.out.println(between.toDays());
    }
}