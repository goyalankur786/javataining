package chapter11_continue;

public class ContinueLoop{
    public static void main(String[] args) {
ContinueLoop obj=new ContinueLoop();
obj.Continue();
    }
    private void Continue(){
        for (int i=0;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
}

