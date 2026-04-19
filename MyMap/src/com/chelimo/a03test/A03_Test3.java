package com.chelimo.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A03_Test3 {
    public static void main(String[] args) {
        /*自动点名器3
                班级里有N个学生
        要求:
        被点到的学生不会再被点到。
        但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。
         */
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list,
                "马超", "司空震", "吕布", "宫本武藏", "百里玄策"
                , "小乔", "安琪拉", "少思缘", "朵利亚", "不知火舞");
        Random r = new Random();
        for (int i = 0; i < 20; ) {
            int index = r.nextInt(list.size());
            String name = list.get(index);
            if(list2.contains(name)){
                if(list2.size()==list.size()){
                    list2.clear();
                }
            }else{
                    list2.add(name);
                    i++;
                    System.out.println(name + list2.size());
                    System.out.println(list2);
            }
        }
    }
}
