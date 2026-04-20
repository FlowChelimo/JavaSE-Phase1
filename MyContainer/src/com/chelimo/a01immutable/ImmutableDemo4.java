package com.chelimo.a01immutable;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ImmutableDemo4 {
    static void main() {
        //如果以后要创建Map的不可变集合，键值对的数量超过十个
        HashMap <String,String> hm= new HashMap<>();
        hm.put("张三","南京");hm.put("李四","北京");
        hm.put("王五","上海");hm.put("赵六","北京");
        hm.put("孙七","深圳");hm.put("周八","杭州");
        hm.put("吴九","宁波");hm.put("郑十","苏州");
        hm.put("刘一","无锡");hm.put("陈二","嘉兴");
        hm.put("aaa","111");

        //JDK10新
        Map<String, String> map1 = Map.copyOf(hm);            //======可以查看复习copyof源码=====
//        map1.put("222","bbb");//报错

        //获取所有键值对对象
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        Map.Entry[] arr1 = new Map.Entry[0];
        //toArray方法在底层会比较集合的长度跟数组的长度两者的大小
        //如果集合的长度 > 数组的长度 : 数据在数组中放不下，此时会根据实际数据的个数，重新创建数组
        //如果集合的长度<=数组的长度:数据在数组中放的下，此时不会创建新的数组，而是直接用
        Map.Entry[] arr2 = entries.toArray(arr1);
        //Map.ofEntries() 是 Java 9 新增的静态工厂方法，
        // 核心作用是：接收任意数量的 Map.Entry 对象，创建一个不可变（Immutable）的 Map 集合
        Map map = Map.ofEntries(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("===============================");

        Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        for (Map.Entry entry : objectObjectMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("===============================");
    }
}
