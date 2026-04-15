public class Test01 {
    public static void main(String[] args) {
//        需求:世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，假如我
//        有一张足够大的纸，它的厚度是0.1毫米。
//        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
          double paper = 0.1;
          int j = 0;
          double height = 8844430;
          while(paper <= height){
              paper = paper * 2;
              j++;
          }
          System.out.println("需要折叠" + j + "次后可以到达珠穆朗玛峰的高度");

    }
}
