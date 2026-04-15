package a03interface.interface7;

public class InterImpl extends a03interface.interface7.InterAdapter {
    //我需要哪个方法 就重写哪个方法 很方便
    @Override
    public void method5() {
        System.out.println("我想要用的 method5 方法");
    }
}
