package chapter23_collection.mapinterface;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

class MapExampleIteration
{
    public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();

        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
        //String str=gfg.get("Quiz");//to get value
        //System.out.println(str);
      //   using iterators
        Iterator<Map.Entry<String, String>> itr = gfg.entrySet().iterator();

        while(itr.hasNext())
        {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
        }
    }
}
