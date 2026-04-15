package com.chelimo.A01myCollection.mysort;

public class A01_BubbleDemo1 {
    public static void main(String[] args) {
        /*冒泡排序:
        核心思想:
        1，相邻的元素两两比较，大的放右边，小的放左边。
        2，第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推。
        3，如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以。
         */

        //1.定义数组
        int [] arr = {3,5,1,4,2,7,9,8,6};
        //外层控制循环五次
        for (int i = 0; i < arr.length; i++) {
            //内层每次循环次数减一，每次把最小的数放在后面
            for (int j = 0; j < arr.length - i - 1; j++) { //条件判断语句 j<arr.length-i-1 为了防止索引越界异常
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
