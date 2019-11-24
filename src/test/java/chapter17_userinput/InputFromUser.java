package chapter17_userinput;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        float a=sc.nextFloat();
        System.out.println("enter value of b");
        float b=sc.nextFloat();
        float c;
        c=a+b;
        System.out.println("addition is "+ c);
    }
}
