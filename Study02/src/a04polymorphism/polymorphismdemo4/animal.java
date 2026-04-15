package a04polymorphism.polymorphismdemo4;

public class animal {

    private int age;
    private String color;

    public animal() {
    }

    public animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void eat(String food) {
        System.out.println("在吃" + food + "");
    }
}
class Dog extends animal {
    public Dog() {
        super();

    }
    public Dog(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的狗在吃" + food);
    }
}

class Cat extends animal {
    public Cat() {
        super();

    }
    public Cat(int age, String color) {
        super(age, color);
    }
    @Override
    public void eat(String food) {
        System.out.println(getAge() + "岁的" + getColor() + "颜色的猫在吃" + food);
    }
}
