package a01day01;

public class switchDemo1 {
    public static void main(String[] args) {
        //switch执行流程
        //1.首先计算表达式的值
        //2.依次和case后面的值进行比较，如果有对应的值，就会执行相应的语句
        //  在执行的过程中，遇到break就会结束
        //3.如果case的值和表达式里的值都不匹配，就会执行default里面的语句体，然后结束整个switch里面的语句
        //4.case后面的值只能是字面量，不能是变量，case给出的值不允许重复
        String noodles = "面2";
        switch (noodles) {
            case "面1":
                System.out.println("吃面1");
                break;
            case "面2":
                System.out.println("吃面2");
                break;
            case "面3":
                System.out.println("吃面3");
                break;
            default:
                System.out.println("只能吃泡面");
        }
        //1.default的位置和省略
        //   default不一定要写在最下面，可以写在任意位置，只不过平时习惯写在最下面
        //   default可以省略，语法不会有问题，但是不建议省略
        //2.case穿透----是由于没写break导致的，会执行所有语句体(如果语句体重复，可以用case穿透来简化代码)
        //   执行流程:首先还是会拿着小括号中表达式的值跟下面每一个case进行匹配
        //   如果匹配上了，就会执行对应的语句体，如果发现了break,就会结束整个switch语句
        //   如果没有发现break,那么程序就会执行下一个case语句体，一直遇到break或者右大括号为止
        //3.switch新特性
        int a = 1;
        switch (a) {
            case 1 ->{
                System.out.println("1");
            } case 2 ->{
                System.out.println("2");
            }case 3 ->{
                System.out.println("3");
            }
            default ->{
                System.out.println("没有这种选项");
            }
        }//可以不用写break，也不会出现case穿透
    }
}
