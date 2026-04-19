package com.chelimo.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A02_Test2 {
    public static void main(String[] args) {
        /*自动点名器2
        班级里有N个学生
        要求:
        70%的概率随机到男生
        30%的概率随机到女生
        */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,
                "马超", "司空震", "吕布", "宫本武藏", "百里玄策"
                , "小乔", "安琪拉", "少思缘", "朵利亚", "不知火舞");
        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0);
        Random r = new Random();
        int i = list2.get(r.nextInt(list2.size()));
        System.out.println(i);
        if (i == 1) {
            System.out.println(list.get(r.nextInt(5)));//包左不包右[0,1,2,3,4,5)
        } else {
            System.out.println(list.get(r.nextInt(5) + 5));//包左不包右[5,6,7,8,9,10)
        }
    }
}
