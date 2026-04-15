package com.chelimo.A01myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class A06_myCollectionDemo6 {
    public static void main(String[] args) {
        /*Collection系列集合三种通用的遍历方式:
        1.迭代器遍历
        2.增强for遍历           JDk5以后
        3.lambda表达式遍历       得益于JDK 8开始的新技术Lambda表达式，提供了一种更简单、更直接的遍历集合的方式。
        增强for格式:
        for(数据类型 变量名:集合/数组){

            }
        */
        Collection <String> c = new ArrayList();
        c.add("zhangsan");
        c.add("lisi");
        c.add("wangwu");
        //快捷:  c.for   回车
//        for (String s : c) {
//            System.out.println(s);
//        }
        for (String s : c) {
            s = "qqq";
        }
        System.out.println(c);//[zhangsan, lisi, wangwu]
                              //集合里的元素不会改变，因为s仅仅是一个第三方变量

        //3.lambda表达式遍历
        //匿名内部类方式
//        c.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        //lambda表达式
        c.forEach(s -> System.out.println(s)
        );
    }
}
