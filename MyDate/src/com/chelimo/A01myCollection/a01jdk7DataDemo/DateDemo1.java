package com.chelimo.A01myCollection.a01jdk7DataDemo;

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {

        //1.创建一个对象表示时间
        Date date = new Date();
        System.out.println(date);

        //2.创建对象表示一个指定的时间
        Date date2 = new Date(0L);//L表示Long类型,0表示从时间原点过了0毫秒时间
        System.out.println(date2);//Thu Jan 01 08:00:00 CST 1970

        //3.setTime:修改时间
        date2.setTime(1000L);//毫秒值
        System.out.println(date2);//Thu Jan 01 08:00:01 CST 1970

        //4.getTime获取当前时间的毫秒值
        long time = date2.getTime();
        System.out.println(time);




    }
}
