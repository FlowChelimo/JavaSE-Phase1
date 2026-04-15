package com.chelimo.A01myCollection.a02SystemDemo;

public class MathDemo3 {
    public static void main(String[] args) {
       long startTime = System.currentTimeMillis();
       //找出一到一万之间所有的质数
        for (int i = 0; i < 10000; i++) {
            boolean flag = isPrime2(i);
            if (flag) {
                System.out.println(i);
            }
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("time is: " + time + "毫秒");
        //老方法：用了14毫秒
        //新方法：用了6毫秒，新方法更快
    }

    //判断数字是否为质数
    //老方法
    public static boolean isPrime1(int number){
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    //新方法
    public static boolean isPrime2(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}