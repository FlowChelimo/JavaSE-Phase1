package com.chelimo.A08mySet;

import java.util.HashSet;

public class A02_hashSetDemo2 {
    public static void main(String[] args) {
        /*需求:创建一个存储学生对象的集合，存储多个学生对象。
        使用程序实现在控制台遍历该集合。
        要求:学生对象的成员变量值相同，我们就认为是同一个对象*/

        //注意 如果对象是String Integer类型 则我们不需要重写JavaBean中的hashSet等方法 Java在底层已经帮我们写好了
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("张三",23);
        HashSet<Student> hs = new HashSet<Student>();
        System.out.println(hs.add(s1));//true
        System.out.println(hs.add(s2));//true
        System.out.println(hs.add(s3));//true
        System.out.println(hs.add(s4));//false
        System.out.println(hs);//[Student{name = 张三, age = 23}, Student{name = 王五, age = 18}, Student{name = 李四, age = 20}]


    }
}
