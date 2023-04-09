package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class FilterDemo {

	public static void main(String[] args) {
               
		//Using Filter method(For condition check)
  
  List<String> list = new ArrayList<>();
   list.add("One");
   list.add("Two");
   list.add("Three");
   list.add("Four");
   list.add("Five");
   
   //Using forEach
     for(String s:list) {
    	 if(s.startsWith("T")) {
    		 System.out.println(s);
    	 }
   }
   
   //Using Filter  with forEach
     list.stream().filter(t->t.startsWith("F")).forEach(t->System.out.println(t));
     
//--------------------------------------------------------------------------------------------------
  
   Map<Integer, String>  map=new HashMap<>();
   map.put(1,"one");
   map.put(2,"two");
   map.put(3,"three");
   map.put(4,"four");
   map.put(5,"five");
   
//   map.forEach((k,v)->System.out.println("Key-"+k+" value-"+v));

   map.entrySet().stream().filter(t->t.getKey()%2==0).forEach((ob)->System.out.println(ob));
   System.out.println("--------------------------------------------------------------------------------------");
   map.entrySet().stream().filter(x->x.getValue().equals("five")).forEach((ob)->System.out.println(ob));
   
   //--------------------------------------------------------------------------------------------------

	}

}
