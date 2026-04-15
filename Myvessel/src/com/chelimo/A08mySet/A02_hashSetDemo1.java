package com.chelimo.A08mySet;

public class A02_hashSetDemo1 {
    static void main() {
        /*哈希值:
        对象的整数表现形式
        1.如果没有重写hashcode方法，不同对象计算出的哈希值是不同的
        2.如果已经重写hashcode方法，不同的对象只要属性值相同，计算出的哈希值就是一样的
        3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样。(哈希碰撞)
         */
        Student s1 = new Student("张三",23);
        Student s2 = new Student("张三",23);

        //1.如果没有重写hashcode方法，不同对象计算出的哈希值是不同的
//        System.out.println(s1.hashCode());//1067040082
//        System.out.println(s2.hashCode());//1325547227

        //重写方法后
        System.out.println(s1.hashCode());//24022543
        System.out.println(s2.hashCode());//24022543

        //3.但是在小部分情况下，不同的属性值或者不同的地址值计算出来的哈希值也有可能一样
        // 哈希碰撞
        String str1 = "abc";
        String str2 = "acD";
        System.out.println(str1.hashCode());//96354
        System.out.println(str2.hashCode());//96354
    }
}
