package a02inner.innerDemo1;
         /*
        内部类的访问特点:
            内部类可以直接访问外部类的成员，包括私有
            外部类要访问内部类的成员，必须创建对象
         */
public class car {
    String carName;
    int carAge;
    String carColor;
    public void show(){
        System.out.println(carName);
        Engine e = new Engine();
        System.out.println(e.engineName);
    }

    public class Engine{
        String engineName;
        int engineAge;
        public void show(){
            System.out.println(carName);
            System.out.println(carAge);
        }
    }
}
