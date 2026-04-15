package a02inner.innerDemo5;

public class Outer {
    int a = 10;
            /*
            局部内部类
            1.将内部类定义在方法里面就叫做局部内部类，类似于方法里面的局部变量。
            2.外界是无法直接使用局部内部类，需要在方法内部创建对象并使用。
            3.该类可以直接访问外部类的成员，也可以访问方法内的局部变量。
            */
    void show() {
        //局部内部类（定义在方法里面）
        class Inner {
            String name;
            int age;
            public void method1() {
                System.out.println("局部内部类里面的method1方法");
                //局部内部类可以直接访问外部类的成员
                System.out.println(a);
            }
            public static void method2() {
                System.out.println("局部内部类里面的method2静态方法");
            }
        }
        Inner inner = new Inner();
        inner.method1();
        inner.method2();
        System.out.println(inner.name);
        System.out.println(inner.age);
    }
}
