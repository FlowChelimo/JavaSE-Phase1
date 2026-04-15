package a02inner.innerDemo3;

import a02inner.innerDemo3.Outer;

public class Test {
    public static void main(String[] args) {
        Outer.Inner o = new Outer().new Inner();
        o.show();
    }
}
