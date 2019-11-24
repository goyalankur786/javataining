package chapter2_methods;

public class Callingmethod {
    public static void main(String[] args) {
        Callingmethod callingmethod = new Callingmethod();
        callingmethod.Iammethod1();
        callingmethod.Iammethod2();
    }


    public void Iammethod1() {
        System.out.println("I am Method 1");
    }

    public void Iammethod2() {
        System.out.println("I am Method 2");
    }
}