package chapter14_this;

public class ThisKeyword {
    int a;
    int b;
    public void setdata(int x ,int y){
        this.a=x;
        this.b=y;
    }
    public void showData(){
        System.out.println("Value of A is-->"+ a);
        System.out.println("value of B is-->"+ b);
    }

    public static void main(String[] args) {
        ThisKeyword obj=new ThisKeyword();
        obj.setdata(2,3);
        obj.showData();
    }
}
