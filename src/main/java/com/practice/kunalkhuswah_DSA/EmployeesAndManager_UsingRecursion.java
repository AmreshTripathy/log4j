package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://www.youtube.com/watch?v=bit4Jn-ZoyQ&list=TLGGW5wad86UQbExMTAxMjAyMw&t=7s
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class EmployeesAndManager_UsingRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, String> emp = new HashMap<String, String>();
		for (int i = 0; i < n; ++i) {
			emp.put(sc.next(), sc.next());
		}
		EmpUnderManager(emp);
		sc.close();
	}

	public static void EmpUnderManager(Map<String, String> emp) {
		// making a map to add employees and their respective employees as a ArrayList
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		String ceo = "";
		for (String employee : emp.keySet()) {
			String manager = emp.get(employee);
			if (employee.equals(manager))
				ceo = employee; // if both employee and manager are equal no need to add it in list
			else if (!map.containsKey(manager)) {
				ArrayList<String> lis = new ArrayList<>();
				lis.add(employee);
				map.put(manager, lis);
			} else {
				ArrayList<String> lis = map.get(manager);
				lis.add(employee);
				map.put(manager, lis);
			}
		}
		
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		getSize(map, ceo, countMap);
		
		for(Entry<String, Integer> obj: countMap.entrySet())
			System.out.println(obj.getKey() + " " + obj.getValue());
	}

	private static int getSize(Map<String, ArrayList<String>> map, String man, Map<String, Integer> countMap) {
		if(!map.containsKey(man)) {
			countMap.put(man, 0);
			return 1;
		}
		
		int size = 0;
		// adding countMap and traversing from ceo to sub level  as a tree
		//			F
		//		C		E
		//   A	   B	   D
		for(String emp: map.get(man)) {// going to sub level of ceo to downwords
			int count = getSize(map, emp, countMap);
			size += count;
		}
		
		countMap.put(man, size);
		return size + 1;
	}
}
