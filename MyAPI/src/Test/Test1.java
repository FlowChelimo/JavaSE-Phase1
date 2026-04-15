package Test;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        /*练习
        按照要求进行排序
        定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
        要求1:属性有姓名、年龄、身高。
        要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
        (姓名中不要有中文或特殊字符，会涉及到后面的知识)

        String st1 = "a";//97
        String st2 = "b";//98
        System.out.println(st1.compareTo(st2));//-1 (compareTo方法会按照字典里顺序进行比较)*/
        //1.
        girlFriend f1 = new girlFriend("AGST", 23, 176);
        girlFriend f2 = new girlFriend("YN", 19, 170);
        girlFriend f3 = new girlFriend("SAR", 19, 170);
        girlFriend[] arr = {f1, f2, f3};
        Arrays.sort(arr, (o1, o2) -> {
                    if (o1.getAge() != o2.getAge()) return o1.getAge() - o2.getAge();
                    else if (o1.getAge() == o2.getAge())
                        if (o1.getName().compareToIgnoreCase(o2.getName()) != 0) return o1.getHeight() - o2.getHeight();
                    return 0;
                }
        );
        System.out.println(Arrays.toString(arr));
        //2.三元运算符，不用if else
//        Arrays.sort(arr, (girlFriend o1, girlFriend o2) -> {
//                    int temp = o1.getAge() - o2.getAge();
//                    temp = temp == 0 ? o1.getHeight() - o2.getHeight() : temp;
//                    temp = temp == 0 ? o1.getName().compareTo(o2.getName()): temp;
//                }
//        if(temp >0){
//            return 1;
//        }else if(temp < 0){
//            return -1;
//        }else{
//            return 0;
//        );
//          return 1
//          含义：表示 01>02(01 比02 大）
//          排序效果：排序算法会把 02 放在前
//          面，01 放在后面（升序排序时，大的数
//          往后排）
    }
}

class girlFriend {
    private String name;
    private int age;
    private int height;

    public girlFriend() {
    }

    public girlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "girlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
