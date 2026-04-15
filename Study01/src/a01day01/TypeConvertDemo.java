package a01day01;

public class TypeConvertDemo {
    public static void main(String[] args) {
        //数字进行运算时，数据类型不一样不能运算，需要转成一样的才能运算
        //隐式转换(自动类型提升)     取值范围小的-->取值范围大的
            //取值范围小的和取值范围大的再进行运算时小的会先提升为大的再进行运算
            //byte short char三种类型的数据在进行运算时都会直接先提升为int,再进行运算
        //强制转换     取值范围大的-->取值范围小的
        //byte--short-int-long-float-double
           //如果把一个取值范围大的数值赋值给一个取值范围小的变量
           //是不允许直接赋值的，如果一定他要这么做就需要强制类型转换
           //格式：目标数据类型 变量名 = (目标数据类型)被强转的数据
        double a = 12.3;
        int b =(int)a;
        System.out.println(b);//12

    }
}
