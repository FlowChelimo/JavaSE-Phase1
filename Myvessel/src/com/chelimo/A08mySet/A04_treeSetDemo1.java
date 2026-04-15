package com.chelimo.A08mySet;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Consumer;

public class A04_treeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        System.out.println(ts);

        System.out.println("======迭代器遍历=====");
        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("======增强for遍历=====");
        for (Integer t : ts) {
            System.out.println(t);
        }

        System.out.println("======lambda表达式遍历=====");
        ts.forEach((Integer t)-> System.out.println(t));

    }
}
