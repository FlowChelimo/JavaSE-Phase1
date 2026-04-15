package a05abstractDemo;

import a05abstractDemo.dog;
import a05abstractDemo.frog;
import a05abstractDemo.sheep;

public class Test {
    public static void main(String[] args) {
        frog f = new frog("小绿",2);
        System.out.println(f.getName() + " " + f.getAge());
        f.drink();
        f.eat();

        dog d = new dog("小黄",3);
        System.out.println(f.getName() + " " + f.getAge());
        d.drink();
        d.eat();

        sheep sh = new sheep("小白",4);
        System.out.println(sh.getName() + " " + sh.getAge());
        sh.drink();
        sh.eat();
    }
}
