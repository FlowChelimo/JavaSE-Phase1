package com.chelimo.A02myList;

import java.util.ArrayList;
import java.util.List;

public class A02_ListDemo02 {
    public static void main(String[] args) {
        //List系列集合中的两个删除的方法
        //1.直接删除元素
        //2.通过索引进行删除
        List <Integer> li = new ArrayList();
        li.add(1);
        li.add(2);
        li.add(3);

        //2.删除元素
        li.remove(1);       //[1, 3]
        System.out.println(li);
        //请问:此时删除的是1这个元素，还是1索引上的元素?
        //为什么?
        //因为在调用方法的时候，如果方法出现了重载现象
        //优先调用，实参跟形参类型一致的那个方法。
        li.add(1,2);

        //手动装箱
        Integer i = 1;
        li.remove(i);
        System.out.println(li);   //[2, 3]
        //优先调用，实参跟形参类型一致的那个方法!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    }
}
