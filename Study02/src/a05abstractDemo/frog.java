package a05abstractDemo;

import a05abstractDemo.animal;

public class frog extends animal {
    public frog() {
    }

    public frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(){
        System.out.println("青蛙在吃虫子");
    }
}
