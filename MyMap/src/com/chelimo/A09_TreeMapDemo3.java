package com.chelimo;

import java.util.StringJoiner;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class A09_TreeMapDemo3 {
    static void main() {
        /*需求:字符串“aababcabcdabcde"
        请统计字符串中每一个字符出现的次数，并按照以下格式输出
        输出结果:a(5)b(4)c(3)d(2)e(1)

        统计：计数器思想
             弊端：如果要统计的变量比较多，要定义多个计数器很麻烦
       新的统计思想:利用map集合进行统计
        如果题目中没有要求对结果进行排序，默认使用HashMap
        如果题目中要求对结果进行排序，请使用TreeMap
        键:表示要统计的内容
        值:表示次数
        */
        String str = "aababcabcdabcde";
        TreeMap <Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //拿着字符串中每一个元素跟集合中的键进行比较
            //如果存在，值加一
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
                //如果不存在，值赋值为一
            }else{
                map.put(c,1);
            }
        }
//        StringBuilder
//        StringJoiner
        StringBuilder sb = new StringBuilder();
        map.forEach(( key, value) ->sb.append(key + "(" + value+")"));
        System.out.println(sb);
        StringJoiner sj = new StringJoiner("","","");
        map.forEach(( key, value) ->sj.add(key + "(" + value+")"));
        System.out.println(sj);
    }
}
