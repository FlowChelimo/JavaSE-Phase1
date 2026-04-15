package com.chelimo.A04GenericsDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class A01_GenericsDemo1 {
    static void main() {
        //没有泛型的时候，集合如何存储数据
        //结论:
        //如果我们没有给集合指定类型，默认认为所有的数据类型都是object类
        //此时可以往集合添加任意的数据类型。
        //带来一个坏处:我们在获取数据的时候，无法使用他的特有行为。
        //此时推出了泛型，可以在添加数据的时候就把类型进行统一
        //而且我们在获取数据的时候，也省的强转了，非常的方便。
        ArrayList list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add(new Student("张三",23));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            //多态的弊端是不能访问子类的特有功能
            //System.out.println(s.getAge());  class java.lang.String cannot be cast to class com.chelimo.A04GenericsDemo.Student
            System.out.println(it .next());
        }
    }
}
