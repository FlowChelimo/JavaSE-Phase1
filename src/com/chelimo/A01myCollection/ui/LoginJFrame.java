package com.chelimo.A01myCollection.ui;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    //规定:LoginJFrame这个界面表示的就是登录的主界面
    //以后跟登录相关的所有逻辑都写在这个类中
    public LoginJFrame() {
        //设置界面的宽高
        this.setSize(488, 430);
        //设置界面的标题
        this.setTitle("拼图单机版  登录");
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
