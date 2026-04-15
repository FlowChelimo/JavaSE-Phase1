package com.chelimo.A01myCollection.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        //设置界面的宽高
        frame.setSize(603,680);
        //设置界面的标题
        frame.setTitle("事件演示");
        //设置界面置顶
        frame.setAlwaysOnTop(true);
        //设置界面居中
        frame.setLocationRelativeTo(null);
        //设置关闭模式
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //取消默认的居中放置，只有取消了才会按照xY轴的形式添加组件
        frame.setLayout(null);

        //创建一个按钮对象
        JButton jtb1 = new JButton("点我啊");
        //设置位置和宽高
        jtb1.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jtb:组件对象，表示你要给哪个组件添加事件
        //addActionListener:表示我要给组件添加哪个事件监听(动作监听鼠标左键点击空格)
        //参数 表示事件被触发后要执行的代码
        //注意 这里参数中myActionListener只能被使用一次 被jtb1使用 可以使用    匿名内部类
        //jtb1.addActionListener(new myActionListener());
        jtb1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) { //这个大括号是匿名内部类 实现了前面ActionEvent接口
                System.out.println("按钮被点击了");        //所以要重写里面的方法
            }
        });
        //把按钮添加到界面当中
        frame.getContentPane().add(jtb1);

        frame.setVisible(true);
    }
}
