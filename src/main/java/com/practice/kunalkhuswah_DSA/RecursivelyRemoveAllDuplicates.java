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
        StringBuilder ans = (removeDuplicates(str + "#", 0, false, new StringBuilder()));
        System.out.println(ans.substring(0, ans.length() - 1));
	}
	
	public static StringBuilder removeDuplicates(String s, int index, boolean flag, StringBuilder ans)
    {
		
		if(index == s.length())
			return removeDuplicates(s, 0, false, new StringBuilder());
		
		if(ans.length() > 0 && s.charAt(index) != ans.charAt(ans.length() - 1) && flag) {
			ans.deleteCharAt(ans.length() - 1);
			ans.append(s.charAt(index));
			flag = false;
		}else if(ans.length() > 0 && s.charAt(index) == ans.charAt(ans.length() - 1))
			flag = true;
		else
			ans.append(s.charAt(index));
		
		ans = removeDuplicates(s, index + 1, flag, ans);
		
		return ans;
    }
}
