package com.chelimo.A01myCollection.search;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        //二分查找/折半查找
        //核心:
        //每次排除一半的查找范围
        //前提条件:数组中的数据必须是有序的
        //核心逻辑:每次排除一半的查找范围

        //需求:定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下:{7，23，79，81，103，127，131，147}
        int [] arr = {7,23,79,81,103,127,131,147};
        int target = 131;
        System.out.println(BinarySearch(arr, target));
    }
    public static int BinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            // 避免整数溢出的安全写法!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                // 目标在右半部分，左边界右移
                left = mid + 1;
            } else {
                // 目标在左半部分，右边界左移
                right = mid - 1;
            }
        }
        // 未找到目标
        return -1;
    }
//1.二分查找的优势?
//    提前查找效率
//2.二分查找的前提条件?
//    数据必须是有序的
//    如果数据是乱的，先排序再用二分查找得到的索引没有实际意义，只能确定当
//    前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了
//3.二分查找的过程
//    min和max表示当前要查找的范围
//    mid是在min和max中间的
//    如果要查找的元素在mid的左边，缩小范围时
//    min不变，max等于mid减1
//    如果要查找的元素在mid的右边，缩小范围时，max不变，min等于mid加1

}

