package com.collection;
import java.util.*;
public class DemoRepeat {
	public static void main(String args[]){
		String str = "my name is lodu lalit is my";
		int len = str.length();
		char[] ch  = str.toCharArray();
		int count=0,i;
		Map<Character,Integer> map = new HashMap<>();
		for( i=0;i<len;i++) {
		if(map.containsKey(ch[i])) {
		count = 0;
			count++;
			System.out.println(ch[i]+" = "+count);	
			map.remove(ch[i]);
		
		}
		
		
		map.put(ch[i],i);
		
		}
		map.forEach((k,v) -> System.out.println(" "+k));
	}

}
