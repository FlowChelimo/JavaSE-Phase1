package com.chelimo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A02_mapDemo2 {
    static void main() {
        //map.keySet ----- 获得一个装所有键的set集合

        //map的第一种遍历方式 (键找值)
        Map <String,String> map = new HashMap();
        map.put("1","一");
        map.put("2","二");
        map.put("3","三");
        //增强for    ------     先获得所有键set集合
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.print(map.get(key) + " ");//一 二 三
        }
        //迭代器
        System.out.println();
        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()){
            System.out.print(map.get(it.next()) + " ");
        }
        //lambda表达式
        System.out.println();
        map.keySet().forEach((String k) -> System.out.print(map.get(k) + " "));
    }
}
