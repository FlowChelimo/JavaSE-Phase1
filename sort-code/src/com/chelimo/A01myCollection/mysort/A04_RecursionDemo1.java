package com.chelimo.A01myCollection.mysort;

import java.util.Random;

public class A04_RecursionDemo1 {
    public static void main(String[] args) {
        /*快速排序:
        第一轮:以0索引的数字为基准数，确定基准数在数组中正确的位置
        比基准数小的全部在左边，比基准数大的全部在右边。
        后面以此类推。
         */

//        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        //快速排序速度非常快
        int [] arr = new int [100000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt();
        }
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();
//        printArr(arr);
        System.out.println(end - start);//几十毫秒
    }

    public static void quickSort(int[] arr, int i, int j) {
        int start = i;
        int end = j;
        int baseNumber = arr[start];
        if(start >= end) {
            //递归的出口:当start跑到end右边时
            return;
        }
        //当start等于end时停止循环
        while (start != end) {
            //利用end，从后往前开始找，找比基准数小的数字
            //start end循环顺序不可以交换 不然容易出错
            while (true) {
                if(start >= end || arr[end] < baseNumber){
                    break;
                }
                end--;
            }
            //利用start，从前往后找，找比基准数大的数字
            while (true) {
                if(start >= end || arr[start] > baseNumber){
                    break;
                }
                start++;
            }
            //把end和start指向的元素进行交换
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        //基准数归位:一开始i就是start 下面要递归与这个范围第一个元素进行交换
        int temp = arr[start];
        arr[start] = arr[i];
        arr[i] = temp;
        //递归
        quickSort(arr, i, start - 1);
        quickSort(arr, start + 1, j);
    }
    //方法:遍历数组
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
