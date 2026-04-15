package com.chelimo.A01myCollection.a05JDK8DateDemo;

import java.time.Duration;
import java.time.LocalDateTime;

public class a09DurationDemo {
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime birthday = LocalDateTime.of(2007, 7, 18,0,00,00);
        Duration duration = Duration.between(birthday, today);
        System.out.println(duration);

        System.out.println(duration.toDays());//两个时间差的天数
        System.out.println(duration.toHours());//两个时间差的小时数
        System.out.println(duration.toMinutes());//两个时间差的分钟数
        System.out.println(duration.getSeconds());//两个时间差的毫秒数
        System.out.println(duration.toMillis());//两个时间差的纳秒数
    }
}
