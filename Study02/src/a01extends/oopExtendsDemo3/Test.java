package a01extends.oopExtendsDemo3;

public class Test {
    public static void main(String[] args) {
        husky d1 = new husky();
        System.out.println("========哈士奇：");
        d1.lifestyle();
        shaPi d2 = new shaPi();
        System.out.println("========沙皮狗：");
        d2.lifestyle();
        hua d3 = new hua();
        System.out.println("========中华田园犬：");
        d3.lifestyle();
    }
}
class dog {
    public void eat() {
        System.out.println("吃狗粮");
    }
    public void drink() {
        System.out.println("喝水");
    }
    public void house() {
        System.out.println("看家");
    }
}
class husky extends dog {
    public void lifestyle() {
        eat();
        drink();
        house();
    }
    @Override
    public void house() {
        System.out.println("看家 拆家");
    }
}
class shaPi extends dog {
    public void lifestyle() {
        eat();
        drink();
        house();
    }
    @Override
    public void eat() {
        System.out.println("吃狗粮 吃骨头");
    }
}
class hua extends dog {
    public void lifestyle() {
        eat();
        drink();
        house();
    }
    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
