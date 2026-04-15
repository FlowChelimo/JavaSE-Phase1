package a03day03.src.StringBuilderDemo;

public class StringBuilderDemo7 {
    public static void main(String[] args) {
        //练习 拼接字符串
        //需求:定义一个方法，把 int数组中的数据按照指定的格式拼接成一个字符串返回，
        //调用该方法，并在控制台输出结果。
        //例如:数组为int[l arr ={1,2,3};
        //执行方法后的输出结果为:[1，2,3]
        int [] arr = {1,2,3,4,5};
        String str = arrToString(arr);
        System.out.println(str);

    }
    public static String arrToString(int [] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
