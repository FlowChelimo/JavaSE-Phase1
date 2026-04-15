package StudentSystem.System;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("----------------欢迎来到学生管理系统-----------------");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.忘记密码");
            System.out.println("4.退出");
            String choose = sc.next();
            switch (choose) {
                case "1" -> register(students);
                case "2" -> login(students);
                case "3" -> forgetPassword(students);
                case "4" -> {
                    System.out.println("退出");
                    break loop;
                }
            }
        }
    }
    //---1.方法 学生注册
    public static ArrayList<Student> register(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        //1.用户名验证
        loop:while (true) {
            System.out.println("注册--请输入用户名，用户名长度必须在3~15之间，为数字+字母组合");
            String name = sc.next();
            boolean flag = contains(students, name);
            if (flag) {
                System.out.println("该用户名已存在，无需注册，请直接登录");
                break loop;
            } else {
                if (name.length() >= 3 && name.length() <= 15) {
                    int letter = 0;
                    int number = 0;
                    //循环遍历得到数字和字母的个数
                    for (int i = 0; i < name.length(); i++) {
                        char ch = name.charAt(i);
                        if (ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                            letter++;
                        } else if (ch >= '0' && ch <= '9') {
                            number++;
                        }
                    }
                    if (letter == name.length() || number == name.length()) {
                        System.out.println("用户id不能全为数字和字母");
                        continue loop;
                    }else{
                        s.setId(name);
                        students.add(s);
                        System.out.println("用户名设置成功");
                        break loop;
                    }
                } else {
                    if (name.length() <= 3) {
                        System.out.println("所输入的用户名不合法，长度过小");
                        continue loop;
                    } else {
                        System.out.println("所输入的用户名不合法，长度过大");
                        continue loop;
                    }
                }
            }
        }
        //2.新用户注册设置密码
        while(true){
            System.out.println("请设置密码，两次密码输入必须一致");
            String password1 = sc.next();
            String password2 = sc.next();
            if (password1.equals(password2)) {
                s.setPassword(password1);
                System.out.println("用户密码设置成功");
                break;
            }else{
                System.out.println("密码设置失败，两次密码不一致");
            }
        }
        //3.验证身份证号码
        loop:while (true) {
            System.out.println("请输入居民身份证号码");
            String IdNumber = sc.next();
            if (IdNumber.length() != 18 || IdNumber.charAt(0) == '0') {
                System.out.println("居民身份证号码不合法");
                continue loop;
            } else {
                Boolean isValid = true;
                for (int i = 0; i < IdNumber.length(); i++) {
                    char ch = IdNumber.charAt(i);
                    if (i < IdNumber.length() - 1) {
                        if (ch < '0' || ch > '9') {
                            System.out.println("居民身份证号码不合法");
                            isValid = false;
                            break ;
                        }
                    } else if (ch != 'X' && ch != 'x' && (ch < '0' || ch > '9')) {
                        System.out.println("居民身份证号码不合法");
                        isValid = false;
                        break ;
                    }
                    if (isValid) {
                        s.setIdNumber(IdNumber);
                        students.add(s);
                        System.out.println("身份证号码录入成功");
                        break loop;
                    }else{
                        System.out.println("居民身份证号码不合法");
                        break loop;
                    }
                }
            }
            break loop;
        }
        //4.手机号验证
        loop:while (true) {
            System.out.println("请输入手机号");
            String p = sc.next();
            if(p.length() == 11 && p.charAt(0) != '0'){
                for (int i = 0; i < p.length(); i++) {
                    if(p.charAt(i) <= '0' && p.charAt(i) >= '9'){
                        System.out.println("所输入的手机号不合法");
                    }else{
                        s.setPhone(p);
                        System.out.println("手机号验证成功");
                        break loop;
                    }
                }
            }else{
                System.out.println("所输入的手机号不合法");
            }
        }
        return students;
    }
    //---2.方法 学生登录
    public static void login(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("请输入用户名");
            String name = sc.next();
            boolean flag = contains(students, name);
            if (flag) {
                int i = getIndex(students, name);
                String code0 = getCode();
                System.out.println("验证码为；" + code0);
                System.out.println("请输入验证码");
                String code = sc.next();
                if(code.equals(code0)){
                    for (int j = 0; j < 4; j++) {
                        System.out.println("请输入密码");
                        String password = sc.next();
                        if(students.get(i).getPassword().equals(password)){
                            System.out.println("登陆成功！");
                            startStudentSystem();
                            break loop;
                        }else{
                            System.out.println("密码不正确,你还有" + (3 - j) + "次机会");
                        }
                    }
                    continue loop;
                }else{
                    System.out.println("验证码不正确");
                    continue loop;
                }
            }else{
                System.out.println("用户名未注册不可登录");
                break loop;
            }
        }
    }
    //---3.方法 忘记密码
    public static ArrayList<Student> forgetPassword(ArrayList<Student> students) {
        Scanner sc = new Scanner(System.in);
        loop:while (true) {
            System.out.println("请输入用户名");
            String name = sc.next();
            boolean flag = contains(students, name);
            if (flag) {
                int j = getIndex(students, name);
                Student s = students.get(j);
                System.out.println("请输入身份证号码");
                String IdNumber = sc.next();
                System.out.println("请输入手机号码");
                String phone = sc.next();
                if (IdNumber.equals(s.getIdNumber()) && phone.equals(s.getPhone())) {
                    System.out.println("请重新修改用户密码");
                    String password = sc.next();
                    s.setPassword(password);
                    System.out.println("密码修改成功");
                    break loop;
                }else{
                    System.out.println("用户身份证号码或手机号输入错误，账号信息不匹配，修改失败");
                    continue loop;
                }
            }else{
                System.out.println("用户名不存在!");
                continue loop;
            }
        }
        return students;
    }
    //方法 检查id是否重复
    public static boolean contains(ArrayList<Student> list, String id){
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
    //方法 生成验证码
    public static String getCode(){
        Random r = new Random();
        String code = "";
        for (int i = 0; i < 4; i++) {
            int s = r.nextInt(10) + 48;
            char c = (char) (s);
            code += c;
        }
        return code;
    }
    //方法 查询学生 如果没有学生信息提示 当前无学生信息 请添加后再查询 如果有学生信息就打印出来
    public static void queryStudent(ArrayList<Student> list) {
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        System.out.println("======================================");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getId());
            System.out.println(list.get(i).getIdNumber());
            System.out.println(list.get(i).getPhone());
            System.out.println(list.get(i).getPassword());
        }
    }
    //     登录学生管理系统
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
}
