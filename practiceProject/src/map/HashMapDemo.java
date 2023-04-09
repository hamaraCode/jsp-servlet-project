package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
	
	public static void main(String[] args) {
    HashMap<Integer, String> hashMap=new HashMap<>();
    hashMap.put(102,"Second");
    hashMap.put(104,"Four");
    hashMap.put(103,"Three");
    hashMap.put(101,"First");
    hashMap.put(105,"Five");
    
//    System.out.println(hashMap); //simple way
    
    System.out.println("All keys");
    System.out.println(hashMap.keySet());
    
    System.out.println("All entries ");
    for(Map.Entry<Integer, String> mp:hashMap.entrySet()) {
    	System.out.println(mp.getKey()+"  "+mp.getValue());      //With for each
    }
	}

}
