package chapter6_operator;

public class Operator {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        System.out.println(x++);//first take value then increment
        System.out.println(x);
        System.out.println(++y);//first increment then take value
        System.out.println(y);

        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21
    }


}
