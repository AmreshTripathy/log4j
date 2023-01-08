package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

// https://leetcode.com/problems/container-with-most-water/

public class ContainerWithMostWater {
	protected static Scanner sc = new Scanner(System.in);
	public static class pair{
		int x,y;
		pair(int x,int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		
		System.out.println(maxArea(arr));
	}
	private static int maxArea(int[] height) {
		
		int area = 0;
		List<pair> lis = new ArrayList<pair>();
		int size = height.length;
		
		for(int i = 0; i < size; i++)
			lis.add(new pair(i+1, height[i]));
		
		for(pair p : lis) {
			System.out.println("(" + p.x + ", "+ p.y + ")");
		}
		
		for(int i = size-1; i >= 0; i--) {
			int x2 = lis.get(i).x;
			int y2 = lis.get(i).y;
			
			for(int j = 0; j < i; j++) {
				int x1 = lis.get(j).x;
				int y1 = lis.get(j).y;
				
				int min = (int) Math.min(y2, y1);
				
				if(area < ((x2-x1) * min)) {
					area = (x2-x1) * min;
				}
				if(y1 > y2)
					break;
			}
		}
		
		return area;
	}
}
