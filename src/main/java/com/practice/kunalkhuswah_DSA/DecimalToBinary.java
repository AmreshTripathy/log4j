package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=71243a94-9185-4faa-a4b3-0e12b8e9fac4
 */

import java.io.IOException;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String [] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
        int N = sc.nextInt();
        toBinary(N);
        System.out.println();
        sc.close();
    
	}

    private static void toBinary(int N) {
        String ans = "";
        while(N > 0) {
            if ((N & 1) > 0)
                ans += '1';
            else
                ans += '0';
            N >>= 1;
        }

        System.out.println(ans);
	}
}
