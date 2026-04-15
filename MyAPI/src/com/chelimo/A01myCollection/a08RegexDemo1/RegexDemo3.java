package com.chelimo.A01myCollection.a08RegexDemo1;

public class RegexDemo3 {
    public static void main(String[] args) {

        // \转义字符 改变后面那个字符原本的含义
        //练习:以字符串的形式打印一个双引号
        //"在Java中表示字符串的开头或者结尾

        //此时\表示转义字符，改变了后面那个双引号原本的含义----复制路径时
        //把他变成了一个普普通通的双引号而已。
        System.out.println("\"");

        //.表示任意一个字符
        System.out.println("你".matches( ".."));//false
        System.out.println("你a".matches( ".."));//true
        //\\d只能是任意的一位数字
        // 简单来记:两个\表示一个\
        System.out.println("a".matches("\\d"));// false
        System.out.println("3".matches( "\\d"));// true
        System.out.println("333".matches("\\d"));// false
        //\\w只能是一位单词字符[a-zA-Z_0-9]
        System.out.println("z".matches("\\w"));// true
        System.out.println("2".matches("\\w"));// true
        System.out.println("21".matches("\\w"));// false
        System.out.println("你".matches( "\\w"));//false
        // 非单词字符
        System.out.println("你".matches( "\\w"));// true
        System.out.println("---------------");
        // 以上正则匹配只能校验单个字符。

        //必须是数字字母下划线至少 6位
        System.out.println("2442fsfsf".matches( "\\w{6,k"));//true
        System.out.println("244f".matches( "\\w{6,}"));//false
        //必须是数字和字符 必须是4位
        System.out.println("23dF".matches( "[a-zA-Z0-9]{4}"));//true
        System.out.println("23_F".matches( "[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches( "[\\w&&[^_]]{4}"));//true
        System.out.println("23 F".matches( "[\\w&&[^_]]{4}"));//false


    }
}
