package com.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String args[]) {
    	String str = "yyooggeennddrraa";
    	int len = str.length();
        Set<Character> set = new LinkedHashSet<Character>();
        
        for(int i=0;i<len;i++) {
        	set.add(str.charAt(i));
        }
        
        for(Character ch : set) {
        	System.out.println(ch);
        }
    	
    }
}
