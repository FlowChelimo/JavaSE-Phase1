package a02inner.innerDemo6;

import a02inner.innerDemo6.Animal;
import a02inner.innerDemo6.Dog;
import a02inner.innerDemo6.Swim;

public class Test {
    public static void main(String[] args) {
//        需要大家理解匿名内部类的格式，而不是硬记
//        new 类名或者接口名(){
//            重写方法;
//        };

        //swim是接口  是实现关系
        //整体我们可以理解为Swim接口的实现类对象
        //   当然也可以用一个变量去接受       Swim s = new Swim(){ @Override ...... }
        new Swim(){  //真正的匿名内部类是大括号里面的

            @Override
            public void swim() {
                System.out.println("重写了游泳方法");
            }
        };


        //Animal是类  是继承关系
        //以下整体是一个new出来的对象
        new Animal(){  //真正的匿名内部类是大括号里面的

            @Override
            public void ani() {
                System.out.println("重写了动物方法");
            }
        };

        //在测试类中调用method方法？
        //以前的方式 --- 新建一个子类调用
        Animal a = new Dog();
        method(a);

        //现在的方法 --- 直接用匿名内部类调用
        method(
                new Dog(){
                    @Override
                    public void eat() {
                        System.out.println("狗吃骨头/匿名内部类");
                    }
                }
        );
    }
    public static void method(Animal a){ //Animal a = new 子类对象
        a.eat();                          //多态
        //编译看左边 运行看右边
        //编译的时候看左边Animal类中有没有eat方法
        //运行的时候会运行子类里面的eat方法
    }
}
