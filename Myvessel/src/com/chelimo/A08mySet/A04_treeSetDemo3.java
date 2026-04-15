package com.chelimo.A08mySet;

import java.util.Comparator;
import java.util.TreeSet;

public class A04_treeSetDemo3 {
    public static void main(String[] args) {
        /*需求:请自行选择比较器排序和自然排序两种方式:
        要求:存入四个字符串，“c”,“ab”,“df”,“qwer”
        按照长度排序，如果一样长则按照首字母排序

        采取第二种方式 比较器排序
        */
        //1.创建集合
        //o1:表示当前要添加的元素
        //o2:表示已经在红黑树存在的元素
        //返回值规则跟之前是一样的
        TreeSet<String> ts = new TreeSet<>((o1, o2) ->{
                //按照长度进行排序
                int i = o1.length() - o2.length();
                //如果长度相同，则按照首字母排序
                i = i == 0 ? o1.compareTo(o2) : i;
                return i;
            }
        );
        ts.add("qwer");
        ts.add("df");
        ts.add("ab");
        ts.add("c");
        System.out.println(ts);
    }
}
