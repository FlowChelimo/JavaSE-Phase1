package a02final;

public class Test1 {
    public static void main(String[] args) {
//        final修饰方法:
//          表明该方法是最终方法，不能被重写
//          使用场景：当我们设计一个规则 不希望它被改写时
//        fina1l修饰类:
//          表明该类是最终类，不能被继承
//        final修饰变量:
//          叫做常量，只能被赋值一次
    }
}
class fu {
    public final void show(){
        System.out.println("父类的show方法");
    }
}
class zi extends fu{
    /*   会报错 final 修饰的方法无法被重写
    @Override
    public final void show(){
        System.out.println("父类的show方法");
    }
    */
}
