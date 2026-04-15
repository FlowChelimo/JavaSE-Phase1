import java.util.Random;

public class Test04 {
    public static void main(String[] args) {
//        案例
//        评委打分
//        需求:
//        在唱歌比赛中，有6名评委给选手打分，分数范围是[0-100]之间的整数。选手的最后得分为:去掉最
//        高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分
        Random rand = new Random();
        int arr[] = new int[6];
        for (int i = 0; i < arr.length; i++) {
            int a = rand.nextInt(101);
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print("第" + (i+1) + "位评委评分为" + arr[i] + " ");
        }
        int max = getMax(arr);
        System.out.println();
        System.out.print("最高分为" + max);
        System.out.println();
        int min = getMin(arr);
        System.out.print("最低分为" + min);
        int score = getScore(arr,max,min);
        System.out.println();
        System.out.println("选手最终得分为" + score + "分");
    }

    //方法 自动查找数组中最高分
    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    //方法 自动查找数组中最低分
    public static int getMin(int arr []){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    //方法 自动去掉最大最小值并计算平均值
    public static int getScore(int arr [],int max,int min){
        int score1 = 0;
        for (int i = 0; i < arr.length; i++) {
            score1 += arr[i];
        }
        int score = (score1 - max - min) / (arr.length - 2);
        return score;
    }
}
