package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class FirstUniqueCharacter {
	
	protected static Scanner sc = new Scanner(System.in);
	
	public static int firstUniqChar(String s) {
        	Map<Character, Integer> map = new HashMap<Character, Integer>();
        	ArrayList<Character> lis = new ArrayList<Character>();
        	for(int i = 0; i < s.length(); i++) {
            		int flag = 0;
            		for(int j = 0; j < s.length(); j++){
                		if(s.charAt(i) == s.charAt(j) && i!= j) {
                    			flag = 1;
                    			break;
                		}
            		}
            		if(flag == 0){
                		map.put(s.charAt(i),i);
                		lis.add(s.charAt(i));
            		}
        	}
        	if(lis.size() > 0){
            		return map.get(lis.get(0));            
        	}else{
       	     		return -1;
      	  	}
    	}

	public static void main(String[] args){
		System.out.println(firstUniqChar(sc.next()));
	}
}
