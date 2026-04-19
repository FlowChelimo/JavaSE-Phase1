package com.chelimo.doudizhu1;

public class app {
    static void main() {
        //以后写项目时，一般不在main方法里面写核心逻辑
        //直接创建一个类，在类中写核心逻辑
        //在main方法里面new了一个类之后，会自动调用空参构造，可以在空参构造里面写 洗牌 发牌 看牌

        new PokerGame();
    }
}
