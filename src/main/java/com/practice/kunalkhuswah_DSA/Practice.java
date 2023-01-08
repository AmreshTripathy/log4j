package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/*
 * @Amresh Tripathy
 */

public class Practice {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[2];
//		Character.isDi
		System.out.println(fact(sc.nextInt()));
		
//		HashSet<Integer> set = new HashSet<Integer>();
//		Pattern p = Pattern.compile("[aeiou]");
//        Matcher m = p.matcher(str);
		Map<Integer,Integer> map = new LinkedHashMap<Integer, Integer>();
		map.put(1,1);
		for(Entry<Integer,Integer> ob: map.entrySet()) {
			ob.getValue();
			ob.getKey();
		}
		
		
		List<Integer> lis = new ArrayList<>();
		Collections.addAll(lis, 1, 2, 3, 4, 5, 6);
        lis.remove(2);
		StringBuilder sb = new StringBuilder();
		sb.delete(0, 0);
		sb.replace(0, 0, "");
//		sb.charAt(sb.length()-1)
//		sb.inser
//		String s2 ="";
//        for(char ch : s2.toCharArray()) {
////        	s2.in
//        }
//        sb.deleteCharAt(0);
//        
//        int a = Arrays.stream(arr).sum();
//		Character.isU
		double p = Math.log(4) / Math.log(2);
		Math.ceil(p);
		Math.floor(p);
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
//		int max = Integer.MIN_VALUE;
//		
//		for(int i = 0; i < n; i++) {
//			int ans = 0;
//			for(int j = 0; j < m; j++) {
//				if(i+2 == n && j+2 == m)
//					break;
//				ans += mat[i][j] + mat[i][j+1] + mat[i][j+2];
//				ans += mat[i+1] + mat[j+1];
//				ans += mat[i+2][j] + mat[i+2][j+1] + mat[i+2][j+2];
//			}
//			if(max < ans)
//				max = ans;
//		}
		
		String[] arr1 = {"a==b", "a != b"};
	    ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("nashorn");
	    String foo = arr1[0].replaceAll("[\\w]+","1");
	    System.out.println(foo);
	    System.out.println(engine.eval(foo));
	    List<Integer> lis1 = new ArrayList<>();
	    List<Integer> lis2 = new ArrayList<>();
	    lis.addAll(lis1); // onle one at a time
	}

	private static int fact(int n) {
		return (n == 1 || n == 0) ? 1 : n * fact(n-1);
	}
}
