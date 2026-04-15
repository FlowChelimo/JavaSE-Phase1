package a03day03.src.StringBuilderDemo;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //StringBuilder概述
        //StringBuilder 可以看成是一个容器，创建之后里面的内容是可变的
        //作用:提高字符串的操作效率

        //创建对象
        StringBuilder sb = new StringBuilder();

        //添加对象
        sb.append("Hello!");

        //反转
        sb.reverse();

        //打印
        //普及
        //因为StringBuilder是java已经写好的类
        //Java在底层对它做了一些特殊处理
        //打印对象不是地址值而是属性值
        System.out.println(sb);



    }
}
