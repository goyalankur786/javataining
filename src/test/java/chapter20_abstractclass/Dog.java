package chapter20_abstractclass;
abstract class Animal{
    public abstract void sound();
   // void display(){
     //   System.out.println("From animal");
    //}
}
 class Cat extends Animal {
    public void sound(){
        System.out.println("Meow");
    }

}
public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("woof");
    }

    public static void main(String[] args) {
  Animal obj=new Dog();
  obj.sound();
  Animal animal=new Cat();
  animal.sound();
 // obj.display();
//Dog obj=new Dog();
//obj.sound();
//Cat animal=new Cat();
//animal.sound();
    }
}