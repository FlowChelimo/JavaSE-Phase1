package com.chelimo.A01myCollection.a03RuntimeDemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        /*
        public static Runtime getRuntime()      当前系统的运行环境对象
        public void exit(int status)            停止虚拟机
        public int availableProcessors()        获得CPU线程数
        public long maxMemory()                 JVM能从系统中获取总内存大小(单位byte)
        public long totalMemory()               JVM已经从系统中获取总内存大小(单位byte)
        public long freeMemory()                JVM剩余内存大小(单位byte)
        public Process exec(String command)     运行cmd命令
        */

        //1.获取Runtime的对象
        Runtime r1 = Runtime.getRuntime();
        //2.exit 停止虚拟机
//        Runtime.getRuntime().exit(0);//----其实就是System.exit的底层源码
        //3.获得CPU的线程数
        System.out.println(Runtime.getRuntime().availableProcessors());//24
        //4.总内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().maxMemory()/ 1024 / 1024);//8012
        //5.已经获取的总内存大小,单位byte字节
        System.out.println(Runtime.getRuntime().totalMemory()/ 1024 / 1024);//508
        //6.剩余内存大小
        System.out.println(Runtime.getRuntime().freeMemory()/ 1024 / 1024);//500
        //7.运行cmd命令
        //shutdown :关机
        //加上参数才能执行
        //-s :默认在1分钟之后关机
        //-s-t指定时间: 指定关机时间
        //-a:取消关机操作
        //-r:关机并重启
//        Runtime.getRuntime().exec( "shutdown -s -t 3600");    一小时后关机
        Runtime.getRuntime().exec( "shutdown -a");
        Runtime.getRuntime().exec("notepad");//打开记事本



    }
}
