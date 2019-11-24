package chapter23_collection.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<Integer, String>();
        map.put(100,"Ankur");
        map.put(200,"Vihan");
        map.put(300,"Dilbag");
//Elements can Traverse in any order..
        for(Map.Entry m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
