package chapter23_collection.list;

import java.util.*;


public class ListExample2 {
    public static void main(String[] args) {
        List<String> al=new ArrayList();
        al.add("Amit");
        al.add("Vijay");
        al.add("Kumar");
       // al.add(1,"sachin");
      //  System.out.println("element at 2nd position"+ al.get(2));
for(String s:al){//using advance for loop
    System.out.println(s);
}

    }
}
