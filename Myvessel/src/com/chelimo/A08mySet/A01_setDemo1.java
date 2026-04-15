package com.chelimo.A08mySet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class A01_setDemo1 {
    static void main() {
        /*利用set系列的集合，添加字符串，并使用多种方式遍历
            迭代器
            增强for
            Lambda表达式
         */
        //set是一个接口，我们不能直接创建他的对象，但我们可以创建他实现类的对象
        //创建一个set集合的对象，元素不允许重复
        Set<String> s = new HashSet<String>();

        //如果当前元素是第一次添加，返回true,添加成功
        boolean b1 = s.add("张三");//true
        //如果当前元素是第一次添加，返回false,添加失败
        boolean b2 = s.add("张三");//false
        System.out.println(b1);
        System.out.println(b2);
//        System.out.println(s);//[张三]

        //无序性 (且无索引)
        s.add("李四");
        s.add("王五");
//        System.out.println(s);//[李四, 张三, 王五]

        //迭代器遍历
        System.out.println("==========迭代器遍历============");
        Iterator<String> it = s.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=======增强for遍历==============");

        //增强for遍历
        for (String str : s) {
            System.out.println(str);
        }
        System.out.println("========Lambda表达式=============");

        //Lambda表达式
        s.forEach((String str)-> System.out.println(str));
    }
}
