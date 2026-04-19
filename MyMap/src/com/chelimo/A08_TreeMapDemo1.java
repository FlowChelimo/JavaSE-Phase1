package com.chelimo;

import java.util.Comparator;
import java.util.TreeMap;

public class A08_TreeMapDemo1 {
    static void main() {
        /*TreeMap
        TreeMap跟TreeSet底层原理一样，都是红黑树结构的，
        由键决定特性:不重复、无索引、可排序
        可排序:对键进行排序。
        注意:默认按照键的从小到大进行排序，也可以自己规定键的排序规则
                TreeMap基本应用
                --代码书写两种排序规则
                --实现Comparable接口，指定比较规则。
                --创建集合时传递Comparator比较器对象，指定比较规则。

                //Integer Double 默认情况下都是按照升序排列的
                //string 按照字母再ASCII码表中对应的数字升序进行排列

        需求1:
            键:整数表示id
            值:字符串表示商品名称
            要求:按照id的升序排列、按照id的降序排列*/
//        TreeMap <Integer,String> treeMap = new TreeMap();
//        treeMap.put(5,"sweet");
//        treeMap.put(10,"cap");
//        treeMap.put(70,"fish");
//        System.out.println(treeMap);//{5=sweet, 10=cap, 70=fish}
                                    //自动排好顺序，Integer源码实现了Comparable接口

                                                //创建集合时传递Comparator比较器对象，指定比较规则。
        TreeMap <Integer,String> treeMap = new TreeMap(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //o1:表示要添加的元素
                //o2:表示在红黑树中已经存在的元素
                return o2 - o1;
            }
        });
        treeMap.put(5,"sweet");
        treeMap.put(10,"cap");
        treeMap.put(70,"fish");
        System.out.println(treeMap);
    }
}
