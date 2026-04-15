import java.util.Random;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
//        练习
//        案例4:猜数字小游戏 1-100 间的随机数字
//        需求:程序自动生成- 使用程序实现猜出这个数字是多少?
        Random rand = new Random();
        int a = rand.nextInt(100) + 1;
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        System.out.println("请猜一个1-100之间的数字");
        int x = sc.nextInt();
        if(a == x){
            System.out.println("恭喜你猜对了");
        }else{
            System.out.println("猜错了");
        }

    }
}
