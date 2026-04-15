package a03interface.interface3;

public class tableSport extends a03interface.interface3.Sport implements a03interface.interface3.English {
    public tableSport() {
    }

    public tableSport(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学习乒乓球");
    }

    public String getName() {
        return super.getName();
    }
}
