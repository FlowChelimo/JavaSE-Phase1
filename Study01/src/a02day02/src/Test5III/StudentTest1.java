package a02day02.src.Test5III;

public class StudentTest1 {
    public static void main(String[] args) {
//    案例
//    对象数组5
//    定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同
//    学生的属性:学号，姓名，年龄。
//    要求1:再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
//    要求2:添加完毕之后，遍历所有学生信息。
//    要求3:通过id删除学生信息
//    如果存在，则删除，如果不存在，则提示删除失败，
//    要求4:删除完毕之后，遍历所有学生信息，
//    要求5:查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁
        Student [] arr = new Student[3];
        Student stu1 = new Student(1,"张三",20);
        Student stu2 = new Student(2,"李四",21);
        Student stu3 = new Student(3,"王五",22);
        Student stu4 = new Student(4,"赵六",23);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        boolean flag = contains(arr, stu4.getId());
        if(flag) {
            System.out.println("所录入新同学的学号重复了");
        }else {
            int count = getCount(arr);
            if (count == arr.length) {
                //说明原先数组已经满了
                //此时需要创建一个新数组 长度为老数组长度+1
                Student[] newArr = creatArr(arr);
                newArr[count] = stu4;
                printArr(newArr);
            } else {
                arr[count] = stu4;
                printArr(arr);
            }
        }
        System.out.println("============================================");
        // 要求--5
        int id = getIndex(arr, 2);
        if(id != -1) {
            Student stu = arr[id];
            int newAge = stu.getAge() + 1;
            stu.setAge(newAge);
            printArr(arr);
        }else{
            System.out.println("当前id不存在，修改失败");
        }
    }
    //方法 进行学号的唯一性判断
    public static boolean contains(Student [] arr, int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                Student stu = arr[i];
                if(stu.getId() == id){
                    return true;
                }
            }
        }
        return false;
    }
    //需要再次添加一个学生对象，就要看原来数组满没满

    //方法 检查原来数组里面的元素个数
    public static int getCount(Student [] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                count++;
            }
        }
        return count;
    }
    //方法 遍历数组中的元素(元素不为null)
    public static void printArr(Student [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(arr[i].getId() + " , " + arr[i].getName() + " , " + arr[i].getAge());
            }
        }
    }
    //方法 创建一个新数组 长度为老数组长度+1
    public static Student[] creatArr(Student [] arr){
        Student [] newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                newArr[i] = arr[i];
            }
        }
        return newArr;
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
}
