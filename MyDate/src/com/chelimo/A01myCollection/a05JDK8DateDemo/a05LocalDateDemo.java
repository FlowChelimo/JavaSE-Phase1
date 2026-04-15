package com.chelimo.A01myCollection.a05JDK8DateDemo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;

public class a05LocalDateDemo {
    public static void main(String[] args) {
        //LocalDate:只有年月日 没有时分秒
        //补充：true:闰年  false:平年
        LocalDate ld = LocalDate.now();
        System.out.println(ld.isLeapYear());

        //获取当前的日历对象
        LocalDate nowDate = LocalDate.now();
        System.out.println("当前日历对象" + nowDate);
        //获取指定的日历对象
        LocalDate d1 = LocalDate.of(2007, 7, 18);
        System.out.println("指定的日历对象" + d1);
        //获取年份  注意是Int
        int year = d1.getYear();
        System.out.println("当前年份" + year);
        //获取月份 方法一(获取的是月的对象)
        Month month1 = d1.getMonth();
        System.out.println("当前月份" + month1);
        //获取月份 方法二 Int类型
        int month2 = d1.getMonthValue();
        System.out.println("当前月份" + month2);
        //获取日
        int day = d1.getDayOfMonth();
        System.out.println("日" + day);
        //获取一年的第几天
        int dayOfYear = d1.getDayOfYear();
        System.out.println("一年中第" + dayOfYear + "天");
        //获取星期
        DayOfWeek dayOfWeek = d1.getDayOfWeek();
        System.out.println("星期" + dayOfWeek);
        //with开头的方法表示修改 只能修改年月日
        LocalDate d2 = d1.withYear(2008);
        System.out.println("修改后" + d2);//新创建一个对象。与原先比较 不同
        System.out.println(d1 == d2);//false
        //minus开头的方法表示减少 只能减少年月日
        LocalDate d3 = d1.minusYears(1);
        System.out.println("年份减少一后" + d3);
        //plus开头的方法表示增加 只能增加年月日
        LocalDate d4 = d1.plusYears(1);
        System.out.println("年份增加一后" + d4);

        //判断今天是否是你的生日
        LocalDate birL = LocalDate.of(2007,7,8);//先把生日封装成一个LocalDate对象
        LocalDate nowL = LocalDate.now();//再把今天封装成一个LocalDate对象
        //MonthDay已经造好的轮子 忽略年份 可读性好 可维护性好
        MonthDay md1 = MonthDay.of(birL.getMonth(), birL.getDayOfMonth());
        MonthDay md2 = MonthDay.of(nowL.getMonth(), nowL.getDayOfMonth());
        System.out.println("今天是你的生日吗" + md1.equals(md2));

        //也可以比较前后
        System.out.println(d1.isBefore(d2));
        System.out.println(d1.isAfter(d2));
    }
}
