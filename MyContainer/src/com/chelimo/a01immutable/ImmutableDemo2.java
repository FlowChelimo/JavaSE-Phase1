package com.chelimo.a01immutable;

import java.util.Iterator;
import java.util.Set;

public class ImmutableDemo2 {
    static void main() {
        //Set
        //细节:当我们要获取一个不可变Set集合时,里面的参数一定要保证唯一性
        Set<String> set = Set.of("张三", "李四", "王五", "赵六");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("==============");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
