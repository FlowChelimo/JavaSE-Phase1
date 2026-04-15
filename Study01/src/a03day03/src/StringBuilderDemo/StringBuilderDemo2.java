package a03day03.src.StringBuilderDemo;

public class StringBuilderDemo2 {
    public static void main(String[] args) {

        //创建对象
        StringBuilder sb = new StringBuilder();

        //添加对象(链式编程)
        sb.append("aaa").append("bbb").append("ccc");
        System.out.println(sb);

        //再把StringBuilder变回字符串(可以对其进行加工 使用字符串的成员方法)
        String str = sb.toString();
        System.out.println(str);
    }
}
