import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
//        案例
//        双色球系统 投注号码由6个红色球号码和1个蓝色
//        球号码组成。红色球号码从1-33中选择;蓝色球号码从1-16中选择。
        //1.生成中奖号码
        int [] arr = creatNumber();
        System.out.println("===========================");
        System.out.println("中奖号码为");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        //2.用户输入彩票号码(红球+蓝球)
        int [] arr1 = userInputNumber();
        //3.判断用户中奖情况
        int redCount = 0;
        int blueCount = 0;
        for (int i = 0; i < arr1.length - 1; i++) {
            int redNumber = arr1[i];
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == redNumber) {
                    redCount++;
                    break;
                }
            }
        }
        int blueNumber = arr1[arr1.length-1];
        if(blueNumber == arr[arr.length - 1]){
            blueCount++;
        }
        if(redCount == 6 && blueCount == 1){
            System.out.println("恭喜你，中奖一千万（一等奖）");
        }else if(redCount == 6 && blueCount == 0){
            System.out.println("恭喜你，中奖五百万（二等奖）");
        } else if(redCount == 5 && blueCount == 1) {
            System.out.println("恭喜你，中奖三千元（三等奖）");
        } else if ((redCount == 5 && blueCount == 0)||(redCount == 4 && blueCount == 1)) {
            System.out.println("恭喜你，中奖二百元（四等奖）");
        }else if ((redCount == 4 && blueCount == 0)||(redCount == 3 && blueCount == 1)) {
            System.out.println("恭喜你，中奖十元（五等奖）");
        }else if ((redCount == 2 && blueCount == 1)||(redCount == 1 && blueCount == 1)||(redCount == 0 && blueCount == 1)) {
            System.out.println("恭喜你，中奖五元（六等奖）");
        }
    }
    //方法 生成中奖号码
    public static int[] creatNumber(){
        int[] arr = new int[7];
        Random r = new Random();
        int blueNumber = r.nextInt(16) + 1;
        for (int i = 0; i < arr.length - 1; ) {
            int redNumber = r.nextInt(33) + 1;
            boolean flag = contains(arr,redNumber);
            if (!flag) {
                arr[i] = redNumber;
                i++;
            }
        }
        arr[arr.length - 1] = blueNumber;
        return arr;
    }
    //方法 检验数组中数据是否存在
    public static Boolean contains(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
    //方法 录入用户中奖号码
    public static int[] userInputNumber(){
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[7];
        for (int i = 0; i < arr.length - 1;) {
            System.out.println("请输入第" + (i+1) + "个红球号码");
            int redNumber = sc.nextInt();
            if (redNumber >= 1&&redNumber <= 33) {
                boolean flag = contains(arr,redNumber);
                if(!flag){
                    arr[i] = redNumber;
                    i++;//***********************************************
                }else{
                    System.out.println("当前输入的红球号码已重复，请重新输入");
                }
            }else{
                System.out.println("当前红球号码超出了范围");
            }
        }
        System.out.println("请输入蓝球号码");
        while (true) {
            int blueNumber = sc.nextInt();
            if(blueNumber >= 1 && blueNumber <= 16){
                arr[arr.length - 1] = blueNumber;
                break;
            }else{
                System.out.println("当前蓝球号码超出了范围");
            }
        }
        return arr;
    }
}
