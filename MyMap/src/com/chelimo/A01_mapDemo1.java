package com.chelimo;

import java.util.HashMap;
import java.util.Map;

public class A01_mapDemo1 {
    static void main() {
        //map的添加put方法 什么时候返回null 什么时候添加/覆盖

        /*   注:hashmap完全无序
        V put(K key,V value)                    添加元素
        V remove(object key)                    根据键删除键值对元素
        void clear()                            移除所有的键值对元素
        boolean containsKey(object key)         判断集合是否包含指定的键
        boolean containsValue(object value)     判断集合是否包含指定的值
        boolean isEmpty()                       判断集合是否为空
        int size()                              集合的长度，也就是集合中键值对的个数
         */
        Map <String,String> map = new HashMap();
        //2.添加元素
        //put方法的细节:
        //添加/覆盖
        //在添加数据的时候，如果键不存在，那么直接把键值对对象添加到map集合当中,方法返回nu11
        //在添加数据的时候，如果键是存在的，那么会把原有的键值对对象覆盖，会把被覆盖的值进行返回。
        System.out.println("=====添加元素=====");
        String s1 = map.put("1", "一");
        System.out.println(s1);//null
        map.put("2", "二");
        map.put("3", "三");
        String s2 = map.put("1", "四");
        System.out.println(s2);//一
        System.out.println(map);
        System.out.println("=====根据键删除键值对元素=====");
        String r = map.remove("1");
        System.out.println(r);
        System.out.println("=====移除所有键值对元素=====");
//        map.clear();
//        System.out.println(map);//{}
        System.out.println("=====判断集合是否包含指定的键 / 值=====");
        boolean b1 = map.containsKey("2");
        System.out.println(b1);
        boolean b2 = map.containsValue("四");
        System.out.println(b2);

        System.out.println("=====判断集合是否为空=====");
        boolean empty = map.isEmpty();
        System.out.println(empty);

        System.out.println("=====集合长度=====");
        System.out.println(map.size());//2
    }
}
