package a01day01;

public class ifDemo1 {
    public static void main(String[] args) {
        //if的第一种格式与注意事项
        //注意事项
        //1.大括号的开头可以另起一行书写，但是建议写在第一行的末尾，不建议
               //int a = 2;(包含两句代码，1定义变量a,给变量a赋值为2)
        //2.在语句体中,如果只有一行代码，大括号可以省略不写
        //3.如果对一个布尔类型的变量进行判断，不要用==号(方便)
        boolean flag = true;
        if (flag) {
            System.out.println("flag的值为true");
        }
        //if的第二种格式
           if (flag) {
               //语句体1
           }else{
               //语句体2
           }
        //if的第三种格式
        int a = 3;
           if (a == 3) {
               System.out.println("<UNK>");
           }else if (a == 4) {
               System.out.println("<UNK>");
           }else{
               System.out.println("<UNK>");
           }
    }
}
