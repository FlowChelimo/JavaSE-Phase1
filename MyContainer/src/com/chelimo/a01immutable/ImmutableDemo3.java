package com.chelimo.a01immutable;

import java.util.Map;
import java.util.Set;

public class ImmutableDemo3 {
    static void main() {
        //创建Map不可变集合
        //细节1:
        //   键是不可以重复的
        //细节2:
        //   Map里面的of方法，参数是有上限的，最多只能传递20个参数，10个键值对
        //   原因：前面几个可以传多个，因为形参只有一个（这里有键和值两个），可变参数必须写在最后面，且只能写一个
        //细节3:
        //   如果我们要传递多个键值对对象，数量大于10个，Map中还有一个方法
        Map<String, String> map = Map.of("张三", "北京", "李四", "上海",
                "王五", "广州", "赵六", "深圳");
        //会自动配对成键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
