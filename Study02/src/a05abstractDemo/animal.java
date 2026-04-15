package a05abstractDemo;

public abstract class animal {
    //编写带有抽象类的标准avab2an类
    //青蛙frog               属性:名字，年龄     行为:吃虫子，喝水
    //狗Dog                  属性:名字，年龄     行为:吃骨头，喝水
    //山羊Sheep              属性:名字，年龄     行为:吃艹，喝水
    String name;
    int age;

    public animal() {
    }

    public animal(String name, int age) {
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
    public void drink(){
        System.out.println("动物在喝水");
    }
    public abstract void eat();
}
