package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=b04c38cb-f18f-4ce9-a461-f9349d2b8c5a
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwosComplement {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String bi = in.readLine();
        System.out.println(complement(bi));
    }

    private static String complement(String bi) {

        int i = bi.lastIndexOf("1");
        if (i == -1)
            return bi;

        StringBuilder sb  = new StringBuilder();
        
        // chaning 1 and 0 upto the last 1 occured without including last 1
        for (int k = 0; k < i; k++) {
            sb.append((bi.charAt(k) == '1') ? "0" : "1");
        }

        // input from from i to last as it is
        for (; i < bi.length(); i++)
            sb.append(bi.charAt(i));

        return sb.toString();
    }
}
