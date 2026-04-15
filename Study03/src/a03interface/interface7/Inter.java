package a03interface.interface7;
//如果我们只想用 method5 方法 因为接口的缺陷 我们要在实现类中重写十个空方法
//而且 method5 不容易被看见 太麻烦
//这时我们可以用适配器设计模式
//在中间新建一个类 然后再继承
public interface Inter {
    public abstract void method1();
    public abstract void method2();
    public abstract void method3();
    public abstract void method4();
    public abstract void method5();
    public abstract void method6();
    public abstract void method7();
    public abstract void method8();
    public abstract void method9();
    public abstract void method10();
}
