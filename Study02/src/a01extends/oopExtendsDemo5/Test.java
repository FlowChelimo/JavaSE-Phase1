package a01extends.oopExtendsDemo5;

public class Test {
    public static void main(String[] args) {
        manager m = new manager("heima001","经理",8000.0,500.0);
        System.out.println(m.getId() + "," +m.getName() + "," + m.getSalary() + "," + m.getBouns());
        m.work();
        m.eat();
        System.out.println("================");
        cook c = new cook("heima002","厨师",5000.0);
        System.out.println(c.getId() + "," +c.getName() + "," + c.getSalary());
        c.work();
        c.eat();
    }
}
