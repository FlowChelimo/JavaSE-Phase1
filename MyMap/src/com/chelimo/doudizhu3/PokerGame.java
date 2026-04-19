package com.chelimo.doudizhu3;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //牌盒
    static ArrayList<String> list = new ArrayList();//设置为静态 方便下面静态代码块访问
    //准备牌------只准备一次，以后都用这副牌
    //这里采用静态代码块 随着类加载而加载 只执行一次
    static {
        ArrayList<String> pokers1 = new ArrayList();
        ArrayList<String> pokers2 = new ArrayList();
        Collections.addAll(pokers1, "♥", "♠", "♣", "♦");
        Collections.addAll(pokers2, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2");
        for (String c : pokers1) {
            for (String v : pokers2) {
                list.add(c + v);
            }
        }
        list.add("小王");
        list.add("大王");
    }
    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
        //发牌
        ArrayList<String> lord = new ArrayList();
        ArrayList<String> player1 = new ArrayList();
        ArrayList<String> player2 = new ArrayList();
        ArrayList<String> player3 = new ArrayList();

        for (int i = 0; i < list.size(); i++) {
            String poker = list.get(i);
            //发底牌
            if(i <= 2){
                lord.add(poker);
            }
            //给三个玩家轮流发牌
            if(i%3 == 0){
                player1.add(poker);
            }else if(i%3 == 1){
                player2.add(poker);
            }else{
                player3.add(poker);
            }
        }
        System.out.println(lord);
        System.out.println(player1);
        System.out.println(player2);
        System.out.println(player3);
    }
}
