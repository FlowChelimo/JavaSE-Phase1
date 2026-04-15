package com.chelimo.A01myCollection.a05JDK8DateDemo;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class a10ChronoUnitDemo {
    public static void main(String[] args) {
        LocalDateTime birthday = LocalDateTime.of(2007, 7, 18,0,00,00);
        LocalDateTime today = LocalDateTime.now();

        System.out.println("相差的年数" + ChronoUnit.YEARS.between(birthday, today));
        System.out.println("相差的月数" + ChronoUnit.MONTHS.between(birthday, today));
        System.out.println("相差的周数" + ChronoUnit.WEEKS.between(birthday, today));
        System.out.println("相差的天数" + ChronoUnit.DAYS.between(birthday, today));
        System.out.println("相差的时数" + ChronoUnit.HOURS.between(birthday, today));
        System.out.println("相差的分数" + ChronoUnit.MINUTES.between(birthday, today));
        System.out.println("相差的秒数" + ChronoUnit.SECONDS.between(birthday, today));
        System.out.println("相差的毫秒数" + ChronoUnit.MILLIS.between(birthday, today));
        System.out.println("相差的微秒数" + ChronoUnit.MICROS.between(birthday, today));
        System.out.println("相差的纳秒数" + ChronoUnit.NANOS.between(birthday, today));
        System.out.println("相差的半天数" + ChronoUnit.HALF_DAYS.between(birthday, today));
        System.out.println("相差的十年数" + ChronoUnit.DECADES.between(birthday, today));
        System.out.println("相差的世纪(百年)数" + ChronoUnit.CENTURIES.between(birthday, today));
        System.out.println("相差的千年数" + ChronoUnit.MILLENNIA.between(birthday, today));
        System.out.println("相差的纪元数" + ChronoUnit.ERAS.between(birthday, today));
    }
}
