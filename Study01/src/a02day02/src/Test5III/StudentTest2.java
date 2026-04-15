package a02day02.src.Test5III;

public class StudentTest2 {
    public static void main(String[] args) {
//    案例
//    对象数组5
//    定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同
//    学生的属性:学号，姓名，年龄。
//    要求3:通过id删除学生信息
//    如果存在，则删除，如果不存在，则提示删除失败，
//    要求4:删除完毕之后，遍历所有学生信息，
//    要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        Student [] arr = new Student[3];
        Student stu1 = new Student(1,"张三",20);
        Student stu2 = new Student(2,"李四",21);
        Student stu3 = new Student(3,"王五",22);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        int id = getIndex(arr,4);
        if(id >= 0){
            arr[id] = null;
            printArr(arr);
        }else{
            //说明查找的id对应的学生不存在
            System.out.println("当前id不存在，删除失败");
        }
    }
    //方法 找到id所对应的索引
    public static int getIndex(Student[] arr, int index) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if (stu != null) {
                int sid = stu.getId();
                if (sid == index) {
                    return i;
                }
            }
        }
        //当循环结束之后还没有找到 就返回一个负一 (数组中没有为负一的索引)
        return -1;
    }
    //方法 遍历数组中的元素(元素不为null)
    public static void printArr(Student [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getId() + " , " + arr[i].getName() + " , " + arr[i].getAge());
            }
        }
    }
}
