package chapter21_interface;
//Interface Defined
interface Animal{
    public void animalSound();//interface method does not have a body
    public void sleep();//interface method does not have a body

}
//Pig implements Animal Interface
class Pig implements Animal{
    //defining method
    public void animalSound() {
        System.out.println("pig ssound like:wee wee");
    }
//Defining method
    public void sleep() {
        System.out.println("Zzzz");
    }
}

public class MyMainClass {
    public static void main(String[] args) {
        //making object of sub class and then running above methods..
Pig obj=new Pig();
obj.animalSound();
obj.sleep();
    }
}
