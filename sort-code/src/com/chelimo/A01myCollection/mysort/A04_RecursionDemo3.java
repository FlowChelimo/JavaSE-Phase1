package com.chelimo.A01myCollection.mysort;

public class A04_RecursionDemo3 {
    public static void main(String[] args) {
        /*练习
        递归求阶乘
        需求:用递归求5的阶乘，并把结果在控制台输出
         */
        Integer n = 5;
        System.out.println("5的阶乘是" + getFactorialRecursion(n));
    }
    public static int getFactorialRecursion

            (int number) {
        if (number == 1) {
            return 1;
        }
        return number * getFactorialRecursion(number - 1);
    }
}
