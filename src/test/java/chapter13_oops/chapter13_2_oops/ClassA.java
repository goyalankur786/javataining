package chapter13_oops.chapter13_2_oops;

     class ClassA {

        public void display() {
            int a=10;
            int b=20;
            System.out.println(b-a);
        }

    }

    class ClassB extends ClassA {

        public void display() {
             //super.display();   //  prevent overriding

            int a = 10;
            int b = 20;
            System.out.println(b + a);
        }
    }
         class ClassD {
            public static void main(String args[]){
                ClassB obj=new ClassB();
                obj.display();


        }
}
