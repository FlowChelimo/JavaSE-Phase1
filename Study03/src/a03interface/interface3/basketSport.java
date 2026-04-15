package a03interface.interface3;

public class basketSport extends a03interface.interface3.Sport {
    public basketSport() {
    }

    public basketSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("蓝球运动员学习蓝球");
    }
}
