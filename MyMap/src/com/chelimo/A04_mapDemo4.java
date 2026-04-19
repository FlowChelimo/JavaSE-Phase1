package com.chelimo;

import java.util.HashMap;
import java.util.Map;

public class A04_mapDemo4 {
    static void main() {
        //map的第三种遍历方式 (lambda表达式)

        //底层:
        //forEach其实就是利用第二种方式进行遍历，依次得到每一个键和值
        //再调用accept方法
        Map<String,String> map = new HashMap();
        map.put("冷晖之枪","马超");
        map.put("雷霆之力","司空震");
        map.put("剑圣","宫本武藏");
        map.forEach(( key,  value) -> System.out.println(key+":"+value));
    }
}
