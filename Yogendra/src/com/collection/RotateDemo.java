package com.collection;

public class RotateDemo {
    public static void main(String args[]) {
    	int[] arr = {1,2,3,4,5};
    	int len = arr.length;
    	int rotate = 4;
    	System.out.println("/n orignal Array : ");
    	for(int i=0;i<len;i++) {
    		System.out.println(arr[i]);
    	}
    	for(int i=0;i<rotate;i++) {
    		int last = arr[len-1];
    		for(int j=len-1;j>0;j--) {
    			arr[j] = arr[j - 1];
    		}
    		arr[0] = last;
    	
    		
    	}
    	System.out.println("Array After rotaion : ");
    	for(int i=0;i<len;i++) {
    	System.out.println(arr[i]);
    	}
    }
}
