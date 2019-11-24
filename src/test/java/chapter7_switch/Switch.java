package chapter7_switch;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);

        int number;
        System.out.println("Enter the number");
        number=obj.nextInt();

        switch (number){
            case 10:
                System.out.println("no is 10");
                break;
            case 20:
                System.out.println("no is 20");
                break;
            case 30:
                System.out.println("no is 30");
                break;
            default:
                System.out.println("not in above 3");
                break;
        }
    }
}
