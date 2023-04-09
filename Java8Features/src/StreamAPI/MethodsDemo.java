package StreamAPI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;


public class MethodsDemo {

	public static void main(String[] args) {
               
		//Using forEach method(for iteration)
  
  List<String> list = new ArrayList<>();
   list.add("One");
   list.add("Two");
   list.add("Three");
   list.add("Four");
   list.add("Five");
   
   //Using forEachLoop
//   for(String s:list) {
//	   System.out.println(s);
//   }
   
   //Using stream and Lambda Expression
   list.stream().forEach(t->System.out.println("Printing list item "+t));
   
   //--------------------------------------------------------------------------------------------------
  
   Map<Integer, String>  map=new HashMap<>();
   map.put(1,"one");
   map.put(2,"two");
   map.put(3,"three");
   map.put(4,"four");
   map.put(5,"five");
   
   map.forEach((k,v)->System.out.println("Key-"+k+" value-"+v));
   
   map.entrySet().stream().forEach((ob)->System.out.println(ob));
   //--------------------------------------------------------------------------------------------------

	}

}
