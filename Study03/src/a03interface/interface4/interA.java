package a03interface.interface4;

public interface interA {
    public abstract void methodA();
    public default void methodB() {
        System.out.println("接口里面的默认方法");
    }
}
