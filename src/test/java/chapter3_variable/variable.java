package chapter3_variable;

public class variable {
      int a = 10;
    static int b = 20;

    public static void main(String[] args) {
        variable variable = new variable();
        variable.display();
        System.out.println(b);
    }

    public void display() {
        int c = 5;
        System.out.println(c);
        System.out.println(a);

    }
}