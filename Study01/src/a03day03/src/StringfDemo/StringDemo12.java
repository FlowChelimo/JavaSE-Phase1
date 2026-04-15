package a03day03.src.StringfDemo;

public class StringDemo12 {
    public static void main(String[] args) {
        //案例 敏感词替换
        //String replace(旧值,新值)替换
        //注意点:只有返回值才是替换之后的结果
        String talk = "你玩的真好，以后不要再玩了，TMD，CNM";
        //定义一个敏感词库
        String [] arr = {"TMD","CNM","MLGB","SB"};
        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println();
        System.out.println(talk);

//        string类代表字符串。Java 程序中的所有字符串字面值(如“abc”)都作为此类的实例实现。
//        字符串是常量;它们的值在创建之后不能更改、字符串缓冲区支持可变的字符串。因为 String对象是不可变的，所以可以共享。例如:
//        String str="abc”:
//        等效于:
//        char data[]-{'a’,’b'’,’c’}:
//        String str=new String(data):


    }
}
