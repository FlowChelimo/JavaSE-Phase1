package com.chelimo.A01myCollection;

import java.util.ArrayList;
import java.util.Collection;

public class A01_myCollectionDemo1 {
    public static void main(String[] args) {
        /*
        public boolean add(E e)                 添加
        public void clear()      t               清空
        public boolean remove(E e)              删除
        public boolean contains(object obj)     判断是否包含
        public boolean isEmpty()                判断是否为空
        public int size()                       集合长度
         */

        //注意点:
        //Collection是一个接口，我们不能直接创建它的对象
        //所以我们现在学习它的方法时，只能创建它实现类的对象
        //实现类:Arraylist

        //目的:为了学习Collection里面的方法

        //1.添加元素
        //细节1:如果我们要往List系列集合中添加数据，那么方法永远返回true，因为List系列的是允许元素重复的。
        //细节2:如果我们要往set系列集合中添加数据，
        //如果当前要添加元素不存在，方法返回true，表示添加成功。
        //如果当前要添加的元素已经存在，方法返回false，表示添加失败。
        //因为set系列的集合不允许重复。
        Collection c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        System.out.println(c);//[aaa, bbb, ccc]打印集合时Java会自动调用toString方法
        //2.清空
//        c.clear();
//        System.out.println(c);     //[]

        //3.删除
        //细节1:因为collection里面定义的是共性的方法，所以此时不能通过索引进行删除。只能通过元素的对象进行删除 hashset set没有索引下标
        //细节2:方法会有一个布尔类型的返回值，删除成功返回true，删除失败回false
        //如果要删除的元素不存在，就会删除失败。
        c.remove("bbb");
        c.remove("ccc");
        System.out.println(c);

        //4.判断元素是否包含
        //细节:底层是依赖equals方法进行判断是否存在的。
        //所以，如果集合中存储的是的定义对象，也想通过contains方法来判断是否包含，那么在javabean类中，一定要重写equals方法。
        boolean result = c.contains("ccc");
        System.out.println(result);//false

        //5.判断是否为空
        System.out.println(c.isEmpty());//false   集合c不为空
        //选中isEmpty  右键 --> 转到 --> 实现 --> 选util

        //6.获取集合的长度
        System.out.println(c.size());
    }
}
