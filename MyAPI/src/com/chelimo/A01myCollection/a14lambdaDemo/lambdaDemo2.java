package com.chelimo.A01myCollection.a14lambdaDemo;

public class lambdaDemo2 {
    public static void main(String[] args) {
        /*
        Lambda表达式的注意点:
        1.Lambda表达式可以用来简化匿名内部类的书写
        2.Lambda表达式只能简化函数式接口的匿名内部类的写法
        3.函数式接口:
            有且仅有一个抽象方法的接口叫做函数式接口，接口上方可以加@FunctionalInterface注解
         */

        //1.利用匿名内部类的形式去调用下面的方法
        //调用一个方法的时候，如果方法的形参是一个接口，那么我们要传递这个接口的实现类对象
        //如果实现类对象只要用到一次，就可以用医名内部类的形式进行书写

        method(
                () -> {
            System.out.println("正在游泳");
        });
    }
    public static void method(swim s){
        s.swim();//必须写！！！！！！！！上面的lambda表达式(改写了抽象方法)
    }            //如果不写，上面lambda表达式里面就是死语句，不会执行
}
interface swim{
    abstract void swim();
}
