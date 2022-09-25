package com.practice.kunalkhuswah_DSA;

import java.util.HashMap;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ExcelSheetColumnSheet {

	protected static Scanner sc = new Scanner(System.in);
	
	public static String convertToTitle(int columnNumber) {
		
		HashMap<Integer, Character> map = new HashMap<Integer, Character>();
		String columnTitle = "";
		int count = 1;
		char c = ' ';
		map.put(0, c);
		for(c = 'A'; c<='Z'; c++) {
			map.put(count, c);
			count++;
		}
		
//		System.out.println(map.toString());
		
		int divided_element = columnNumber / 26;
		int percentile_element = columnNumber % 26;
		
		if(columnNumber > 26) {
			if(divided_element < 26 && percentile_element != 0) {
				columnTitle = Character.toString(map.get(divided_element)) + Character.toString(map.get(percentile_element));
			}else if(divided_element < 26 && percentile_element == 0) {
				columnTitle = Character.toString(map.get(divided_element-1)) + "Z";
			}else if(percentile_element > 0) {
				columnTitle = Character.toString(map.get(percentile_element));
				while(divided_element > 26) {
					percentile_element = divided_element % 26;
					divided_element = divided_element / 26;
					columnTitle = Character.toString(map.get(percentile_element)) + columnTitle;
				}
				columnTitle = Character.toString(map.get(divided_element)) + columnTitle;
			}else if(percentile_element == 0){
				while(divided_element > 26) {
					percentile_element = divided_element % 26;
					divided_element = divided_element / 26;
					columnTitle = Character.toString(map.get(27-percentile_element)) + columnTitle;
				}
				columnTitle = Character.toString(map.get(27 - divided_element)) + columnTitle;
			}
		}else {
			columnTitle = Character.toString(map.get(columnNumber));
		}
        return columnTitle.trim();
    }
	
	public static void main(String[] args) {
		System.out.println(convertToTitle(sc.nextInt()));
	}
	
}
