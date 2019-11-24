package chapter5_ifelse;

public class IfElse {
    public static void main(String[] args) {
        IfElse IfElse=new IfElse();
        IfElse.IfElseExample();
        IfElse.NestedIfElse();
    }
    private void IfElseExample() {
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }
        //NESTED IF ELSE EXAMPLE
        private void NestedIfElse() {
            int a = 10;
            int b = 20;
            int c = 30;
            if (a > b) {
                if (a > c) {
                    System.out.println("a is greater");
                } else {
                    System.out.println("cis greater");
                }
            } else {
                if (b > c) {
                    System.out.println("b is greater");
                } else {
                    System.out.println("c is greater");
                }
            }

        }

        }




