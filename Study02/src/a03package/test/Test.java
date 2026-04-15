package a03package.test;

import a03package.domain1.Teacher;

public class Test {
    public static void main(String[] args) {
        //使用同一个包中的类时，不需要导包。
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);
        System.out.println(s.getAge() + " " + s.getName());

        //使用java.lang包中的类时，不需要导包。
        String s1 = "abc"; //可以选中String查看源代码 最上面
        System.out.println(s1);

        //其他情况都需要导包
        Teacher t = new Teacher(); //第三行

        //如果同时使用两个包中的同名类，需要用全类名
        Teacher t1 = new Teacher();
        a03package.domain2.Teacher t2 = new a03package.domain2.Teacher();
    }
}
