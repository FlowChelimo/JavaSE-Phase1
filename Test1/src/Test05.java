public class Test05 {
    public static void main(String[] args) {
//        案例 数字加密
//        需求:
//        某系统的数字密码(大于0)，比如1983，采用加密方式进行传输。
//        规则如下:
//        先得到每位数，然后每位数都加上5，再对10求余，最后将所有数字反转，得到一串新数。
        //把数字添加进数组
        int math = 1983;
        int temp = math;
        int count =0;
        while(math != 0){
            math = math / 10;
            count++;
        }
        int arr [] = new int [count];
        for (int i = arr.length -1; i >= 0; i--) {
            int ge = temp % 10;
            temp /= 10;
            arr[i] = ge;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //每位数字都加上5
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
        }
        //每位数字都对10取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] %= 10;
        }
        //将所有数字反转
        for (int i = 0,j = arr.length - 1; i < j; i++,j--){
            int temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
        }
        //把数组中每一个数字进行拼接，变成加密之后的结果
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum*10 + arr[i];
        }
        System.out.println(sum);
    }
}
