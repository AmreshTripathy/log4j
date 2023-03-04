package com.practice.kunalkhuswah_DSA;
/*
 * @Amresh Tripathy
 * https://course.acciojob.com/idle?question=d6a8385f-d917-41ca-b936-2cb489564507
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        binaryRepresentation(n);
        sc.close();
    }

    private static void binaryRepresentation(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("1");

        while (n-- > 0) {
            String s1 = q.remove();

            System.out.println(s1);

            String s2 = s1;

            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }
}
