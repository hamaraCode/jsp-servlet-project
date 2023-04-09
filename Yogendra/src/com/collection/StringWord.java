package com.collection;

import java.util.HashMap;
import java.util.Set;

public class StringWord {
    public static void main(String args[]){
   
	HashMap<Character, Integer> wordCount = new HashMap<Character,Integer>();
        String words = "aabbbcaabgabbgbbbb";
       char[] ch = words.toCharArray();
       int len = words.length();
        for(int i=0;i<len;i++){
            if(wordCount.containsKey(ch[i])){
                wordCount.put(ch[i], wordCount.get(ch[i])+1);             
            }
            else{
                wordCount.put(ch[i], 1);
            }
        }
        //Extracting of all keys of word count
        Set<Character> wordsInString = wordCount.keySet();

        for(Character word : wordsInString){
            if(wordCount.get(word)>1){
                System.out.println(word+":"+wordCount.get(word));
            }
        }

    }
 }
