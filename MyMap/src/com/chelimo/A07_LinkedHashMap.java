package com.chelimo;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class A07_LinkedHashMap {
    static void main() {
        /*LinkedHashMap:
        由键决定:
            有序、不重复、无索引。
        有序:
            保证存储和取出的顺序一致
        原理:
            底层数据结构是依然哈希表，只是每个键值对元素又额外的多了一个双链表的机制记录存储的顺序*/
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("冷晖之枪:", "孙策");
        map.put("冷晖之枪:", "马超");
        map.put("雷霆之力:", "司空震");
        map.put("剑圣:", "宫本武藏");
        //双链表机制 有序
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            System.out.println(key + map.get(key));
        }
    }
}
