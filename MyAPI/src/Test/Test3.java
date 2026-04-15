package Test;

public class Test3 {
    public static void main(String[] args) {
        /*练习 猴子吃桃子
        有一堆桃子，猴子第一天吃了其中的一半，并多吃了一个!以后每天猴子都吃当前剩下来的一半，然后
        再多吃一个，第10天的时候(还没吃)，发现只剩下一个桃子了，请问，最初总共多少个桃子?
         */
        //  X/2-1=Y     X=2(Y+1)
        //Fn(10) = 1
        //Fn(9) = 2(Fn(10)+1)
        System.out.println(getCount(1));
    }
    public static int getCount(int r) {
        if(r <= 0 || r >= 11){
            System.out.println("当前时间错误");
            return -1;
        }
        if(r == 10){
            return 1;
        }
        return (getCount(r + 1)+1)*2;
    }
}
