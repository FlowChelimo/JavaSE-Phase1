package com.chelimo.A02myList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class A03_ListDemo03 {
    public static void main(String[] args) {
        /*List系列集合的五种遍历方式:
        1.迭代器
        2.列表迭代器
        3.增强for
        4.Lambda表达式
        5.普通for循环  (因为List集合中存在索引)
         */
        List<String> l = new ArrayList();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        //1.迭代器遍历
        Iterator it = l.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();
        //2.增强for
        for (String s : l) {
            System.out.print(s + " ");
        }
        System.out.println();
        //3.Lambda表达式
        l.forEach(s -> System.out.print(s + " ")
        );
        System.out.println();
        //4.普通for循环  (因为List集合中存在索引)
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
        System.out.println();
        //5.列表迭代器 ListIterator
        //获取一个列表迭代器的对象，里面的指针默认也是指向0索引的
        //额外添加了一个方法:在遍历的过程中，可以添加元素
        ListIterator<String> listIterator = l.listIterator();
        while (listIterator.hasNext()) {
            String s = listIterator.next();
            //l.add(s);  不可以用集合方法添加元素会报错
            listIterator.add("ddd");
            //System.out.println(s + " ");
        }
        System.out.print(l);
    }
}
