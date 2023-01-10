package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 */

import java.util.Scanner;

public class RecursivelyRemoveAllDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        System.out.println(rremove(str));
	}
	
	private static String rremove(String s) {
        String str = helper(s, 0, "");
        return str;
    }
    
    private static String helper(String s, int index, String ans) {
        if(index == s.length()){
            boolean flag = false;
            for(int i = 0; i < ans.length() - 1; i++){
                if(ans.charAt(i) == ans.charAt(i + 1)){
                    flag = true;
                    break;
                }
            }
            
            return (flag) ? helper(ans, 0, "") : ans;
        }
        
        if(index > s.length()) return ans;
        
        char ch = s.charAt(index);
        
        int i = index + 1;
        boolean flag = false;
        while(i < s.length() && ch == s.charAt(i)) {
        	i++;
            flag = true;
        }
        
        if(flag) {
            ans = helper(s, i, ans);
        }else{
            ans = helper(s, index + 1, ans + s.charAt(index));
            
        }
            
        return ans;
        
    }
}
