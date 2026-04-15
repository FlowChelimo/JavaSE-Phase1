package com.chelimo.A01myCollection.a05JDK8DateDemo;

import java.time.LocalTime;

public class a06localTimeDemo {
    public static void main(String[] args) {
        //LocalTime只包含时分秒
        //LocalTime应用场景：用于时间比较精确的场景，比如 商品秒杀活动
        //获取现在时分秒
        LocalTime nowTime = LocalTime.now();

        //通过get方法获取时分秒纳秒
        int hour = nowTime.getHour();//时
        System.out.println("hour: "+ hour);
        int minute = nowTime.getMinute();//分
        System.out.println("minute:"+ minute);
        int second = nowTime.getSecond();//秒
        System.out.println("second:"+ second);
        int nano = nowTime.getNano();//纳秒
        System.out.println("nano:"+ nano);

        //可以用of方法指定时分秒
        LocalTime localTime1 = LocalTime.of(3, 33);//指定时分
        LocalTime localTime2 = LocalTime.of(3, 33, 33);//指定时分秒
        LocalTime localTime3 = LocalTime.of(3, 33, 33, 33);//指定时分秒纳秒

        //is系列的方法
        System.out.println(nowTime.isBefore(localTime1));
        System.out.println(nowTime.isAfter(localTime1));
        //with系列的方法，只能修改时、分、秒
        System.out.println(nowTime.withHour(10));
        //minus系列的方法，只能修改时、分、秒
        System.out.println(nowTime.minusHours(10));
        //plus系列的方法，只能修改时、分、秒
        System.out.println(nowTime.plusHours(10));

    }
}
