package a03day03.src.StringBuilderDemo;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        //StringJoiner 概述
        //StringJoiner跟StringBuilder一样，也可以看成是一个容器，创建之后里面的内容是可变的。
        //作用:提高字符串的操作效率，而且代码编写特别简洁，但是目前市场上很少有人用。

        //创建对象
        StringJoiner joiner = new StringJoiner(",","[","]");
        //添加元素
        joiner.add("aaa").add("bbb").add("ccc");
        //打印
        System.out.println(joiner);
        System.out.println(joiner.toString());


    }
}
