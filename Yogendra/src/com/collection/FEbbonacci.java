package com.collection;
import java.util.*;

public class FEbbonacci {
	    public static void main(String args[]) {
	    	Scanner sc = new Scanner(System.in);
	    	System.out.print("Enter number : ");
	    	int num = sc.nextInt();
	    	int i,a=3,b=3,c;
	    	
	    	for(i=0;i<=num;i++) {
	    		c = a+b;
	    		System.out.println(c);
	    		a = b;
	    		b = c;
	    	}
	    }

}
