package com.chelimo.A05GenericsDemo;

public class A01_GenericsDemo1 {
    public static void main(String[] args) {
//        myArraylist<String> list = new myArraylist<String>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        System.out.println(list.get(0));

        myArraylist<Integer> list = new myArraylist<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));
    }
}
