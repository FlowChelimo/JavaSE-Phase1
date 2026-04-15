public class Test04 {
    public static void main(String[] args) {
//        练习
//        案例1:逢7过
//        朋友聚会的时候可能会玩一个游戏:逢7过
//        :是包含7或者是7的倍
//        从任意一个数字开始报数，当你要报的数字
//        游戏规则:
//        数时都要说过:过
//        需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
        for (int i = 1; i < 100; i++) {
           if (i % 7 == 0 || i % 10 == 7 || i % 10 == 7) {
               System.out.println("过");
               continue;
           }
           System.out.println(i);
        }

    }
}
