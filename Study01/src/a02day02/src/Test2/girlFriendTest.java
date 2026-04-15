package a02day02.src.Test2;

public class girlFriendTest {
    public static void main(String[] args) {
        girlFriend gf1 = new girlFriend();
        gf1.setName("尤诺");
        gf1.setAge(18);
        gf1.setGender("傲娇少女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getGender());
        gf1.eat();
        gf1.sleep();
        gf1.watch();
        System.out.println("==========================");
        girlFriend gf2 = new girlFriend();
        gf2.setName("阿蕾奇诺");
        gf2.setAge(26);
        gf2.setGender("御姐成女");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getGender());
        gf2.eat();
        gf2.sleep();
        gf2.watch();


    }
}
