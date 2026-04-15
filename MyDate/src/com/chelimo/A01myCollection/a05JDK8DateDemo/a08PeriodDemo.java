package com.chelimo.A01myCollection.a05JDK8DateDemo;

import java.time.LocalDate;
import java.time.Period;

public class a08PeriodDemo {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(2007, 7, 18);
        Period period = Period.between(birthday, today);

        System.out.println(period);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());//时间间隔总月份
    }
}
