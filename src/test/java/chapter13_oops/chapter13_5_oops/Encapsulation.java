package chapter13_oops.chapter13_5_oops;
//main class to test the encapsulated class
public class Encapsulation {
    public static void main(String[] args) {
        //creating instance of encapsulated class
        Student s = new Student();
        //setting value in the name member
        s.setName("Qarobo");
        //getting value in the name mmember
        System.out.println(s.getName());
    }
}
//A java class which is fully encapsulated class
//it hhas private data members and getter and setter methods..
    class Student {
    //private data member
        private String name;
//getter methods for name
        public String getName() {
            return name;
        }
//setter method for name
        public void setName(String name) {
            this.name = name;
        }
    }

