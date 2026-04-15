package a01extends.oopExtendsDemo1;

public class Test {
    public static void main(String[] args) {

        LiHua cat1 = new LiHua();
        cat1.eat();
        cat1.drink();
        cat1.catchMice();
        System.out.println("=======================");
        Husky dog1 = new Husky();
        dog1.eat();
        dog1.drink();
        dog1.seeHouse();
    }
}
