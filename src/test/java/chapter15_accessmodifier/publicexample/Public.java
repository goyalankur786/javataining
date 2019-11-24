package chapter15_accessmodifier.publicexample;

public class Public {
   public int a=10;
    public void Iampublicmethod(){
        System.out.println("i am public method");
        System.out.println(a);
    }

    public static void main(String[] args) {
        Public obj=new Public();
        obj.Iampublicmethod();
        Public2 obj1=new Public2();
        obj1.display();
    }
}
class Public2{
    public void display(){
        System.out.println("ankur");
    }
}