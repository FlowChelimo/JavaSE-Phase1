package a03day03.src.StringfDemo;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        //案例 遍历字符串
        //需求：键盘录入一个字符串，使用程序实现再控制台遍历该字符串

        //public char charAt(int index):根据索引返回字符
        //public int length():返回此字符串的长度

        //数组的长度 arr.length是一个属性不需要加括号
        //字符串的长度 字符串对象.length() 是一个方法需要加括号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
