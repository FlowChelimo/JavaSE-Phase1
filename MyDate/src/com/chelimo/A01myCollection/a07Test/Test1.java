package com.chelimo.A01myCollection.a07Test;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        键盘录入一些1~100之间的整数，并添加到集合中。
        直到集合中所有数据和超过200为止。
         */
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("数字范围1~100");
        int i = 1;
        while (list.size() < 20) {
            System.out.println("请输入第" + i + "个数字");
            String str = sc.nextLine();//nextLine:先把数据录入到内存当中，以后想用进行转换就可以了
            if(Integer.parseInt(str) >= 1 && Integer.parseInt(str) <= 100) {
                list.add(Integer.parseInt(str));
                i++;
            }else{
                System.out.println("输入的数字不符合规范,请重新输入");
            }
        }
        for (int i1 = 0; i1 < list.size(); i1++) {
            System.out.print(list.get(i1) + " ");
        }
        System.out.println("集合中所有数据和已经满足要求了");
    }
}
