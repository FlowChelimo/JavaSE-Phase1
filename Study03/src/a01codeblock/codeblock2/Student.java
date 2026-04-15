package a01codeblock.codeblock2;

public class Student {
    private String name;
    private int age;

//    执行时机:
//    随着类的加载而加载的，并且只执行一次
//    使用场景 在一些数据初始化时候可以使用 例如学生管理系统 刚开始录入一个学生张三
//            如果手动add录入 这部分代码会被写在方法里面 有可能被别人反复调用
//            那么集合就有可能被创建多个 学生被反复添加
    static{
        System.out.println("静态代码块执行了");
    }
    public Student() {
        System.out.println("空参构造");
    }

    public Student(String name, int age) {
        System.out.println("有参构造");
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
