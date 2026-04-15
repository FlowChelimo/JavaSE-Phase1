package com.chelimo.A01myCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

public class A02_myCollectionDemo2 {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        girlFriend f1 = new girlFriend("奥古斯塔",23);
        girlFriend f2 = new girlFriend("尤诺",19);
        coll.add(f1);
        coll.add(f2);
        //4.判断集合中某一个学生对象是否包含
        girlFriend f3 = new girlFriend("奥古斯塔",23);
        //因为contains方法在底层依赖equals方法判对象是否一致的。
        //如果存的是自定义对象，没有重写equals方法，那么默认使用object类中的equals方法进行判断，而object类中equals方法，依赖地址值进行判断。
        //需求:如果同姓名和同年龄，就认为是同一个学生。
        //所以，需要在自定义的Javabean类中，重写equals方法就可以了
        boolean result = coll.contains(f3);
        System.out.println(result);

    }
}
class girlFriend{
    private String name;
    private int age;

    public girlFriend() {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        girlFriend that = (girlFriend) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public girlFriend(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
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
        return "girlFriend{name = " + name + ", age = " + age + "}";
    }
}
