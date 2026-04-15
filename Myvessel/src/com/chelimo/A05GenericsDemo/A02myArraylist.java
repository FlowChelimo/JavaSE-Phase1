package com.chelimo.A05GenericsDemo;

import java.util.ArrayList;

public class A02myArraylist {
    //泛型方法
    //修饰符 <类型> 返回值类型 方法名（）{}
    //public <T> void show (T t){}
    //此处T可以理解为一个变量 但是不是用来记录数据的 而是记录类型的 可以写成T E K V 等
    static void main() {
        //定义一个工具类:ListUtil
        //类中定义一个静态方法addAll，用来添加多个集合的元素。
        ArrayList <String> list = new ArrayList();
        ListUtil.addAll1(list,"1","2","3","4");
        System.out.println(list.toString());

        ArrayList <String> list1 = new ArrayList();
        ListUtil.addAll2(list1,"1","2","3","4","4","4","4","4","4","4");
        System.out.println(list1.toString());
    }
}
