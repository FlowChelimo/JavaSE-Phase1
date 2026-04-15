package com.chelimo.A06GenericsDemo;

import java.util.ArrayList;

public class A01_GenericsDemo1 {
    //泛型不具备继承性 而数据具备继承性
    public static void main(String[] args) {
        Ye ye = new Ye();
        Fu fu = new Fu();
        Zi zi = new Zi();
        ArrayList<Ye> list1 = new ArrayList();
        ArrayList<Fu> list2 = new ArrayList();
        ArrayList<Zi> list3 = new ArrayList();
        ArrayList<Student> list4 = new ArrayList();

        //1.泛型不具备继承性
        Method(list1);
      //Method(list2);  报错
      //Method(list3);  报错
        Method1(list4);//利用泛型方法 弊端 可以接收任意的数据类型

        //2.数据具备继承性   不会报错
        list1.add(ye);
        list1.add(fu);
        list1.add(zi);

    }
    public static void Method(ArrayList<Ye> list){
    }
    //利用泛型方法  弊端 可以接收任意的数据类型
    public static <E> void Method1(ArrayList<E> list){
    }

    //泛型的通配符 (只可以接收 Ye Fu Zi)
    public static  void Method3(ArrayList<? extends Ye> list){
    }
    //泛型的通配符 (只可以接收 Fu Ye)
    public static  void Method4(ArrayList<? super Fu> list){
    }
}
class Ye {}
class Fu extends Ye {}
class Zi extends Fu {}
class Student {}
