import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
//        练习
//        案例2:求平方根
//        需求:键盘录入一个大于等于2的整数x，计算并返回x的 平方根
//        结果只保留整数部分，小数部分将被舍去。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于2的整数");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i * i == n){
                System.out.println(i + "就是这个数的平方根");
                break;
            }else if(i*i > n){
                System.out.println((i-1) + "就是这个数的平方根");
                break;
            }
        }

    }
}
