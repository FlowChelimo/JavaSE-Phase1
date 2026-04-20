package com.chelimo.a01immutable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ImmutableDemo1 {
    public static void main(String[] args) {
        /*
        创建不可变list集合   例如扑克牌里面的牌不变不可修改
         “张三”，“李四”，“王五”，“赵六”*/
        List <String> list = List.of("张三","李四","王五","赵六");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println("===================");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===================");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("===================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
