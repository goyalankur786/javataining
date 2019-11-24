package chapter13_oops.chapter13_3_oops;

public class BaseClass {
    public void method(){
        System.out.println("i am base class method");

    }
}
class Subclass extends BaseClass{
    public void method(){
        super.method();
        System.out.println("i am sub class method");
    }
}
class MainClass{
    public static void main(String[] args) {
        Subclass obj=new Subclass();
        obj.method();
    }
}