package a03day03.src.StringfDemo;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1.假设我键盘录入一个abc
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.next();

        //2.代码中再定义一个字符串abc
        String str2 = "abc";

        //3.用 == 进行比较，两者会一样吗
        System.out.println(str1 == str2);//false
    }
}
