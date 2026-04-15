package a01extends.oopExtendsDemo2;

public class Test {
    public static void main(String[] args) {
        OverseasStudent student = new OverseasStudent();
        student.lunch();
    }
}
class person{
    public void eat(){
        System.out.println("吃米饭，吃菜");
    }
    public void drink(){
        System.out.println("喝开水");
    }
}
class student extends person{
    public void lunch(){
        eat();
        drink();
    }
}
class OverseasStudent extends student {
    public void lunch(){
        eat();
        drink();
        super.eat();
        super.drink();
    }
    //应用场景 当父类中方法不能满足子类中需求时，我们就需要把这个方法进行重写
    //方法重写的本质 覆盖了虚方法表
    //注意 子类中重写的方法上面需要加上@override
    @Override
    public void eat(){
        System.out.println("吃面包");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }
}