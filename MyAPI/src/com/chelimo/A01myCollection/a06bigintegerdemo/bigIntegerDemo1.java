package com.chelimo.A01myCollection.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class bigIntegerDemo1 {
    public static void main(String[] args) {
        /*
        public BigInteger(int num, Random rnd)      获取随机大整数，范围:[0~2的num次方-1]
        public BigInteger(string val)               获取指定的大整数
        public BigInteger(string val,int radix)     获取指定进制的大整数

        public static BigInteger valueOf(long val)  静态方法获取BigInteger的对象，内部有优化
        细节:
        对象一旦创建里面的数据不能发生改变。
        */

        //1.获取随机大整数
        Random r = new Random();
        BigInteger b1 = new BigInteger(4,r);//范围0 ~ 2^4-1
        System.out.println("1-- "+b1);

        //2.获取指定大正整数
        BigInteger b2 = new BigInteger("100");
        System.out.println("2--" + b2);

        //3.获取指定进制的大整数
        BigInteger b3 = new BigInteger("110",2);
        System.out.println("3--" + b3);

        //4.静态方法获取Biginteger对象，内部有优化
        //细节
        //能表示的范围比较小，在long的取值范围之内，如果超出long范围就不行了
        System.out.println("4：");
        BigInteger b4 = BigInteger.valueOf(1);//1
        BigInteger b5 = BigInteger.valueOf(9223372036854775807L);//后面加L表示是long类型
        System.out.println("long最大值" + Long.MAX_VALUE);

        //5.对象一旦创建内部的数据不能发生改变
        System.out.println("5：");
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10= BigInteger.valueOf(2);
        BigInteger result=bd9.add(bd10);
        System.out.println(result);//3
        //此时，不会修改参与计算的BigInteger对象中的值，而是产生了一个新的BigInteger对象记录3
        System.out.println(bd9 == result);//false
        System.out.println(bd10 == result);//false
    }
}
