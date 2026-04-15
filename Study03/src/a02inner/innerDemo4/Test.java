package a02inner.innerDemo4;

import a02inner.innerDemo4.Outer;

public class Test {
    public static void main(String[] args) {
        Outer.Inner in = new Outer.Inner();
        in.show1();
//      in.show2();  静态的也可以调用，之不过Java中不提倡
        Outer.Inner.show2();  //提倡
    }
}
