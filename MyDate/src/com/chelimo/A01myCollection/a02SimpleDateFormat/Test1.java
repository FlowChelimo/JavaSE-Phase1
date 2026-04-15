package com.chelimo.A01myCollection.a02SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {
    public static void main(String[] args) throws ParseException {
        /*
        练习
        按照指定格式展示 假设，你初恋的出生年月日为:2000-11-11
        请用字符串表示这个数据，并将其转换为:2000年11月11日
         */

        //1.可以通过2000-11-11进行解析，解析成一个Date对象
        String str1 = "2000-11-11";
        //2.解析
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sdf.parse(str1);
        //3.格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf2.format(d));
    }
}
