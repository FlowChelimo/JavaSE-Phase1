package a01extends.oopExtendsDemo5;

public class manager extends employee{
    private double bouns;

    //空参构造
    public manager(double bouns) {
        this.bouns = bouns;
    }

    //带全部参数的构造
    //父类 + 子类
    public manager(String id, String name, Double salary, double bouns) {
        super(id, name, salary);
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;
    }

    @Override
    public void work() {
        System.out.println("经理在管理其他人");
    }
}
