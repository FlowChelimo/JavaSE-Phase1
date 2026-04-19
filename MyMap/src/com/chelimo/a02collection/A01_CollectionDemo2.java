package com.chelimo.a02collection;

import java.util.ArrayList;
import java.util.Collections;

public class A01_CollectionDemo2 {
    public static void main(String[] args) {
        /*
        public static<T> void sort(List<T> list)                        排序
        public static <T> void sort(List<T> list, Comparator<T> c)      根据指定的规则进行排序
        public static <T>int binarysearch(List<T> list, T key)          以二分查找法查找元素
        public static <T> void copy(List<T> dest, List<T> src)          拷贝集合中的元素
        public static <T> int fill(List<T> list, T obj)                 使用指定的元素填充集合
        public static <T> void max/min(collection<T> co11)              根据默认的自然排序获取最大/小值
        public static <T> void swap(List<?> list, int i, int j)         交换集合中指定位置的元素
         */
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "a", "b", "c", "d", "e");
        Collections.shuffle(list);
        System.out.println("==========排序=========");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("=========以二分查找法查找元素==========");
        int a = Collections.binarySearch(list, "b");
        System.out.println(a);
        System.out.println("========根据指定规则进行排序===========");
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        System.out.println("========拷贝集合中的元素===========");//必须先让目标集合有足够的长度
        ArrayList <String> list2 = new ArrayList<>(Collections.nCopies(list.size(), null));
        Collections.copy(list2, list);
        System.out.println(list2);
        System.out.println("=========使用指定的元素填充集合==========");
        Collections.fill(list2, "G");
        System.out.println(list2);
        System.out.println("=========根据默认的自然排序获取最大/小值==========");
        System.out.println("默认自然排序最大值是" + Collections.max(list));
        System.out.println("默认自然排序最小值是" + Collections.min(list));
        System.out.println("=========交换集合中指定位置的元素=========");
        System.out.println(list);
        Collections.swap(list, 0, 1);
        System.out.println(list);
    }
}
