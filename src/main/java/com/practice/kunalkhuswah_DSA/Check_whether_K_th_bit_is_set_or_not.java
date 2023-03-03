package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=90266d47-b043-4a66-b6c8-57d12147a33d
 */

import java.util.Scanner;

public class Check_whether_K_th_bit_is_set_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int K=sc.nextInt();
        
        Boolean ans= solve(N,K);

        if(ans==true)
            System.out.println("YES");
        else
            System.out.println("NO");
        sc.close();
    }
    
    public static Boolean solve(int n,int k) {
        // Your code here
        /*
         * 1 << k
         * 00000001
         * 00000010
         * 
         * ans check for n let take ex: 3
         * 00000011 & 00000010 give a number > 0 so it will be true
        */
        return (n & (1 << k)) > 0;
    }
}
