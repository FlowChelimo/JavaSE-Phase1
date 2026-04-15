package com.chelimo.A01myCollection.a10Crawler2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
        /*
        有如下文本，请按照要求爬取数据。
        Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，下一个长期支持版本是Java17,
        相信在未来不久JAVA17也会逐渐登上历史舞台"

        需求1:爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        需求2:爬取版本号为8,11,17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        需求3:爬取除了版本号为8,11,17的Java文本
        */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11" +
                "，因为这两个是长期支持版本，下一个长期支持版本是Java17,相信在未来不久Java17也会逐渐登上历史舞台";
        //需求1：爬取版本号为8,11,17的Java文本，但是只要Java，不显示版本号。
        String regex1 = "Java(?=8|11|17)";
        Pattern p = Pattern.compile(regex1);
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }

        //需求2：爬取版本号为8,11,17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        System.out.println("=========================");
        String regex2 = "Java(?:8|11|17)";//或者"Java((8|11|17)|())"
        Pattern p2 = Pattern.compile(regex2);
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group());
        }

        //需求3：爬取除了版本号为8,11,17的Java文本
        System.out.println("=========================");
        String regex3 = "Java(?!8|11|17)";
        Pattern p3 = Pattern.compile(regex3);
        Matcher m3 = p3.matcher(str);
        while (m3.find()) {
            System.out.println(m3.group());
        }
    }
}
