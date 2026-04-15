package a02day02.src.Test2;

public class girlFriend {
    //封装--面向对象的三大特征(封装，继承，多态)
    //封装 对象代表什么，就得封装对应的数据，并提供数据对应的行为
    //比如 人画圆，人只是调用画圆的方法
    //    人关门，人给了门一个作用力，门是自己关的
    //    张三砍来李四 张三调用了李四凉凉的方法 是李四自己凉的
//    private关键字
//            是一个权限修饰符
//    可以修饰成员(成员变量和成员方法)
//    被private修饰的成员只能在本类中才能访问
    private String name;
    private int age;
    private String gender;
    //针对每一个私有化的成员变量，都要提供get和set方法
    //set方法：给成员变量赋值
    //get方法：对外提供成员变量的值
    public void setName(String name){
        //局部变量表示测试类中调用方法传递过来的数据
         //等号的左边：就表示成员位置的name
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        if(18 <= age && 30 >= age){
            this.age = age;
        }else{
            System.out.println("非法数据");
        }
    }
    public int getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void eat(){
        System.out.println("女朋友在吃饭");
    } public void sleep(){
        System.out.println("女朋友在睡觉");
    } public void watch(){
        System.out.println("女朋友在看电视");
    }


}
