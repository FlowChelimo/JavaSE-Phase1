public class Test03 {
    public static void main(String[] args) {
//        练习
//        案例3:求商和余数 被除数
//        需求:
//        给定两个整数
//        和除数(都是正数，且不超过int的范围)
//        将两数相除，要求不使用乘法、除法和 % 运算符。
//        得到商和余数。

        //定义变量记录被除数
        int dividend = 12;
        //定义变量记录除数
        int divisor = 3;
        int count = 0;
        while(dividend  >= divisor){
            dividend -= divisor;
            count++;
        }
        System.out.println("商是" + count);
        System.out.println("余数是" + dividend);

    }
}
