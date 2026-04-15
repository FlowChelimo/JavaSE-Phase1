package com.chelimo.A01myCollection.a05objectsDemo;

import java.util.Objects;

public class objects {
    public static void main(String[] args) {
        //Objects是一个工具类
        /*
        public static boolean equals(object a，object b)     先做非空判断，比较两个对象
        public static boolean isNull(object obj)            判断对象是否为nu11，为nu11返回true，反之
        public static boolean nonNull(object obj)           判断对象是否为nu11，跟isNu11的结果相反
        */

        //1.创建学生类的对象
        Student s1 = null;
        Student s2=new Student( "zhangsan",23);

        //2.比较两个对象的属性值是否相同

        /*
        if(s1 != nul1){
        boolean result=s1.equals(s2);
        System.out.println(result);
        }else{
        System.out.println("调用者为空");
        */

        boolean result = Objects.equals(s1,s2);
        System.out.println(result);

        //细节:
        //1.方法的底层会判断s1是否为nu11，如果为nu11，直接返回false
        //2.如果s1不为nu11，那么就利用s1再次调用equals方法
        //3.此时s1是student类型，所以最终还是会调用student中的equals方法。
        //  如果没有重写，比较地址值，如果重写了，就比较属性值。

        //判断对象是否为nu11，为nu11返回true，反之
        boolean result2 = Objects.isNull(s1);
        System.out.println(result2);

        //判断对象是否为nu11，跟isNu11的结果相反
        boolean result3 = Objects.isNull(s1);
        System.out.println(result3);
    }
}
