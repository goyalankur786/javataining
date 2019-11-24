package chapter15_accessmodifier.protectedexample;

 class Protected {
     protected int a = 10;

     protected void Iamprotectedmethod() {
         System.out.println("i am protected method");
         System.out.println(a);
     }
 }
   class OverrideProtected extends Protected {
       public static void main(String[] args) {
           OverrideProtected obj=new OverrideProtected();
           obj.Iamprotectedmethod();

       }
   }

