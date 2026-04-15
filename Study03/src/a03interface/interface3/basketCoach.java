package a03interface.interface3;

public class basketCoach extends a03interface.interface3.coach {
    public basketCoach() {
    }

    public basketCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("蓝球教练教学练篮球");
    }
}
