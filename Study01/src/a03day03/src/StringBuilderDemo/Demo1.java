package a03day03.src.StringBuilderDemo;

public class Demo1 {
    public static void main(String[] args) {
        //StringBuilder底层原理
        StringBuilder sb = new StringBuilder();
        //容量:最多装多少
        //长度：已经装多少
        System.out.println(sb.capacity());//默认最初16
        System.out.println(sb.length());//0
        //sb.append("abc");
        System.out.println(sb.capacity());//16
        System.out.println(sb.length());//3
        //sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.capacity());//容量不够，长度*2+2----34
        System.out.println(sb.length());//26
        sb.append(new StringBuilder("abcdefghijklmnopqrstuvwxyz0123456789"));
        System.out.println(sb.capacity());//36
        System.out.println(sb.capacity());//36
    }
}
