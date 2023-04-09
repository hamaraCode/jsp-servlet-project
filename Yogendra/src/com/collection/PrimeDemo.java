// DUPLICATE ELEMENT REMOVE

package com.collection;
import java.util.*;

public class PrimeDemo {
     public static void main(String args[]) {
    	/* Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter Styring : ");
    	 String s = sc.nextLine();*/
    	 String s = "yyooggii";
    	 String ans = "";
    	 char[] ch = s.toCharArray();
    	 int len = ch.length;
    	 int i,j;
    	 
    	 for(i=0;i<len;i++) {
    		 for(j=0;j<i;j++) {
    			 if(ch[i] == ch[j]) {
    				 break;
    		 }
    	 } 
    		 if(j == i) {
    			 ans = ans + ch[i];
    		 }
    	 }
    	 System.out.println(ans);   	 
     }
}
