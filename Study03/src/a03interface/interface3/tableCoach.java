package a03interface.interface3;

public class tableCoach extends a03interface.interface3.coach implements a03interface.interface3.English {

    public tableCoach() {
    }

    public tableCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教学乒乓球");
    }
}
