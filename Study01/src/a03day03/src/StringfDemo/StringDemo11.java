package a03day03.src.StringfDemo;

public class StringDemo11 {
    public static void main(String[] args) {
        //案例 身份证信息查看
        String id = "32032320070718423X";
        //获取出生年月
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);
        System.out.println("人物信息为:");
        System.out.println("出生年月为：" + year + "年" + month + "月" + day + "日");
        //身份证第16位奇书是男偶数是女，要把字符类型转变为数字类型(ASCII码表)
        //System.out.println('0' + 0);   0 --> 48
        int gender = id.charAt(16) - 48;
        if (gender % 2 == 0) {
            System.out.println("女性");
        }else{
            System.out.println("男性");
        }
    }
}
