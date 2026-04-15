package com.chelimo.A01myCollection.a07bigdecimalDemo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class bigDecimalDemo2 {
    public static void main(String[] args) {
        /*
        public BigDecimal add(BigDecimal val)                           加法
        public BigDecimal subtract(BigDecimal val)                      减法
        public BigDecimal multiply(BigDecimal val)                      乘法
        public BigDecimal divide(BigDecimal val)                        除法
        public BigDecimal divide(BigDecimal val，精确几位，舍入模式)       除法
         */

        BigDecimal b1 = new BigDecimal("10.0");
        BigDecimal b2 = new BigDecimal("3.0");

        BigDecimal bd1 = new BigDecimal("10.0");
        BigDecimal bd2 = new BigDecimal("4");

        BigDecimal b3 = b1.add(b2);//加法
        System.out.println(b3);

        BigDecimal b4 = b1.subtract(b2);//减法
        System.out.println(b4);

        BigDecimal b5 = b1.multiply(b2);//乘法
        System.out.println(b5);

        BigDecimal b6 = bd1.divide(bd2);//除法--能除尽
        System.out.println(b6);

        BigDecimal b7 = b1.divide(b2, 2, RoundingMode.HALF_UP);//除法
//        BigDecimal b8 = b1.divide(b2, 2, BigDecimal.ROUND_HALF_UP);   老版本
        System.out.println(b7);
    }
}
