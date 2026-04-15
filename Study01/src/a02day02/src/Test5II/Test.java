package a02day02.src.Test5II;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        //    键盘录入:
//    第一套体系:
//    nextInt();接收整数
//    nextDouble();接收小数
//    next();接收字符串
        //遇到空格，制表符，回车就停止接收，这些符号后面的数据就不会接受了

        //第二套体系
        //nextLine();接收字符串
        //可以接受空格，制表符，遇到回车才停止接收数据
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("请输入第一个整数"); //键盘录入“123 123”
        int n = sc.nextInt();                 //空格后面就不会接受了，直接给下面
        System.out.println("请输入第二个整数");
        int m = sc.nextInt();
        System.out.println(n);//123
        System.out.println(m);//123
         */

        System.out.println("请输入第一个字符串");
        String line1 = sc.nextLine();
        System.out.println(line1);
        System.out.println("请输入第二个字符串");
        String line2 = sc.nextLine();
        System.out.println(line2);

        //键盘录入的两套体系不能混用
        //弊端 如果先用nextInt 再用nextLine 会导致下面的extLine接收不到数据
    }
}
