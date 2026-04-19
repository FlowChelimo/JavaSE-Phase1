package com.chelimo;

import com.sun.source.tree.Tree;

import java.util.TreeMap;

public class A08_TreeMapDemo2 {
    static void main() {
        /*TreeMap
        TreeMap跟TreeSet底层原理一样，都是红黑树结构的，
        由键决定特性:不重复、无索引、可排序
        可排序:对键进行排序。
        注意:默认按照键的从小到大进行排序，也可以自己规定键的排序规则
        /*TreeMap基本应用
        需求2:
            键:学生对象
            值:籍贯
            要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人*/

        TreeMap <Student,String> map = new TreeMap();
        Student s1 = new Student("zhangsan", 18);
        Student s2 = new Student("lisi", 19);
        Student s3 = new Student("wangwu", 20);
        Student s4 = new Student("wangwu", 20);
        map.put(s1,"上海");
        map.put(s2,"北京");
        map.put(s3,"杭州");
        System.out.println(map);
    }
}
