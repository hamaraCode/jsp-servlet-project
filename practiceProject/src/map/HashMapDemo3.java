package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HashMapDemo3 {
	
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
    
    System.out.println("Enter any Key to delete");
    int k=sc.nextInt();
    
	int count=0;
	Iterator<Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
	while (iterator.hasNext()) {
	    if (iterator.next().getKey()==k)
	    {
	    	iterator.remove();
	    	count++;
	    }
	    }

    if(count==0) {
    	System.out.println("Key not found");
    }
	
	System.out.println("After Removing Element New HashMap is ");
	System.out.println(hashMap);
	
	}
}
