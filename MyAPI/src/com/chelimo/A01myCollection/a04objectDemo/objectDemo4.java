package com.chelimo.A01myCollection.a04objectDemo;

public class objectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected object clone(int a)       对象克隆

        //1.先创建一个对象
        int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        User u1 = new User(1,"zhanhgsan","001","gril11",data);

        //2.克隆对象
        //细节:
        //方法在底层会帮我们创建一个对象，并把原对象中的数据拷贝过去。
        //书写细节:
        //1.重写object中的clone方法
        //2.让javabean类实现cloneable接口
        //3.创建原对象并调用clone就可以了。

        User u2 = (User)u1.clone();
        int[] arr = u1.getData();
        arr[0] = 100;
        System.out.println(u1);
        System.out.println(u2);

        //额外小扩展---实际开发中在User类中重写clone方法太麻烦
        //            实际开发中会导入别人写的代码
        //1.第三方写的代码导入到项目中
    }
}
