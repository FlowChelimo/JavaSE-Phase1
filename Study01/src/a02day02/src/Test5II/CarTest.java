package a02day02.src.Test5II;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car [] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            Car car = new Car();
            System.out.println("请输入汽车品牌");
            String brand = sc.next();
            System.out.println("请输入汽车价格");
            int price = sc.nextInt();
            System.out.println("请输入汽车颜色");
            String color = sc.next();
            car.setBrand(brand);
            car.setPrice(price);
            car.setColor(color);
            arr[i] = car;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i].getBrand() + " " + arr[i].getPrice() + " " + arr[i].getColor());
            System.out.println();
        }
    }
}
