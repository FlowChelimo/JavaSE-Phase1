package Test;

public class Test5 {
    public static void main(String[] args) {
        /*练习 爬楼梯     迭代迭代迭代迭代迭代迭代迭代迭代迭代迭代！！！！！！！！
        可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶，有的时候一次爬三个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢?
        运算结果:                           斐波那契数列
        1层台阶 1种爬法
        2层台阶 2种爬法
        7层台阶 21种爬法*/
        System.out.println(getSum(20));//101902
        int res = getWays(20);
        System.out.println("20层楼梯总走法：" + res);
    }

    public static int getSum(int n) {
        if (n == 1) {
            return 1;//如果是1阶，就有一个爬法
        }
        if (n == 2) {
            return 2;//如果是2阶，就有二个爬法
        }
        if (n == 3) {
            return 3;
        }
        return getSum(n - 1) + getSum(n - 2) + getSum(n - 3);//如果是n阶，就有getSum(n - 1) + getSum(n - 2);个爬法
    }

    // 求 20 层楼梯一共有多少种走法
// 迭代 / 循环写法
    public static int getWays(int n) {
        // 边界条件
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        // 初始：对应 f(1)、f(2)
        int a = 1;
        int b = 2;
        int c = 0;

        // 从第 3 层 循环算到第 n 层
        for (int i = 3; i <= n; i++) {
            c = a + b;   // 当前层 = 上一层 + 上上层
            a = b;       // 旧的b 变成新的a（往前挪）
            b = c;       // 当前结果 变成新的b
        }
        // 循环结束，b就是第n层的结果
        return b;
    }
}
