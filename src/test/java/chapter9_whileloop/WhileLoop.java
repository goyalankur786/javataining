package chapter9_whileloop;

public class WhileLoop {
    public static void main(String[] args) {
WhileLoop obj=new WhileLoop();
obj.whileLoop();
obj.infiniteLoop();
    }
    private void whileLoop(){
        int i=1;
        while(i<=10){
            System.out.println(i);
            i++;
        }
    }
private void infiniteLoop(){
        while(true){
            System.out.println("infinite while loop");
        }
}



}


