package com.chelimo.doudizhu2;

import java.util.*;

public class PokerGame {
    //牌盒
    static ArrayList <String> pokers = new ArrayList();//设置为静态 方便下面静态代码块访问
    static ArrayList <Integer> list = new ArrayList<>();
    static HashMap<Integer,String> hm = new HashMap<>();
    //准备牌------只准备一次，以后都用这副牌
    //这里采用静态代码块 随着类加载而加载 只执行一次
    static {
        ArrayList<String> pokers1 = new ArrayList();
        ArrayList<String> pokers2 = new ArrayList();
        Collections.addAll(pokers1, "♥", "♠", "♣", "♦");
        Collections.addAll(pokers2, "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A","2");
        int j = 1;
        for (String c : pokers2) {
            for (String v : pokers1) {
                hm.put(j,v+c);
                list.add(j);
                j++;
            }
        }
        hm.put(j,"小王");
        list.add(j);
        j++;
        hm.put(j,"大王");
        list.add(j);
//        System.out.println(hm);
    }
    public PokerGame() {
        //洗牌
        Collections.shuffle(list);
//        System.out.println(pokers);
        //发牌(三个玩家+地主牌3张  四个集合)   优化用Treemap底层会按照数字大小进行排序
        TreeSet<Integer> lord    = new TreeSet<>();
        TreeSet<Integer> player1 = new TreeSet<>();
        TreeSet<Integer> player2 = new TreeSet<>();
        TreeSet<Integer> player3 = new TreeSet<>();
        for (int i = 0; i < list.size(); i++) {
            int j = list.get(i);
            if (i<=2) {
                lord.add(j);
                continue;
            }
            if(i%3 == 0){
                player1.add(j);
            } else if (i%3 == 1) {
                player2.add(j);
            }else{
                player3.add(j);
            }
        }
        lookPoker("lord",lord);
        lookPoker("player1",player1);
        lookPoker("player2",player2);
        lookPoker("player3",player3);
    }
    public static void lookPoker(String name , TreeSet<Integer> pokers) {
        System.out.print(name + ":  ");
        for (Integer i : pokers) {
            System.out.print(hm.get(i) + " ");
        }
        System.out.println();
    }
}
