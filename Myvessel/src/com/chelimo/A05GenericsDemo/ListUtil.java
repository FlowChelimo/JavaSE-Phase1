package com.chelimo.A05GenericsDemo;

import java.util.List;

public class ListUtil {
    private ListUtil() {}

    public static <E> void addAll1(List<E> list, E e1, E e2, E e3, E e4) {
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
    public static <E> void addAll2(List<E> list, E...elements) {
        for(E element : elements) {
            list.add(element);
        }
    }
    public void show(){
        System.out.println("看看我执行了没");
    }
}
