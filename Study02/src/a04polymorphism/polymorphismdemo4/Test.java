package a04polymorphism.polymorphismdemo4;

public class Test {
    public static void main(String[] args) {
//        person p1 = new person();
//        p1.setAge(30);
//        p1.setName("老王");
//        person p2 = new person();
//        p2.setAge(25);
//        p2.setName("老李");
//        Dog d = new Dog();
//        d.setAge(2);
//        d.setColor("黑颜色的");
//        Cat c = new Cat();
//        c.setAge(3);
//        c.setColor("灰颜色的");
//        p1.keepPet(d,"骨头");
//        p2.keepPet(c,"三文鱼");
        person p1 = new person("老王", 30);
        person p2 = new person("老李", 25);
        Dog d = new Dog(2,"黑颜色的");
        Cat c = new Cat(3,"灰颜色的");
        p1.keepPet(d,"骨头");
        p2.keepPet(c,"三文鱼");
    }
}
