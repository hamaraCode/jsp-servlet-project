package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class HashMapDemo2 {
	
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
	HashMap<Integer, String> hashMap=new HashMap<>();
    hashMap.put(102,"Second");
    hashMap.put(104,"Four");
    hashMap.put(103,"Three");
    hashMap.put(101,"First");
    hashMap.put(105,"Five");
    
    System.out.println("Original HashMap");
    System.out.println(hashMap); //simple way
    
    System.out.println("Enter any Key to change");
    int k=sc.nextInt();
    
    sc.nextLine();   
    
    System.out.println("Enter New value to Add");
    String val2=sc.nextLine();
	int count=0;
    for(Map.Entry<Integer,String> mp:hashMap.entrySet())
	{
		if(mp.getKey()==k) {
         mp.setValue(val2);
			count++;
		}
	}
    if(count==0) {
    	System.out.println("Key not found");
    }
	
	System.out.println("After changing value NewHashMap is ");
	System.out.println(hashMap);
	
	}
}
