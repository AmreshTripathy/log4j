package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class FurthestBuildingYouCanReach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] heights = new int[n];
		
		for(int i = 0; i < n; i++) heights[i] = sc.nextInt();
		
		int bricks = sc.nextInt();
		int ladders = sc.nextInt();
		
		sc.close();
		
		System.out.println(furthestBuilding(heights, bricks, ladders));
	}
	
	public static int furthestBuilding(int[] heights, int bricks, int ladders) {
		int length = 0;
        int length_1 = 0;
        int bricks_1 = bricks;
        int ladders_1 = ladders;
        for(int i = 1; i < heights.length; i++) {
            if(heights[i - 1] < heights[i]){
                int gap = heights[i] - heights[i - 1];
                if(gap <= bricks) {
                    bricks -= gap;
                    length = i;
                }else if(ladders > 0) {
                    ladders--;
                    length = i;
                }else if(gap > bricks && ladders == 0) {
                    break;
                }
            }else{
                length = i;
            }
        }

        for(int i = 1; i < heights.length; i++) {
            if(heights[i - 1] < heights[i]){
                int gap = heights[i] - heights[i - 1];
                if(ladders_1 > 0) {
                	ladders_1--;
                    length_1 = i;
                }else if(gap <= bricks_1) {
                    bricks_1 -= gap;
                    length_1 = i;
                }else if(bricks == 0 && ladders == 0) {
                    break;
                }
            }else{
                length_1 = i;
            }
        }

        return Math.max(length, length_1);
	}
}
