package a04polymorphism.polymorphismdemo1;

public class person {
    String name;
    int age;

    public person() {
    }

    public person(String name, int age) {
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
    public void show() {
        System.out.println("姓名为: " + name + ", 年龄为 " + age);
    }
}
