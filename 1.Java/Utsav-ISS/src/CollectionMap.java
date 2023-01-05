import java.util.*;

public class CollectionMap{
	
  public static void main(String args[]){
	  
    HashMap<Integer, String> hmap = new HashMap();

    //key and value pairs
    hmap.put(101, "Chaitanya");
    hmap.put(105, "Derick");
    hmap.put(111, "Logan");
    hmap.put(120, "Paul");

    //print HashMap elements
    Set set = hmap.entrySet();
    Iterator iterator = set.iterator();
    while(iterator.hasNext()) {
      Map.Entry m = (Map.Entry)iterator.next();
      System.out.print("key is: "+ m.getKey() + " & Value is: ");
      System.out.println(m.getValue());
    }
  }
}