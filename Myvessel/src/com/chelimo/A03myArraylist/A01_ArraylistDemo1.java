package com.chelimo.A03myArraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class A01_ArraylistDemo1 {
    static void main() {
        ArrayList<String> l = new ArrayList();
        l.add("aaa");
        l.add("bbb");
        l.add("ccc");
        /*
        iterator():                     生成一个迭代器对象，默认指向集合的0索引处
        hasNext():                      判断当前指向的位置是否有元素
        next():                         1.获取元素  2.移动指针
         */
        Iterator<String> it = l.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
