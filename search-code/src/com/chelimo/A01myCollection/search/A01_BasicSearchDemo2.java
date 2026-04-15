package com.chelimo.A01myCollection.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        int [] arr = {131,23,23,127,147,23,81,103,23,7,79};
        int target = 23;
        ArrayList<Integer> list = basicSearch2(arr, target);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    //课堂练习1:
    //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求:不需要考虑数组中元素是否重复
    public static int basicSearch1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    //课堂练习2:
    //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求:需要考虑数组中元素有重复的可能性
    public static ArrayList<Integer> basicSearch2(int[] arr, int target){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                list.add(i);
            }
        }
        return list;
    }
}
