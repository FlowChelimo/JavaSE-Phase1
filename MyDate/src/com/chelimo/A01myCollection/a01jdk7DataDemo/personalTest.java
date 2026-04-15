package com.chelimo.A01myCollection.a01jdk7DataDemo;

import java.util.Date;

public class personalTest {
    public static void main(String[] args) {
        //创建一个date对象
        Date date = new Date();
        //set方法改变date的值。date是对象，无法直接改变
        date.setTime(1000L);
        Long time = date.getTime();
        System.out.println(time);
        System.out.println(date.getTime());

    }
}
