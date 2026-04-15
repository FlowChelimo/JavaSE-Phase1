import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
//        案例 卖飞机票
//        需求:
//        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价 月份 和 头等舱或经济舱。
//        按照如下规则计算机票价格:旺季(5-10月)头等舱9折，经济舱8.5折，淡季(11月到来年4月)头等舱7 折，经济舱6.5折。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价");
        int ticket = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入头等舱0 经济舱1");
        int seat = sc2.nextInt();
        if (month >= 5 && month <= 10) {
            if (seat == 0) {
                ticket = (int) (ticket * 0.9);
            } else if (seat == 1) {
                ticket = (int) (ticket * 0.85);
            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            if (seat == 0) {
                ticket = (int) (ticket * 0.7);
            } else if (seat == 1) {
                ticket = (int) (ticket * 0.65);
            }
        } else {
            System.out.println("键盘录入的月份不合法");
        }
        System.out.println("机票价格为" + ticket);
    }
//方法------自动计算票价
    public static int getPrice(int ticket, int seat,double v1, double v2) {
        if (seat == 0) {
            ticket = (int) (ticket * v1);
        } else if (seat == 1) {
            ticket = (int) (ticket * v2);
        }else{
            System.out.println("舱类型不合法");
        }
        return ticket;
    }
}
