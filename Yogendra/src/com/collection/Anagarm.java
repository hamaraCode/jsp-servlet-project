package com.collection;
import java.util.*;
public interface Anagarm {
 
    public static void main(String args[]) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.print("enter 1st  : ");
    	 String str1  = sc.nextLine();
    	 System.out.print("enter 2nd : ");
    	 String str2 = sc.nextLine();
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1 == len2) {
			for(int i=0;i<len1;i++) {
				for(int j=0;j<len1;j++) {
					if(ch1[i] > ch1[j]) {
						char temp = ch1[i];
						          ch1[i] = ch1[j];
						          ch1[j] = temp;
					}
				}
			}
			for(int i=0;i<len2;i++) {
				for(int j=0;j<len2;j++) {
					if(ch2[i] > ch2[j]) {
						char temp = ch2[i];
						          ch2[i] = ch2[j];
						          ch2[j] = temp;
					}
				}
			}
			if(Arrays.equals(ch1,ch2)) {
				System.out.println("Anagram : ");
			}
			else {
				System.out.println("Not - Anagram");
			}
			System.out.println("no");
		}

		
	}
}
