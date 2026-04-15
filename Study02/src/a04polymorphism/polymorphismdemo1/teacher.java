package a04polymorphism.polymorphismdemo1;

public class teacher extends person {
    @Override
    public void show() {
        System.out.println("老师的姓名为: " + name + ", 年龄为 " + age);
    }
}
