package a02inner.innerDemo3;

public class Outer {
    int a = 10;
    class Inner {
        int a = 20;
        public void show(){
            int a = 30;
            System.out.println(a);//10 ---- 就近原则
            System.out.println(this.a);//20
            System.out.println(Outer.this.a);//30
        }
    }
}
