package a04polymorphism.polymorphismdemo1;

public class student extends person {
    @Override
    public void show() {
        System.out.println("学生的姓名为: " + name + ", 年龄为 " + age);
    }
}
