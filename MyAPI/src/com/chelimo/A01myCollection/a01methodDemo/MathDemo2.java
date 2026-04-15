package com.chelimo.A01myCollection.a01methodDemo;

public class MathDemo2 {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
    //改进---判断数字是否为质数
    public static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}