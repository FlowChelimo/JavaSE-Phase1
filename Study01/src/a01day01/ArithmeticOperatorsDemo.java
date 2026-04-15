package a01day01;

import java.util.Scanner;

public class ArithmeticOperatorsDemo {
    public static void main(String[] args) {
        //复习：键盘录入一个三位数，将其拆分为个位十位百位后，打印在控制台
        // byte
        System.out.println("byte 最小值：" + Byte.MIN_VALUE);
        System.out.println("byte 最大值：" + Byte.MAX_VALUE);
        System.out.println("------------------------");
        // short
        System.out.println("short 最小值：" + Short.MIN_VALUE);
        System.out.println("short 最大值：" + Short.MAX_VALUE);
        System.out.println("------------------------");
        // int
        System.out.println("int 最小值：" + Integer.MIN_VALUE);
        System.out.println("int 最大值：" + Integer.MAX_VALUE);
        System.out.println("------------------------");
        // long
        System.out.println("long 最小值：" + Long.MIN_VALUE);
        System.out.println("long 最大值：" + Long.MAX_VALUE);
        System.out.println("------------------------");
        // float
        System.out.println("float 最小值：" + Float.MIN_VALUE);
        System.out.println("float 最大值：" + Float.MAX_VALUE);
        System.out.println("------------------------");
        // double
        System.out.println("double 最小值：" + Double.MIN_VALUE);
        System.out.println("double 最大值：" + Double.MAX_VALUE);
        System.out.println("------------------------");
        // char
        System.out.println("char 最小值：" + (int) Character.MIN_VALUE);
        System.out.println("char 最大值：" + (int) Character.MAX_VALUE);
        //------------------------------------------------------------------------------------
        System.out.println("请输入一个三位数");
       Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int ge =number % 10;
       int shi =number / 10 % 10;
       int bai =number / 100;
       System.out.println("这个数个位是" + ge);
       System.out.println("这个数十位是" + shi);
       System.out.println("这个数百位是" + bai);

    }
}
