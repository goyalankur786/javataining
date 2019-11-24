package chapter15_accessmodifier;

public class Private {
    private int a=10;
    private void Iamprivatemethod(){
        System.out.println("I am private");
        System.out.println(a);
    }

    public static void main(String[] args) {
        Private obj=new Private();
        obj.Iamprivatemethod();
    }

}
//not access in class a because private method is accessed within the class not other class
//we can access class only by making above class member and methods public
/*class a{
    public static void main(String[] args) {
        Private obj=new Private();
        obj.Iamprivatemethod();
    }
}
*/