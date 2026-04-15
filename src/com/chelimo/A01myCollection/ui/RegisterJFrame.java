package com.chelimo.A01myCollection.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //规定:RegisterJFrame这个界面表示的就是注册的主界面
    //以后跟注册相关的所有逻辑都写在这个类中
    public RegisterJFrame() {
        //设置界面的宽高
        this.setSize(488, 500);
        //设置界面的标题
        this.setTitle("拼图单机版  注册");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //点击右上角叉号，程序也会随之停止


        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }
}
