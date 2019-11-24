package chapter23_collection.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> list=new HashSet<String>();//creating hashset
        list.add("Ronak");//add elements to set
        list.add("Ajay");
        list.add("vijay");
        list.add("Sumit");//doesnot maintain insertion order
        list.add("Samay");
        list.add("Sumit");//does not print duplicate element
        Iterator itr=list.iterator();//iterating hashset
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
