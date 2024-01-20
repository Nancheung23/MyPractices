package com.nancheung.api_jdk8Date;

import java.time.*;

public class Test {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);
        System.out.println("============================");
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int day = ld.getDayOfMonth();
        System.out.printf("today is %d/%d/%d !\n",year,month,day);
        System.out.println("============================");
        LocalDate ldModified = ld.withYear(2077);
        System.out.println("new modified year: " + ldModified.getYear());
        LocalDate ldFinal = ld.withYear(2075).plusYears(2).withMonth(4).withDayOfMonth(4);
        System.out.println("new modified date: " + ldFinal);
        System.out.println("============================");
        LocalTime ltNow = LocalTime.of(12,12,12,12);
        LocalTime ltNext = ltNow.minusHours(1).minusSeconds(1).minusMinutes(1).minusNanos(1);
        if (lt.isBefore(ltNext)) {
            System.out.println("Recent time is before the ltNext time !");
        } else if (lt.equals(ltNext)) {
            System.out.println("It's now !");
        } else {
            System.out.println("Recent time is after the lt Next time !");
        }
        System.out.println("============================");
        LocalDateTime combine = LocalDateTime.of(ldFinal, ltNext);
        System.out.println("now the date and time is: " + ldt + " but the set one is: " + combine);

        System.out.println("============================");
        ZoneId zid = ZoneId.systemDefault();
        System.out.println(zid.getId());

        System.out.println("============================");
        System.out.println(ZoneId.getAvailableZoneIds());
        ZoneId zid1 = ZoneId.of("Asia/Shanghai");
        ZonedDateTime zTime = ZonedDateTime.now(zid1);
        System.out.println("Now time in China: " + zTime);
        ZonedDateTime zStatic = ZonedDateTime.now(Clock.systemUTC());
        System.out.println("Now standard time: " + zStatic);

        System.out.println("============================");
        Instant insNow = Instant.now();
        long sec = insNow.getEpochSecond();
        long nanoSec = insNow.getNano();
        System.out.println("Instant obj info: " + sec + " , " + nanoSec);

    }


}
