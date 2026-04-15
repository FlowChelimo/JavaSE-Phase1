package com.chelimo.A01myCollection.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //JFrame 界面，窗体
    //子类呢?也表示界面，窗体
    //规定:GameJFrame这个界面表示的就是游戏的主界面
    //以后跟游戏相关的所有逻辑都写在这个类中
    //4.创建一个二维数组
    String [][] date = new String[4][4];
    //记录空白方块在二维数组中的位置
    int x = 0, y = 0;
    int step = 0;
    //创建选项下面的条目对象
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    JMenuItem rulerItem = new JMenuItem("更多");

    String [][] win = new String[][]{

        {"G:\\puzzlegame\\埃隆马斯克-cropped_r1_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c1.png"},
        {"G:\\puzzlegame\\埃隆马斯克-cropped_r1_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c2.png",},
        {"G:\\puzzlegame\\埃隆马斯克-cropped_r1_c3.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c3.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c3.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c3.png",},
        { "G:\\puzzlegame\\埃隆马斯克-cropped_r1_c4.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c4.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c4.png",""}
    };

    public GameJFrame() {
        //初始化界面
        initJFrame();
        //初始化菜单
        initManuBar();
        //初始化数据(打乱)
        initDate();
        //初始化图片
        initImage();

        //让界面显示出来，建议写在最后
        this.setVisible(true);
    }

    private void initDate() {
        //1.定义一个一维数组
        String[] tempArr = {
                "",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r1_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r1_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r1_c3.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r1_c4.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c3.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c4.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c3.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c4.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c1.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c2.png",
                "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c3.png",
        };
        //2.打乱数组中数据的顺序
        //遍历数组：得到每一个元素，拿着每一个元素跟随即索引上的数据进行交换
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            String temp = tempArr[i];
            //获取到随机索引
            int index = r.nextInt(tempArr.length);
            tempArr[i] = temp;
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }
        //3.遍历数组
        //5.给二维数组添加数据
        //解法一:
        //遍历一维数组tempArr得到每一个元素，把每一个元素依次添加到二维数组当中
        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] == ""){
                x = i/4;
                y = i%4;
            }
                date[i / 4][i % 4] = tempArr[i];
        }
    }

        private void initImage () {//---------------------------------------
            //清空原本已经出现的所有图片
            this.getContentPane().removeAll();
//            if(victory()){
//                //显示胜利的图标
//                JLabel winLabel = new JLabel(new ImageIcon("G:\\puzzlegame\\win!.jpg"));
//                winLabel.setBounds(0, 0, this.getWidth(), this.getHeight());
//                this.getContentPane().add(winLabel);
//            }

            JLabel stepCount = new JLabel("步数；" + step);
            stepCount.setBounds(0, 0,150,30);
            this.getContentPane().add(stepCount);

            //路径分为两种:
            //绝对路径:一定是从盘符开始的。C:\ D:\
            //相对路径:不是从盘符开始的
            //相对路径相对当前项目而言的。aaa\\bbb
            //在当前项目下，去找aaa文件夹，里面再找bbb文件夹:

            //细节 先加载的图片在上方
        //     后加载图片塞在下面

            for (int j = 0; j < 4; j++) {
                for (int i = 0; i < 4; i++) {
                    //                           创建一个图片ImageIcon的对象
                    //创建一个JLabel的对象(管理容器)    ||||
                    JLabel label1 = new JLabel(new ImageIcon(date[i][j]));
                    //指定图片位置
                    label1.setBounds(250 * i + 10, 250 * j +10 , 250, 250);
                    //给图片添加边框
                    //0：表示让图片凸起来
                    //1：表示让图片凹下去
                    label1.setBorder(new BevelBorder(BevelBorder.RAISED));
                    //把管理容器添加到界面中
                    //this.add(label1);  --------  也可以，add方法被做了封装优化，会自动将组件添加到JFrame中，
                    //                             等价与手动调用  getContentPane().add(label1)
                    getContentPane().add(label1);
                }
            }
            //添加背景图片
            ImageIcon dg = new ImageIcon("");
            JLabel image = new JLabel(dg);
            image.setBounds(40, 40,1080, 1080);
            //把背景图片添加到界面中
            this.getContentPane().add(image);

            //刷新一下界面
            this.getContentPane().repaint();

        }


        private void initManuBar () {//--------------------------------------
            //初始化菜单
            //创建整个的菜单对象
            JMenuBar jMenuBar = new JMenuBar();

            //创建菜单上面的两个选项的对象(功能,关于我们)

            JMenu functionJMenu = new JMenu("功能");
            JMenu aboutJMenu = new JMenu("关于我们");
            JMenu helpJMenu = new JMenu("帮助");

//            //创建选项下面的条目对象
//
//            JMenuItem replayItem = new JMenuItem("重新游戏");
//            JMenuItem reLoginItem = new JMenuItem("重新登录");
//            JMenuItem closeItem = new JMenuItem("关闭游戏");
//            JMenuItem accountItem = new JMenuItem("公众号");
//            JMenuItem rulerItem = new JMenuItem("更多");

            //将每一个选项下面的条目添加到选项当中

            functionJMenu.add(replayItem);
            functionJMenu.add(reLoginItem);
            functionJMenu.add(closeItem);

            aboutJMenu.add(accountItem);
            helpJMenu.add(rulerItem);

            //给条目绑定事件
            replayItem.addActionListener(this);
            reLoginItem.addActionListener(this);
            closeItem.addActionListener(this);
            accountItem.addActionListener(this);
            rulerItem.addActionListener(this);

            //将菜单里面的两个选项添加到菜单当中
            jMenuBar.add(functionJMenu);
            jMenuBar.add(aboutJMenu);
            jMenuBar.add(helpJMenu);
            this.setJMenuBar(jMenuBar);
        }

        private void initJFrame () {//---------------------------------------
            //设置界面的宽高
            this.setSize(1003, 1080);
            //设置界面的标题
            this.setTitle("拼图单机版 V1.0");
            //设置界面置顶
            this.setAlwaysOnTop(true);
            //设置界面居中
            this.setLocationRelativeTo(null);
            //设置点击插号后关闭
            this.setDefaultCloseOperation(3);
            //取消默认居中放置
            this.setLayout(null);
            //给整个界面添加键盘监听事件-----------------------------------------
            this.addKeyListener(this);
        }

        //触发时机 按下并释放一个可打印字符键
    @Override
    public void keyTyped(KeyEvent e) {

    }
        //触发时机 按下任意一个键盘按键 长按图片会一直换不符合此游戏逻辑
    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //把界面中所有图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整的图片
            JLabel label1 = new JLabel(new ImageIcon("G:\\puzzlegame\\埃隆马斯克-cropped.png"));
            label1.setBounds(-55,-40,1080, 1080);
            this.getContentPane().add(label1);
            //加载背景图片
            //添加背景图片
            JLabel label2 = new JLabel(new ImageIcon(""));
            label2.setBounds(0,0,1080, 1080);
            //把背景图片添加到界面当中
            this.getContentPane().add(label2);
            //刷新界面
            this.getContentPane().repaint();
        }
    }
        //触发时机 释放一个已经按下的键盘按键
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利，如果胜利，此方法需要直接结束，不能再执行下面的移动代码了
        if(victory()) {
            //结束方法
            return;
        }

            //对上，下，左，右进行判断
        //左:37 上:38 右:39 下:40
        //逻辑:
        //把空白方块下方的数字往上移动
        //x，y 表示空白方块
        //x+1，y 表示空白方块下方的数字
        //把空白方块下方的数字赋值给空白方块
        //调用方法按照最新的数字加载图片
        int code = e.getKeyCode();
        if (code == 37) {
            if(x == 0){
                return;
            }
            System.out.println("向左移动");
            date[x][y]= date[x-1][y];
            date[x-1][y] = "";
            x--;
            step++;
            initImage();
        } else if (code == 38) {
            if(y == 0){
                return;
            }
            System.out.println("向上移动");
            date[x][y]= date[x][y-1];
            date[x][y-1] = "";
            y--;
            step++;
            initImage();
        } else if (code == 39) {
            if(x == 3){
                return;
            }
            System.out.println("向右移动");
            date[x][y]= date[x+1][y];
            date[x+1][y] = "";
            x++;
            step++;
            initImage();
        } else if (code == 40) {
            if(y == 3){
                return;
            }
            System.out.println("向下移动");
            date[x][y]= date[x][y+1];
            date[x][y+1] = "";
            y++;
            step++;
            initImage();
        }else if (code == 65) {
            initImage();
        } else if (code == 87) {
            date = new String[][]{
                    {"G:\\puzzlegame\\埃隆马斯克-cropped_r1_c1.png",
                     "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c1.png",
                     "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c1.png",
                     "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c1.png"},
                    {"G:\\puzzlegame\\埃隆马斯克-cropped_r1_c2.png",
                      "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c2.png",
                      "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c2.png",
                      "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c2.png",},
                    {"G:\\puzzlegame\\埃隆马斯克-cropped_r1_c3.png",
                     "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c3.png",
                     "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c3.png",
                     "G:\\puzzlegame\\埃隆马斯克-cropped_r4_c3.png",},
                    { "G:\\puzzlegame\\埃隆马斯克-cropped_r1_c4.png",
                      "G:\\puzzlegame\\埃隆马斯克-cropped_r2_c4.png",
                      "G:\\puzzlegame\\埃隆马斯克-cropped_r3_c4.png",""}
            };
            initImage();
        }
    }
    public boolean victory(){
        for (int i = 0; i < date.length; i++) {
            for (int j = 0; j < 4; j++) {
                if (date[i][j] != win[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == replayItem){
            System.out.println("重新游戏");
            //计步器清零 ------------ 顺序要放在第一个！
            step = 0;
            //再次打乱二维数组中的数据
            initDate();
            //重新加载图片
            initImage();

        } else if (obj == reLoginItem) {
            System.out.println("重新登录");
            //关闭当前的游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        } else if (obj == closeItem) {
            System.out.println("关闭游戏");
            //直接关闭虚拟机即可
            System.exit(0);

        } else if (obj == accountItem) {
            System.out.println("公众号");
            //创建一个弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象JLabe1
            JLabel jLabel = new JLabel(new ImageIcon("G:\\puzzlegame\\个人名片.jpg"));
            jLabel.setBounds(0, 0, 500, 500);
            //把图片添加到弹框当中
            jDialog.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog.setSize(600,600);
            //给弹框设置标题
            jDialog.setTitle("关于我们 --> 公众号");
            //让弹框置顶
            jDialog.setAlwaysOnTop(true);
            //让弹框居中
            jDialog.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog.setModal(true);
            //让弹框显示出来
            jDialog.setVisible(true);

        } else if (obj == rulerItem) {
            System.out.println("更多");
            //创建一个弹框对象
            JDialog jDialog1 = new JDialog();
            //创建一个管理图片的容器对象JLabe1
            JLabel jLabel = new JLabel(new ImageIcon("G:\\puzzlegame\\拼图游戏规则.jpg"));
            jLabel.setBounds(0, 0, 300, 300);
            //把图片添加到弹框当中
            jDialog1.getContentPane().add(jLabel);
            //给弹框设置大小
            jDialog1.setSize(400,400);
            //给弹框设置标题
            jDialog1.setTitle("帮助 --> 更多");
            //让弹框置顶
            jDialog1.setAlwaysOnTop(true);
            //让弹框居中
            jDialog1.setLocationRelativeTo(null);
            //弹框不关闭则无法操作下面的界面
            jDialog1.setModal(true);
            //让弹框显示出来
            jDialog1.setVisible(true);
        }
    }
}
