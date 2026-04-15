package com.chelimo.A01myCollection.search;

public class A03_BlockSearchDemo1 {
    public static void main(String[] args) {
        /*分块查找
        核心思想:
        块内无序，块间有序
        实现步骤:
        1.创建数组blockArr存放每一个块对象的信息
        2.先查找blockArr确定要查找的数据属于哪一块
        3.再单独遍历这一块数据即可 */

        //1.要把数据进行分块，分根号18  4.24块
        int[]arr ={16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};
        //2.创建block对象
        block b1 = new block(21,0,5);
        block b2 = new block(45,6,11);
        block b3 = new block(75,12,17);
        //3.创建数组blockArr存放每一个块对象的信息
        block [] blockArr = {b1,b2,b3};
        //4.要查找的数据
        int number = 45;
        //5.查找数据
        System.out.println(getIndex(blockArr[getBlockIndex(blockArr, number)], arr, number));
    }
    //方法:查找blockArr确定要查找的数据属于哪一块
    public static int getBlockIndex(block [] blockArr, int number) {
        for (int i = 0; i < blockArr.length; i++) {
            if(number <= blockArr[i].getMax()){
                return i;
            }
        }
        return -1;
    }
    //方法:找到查找的数据在哪一块后，基本查找找出在原数组中的索引
    public static int getIndex(block b,int [] arr, int number){
        for (int i = b.getStartIndex(); i < b.getEndIndex(); i++) {
            if(arr [i] == number){
                return i;
            }
        }
        return -1;
    }
}
//类block标准JavaBean
class block{
    private int max;
    private int startIndex;
    private int endIndex;

    public block() {
    }

    public block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return max
     */
    public int getMax() {
        return max;
    }

    /**
     * 设置
     * @param max
     */
    public void setMax(int max) {
        this.max = max;
    }

    /**
     * 获取
     * @return startIndex
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * 设置
     * @param startIndex
     */
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    /**
     * 获取
     * @return endIndex
     */
    public int getEndIndex() {
        return endIndex;
    }

    /**
     * 设置
     * @param endIndex
     */
    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }

    public String toString() {
        return "block{max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
