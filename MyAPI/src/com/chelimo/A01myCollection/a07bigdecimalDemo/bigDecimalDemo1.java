package com.chelimo.A01myCollection.a07bigdecimalDemo;

import java.math.BigDecimal;

public class bigDecimalDemo1 {
    public static void main(String[] args) {
        /*
        构造方法获取BigDecimal对象
        public BigDecimal(double val)
        public BigDecimal(string val)
        静态方法获取BigDecimal对象
        public static BigDecimal valueOf(double val)
        */

        //1.通过传递double类型的小数来创建对象
        //细节:
        //这种方式有可能是不精确的，所以不建议使用
        BigDecimal b1 = new BigDecimal(0.01);
        BigDecimal b2 = new BigDecimal(0.09);
//        System.out.println(b1);
//        System.out.println(b2);

        //2.通过传递字符串表示的小数来创建对象
        BigDecimal b3 = new BigDecimal( "0.01");
        BigDecimal b4 = new BigDecimal( "0.09");
        BigDecimal b5 = b3.add(b4);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);

        //3.通过静态方法获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        BigDecimal bd7 = BigDecimal.valueOf(10);
        System.out.println(bd6);
        System.out.println(bd6 == bd7);//整数---true
        BigDecimal bd8 = BigDecimal.valueOf(10.0);
        BigDecimal bd9 = BigDecimal.valueOf(10.0);
        System.out.println(bd8 == bd9);//Double---false

        //细节
        //1.如果要表示的数字不大，没有超出double的取值范围，建议使用静态方法
        //2.如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法
        //3.如果我们传递的是8~10之间的整数，包含0，包含10，那么方法会返回己经创建好的对象，不会重新new




    }
}
