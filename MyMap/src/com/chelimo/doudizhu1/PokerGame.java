package com.chelimo.doudizhu1;

import java.util.ArrayList;
import java.util.Collections;

public class PokerGame {
    //牌盒
    static ArrayList <String> pokers = new ArrayList();//设置为静态 方便下面静态代码块访问
    //准备牌------只准备一次，以后都用这副牌
    //这里采用静态代码块 随着类加载而加载 只执行一次
    static {
        ArrayList<String> pokers1 = new ArrayList();
        ArrayList<String> pokers2 = new ArrayList();
        Collections.addAll(pokers1, "♥", "♠", "♣", "♦");
        Collections.addAll(pokers2, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2");
        for (String c : pokers1) {
            for (String v : pokers2) {
                pokers.add(c + v);
            }
        }
        pokers.add("小王");
        pokers.add("大王");
    }
    public PokerGame() {
        //洗牌
        Collections.shuffle(pokers);
//        System.out.println(pokers);
        //发牌(三个玩家+地主牌3张  四个集合)
        ArrayList<String> lord = new ArrayList();
        ArrayList<String> player1 = new ArrayList();
        ArrayList<String> player2 = new ArrayList();
        ArrayList<String> player3 = new ArrayList();
        for (int i = 0; i < pokers.size(); i++) {
            if(i <= 2){
                lord.add(pokers.get(i));
                continue;
            }
            if(i%3 == 0){
                player1.add(pokers.get(i));
            } else if (i%3 == 1) {
                player2.add(pokers.get(i));
            }else{
                player3.add(pokers.get(i));
            }
        }
        lookPoker("lord",lord);
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
    }
    public static void lookPoker(String name ,ArrayList<String> pokers) {
        System.out.print(name + ":");
        for (String s : pokers) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
