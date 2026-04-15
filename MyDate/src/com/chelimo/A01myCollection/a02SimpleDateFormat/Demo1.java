package com.chelimo.A01myCollection.a02SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1 {
    public static void main(String[] args) throws ParseException {
        /*
        public simpleDateFormat()                       默认格式
        public simpleDateFormat(string pattern)         指定格式

        public final string format(Date date)           格式化(日期对象->字符串)
        public Date parse(string source)                解析(字符串 ->日期对象)
         */

        //定义一个字符串表示时间
        String str = "2007-07-18 11:11:11";
        //创建simpleDateFormat对象，创建格式要与字符串格式完全相同
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse(str);
        System.out.println(d);
        System.out.println("=================");
        Method();
    }

    private static void Method() {
        //利用空参构造创建simpleDateFormat对象，默认格式
        SimpleDateFormat sdf1 = new SimpleDateFormat();
        Date d1 = new Date(0L);
        String str1 = sdf1.format(d1);
        System.out.println(str1);

        //利用含参构造创建simpleDateFormat对象，指定格式
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EE");
        Date d2 = new Date(0L);
        String str2 = sdf2.format(d2);
        System.out.println(str2);
    }
}
