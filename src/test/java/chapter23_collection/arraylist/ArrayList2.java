package chapter23_collection.arraylist;


import javax.swing.text.html.HTMLDocument;
import java.util.*;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList();//creating array list
        list.add("Amit");//Adding object in array list
        list.add("Ritik");
        list.add("Rahul");
        list.add("Sapan");
        //Traversing List Through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }

}
