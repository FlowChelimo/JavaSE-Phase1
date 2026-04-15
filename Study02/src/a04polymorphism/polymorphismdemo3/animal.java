package a04polymorphism.polymorphismdemo3;

class animal {
    public void eat() {
        System.out.println("动物在吃东西");
    }
}
class dog extends animal{
    @Override
    public void eat() {
        System.out.println("狗在吃东西");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
class cat extends animal{
    @Override
    public void eat() {
        System.out.println("猫在吃东西");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
