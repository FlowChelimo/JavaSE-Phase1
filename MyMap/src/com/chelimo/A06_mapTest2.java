package com.chelimo;

import javax.swing.*;
import java.util.*;

public class A06_mapTest2 {
    public static void main(String[] args) {
        /*案例
        Map集合案例-统计投票人数
        需求
        某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D),每个学生只
        能选择一个景点，请统计出最终哪个景点想去的人数最多。*/
        String [] arr = {"A","B","C","D"};
        Random r = new Random();
        //模拟八十个同学投票结果 并用集合存储起来
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            list.add(arr[r.nextInt(arr.length)]);
        }
        //当旅游经典数量未知时，不方便定义计数器，此时采用hashmap
        HashMap <String,Integer> map = new HashMap();
        for(String name: list){
            //判断当前景点在map中是否存在
            if(map.containsKey(name)){
                int count = map.get(name);
                count++;
                //把新的次数添加到map当中
                map.put(name,count);
            }else{
                map.put(name,1);
            }
        }
        System.out.println(map);

        Set<Map.Entry<String,Integer>> entries = map.entrySet();
        int max = 0;
        for(Map.Entry<String,Integer> entry: entries){
            if(entry.getValue()>max){
                max = entry.getValue();
            }
        }
        for(Map.Entry<String,Integer> entry: entries){
            if(entry.getValue()==max){
                System.out.println(entry.getKey());
            }
        }
    }
}
