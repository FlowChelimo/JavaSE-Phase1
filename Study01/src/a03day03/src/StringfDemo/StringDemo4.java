package a03day03.src.StringfDemo;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
//        案例 用户登录
//        需求:已知正确的用户名和密码，请用程序实现模拟用户登录，
//        总共给三次机会，登录之后，给出相应的提示
        //读题拆解法
        String rightUserName = "zhangSan";
        String rightPassword = "123456";
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String userName = sc.next();
            System.out.println("请输入密码");
            String password = sc.next();
            if (userName.equals(rightUserName) && password.equals(rightPassword)) {
                System.out.println("用户登陆成功");
                break;
            }else {
                System.out.println("用户登陆失败，用户名或密码输入错误，您还剩下" + (2 - i) + "次机会");
            }
        }

    }
}
