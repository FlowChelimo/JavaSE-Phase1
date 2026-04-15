package a02day02.src.Test3;

public class User {
    //标准的JavaBean类
    //1.类名要见知意
    //2.成员变量使用private修饰
    //3.提供至少两个构造方法(无参构造方法，带全部参数的构造方法)
    //4.成员方法：
    //  提供每一个成员变量对应的setXxx()getXxx()
    //  如果还有其他行为，也需要写上

    //属性
    private String username;
    private String password;
    private String emil;
    private String gender;
    private int age;

    public User() {
    }

    public User(String username, String password, String emil, String gender, int age) {
        this.username = username;
        this.password = password;
        this.emil = emil;
        this.gender = gender;
        this.age = age;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return emil
     */
    public String getEmil() {
        return emil;
    }

    /**
     * 设置
     * @param emil
     */
    public void setEmil(String emil) {
        this.emil = emil;
    }

    /**
     * 获取
     * @return gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置
     * @param gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", emil = " + emil + ", gender = " + gender + ", age = " + age + "}";
    }
}

