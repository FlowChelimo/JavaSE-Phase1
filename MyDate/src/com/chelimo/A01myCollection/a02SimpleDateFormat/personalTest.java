package com.chelimo.A01myCollection.a02SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class personalTest {
    public static void main(String[] args) throws ParseException {
        //1.
        //定义一个字符串表示时间对象
        String s = "2007年7月8日 11:11:11";
        //格式要与字符串完全相同
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date date = sdf.parse(s);
        System.out.println(date);
        //2.
        //利用空参构造创建SimpleDateFormat
        SimpleDateFormat sdf2 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String format = sdf2.format(d1);
        System.out.println(format);
        //3.
        //利用含参构造创建SimpleDateFormate
        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = sdf3.format(d1);
        System.out.println(format1);
    }
}
