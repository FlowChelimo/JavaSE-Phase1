package com.chelimo.A01myCollection.a07Test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        /*
        定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */
        System.out.println("请输入一个十进制整数，会把它转化为二进制");
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        Integer i = Integer.valueOf(k);
        int i1  = i;
        StringBuilder s = new StringBuilder();
        while (i != 0) {
            Integer j = i % 2;
            i = i / 2;
            s.append(j);
        }
        System.out.println("这个数的二进制是：" + s.reverse().toString());
        System.out.println("这个数的二进制是：" + Integer.toBinaryString(i1));
    }
}
