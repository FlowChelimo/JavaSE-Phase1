package com.chelimo.A05GenericsDemo;

//当我在写一个类的时候，如果不确定类型，那么这个类就可以定义为泛型类
public class myArraylist<E> {
    //创建一个Object类型的数组
    Object [] obj = new Object [10];
    int size = 0;

    public boolean add(E e) {
        obj[size] = e;
        size++;
        return true;
    }

    public E get(int index) {
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
