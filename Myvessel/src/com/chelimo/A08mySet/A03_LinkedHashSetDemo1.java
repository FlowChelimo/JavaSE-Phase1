package com.chelimo.A08mySet;

import java.util.LinkedHashSet;

public class A03_LinkedHashSetDemo1 {
    static void main() {
        //LinkedHashSet
        //底层加了一条双向链表 所以遍历的顺序和添加的顺序相同
        Student s1 = new Student("张三",23);
        Student s2 = new Student("李四",20);
        Student s3 = new Student("王五",18);
        Student s4 = new Student("张三",23);
        LinkedHashSet<Student> hs = new LinkedHashSet<Student>();
        System.out.println(hs.add(s1));//true
        System.out.println(hs.add(s2));//true
        System.out.println(hs.add(s3));//true
        System.out.println(hs.add(s4));//false
        System.out.println(hs);
        //顺序和添加的顺序相同
        //[Student{name = 张三, age = 23}, Student{name = 李四, age = 20}, Student{name = 王五, age = 18}]
    }
}
