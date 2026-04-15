package a04polymorphism.polymorphismdemo2;

class animal {
    String name = "animal";
    public void show(){
        System.out.println("animal");
    }
}
class Dog extends animal{
    String name;
    @Override
    public void show() {
        System.out.println("dog");
    }
}
class cat extends animal{
    @Override
    public void show() {
        System.out.println("cat");
    }
}
