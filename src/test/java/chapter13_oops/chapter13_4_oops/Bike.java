package chapter13_oops.chapter13_4_oops;

 class Bike {
    void run() {
        System.out.println("running");

    }
}
    class Splendor extends Bike{
     void run(){
         //super.run();//if we want to access the parent class
         System.out.println("running at 60 kmph");
     }

        public static void main(String[] args){
            Bike obj=new Splendor();//upcasting
            obj.run();
        }
}
