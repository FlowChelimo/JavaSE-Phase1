package com.chelimo.A01myCollection.a14lambdaDemo;

import java.util.Arrays;

public class lambdaDemo4 {
    public static void main(String[] args) {
        /*
        练习:
          Lambda表达式简化Comparator接口的匿名形式
          定义数组并存储一些字符串，利用Arrays中的sort方法进行排序
          要求:
          长的在后面
          按照字符串的长度进行排序，短的在前面，
          暂时不比较字符串里面的内容
         */
        String[] arr = {"chel", "che", "c", "cheli", "chelimo", "ch"};
//        Arrays.sort(arr,(String o1, String o2) -> {
//                return o1.length() - o2.length();
//            }
//          );
        //简化格式
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length()
        );
        System.out.println(Arrays.toString(arr));
    }
}
