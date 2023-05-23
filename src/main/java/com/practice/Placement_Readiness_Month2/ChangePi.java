package com.practice.Placement_Readiness_Month2;

import java.util.Scanner;

public class ChangePi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        System.out.println(changePi(str));
    }

    private static String changePi(String str) {
        str = str.replace("pi", "3.14");
        return str;
    }
}
