package a02day02.src;

public class twoDimensionDemo1 {
    public static void main(String[] args) {
        //二维数组的静态初始化
        //格式 数据类型 [][] 数组名 = new 数据类型[][] {{元素1,元素2},{元素1，元素2}}
        //范例int [][] arr = new int [][] {{11,22},{33,44}};
        //简化格式
        int [][] arr1 = {{11,22},{33,44}};
        //注意 以后建议这样定义，把每一个一维数组，单独写成一行
        int [][] arr = {{1,2},
                        {3,4,5},
                        {6,7,8,9}
                      };
        //获取其中的元素
//        System.out.println(arr[0][0]);
        //二维数组的遍历
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        //二维数组的动态初始化
        //格式 数据类型 [][] 数组名 = new int [m][n];
        //3表示二维数组长度为三，可以装3个一维数组
        //5表示每一个一维数组的长度都是5，可以装5个int类型的数组
        int [][] arr2 = {{5},{3}};

//        1.当我们需要把数据分组管理的时候，就需要用到二维数组
//        2.掌握二维数组的静态初始化、动态初始化
//        3.如何给二维数组中的元素赋值
//        4.如何遍历二维数组


    }
}
