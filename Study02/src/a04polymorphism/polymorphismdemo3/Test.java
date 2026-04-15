package a04polymorphism.polymorphismdemo3;

public class Test {
    public static void main(String[] args) {
        animal a = new dog();
        a.eat();

        //多态的弊端
        //不能调用子类的特有功能
        //报错的原因?
        //当调用成员方法的时候，编译看左边，运行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法，如果没有直接报错
        //a.lookHome();

        //解决方案 变回子类类型就可以了
        /*if (a instanceof dog) {
            dog d = (dog) a;
            d.lookHome();
        } else if (a instanceof cat) {
            cat c = (cat) a;
            c.catchMouse();
        } else {
            System.out.println("没有这个类型，无法转换");
        }*/

        //新特性
        if (a instanceof dog d) {
            d.lookHome();
        } else if (a instanceof cat c) {
            c.catchMouse();
        } else {
            System.out.println("没有这个类型，无法转换");
        }
    }
}
