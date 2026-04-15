package com.chelimo.A01myCollection.a11Crawler3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*
        只写+和*表示贪婪匹配
        +? 非贪婪匹配
        *? 非贪婪匹配

        贪婪爬取:在爬取数据的时候尽可能的多获取数据
        非贪婪爬取:在爬取数据的时候尽可能的少获取数据

        ab+:
        贪婪爬取:abbbbbbbbbbbb
        非贪婪爬取:ab

         */

        String str = "Java自从95年问世以来，abbbbbbbbbbbaaaaaaaaaa" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11" +
                "，因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";

        //贪婪爬取
        String regex = "ab+";
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(str);
        while (m1.find()) {
            System.out.println(m1.group());//abbbbbbbbbbb
        }
        //非贪婪爬取
        String regex2 = "ab+?";
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group());//ab
        }
    }
}
