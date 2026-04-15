package a03interface.interface3;

public class Test1 {
    public static void main(String[] args) {

        tableSport t = new tableSport("乒乓球运动员",18);
        System.out.println(t.getName() + " " + t.getAge());
        t.speakEnglish();
        t.study();

        basketSport b = new basketSport("蓝球运动员",19);
        System.out.println(b.getName() + " " + b.getAge());
        b.study();

        tableCoach tc = new tableCoach("乒乓球教练",18);
        System.out.println(tc.getName() + " " + tc.getAge());
        tc.speakEnglish();
        tc.teach();

        basketCoach bc = new basketCoach("篮球教练",30);
        System.out.println(bc.getName() + " " + bc.getAge());
        bc.teach();
    }
}
