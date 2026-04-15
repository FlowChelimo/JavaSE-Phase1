package com.chelimo.A01myCollection.a06bigintegerdemo;

public class bigIntegerDemo2 {
    public static void main(String[] args) {
        //Biginteger的常见方法
        //注:Biginteger是对象，是不可以直接进行加减乘除的，必须依靠方法实现
        /*
        public BigInteger add(BigInteger val                        加法
        public BigInteger subtract(BigInteger val)                  减法
        public BigInteger multiply(BigInteger val)                  乘法
        public BigInteger divide(BigInteger val)                    除法，获取商
        public BigInteger[] divideAndRemainder(BigInteger val)      除法，获取商和余数
        public boolean equals(object x)                             比较是否相同
        public BigInteger pow(int exponent)                         次幂
        public BigInteger max/min(BigInteger va1)                   返回较大值/较小值
        public int intValue(BigInteger val)                         转为int类型整数，超出范围数据有误
        */

        //Biginteger比较大小时，会返回较大的值，并没有创建新的对象
        //Biginteger.LongValue:转化为long类型
        //Biginteger.doubleValue:转化为Double类型
    }
}
