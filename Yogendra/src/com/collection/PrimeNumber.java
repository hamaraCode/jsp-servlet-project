package com.collection;
import java.util.*;

public class PrimeNumber {
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter a and b : ");
	    	int a = sc.nextInt();
	    	int b = sc.nextInt();
	    	
	    	int i=0,count=0,num;
	    	for(num=a;num<=b;num++) {
	    for(i=2;i<=num/2;i++) {
	    	if(num%i==0) {
	    		break;
	    	}
	    }
	    if(i>num/2 && num>1) {
	    	System.out.println(num);
	    }
	
	    	}
	    }
 
}
