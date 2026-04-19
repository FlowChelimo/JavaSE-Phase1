package com.chelimo.a03test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class A01_Test1 {
    public static void main(String[] args) {
        /*自动点名器1
        班级里有N个学生，实现随机点名器。
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,
                "马超", "司空震", "吕布", "宫本武藏", "百里玄策"
                        , "小乔", "安琪拉", "少思缘", "朵利亚", "不知火舞");
        Random r = new Random();
        System.out.println(list.get(r.nextInt(list.size())));
    }
}
