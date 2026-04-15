package a01extends.oopExtendsDemo4;

public class student extends person {
    public student() {
        super();
        System.out.println("子类的无参构造");
    }
    public student(String name,int age) {
        super(name, age);
    }
}
