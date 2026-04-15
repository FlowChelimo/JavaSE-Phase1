import java.util.Random;

public class Test02 {
    public static void main(String[] args) {
//        案例：开发验证码
//        需求:
//        定义方法实现随机产生一个5位的验证码
//        验证码格式:
//        长度为5 前四位是大写字母或者小写字母
//        最后一位是数字
        //在以后我们要在一堆没有什么规律的数据中随机抽取，可以把这些数据放到数组里，再用随机索引
        char chs [] = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表 + 强制类型转换
            if (i <= 25) {
                chs[i] = (char) (97 + i);
            }else{
                chs[i] = (char) (65 + i - 26);
            }
//            System.out.print(chs[i] + " ");
        }
        Random r = new Random();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        String s = "";
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(chs.length);
            int num1 = r.nextInt(arr.length);
            if (i < 4) {
                s += chs[num];
            }else{
                s += arr[num1];
            }
        }
        System.out.println(s);

    }
}
