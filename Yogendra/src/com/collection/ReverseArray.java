package com.collection;
import java.util.*;

public class ReverseArray {
	  public static void main(String args[]) {
		  int[] arr = {15,24,37,47,58};
		  int len = arr.length;
		  int rev = 0,temp,i=0,rem;
		  for(i=0;i<len;i++){
			  rev=0;
		  temp = arr[i];
		  while(temp>0) {
			  rem = temp%10;
			  rev = rev*10+rem;
			  temp = temp/10;
		  }
		  arr[i]  = rev;
	  }
		  for(i=0;i<len;i++) {
			  System.out.println(arr[i]);
		  }
	  }

}
