package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class EmployeesAndManager {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<String,String> emp = new HashMap<String, String>();
        for(int i=0;i<n;++i){
			emp.put(sc.next(),sc.next());
        }
        EmpUnderManager(emp);
        sc.close();
	}
	
	public static void EmpUnderManager(Map<String, String> emp) {
		// making a map to add employees and their respective employees as a ArrayList
		Map<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for(String employee: emp.keySet()) {
			String manager = emp.get(employee);
			if(employee.equals(manager))
				continue; // if both employee and manager are equal no need to add it in list
			else if(!map.containsKey(manager)) {
				ArrayList<String> lis =  new ArrayList<>();
				lis.add(employee);
				map.put(manager, lis);
			}else {
				ArrayList<String> lis = map.get(manager);
				lis.add(employee);
				map.put(manager, lis);
			}
		}
		
		// create a list to add all the employees from out driver given hashMap
		List<String> employees = new ArrayList<String>(emp.keySet());
		Collections.sort(employees); // then sort it in lexicographical order
		
		// here we are counting all the employees child employees size i.e size of arrayList
		Map<String, Integer> countMap = new HashMap<String, Integer>();
		for(String employee: employees) {
			if(map.containsKey(employee))
				countMap.put(employee, map.get(employee).size());
			else
				countMap.put(employee, 0);
		}
		
		
		// here we are checking any employee under one manager having any child employees or not 
		// and adding their count to their main size
		for(String employee: employees) {
			if(map.containsKey(employee)) {
				ArrayList<String> lis = map.get(employee);
				int count = lis.size();
				// checking the default size (a) -> (c, d) , (c) -> (e), (d) -> (f)
				// so our size needs to be 4 but current count is 2
				// so we sdd that count in  the main count
				for(int i = 0; i < lis.size(); i++) {
					count += countMap.get(lis.get(i));
				}
				countMap.put(employee, count);
			}
		}
		
		// printing countMap below
		for(Entry<String, Integer> obj: countMap.entrySet())
			System.out.println(obj.getKey() + " " + obj.getValue());
	}
}
