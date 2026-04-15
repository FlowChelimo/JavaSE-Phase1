import java.util.Random;

public class Test06 {
    public static void main(String[] args) {
//        案例 抢红包
//        需求:
//        一个大V直播抽奖，奖品是现金红包，分别有(2,588,888,1000,10000}五个奖金。请使用代码模拟抽奖
//        打印出每个奖项，奖项的出现顺序要随机且不重复。打印效果如下:(随机顺序，不一定是下面的顺序)
        Random rand = new Random();
        int [] arr ={2,588,888,1000,10000};
        for (int i = 0; i < arr.length; i++) {
            int randNum = rand.nextInt(arr.length);
            int temp = arr[randNum];
            arr[randNum] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
}
}
