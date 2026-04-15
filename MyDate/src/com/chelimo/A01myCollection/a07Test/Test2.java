package com.chelimo.A01myCollection.a07Test;

public class Test2 {
    public static void main(String[] args) {
        /*
        自己实现parseInt方法的效果，将字符串形式的数据转成整数。
        要求:
        字符串中只能是数字不能有其他字符
        最少一位，最多10位
        0不能开头
         */

        //1.定义一个字符串
        String str = "123456789";
        //2.校验字符串
        //习惯:会先把异常数据进行过滤，剩下来就是正常的数据。
        int count = 0;
        if(!str.matches("[1-9]\\d{1,9}")){
            System.out.println("字符串不符合规则");
        }else{
            for (int i = 0; i < str.length(); i++) {
                int a = str.charAt(i) - '0';
                count = a + count*10;
            }
        }
        System.out.println(count);
    }
}
