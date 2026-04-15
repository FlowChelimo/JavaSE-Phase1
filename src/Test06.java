import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
//        练习 求质数
//        案例3:
//        需求 键盘录入一个正整数 x
//        判断该整数是否为一个质数。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int a = sc.nextInt();
        Boolean flag = true;
        for (int i = 2; i < a; i++) {
            if(a % i == 0){
                flag = false;
            }
        }
        if(flag){
            System.out.println(a + "是一个质数");
        }else{
            System.out.println(a + "不是一个质数");
        }
//循环次数过多，代码运行慢，可以把结束范围缩小至录入数的平方根

    }
}
