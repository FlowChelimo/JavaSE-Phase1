package com.chelimo.A08mySet;

import java.util.TreeSet;

public class A04_treeSetDemo4 {
    public static void main(String[] args) {
        /*需求:创建5个学生对象
        属性:(姓名,年龄，语文成绩,数学成绩,英语成绩),
        按照总分从高到低输出到控制台
        如果总分一样，按照语文成绩排
        如果语文一样，按照数学成绩排
        如果数学成绩一样，按照英语成绩排
        如果英文成绩一样，按照年龄排
        如果年龄一样，按照姓名的字母顺序排
        如果都一样，认为是同一个学生，不存。

        第一种：默认排序/自然排序
               在Student类中实现Comparable<Student2>接口
        第二种：比较器排序
               创建treeSet对象的时候，在小括号中传递比较器的对象
               如果JavaBean中没有定义总分属性，但是想在控制台看到总分
               可以在遍历方法中或ToString中修改打印三门学科分数之和总分
         */
        Student2 s1 = new Student2("zhangsan",23,90,80,70,240);
        Student2 s2 = new Student2("lisi",20,90,75,60,225);
        Student2 s3 = new Student2("wangwu",17,90,80,60,230);
        Student2 s4 = new Student2("zhaoliu",14,90,90,70,250);
        TreeSet<Student2> ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
//        System.out.println(ts);
        for (Student2 t : ts) {
            System.out.println(t);
        }


    }
}
