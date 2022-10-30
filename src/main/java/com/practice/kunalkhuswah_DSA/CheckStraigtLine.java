package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class CheckStraigtLine {
	
	protected static Scanner sc = new Scanner(System.in);
	public static class pair{
		int first, second;
		pair(int first, int second){
			this.first = first;
			this.second =  second;
		}
	}
	
	public static void main(String[] args) {
		int n = sc.nextInt();
		ArrayList<pair> lis = new ArrayList<pair>();
		
		for(int i = 0; i < n; i++) {
			lis.add(new pair(sc.nextInt(), sc.nextInt()));
		}
		
		System.out.println(isStraightLine(lis));
	}

	private static String isStraightLine(ArrayList<pair> lis) {
		
		int x0 = lis.get(0).first;
	    int y0 = lis.get(0).second;
	 
	    // Second pair of point (x1, y1)
	    int x1 = lis.get(1).first;
	    int y1 = lis.get(1).second;
	 
	    int dx = x1 - x0, dy = y1 - y0;
	 
	    // Loop to iterate over the points
	    for(int i = 0; i < lis.size(); i++)
	    {
	        int x = lis.get(i).first;
	        int y = lis.get(i).second;
	        if (dx * (y - y1) != dy * (x - x1))
	        {
	            return "NO";
	        }
	    }
	    return "YES";
	}
}

