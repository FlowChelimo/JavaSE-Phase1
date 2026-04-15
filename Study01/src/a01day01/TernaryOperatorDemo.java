package a01day01;

public class TernaryOperatorDemo {
    public static void main(String[] args) {
        //三元运算符的结果必须要被使用，否则代码会报错
              //格式：关系表达式?表达式1：表达式2;(如果值为true,表达式1的值就是运算结果)(如果值为false,表达式2的值就是运算结果)
        //需求：使用三元运算符，获取两个数的较大值
        int number1 = 10;
        int number2 = 20;
        int number = number1>number2 ? number2 : number1;
        System.out.println(number);

        //复习原码反码补码--复习原码反码补码--复习原码反码补码
    }
}
