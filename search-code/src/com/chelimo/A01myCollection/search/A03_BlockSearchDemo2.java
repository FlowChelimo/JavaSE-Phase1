package com.chelimo.A01myCollection.search;

public class A03_BlockSearchDemo2 {
    public static void main(String[] args) {
        //分块查找(扩展)
        //如果数组中数据顺序太乱，不能直接顺序分组
        //此时就把它们分成各个组之间没有[交集]的组
        //block类中新添加一个属性min(表范围)

        //1.要把数据进行分块
        int [] arr = {27, 22, 30, 40, 36,
                        13, 19, 16, 20,
                        7,10,
                        43, 50, 48};
        //2.创建block对象
        block2 b1 = new block2(22, 30, 0, 4);
        block2 b2 = new block2(13, 20, 5, 8);
        block2 b3 = new block2(7, 10, 9, 10);
        block2 b4 = new block2(43, 48, 11, 13);
        //3.创建数组blockArr存放每一个块对象的信息
        block2 [] blocks = {b1, b2, b3, b4};
        //4.要查找的数据
        int number = 19;
        //5.查找数据
        System.out.println(getIndex(blocks[getBlockIndex(blocks, number)], arr, number));
    }
    //方法:查找blockArr确定要查找的数据属于哪一块
    public static int getBlockIndex(block2 [] blocks, int number) {
        for (int i = 0; i < blocks.length; i++) {
            if(number >= blocks[i].getMin() && number <= blocks[i].getMax()){
                return i;
            }
        }
        return -1;
    }
    //方法:找到查找的数据在哪一块后，基本查找找出在原数组中的索引
    public static int getIndex(block2 b,int [] arr, int number){
        for (int i = b.getStartIndex(); i < b.getEndIndex(); i++) {
            if(arr [i] == number){
                return i;
            }
        }
        return -1;
    }
}
class block2{
    private int min;
    private int max;
    private int startIndex;
    private int endIndex;

    public block2() {
    }

    public block2(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    /**
     * 获取
     * @return min
     */
    public int getMin() {
        return min;
    }

    /**
     * 设置
     * @param min
     */
    public void setMin(int min) {
        this.min = min;
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
        return "block2{min = " + min + ", max = " + max + ", startIndex = " + startIndex + ", endIndex = " + endIndex + "}";
    }
}
