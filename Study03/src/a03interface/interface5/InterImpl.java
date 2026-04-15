package a03interface.interface5;

public class InterImpl implements Inter {

    @Override
    public void method() {
    }
    //不属于重写方法 只是方法名字相同而已
    //子类把从父类继承下来的虚方法表里面的方法进行覆盖了，这才叫重写。
    //不能被重写原因 静态 私有 最终的是无法被添加到虚方法表里面的
    public static void show() {
        System.out.println("类里面的静态方法  show");
    }
}
