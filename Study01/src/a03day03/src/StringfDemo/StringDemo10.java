package a03day03.src.StringfDemo;

public class StringDemo10 {
    public static void main(String[] args) {
        //案例 手机号屏蔽
        //截取
        //String substring(int beginIndex, int endIndex)
        //注意点:包头不包尾，包左不包右 只有返回值才是截取的小串
        //如果只输入一个参数  截取到末尾
        //String substring(int beginIndex)
        String phoneNumber = "19811117239";
        //截取手机号前三位
        String strat = phoneNumber.substring(0,3);
        //只有返回值才是截取的小串，原先字符串不变
        System.out.println(strat);
        //截取手机号后四位
        String end = phoneNumber.substring(7);
        String result = strat + "****" + end;
        System.out.println(result);
    }
}
