package com.collection;

import java.util.HashMap;
import java.util.Set;

public class FrequencyByHashMap {
	 public static void main(String args[]){ 
	        HashMap<String, Integer> map = new HashMap<String,Integer>();
	        String s = "I am Java Programmer and IT Server Programmer with Java as Best Java lover";
	        String[] str = s.split(" ");
	        int len = str.length;
System.out.println(len);
	        for(int i=0;i<len;i++){
	            if(map.containsKey(str[i])){
	            map.put(str[i], map.get(str[i])+1);             
	            }
	            else{
	                map.put(str[i], 1);
	            }
	        }
	        //Extracting of all keys of word count
	        Set<String> set = map.keySet();

	        for(String word : set){
	            if(map.get(word)>1){
	                System.out.println(word+":"+map.get(word));
	            }
	        }
	   }
	}