package com.chelimo.A02myList;

import java.util.ArrayList;
import java.util.List;

public class A01_ListDemo01 {
    public static void main(String[] args) {
        //List 继承于 collection
        /*List系列集合独有的方法:
        void add(int index,E element)       在此集合中的指定位置插入指定的元素
        E remove(int index)                 删除指定索引处的元素，返回被删除的元素
        E set(int index,E element)          修改指定索引处的元素，返回被修改的元素
        E get(int index)                    返回指定索引处的元素
         */

        List <String> l = new ArrayList();
        l.add("a");
        l.add("b");
        l.add("c");
        //1.在此集合中的指定位置插入指定的元素  后面的元素索引会往后移动一
        l.add(1,"g");
        System.out.println(l);
        //2.删除指定索引处的元素，返回被删除的元素
        String remove = l.remove(1);//方法会返回被删除的元素
        System.out.println(l);
        //3.修改指定索引处的元素，返回被修改的元素
        String d = l.set(0, "aaa");//方法会返回被修改的元素
        System.out.println(l);
        //4.返回指定索引处的元素
        String s = l.get(0);
        System.out.println(s);
    }
}
