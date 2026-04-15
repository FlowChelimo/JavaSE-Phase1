package com.chelimo.A01myCollection.a12Crawler4;

public class Test1 {
    public static void main(String[] args) {
        /*
        捕获分组
        后续还要继续使用本组的数据。
        \\组号 正则内部使用
        正则外部使用:$组号
        */

        /*需求:
        将字符串:我要学学编编编编程程程程程程
        替换为:我要学编程
        */

        String s = "我要学学编编编编程程程程程程";
        //正则表达式 (.)\\1+
        //(.)：捕获组1，匹配任意单个字符（中文、英文、数字、符号都可以），并把这个字符暂存起来。
        //\\1：反向引用，引用捕获组1中匹配到的字符，要求后面的字符必须和捕获组1的字符完全相同。
        //+：量词，表示前面的\\至少出现1次，也就是匹配连续重复的字符序列    （长度≥2）
        String s1 = s.replaceAll("(.)\\1+", "$1");
        System.out.println(s1);
    }
}
