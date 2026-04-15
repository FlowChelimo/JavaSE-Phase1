package com.chelimo.A01myCollection.mysort;

public class A02_SelectionDemo1 {
    public static void main(String[] args) {
        /*选择排序:
        1，从0索引开始，跟后面的元素一一比较。
        2，小的放前面，大的放后面。
        3，第一次循环结束后，最小的数据已经确定。
        4，第二次循环从1索引开始以此类推。
         */
        //1.定义数组
        int[] arr = {3, 5, 1, 4, 2, 7, 9, 8, 6};
        //1.改进前 每次比较大小如果符合就会交换 效率较低
        /*
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1 ; j < arr.length ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }*/
       //2.改进后
        for (int i = 0; i < arr.length - 1; i++) {
            //先定义一个变量假设它最小，内循环遍历后面数据找到最小，外循环结束一次交换一次
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if (arr[min] > arr[j]) {//不能写成arr[i] > arr[j] 因为arr[i]的值全程不会改变会出错 逻辑直接乱掉：
                    min = j;            //你本来要往前挨个比、找插入位置 结果变成：只单纯和「当前i位置」比一次
                }                       //前面排好的有序区间直接废掉 顺序全错，排序失败
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
        printArr(arr);
    }
    //方法--遍历数组
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
