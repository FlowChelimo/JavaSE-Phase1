package com.chelimo.A01myCollection.a04JDK8DateDemo;

import java.time.Instant;
import java.time.ZoneId;

public class A02ZoneIdDemo2 {
    public static void main(String[] args) {
        /*
        static Instant now()                        获取当前时间的Instant对象(标准时间)
        static Instant ofXxxx(long epochMilli)      根据(秒/毫秒/纳秒)获取Instant对象
        ZonedDateTime atZone(ZoneId zone)           指定时区
        boolean isXxx(Instant otherInstant)         判断系列的方法
        Instant minusXxx(long millisTosubtract)     减少时间系列的方法
        Instant plusXxx(long millisTosubtract)      增加时间系列的方法
         */
        //静态方法----通过类名调用
        //非静态方法---通过对象调用

        //1.获取当前时间的Instant对象(标准时间)
        Instant instant = Instant.now();
        System.out.println(instant);

        //2.根据(秒/毫秒/纳秒)获取Instant对象
        Instant instant2 = Instant.ofEpochMilli(0L);
        System.out.println(instant2);//1970-01-01T00:00:00Z

        Instant instant3 = Instant.ofEpochSecond(1L);
        System.out.println(instant3);//1970-01-01T00:00:01Z

        Instant instant4 = Instant.ofEpochSecond(1L,1000000000);//第二个形参为纳秒
        System.out.println(instant4);//1970-01-01T00:00:02Z
        System.out.println("=================");

        //3.指定时区
        Instant.now().atZone(ZoneId.of("America/New_York"));//Instant.now() 返回的类型是：java.time.Instant
        System.out.println(Instant.now());

        //4.判断系列的方法
        System.out.println("=================");
        Instant instant5 = Instant.ofEpochMilli(1000);
        Instant instant6 = Instant.ofEpochMilli(3000);
        //判断instant5是否在instant6前面
        boolean result1 = instant5.isBefore(instant6);
        System.out.println(result1);//true
        //判断instant5是否在instant6后面
        boolean result2 = instant5.isAfter(instant6);
        System.out.println(result2);//false

        //5.增加/减少时间的方法
        System.out.println(instant5);
        Instant instant7 = instant5.minusSeconds(1);
        System.out.println(instant7);
        Instant instant8 = instant5.plusSeconds(1);
        System.out.println(instant8);
    }
}
