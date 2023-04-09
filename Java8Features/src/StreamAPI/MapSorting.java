package StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSorting {
public static void main(String[] args) {
	Map<Integer, String>  map=new HashMap<>();
	   map.put(10,"one");
	   map.put(12,"two");
	   map.put(3,"three");
	   map.put(14,"four");
	   map.put(50,"five");
	   
//	   List<Entry<Integer, String>> entries=new ArrayList<>(map.entrySet());
//	   
	   //Using Lambda Expression
//	   Collections.sort(entries,( o1, o2)-> o1.getKey().compareTo(o2.getKey()));
//	   
//		for(Entry<Integer, String> entry:entries) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
//		
		//Using streamAPI

		System.out.println("ascending on key and value");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		System.out.println("Reverse on key and value");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("--------------------------------------------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

				
}
}

