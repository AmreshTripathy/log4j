package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

public class NumberComplement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(findComplement(num));
        sc.close();
    }

    private static int findComplement(int num) {

        String str = Integer.toBinaryString(num);
        int i = str.indexOf("1");
        StringBuilder sb = new StringBuilder();
        for (; i < str.length(); i++)
            sb.append((str.charAt(i) == '1' ? '0' : '1'));

        return Integer.parseInt(sb.toString(), 2);
    }
}
