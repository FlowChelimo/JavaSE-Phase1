package com.chelimo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class A03_mapDemo3 {
    static void main() {
        //map.entrySet  获取装取键值对对象的set集合

        //map的第二种遍历方式 (键值对)
        Map <String,String> map = new HashMap();
        map.put("冷晖之枪:","马超");
        map.put("雷霆之力:","司空震");
        map.put("剑圣:","宫本武藏");
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println("==============");
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        System.out.println("==============");
        Iterator it = entries.iterator();
        while (it.hasNext()) {
            //默认获取的是object类，为了下面遍历此时需要强转
            Map.Entry<String, String> next = (Map.Entry<String, String>) it.next();
            System.out.println(next.getKey() + next.getValue());
        }
        System.out.println("==============");
        entries.forEach((Map.Entry<String, String> entry) -> System.out.println(entry.getKey() + entry.getValue()));
    }
}
