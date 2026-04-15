package com.chelimo.A01myCollection.a04objectDemo;

public class objectDemo1 {
    public static void main(String[] args) {
        /*
        public string toString()            返回对象的字符串表示形式
        public boolean equals(object obj)    比较两个对象是否相等
        protected object clone(int a)       对象克隆
        */
        Student stu = new Student("John Doe", 23);
        Object o = new Object();
        String s = o.toString();
        String s1 = stu.toString();
        System.out.println(s);//java.lang.Object@23fc625e
        System.out.println(o);//java.lang.Object@23fc625e

        System.out.println(s1);//Student类中重写了toString方法     (Ptg To JavaBean)

    }
}
