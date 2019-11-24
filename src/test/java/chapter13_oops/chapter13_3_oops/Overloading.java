package chapter13_oops.chapter13_3_oops;

public class Overloading {
    public int overloadingmethod(int a,int b){
        return a+b;//if we want to return value then in main we assign that obj to another value and then
                   // it is evaluated and we can print it.
    }
    public void overloadingmethod(int a,int b,int c){
        System.out.println(a+b+c); //if we don't want to return any value then we simply call by making object.
    }

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        int add1=obj.overloadingmethod(2,3);
        System.out.println(add1);
        obj.overloadingmethod(2,5,9);

    }
}
