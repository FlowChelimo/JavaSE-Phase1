package a04polymorphism.polymorphismdemo1;

public class administrator extends person{
    @Override
    public void show() {
        System.out.println("管理员的姓名为: " + name + ", 年龄为 " + age);
    }
}
