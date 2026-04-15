package a03interface.interface6;
//默认方法 --- (public) default
//静态方法 --- (public) static
//私有方法 --- private  --->  普通的私有方法，给默认方法服务
//            private static --->  静态的私有方法，给静态方法服务
public interface Inter {
    public static void show1(){
        System.out.println("show1方法开始执行了");
        //show3();   非静态不可用
        show4();
    }
    public static void show2(){
        System.out.println("show2方法开始执行了");
        show4();
    }
    private void show3(){
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }
    private static void show4(){
        System.out.println("记录程序在运行过程中的各种细节，这里有100行代码");
    }
}
