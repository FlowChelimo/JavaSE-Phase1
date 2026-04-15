package com.chelimo.A01myCollection.a04objectDemo;

//Cloneable
//如果一个接口里面没有抽象方法
//表示当前的接口是一个标记性接口
//现在cloneable表示一旦了实现，那么当前类的对象就可以被克降
//如果没有实现，当前类的对象就不能克降

public class User implements Cloneable {
    private int id;
    private String UserName;
    private String Password;
    private String path;
    private int [] data;

    public User() {
    }

    public User(int id, String UserName, String Password, String path, int[] data) {
        this.id = id;
        this.UserName = UserName;
        this.Password = Password;
        this.path = path;
        this.data = data;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return UserName
     */
    public String getUserName() {
        return UserName;
    }

    /**
     * 设置
     * @param UserName
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取
     * @return Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * 设置
     * @param Password
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置
     * @param path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取
     * @return data
     */
    public int[] getData() {
        return data;
    }

    /**
     * 设置
     * @param data
     */
    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", UserName = " + UserName + ", Password = " + Password + ", path = " + path + ", data = " + data + "}";
    }

    //重写clone方法

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的clone方法
        //相当于让Java帮我们克隆了一个对象，并把克隆之后的对象返回出去

        //手动深克隆
        //先把克隆对象获取出来
        int data[] = this.data;
        //创建一个新数组
        int [] newData = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        //调用父类中的方法克隆对象
        User u = (User)super.clone();//super表示父类
        //因为父类中的克隆方法是浅克隆，替换克隆出来对象中的数组地址值
        u.data = newData;
        return super.clone();
    }

    //这是 Comparable 接口 中必须实现的核心方法，用于定义对象之间的“大小”比较规则，让你的类支持自然排序。
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
}
