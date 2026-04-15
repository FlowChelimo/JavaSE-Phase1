package a02day02.src.Test5I;

public class GoodsTest {
    public static void main(String[] args) {
        Goods [] arr = new Goods[3];
        Goods goods1 = new Goods("001","手机",4000.0,10 );
        Goods goods2 = new Goods("002","保温杯",200.0,40 );
        Goods goods3 = new Goods("003","枸杞",14.0,70 );
        arr[0] = goods1;
        arr[1] = goods2;
        arr[2] = goods3;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getId() + " ");
            System.out.print(arr[i].getName() + " ");
            System.out.print(arr[i].getPrice() + " ");
            System.out.print(arr[i].getCount() + " ");
        }
    }
}
