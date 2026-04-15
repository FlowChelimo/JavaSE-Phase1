package a01codeblock;

public class Student {
    private String name;
    private int age;

    //构造方法块
    //写在成员位置的代码块
    //作用:可以把多个构造方法中重复的代码抽取出来
    //执行时机:我们在创建本类对象的时候会先执行构造代码块再执行构造方法
    //渐渐淘汰了 写法太死了不够灵活 写了就一定会执行
    {
        System.out.println("开始创建对象了");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
