package com.chelimo.A01myCollection.a07Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Test4 {
    public static void main(String[] args) throws ParseException {
        /*
        算法水题
        请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
         */

        //JDK7:
        String birthday1 = "2007-07-18";
        String today1 = "2026-04-04";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf1.parse(birthday1);
        Date todayDate = sdf2.parse(today1);
        long time1 = birthdayDate.getTime();
        long time2 = todayDate.getTime();
        long time3 = (time2 - time1) / 1000 / 3600 / 24;
        System.out.println("活了" + time3 + "天");
        //方法2:
        Long Today = System.currentTimeMillis();

        //JDK8:
        LocalDate birthday = LocalDate.parse(birthday1);
        LocalDate today = LocalDate.now();
        System.out.println("活了" + ChronoUnit.DAYS.between(birthday, today) + "天");
    }
}
