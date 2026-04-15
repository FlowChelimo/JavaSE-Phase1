public class Test03 {
    public static void main(String[] args) {
//        案例 数组元素的复制
//        需求:
//        把一个数组中的元素复制到另一个新数组中去。
        int arr [] = {1,2,3,4,5,6,7,8,9};//老数组
        int arr1 [] = copyArr(arr);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
    public static int[] copyArr(int[] arr) {
        int arr1 [] = new int [arr.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
}
