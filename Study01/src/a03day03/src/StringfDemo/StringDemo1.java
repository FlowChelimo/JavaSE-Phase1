package a03day03.src.StringfDemo;

public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值的方式来获取一个字符串对象     最简单且节约内存(串池)
        String s1 = "abc";
        System.out.println(s1);//abc

        //2.使用new的方式来获取一个字符串对象
        String s2 = new String();
        System.out.println("@" + s2 + "!");

        //传递一个字符串内容，根据传递的字符串内容在创建一个新的字符串对象
        String s3 = new String("abc");
        System.out.println(s3);

        //传递一个字符数组，根据字符数组的内容再创建一个新的字符串对象
        //应用场景；我要修改字符串的内容abc -> qbc
        //可以先创建一个字符数组abc -> {'a','b','c'} -> {'q','b','c'}
        char [] chs = {'a','b','c','d','e','f'};
        String s4 = new String(chs);
        System.out.println(s4);//abcdef

        //传递一个字节数组，根据字节数组的内容再创建一个新的字符串对象
        //应用场景 以后在网络当中传输的数据都是字节信息
        //我们一般要把字节信息进行转换，转成字符串，此时就要用到这个构造了
        byte [] bytes ={97,98,99,100};
        String s5 = new String(bytes);
        System.out.println(s5);
    }
}
