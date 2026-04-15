package StudentSystem.System;

import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem1 {
    public static void startStudentSystem() {
        ArrayList<Student> students = new ArrayList<>();
        loop:while (true) {
            System.out.println("----------------欢迎来到学生管理系统-----------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose) {
                case "1" -> addStudent(students);
                case "2" -> deleteStudent(students);
                case "3" -> updateStudent(students);
                case "4" -> queryStudent(students);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                }

            }
        }
    }
    //方法 添加学生
    public static ArrayList<Student> addStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            boolean flag = contains(list, id);
            if(flag){
                System.out.println("id已经存在，请重新输入");
            }else{
                s.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        s.setName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        s.setAge(age);
        System.out.println("请输入学生家庭住址");
        String hometown = sc.next();
        s.setHometown(hometown);
        list.add(s);
        System.out.println("学生信息添加成功");
        return list;
    }
    //方法 删除学生--id存在删除 id不存在 需要提示不存在，并回到初始菜单
    public static ArrayList<Student> deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的id");
        String id = sc.next();
        int Index = getIndex(list,id);
        if (Index >= 0) {
            list.remove(getIndex(list,id));
            System.out.println("id为" + id + "的学生删除成功");
        }else{
            System.out.println("id不存在，删除失败");
            //返回初始菜单
        }
        return list;
    }
    //方法 修改学生 id存在继续录入其他信息 id不存在需要提示不存在并回到初始菜单
    public static ArrayList<Student> updateStudent(ArrayList<Student> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生id");
        String id = sc.next();
        int Index = getIndex(list,id);
        if (Index >= 0) {
            System.out.println("请输入要修改的学生id");
            String newId = sc.next();
            list.get(Index).setId(newId);
            System.out.println("请输入要修改的学生姓名");
            String newName = sc.next();
            list.get(Index).setName(newName);
            System.out.println("请输入要修改的学生年龄");
            int newAge = sc.nextInt();
            list.get(Index).setAge(newAge);
            System.out.println("请输入要修改的学生家庭住址");
            String newHometown = sc.next();
            list.get(Index).setHometown(newHometown);
            System.out.println("修改学生信息成功");
        }else{
            System.out.println("要修改的id为" + id + "的学生不存在，删除失败");
        }
        return list;
    }
    //方法 查询学生 如果没有学生信息提示 当前无学生信息 请添加后再查询 如果有学生信息就打印出来
    public static void queryStudent(ArrayList<Student> list) {
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            //结束方法
            return;
        }
        System.out.println("id\tname\tage\thometown");
        System.out.println("======================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getHometown());
        }
    }
    //方法 检查id是否重复
    public static boolean contains(ArrayList<Student> list, String id){
        /*for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;*/
        return getIndex(list,id) >= 0;    //提高代码简洁程度和复用性
    }
    //方法 根据id获取索引
    public static int getIndex(ArrayList<Student> list, String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }
}
