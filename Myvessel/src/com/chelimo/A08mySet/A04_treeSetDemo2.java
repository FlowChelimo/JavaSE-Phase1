package com.chelimo.A08mySet;

import java.util.TreeSet;

public class A04_treeSetDemo2 {
    public static void main(String[] args) {
        /*需求:创建Treeset集合，并添加3个学生对象
        学生对象属性:
        姓名，年龄。
        要求按照学生的年龄进行排序
        同年龄按照姓名字母排列(暂不考虑中文)
        同姓名，同年龄认为是同一个人

        方式一:
        默认的排序规则/自然排序
        Student实现comparable接口，重写里面的抽象方法，再指定比较规则
         */
        //直接添加Student类会报错
        //解决方法 ： 在Student类中实现Comparable接口

        TreeSet<Student> ts = new TreeSet<>();
        Student s1 = new Student("mike",23);
        Student s2 = new Student("marry",20);
        Student s3 = new Student("juke",18);
        ts.add(s1);
        ts.add(s3);
        ts.add(s2);
        System.out.println(ts);



    }
}
