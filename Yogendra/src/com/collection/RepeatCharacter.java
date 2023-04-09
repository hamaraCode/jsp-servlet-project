package com.collection;

public class RepeatCharacter {
	public static void main(String args[]) {  
	String s = "a3b3c4";
	char[] ch = s.toCharArray();
	   int n = s.length();
	   String w = "";
	   for(int i=0;i<n;i++) {
	      if(ch[i] >= '0' && ch[i] <= '9') {
	          for(int j=0;j<ch[i]-'0';j++) {
	              w += ch[i-1];
	          }
	      }
	   }
	  System.out.println(w);
	}
}
