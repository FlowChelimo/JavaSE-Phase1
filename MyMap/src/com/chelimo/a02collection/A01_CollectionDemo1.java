package com.chelimo.a02collection;

import java.util.ArrayList;
import java.util.Collections;

public class A01_CollectionDemo1 {
    public static void main(String[] args) {
        /*
        public static<T>boolean addAll(collection<T>c,elements)     批量添加元素
        public static void shuffle(List<?> ,list)                   打乱List集合元素的顺序
         */
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        System.out.println(list);//[a, b, c, d, e]
        Collections.shuffle(list);
        System.out.println(list);//[e, a, b, c, d]
    }
}
