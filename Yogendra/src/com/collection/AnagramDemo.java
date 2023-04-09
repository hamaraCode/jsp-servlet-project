package com.collection;
import java.util.*;

public class AnagramDemo {
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("1st : ");
    	String s1 = sc.nextLine();
    	System.out.println("1st : ");
    	String s2 = sc.nextLine();
        	
    	if(s1.length() == s2.length()) {
    		char[] str1 = s1.toCharArray();
    		char[] str2 = s2.toCharArray();
    		Arrays.sort(str1);
    		Arrays.sort(str2);
    		if(Arrays.equals(str1,str2) == true)
    		{
    			System.out.println("Angram : ");
    		}else {
    			System.out.println("Not - angram,");
    		}
    	}else {
    		System.out.println("Not - anagram");
    	}
    }
}
