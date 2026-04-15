package StudentSystem.System;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class studentSystem2 {
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
}
