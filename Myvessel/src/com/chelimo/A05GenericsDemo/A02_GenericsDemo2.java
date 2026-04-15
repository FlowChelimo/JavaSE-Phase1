package com.chelimo.A05GenericsDemo;

public class A02_GenericsDemo2 {
    public static void main(String[] args) {
        /*泛型接口的两种使用方式:
        1.实现类给出具体的类型
        2.实现类延续泛型，创建实现类对象时再确定类型
         */

        //1.实现类给出具体的类型                          第一种实现类型
        myArraylist2 obj = new myArraylist2();
//        obj.add(123);   会报错 因为123不是String类型

        //2.实现类延续泛型，创建实现类对象时再确定类型       第二种实现类型
        myArraylist3<String> obj2 = new myArraylist3();
    }
}
