package a01extends.oopExtendsDemo5;
//    带有继承结构的标准Javabean类
//    1.经理
//    成员变量:工号，姓名，工资，管理奖金
//    成员方法:工作(管理其他人)，吃饭(吃米饭)
//    2.厨师
//    成员变量:工号，姓名，工资
//    成员方法:工作(炒菜)，吃饭(吃米饭)
public class employee {
    //标准的JavaBean类
    //1.类名要见名知意
    //2.所有的成员变量都需要私有
    //3.构造方法(空参 带全部参数的构造)
    //4.get/set方法
    private String id;
    private String name;
    private Double salary;

    public employee() {
    }

    public employee(String id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void work() {
        System.out.println("员工在工作");
    }

    public void eat() {
        System.out.println("吃米饭");
    }
}
