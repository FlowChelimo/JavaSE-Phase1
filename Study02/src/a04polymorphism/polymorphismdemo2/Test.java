package a04polymorphism.polymorphismdemo2;

public class Test {
    public static void main(String[] args) {
        //创建对象(多态方式)
        //Fu f = new zi();
        animal a= new Dog();
        //调用成员变量:编译看左边，运行也看左边
        //编译看左边:     javac编译代码的时候，会看左边的父类中有没有这个变量，如果有，编译成功，如果没有编译失败。
        //运行也看左边:   java运行代码的时候，实际获取的就是左边父类中成员变量的值
        System.out.println(a.name);//动物
       //调用成员方法:编译看左边，运行看右边
        //编译看左边:javac编译代码的时候，会看左边的父类中有没有这个方法，如果有，编译成功，如果没有编译失败。
        //运行看右边:java运行代码的时候，实际上运行的是子类中的方法。
        a.show();//Dog---show方法


    }
}
