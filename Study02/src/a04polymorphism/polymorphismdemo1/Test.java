package a04polymorphism.polymorphismdemo1;

public class Test {
    public static void main(String[] args) {
        student s = new student();
        s.setName("张三");
        s.setAge(18);
        teacher t = new teacher();
        t.setName("王建国");
        t.setAge(30);
        administrator admin = new administrator();
        admin.setName("管理员");
        admin.setAge(35);
        register(s);
        register(t);
        register(admin);
    }
    public static void register(person p){
        p.show();
    }
}
