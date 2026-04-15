package com.chelimo.A01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A03_myCollectionDemo3 {
    static void main() {
        /*
        Collection系列集合三种通用的遍历方式:
        1.迭代器遍历
        2.增强for遍历
        3.lambda表达式遍历

        迭代器遍历相关的三个方法:
        Iterator<Exiterator()   :获取一个迭代器对象
        boolean hasNext()       :判断当前指向的位置是否有元素
        E next()                :获取当前指向的元素并移动指针
         */

        //1.创建迭代器对象
        Collection <String> c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        //2.获取迭代器对象
        //  迭代器就像一个箭头，默认指向集合的零索引处
        Iterator<String> it = c.iterator();
        //利用循环不断获取集合中每一个元素
        while(it.hasNext()){
            //底层迭代器做了两件事情:获取元素并移动指针
            System.out.println(it.next());
        }
    }
}
