package com.practice.kunalkhuswah_DSA;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * @Amresh Tripathy
 */

public class CompressedStrings {
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            System.out.println(compressedString(s));
        }
	}
	
	public static String compressedString(String s) {
		
		StringBuilder sb = new StringBuilder();
		
		int count = 1;
		for(int i = 0; i < s.length()-1; i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count++;
			}else {
				sb.append(s.charAt(i));
				if(count > 1)
					sb.append(count);
				count = 1;
			}
		}
		
		if(count > 1) {
			sb.append(s.charAt(s.length()-1));
			sb.append(count);
		}else {
			sb.append(s.charAt(s.length()-1));
		}
		return sb.toString();
    }
}
