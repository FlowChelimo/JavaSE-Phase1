package com.chelimo.A01myCollection.mysort;

public class A03_InsertDemo1 {
    public static void main(String[] args) {
        /*
        插入排序:
        将0索引的元素到N索引的元素看做是有序的，把N+1索引的元素到最后一个当成是无序的。
        遍历无序的数据，将遍历的元素插入有序序列中适当的位置，如遇到相同数据，插在后面。
        N的范围:0~最大索引
         */
        int [] arr = {3,44,38,5,47,15,36,26,27,2,46,4,19,50,48};
        //如果数组完全正确，startIndex会保持值-1，避免对已有序数组做无效操作
        //先找到无序开始的索引
        int startIndex = -1;
        for ( int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[i+1]){
                startIndex = i + 1;//从二索引开始无序
                break;
            }
        }
        //遍历依次得到无序数组里面的每一个数据
        for (int i = startIndex; i < arr.length; i++) {
            int j = i;
            //j>0 保护j-1不会变成-1
            while(j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        printArr(arr);
    }
    //方法:遍历数组
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
