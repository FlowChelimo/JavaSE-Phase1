package com.chelimo.A01myCollection.a01jdk7DataDemo;

import java.util.Date;
import java.util.Random;

public class DateDemo2 {
    public static void main(String[] args) {
        /*
        需求1:打印时间原点开始一年之后的时间
        需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后
        */

        extracted();

        //需求2：
        //需求2:定义任意两个Date对象，比较一下哪个时间在前，哪个时间在后

        Random r=new Random();
        System.out.println("===================");
        //创建两个时间对象
        Date d1 = new Date(Math.abs(r.nextInt()));
        Date d2 = new Date(Math.abs(r.nextInt()));
        System.out.println(d1);
        System.out.println(d2);
        long t1 = d1.getTime();
        long t2 = d2.getTime();
        //转成time就可以进行比较了,d1 d2是两个对象无法直接比较会报错


    }

    private static void extracted() {
        //需求1:打印时间原点开始一年之后的时间
        //1.创建一个对象，表示时间原点
        Date d1 = new Date(0L);
        //2.获取d1时间的毫秒值
        long time = d1.getTime();
        //3.在这个基础上我们要加一年的毫秒值即可
        time =time +1000L*60*60*24 * 365;
        //4.把计算之后的时间毫秒值，再设置回d1当中
        d1.setTime(time);
        //5.打印d1
        System.out.println(d1);
    }
}
