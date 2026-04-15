package a04polymorphism.polymorphismdemo4;

public class person {
    private String name;
    private int age;

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
//    public void keepPet(Dog dog,String sb) {
//        System.out.println(getAge() + "岁的" + getName() + "养了一只" + dog.getColor()+dog.getAge()+"岁的宠物狗");
//        dog.eat(sb);
//    }
//    public void keepPet(Cat cat,String sb) {
//        System.out.println(getAge() + "岁的" + getName() + "养了一只" + cat.getColor()+cat.getAge()+ "岁的宠物猫");
//        cat.eat(sb);
//    }
    public void keepPet(animal a,String sb) {
        if(a instanceof Dog d){
            System.out.println(getAge() + "岁的" + getName() + "养了一只" + d.getColor()+d.getAge()+"岁的宠物狗");
            d.eat(sb);
        }else if(a instanceof Cat c){
            System.out.println(getAge() + "岁的" + getName() + "养了一只" + c.getColor()+c.getAge()+ "岁的宠物猫");
            c.eat(sb);
        }else{
            System.out.println("没有这种动物");
        }
    }
}
