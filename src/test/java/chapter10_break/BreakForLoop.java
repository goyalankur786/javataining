package chapter10_break;

public class BreakForLoop {
    public static void main(String[] args) {
BreakForLoop obj=new BreakForLoop();
obj.breakLoop();
    }
    private void breakLoop(){
        for (int i=0;i<5;i++){
            if(i==3){
                System.out.println("Hello QaROBO");
            }
        }
    }
}
