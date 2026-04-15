package StudentSystem.System;

public class Student {
    private String id;
    private String name;
    private int age;
    private String hometown;
    private String password;
    private String IdNumber;
    private String phone;

    public Student() {
    }

    public Student(String id, String name, int age, String hometown) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.password = password;
        this.IdNumber = IdNumber;
        this.phone = phone;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        this.IdNumber = idNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
