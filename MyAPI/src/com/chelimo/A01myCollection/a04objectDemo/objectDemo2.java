package com.chelimo.A01myCollection.a04objectDemo;

public class objectDemo2 {
    public static void main(String[] args) {
        /*
        public boolean equals(object obj)    比较两个对象是否相等
        */
        Student s1 = new Student("John Doe", 23);
        Student s2 = new Student("John Doe", 23);
        boolean flag =s1.equals(s2);
        System.out.println(flag);

        //结论:
        //1.如果没有重写equals方法，那么默认使用object中的方法进行比较，比较的是地址值是否相等
        //2.一般来讲地址值对于我们意义不大，所以我们会重写，重写之后比较的就是对象内部的属性值了。


    }
}
