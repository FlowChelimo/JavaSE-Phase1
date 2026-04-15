package a01day01;

public class forDemo1 {
    public static void main(String[] args) {
        //for(初始化语句;条件判断语句;条件控制语句){
        //     循环体语句;
        //    }
        //扩展小点‘
        //1.求和的变量不可定义在循环的里面，因为变量再在所属的大括号中有效
        //2.如果我们把变量定义在循环里面，那么的当前变量只能在本次循环中有效
        //当本次循环结束之后，变量就会从内存中消失
        //第二轮循环开始的时候，又会重新定义一个新的变量
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        //跳转控制语句
        //场景---小老虎吃包子 一共五个包子但是第三个包子坏掉了
        for (int i = 1; i <= 5; i++) {
            if(i == 3){
                //结束本次循环继续下次循环------(break)直接结束整个循环
                continue;
            }
            System.out.println("小老虎再吃第" + i + "个包子");
        }
        //无限循环
//        for(;;){
//            System.out.println("学习");
//        }
    }
}
