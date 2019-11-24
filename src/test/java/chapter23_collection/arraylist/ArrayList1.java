package chapter23_collection.arraylist;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating array list
        list.add("Ankur");
        list.add("Paul");
        //list.remove(0);
        list.add(1,"Vivan");
        list.add("Kavya");
        System.out.println(list);//invoking Array list
    }
}
