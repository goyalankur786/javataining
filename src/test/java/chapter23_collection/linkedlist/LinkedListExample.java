package chapter23_collection.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList();
        list.add("Rohan");
        list.add("vivek");
        list.add("Nitin");
        //System.out.println(list);
        Iterator itr=list.iterator();
        while ((itr.hasNext())){
            System.out.println(itr.next());
        }

    }
}
