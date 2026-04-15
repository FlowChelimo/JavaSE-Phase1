package a02day02.src.Test1;

public class phoneTest {
    public static void main(String[] args) {
        //类和对象是什么
        //类 是共同特征的描述(设计图)
        //对象 是真实存在的具体实例
        //如何得到类的对象
        //类名 对象名 = new 类名();
        Phone phone = new Phone();
        //如何使用对象
        //访问属性 对象名.成员变量
        //访问行为 对象名.方法名(...)
        //给手机赋值
        phone.brand = "小米";
        phone.price = 1999.98;
        System.out.println(phone.brand);
        System.out.println(phone.price);
        //调用手机中的方法
        phone.call();
        phone.playGame();
    }
}
