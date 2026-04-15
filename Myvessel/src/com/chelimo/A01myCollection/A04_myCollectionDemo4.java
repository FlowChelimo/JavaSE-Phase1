package com.chelimo.A01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class A04_myCollectionDemo4 {
    static void main() {
        /*
        迭代器的细节注意点:
            1.报错NoSuchElementException
            2.迭代器遍历完毕，指针不会复位
            3.循环中只能用一次next方法
            4.迭代器遍历时，不能用集合的方法进行增加或者删除
                暂时当做一个结论先行记忆，在今天我们会讲解源码详细的再来分析，
                如果我实在要删除:那么可以用迭代器提供的remove方法进行删除。
                如果我要添加，暂时没有办法。
         */

        //1.创建迭代器对象
        Collection <String> c = new ArrayList();
        c.add("aaa");
        c.add("bbb");
        c.add("ccc");
        c.add("ddd");
        c.add("eee");
        //2.获取迭代器对象
        //  迭代器就像一个箭头，默认指向集合的零索引处
        Iterator<String> it = c.iterator();
        //利用循环不断获取集合中每一个元素
        while(it.hasNext()){
            //底层迭代器做了两件事情:获取元素并移动指针
            System.out.println(it.next());//aaa ccc eee
            //System.out.println(it.next());//bbb ddd NoSuchElementException 没有这个元素异常

            //迭代器遍历时，不能用集合的方法进行增加或者删除
            //c.remove(it.next()); ConcurrentModificationException  并发修改异常
        }

        //后面已经没有元素了
        //System.out.println(it.next());//NoSuchElementException 翻译:没有这个元素异常 因为迭代器获取元素不依赖索引

        //迭代器遍历完毕，指针不会复位
        System.out.println(it.hasNext());//false
        System.out.println(it.hasNext());//false
        System.out.println(it.hasNext());//false

        //如果我们要第二次遍历集合，只能重新获取一个迭代器对象
        System.out.println("=================");
        Iterator<String> it2 = c.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}
