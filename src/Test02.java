import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
//        案例2:回文数
//        需求:给你一个整数x。
//        如果x是一个回文整数，打印 true，否则，返回 false 。
//        解释:回文数是指正序(从左向右)和倒序(从右向左)读都是一样的整数。
//        例如，121 是回文，而 123 不是。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = sc.nextInt();
        int m = n;
        int math = 0;
        while(m != 0){
            int ge = m % 10;
            m = m/ 10;
            math = math* 10 + ge;
        }
        System.out.println(math);
        System.out.println(math == n);
    }
}
