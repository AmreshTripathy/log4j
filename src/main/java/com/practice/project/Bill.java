package com.practice.project;
/*
 * @Amresh Tripathy
 */

public class Bill {
    public static void main(String[] args) {
        String countryName = "ind";
        countryName = countryName.toUpperCase();

        CountryName countryName1 = CountryName.valueOf(countryName);
        System.out.println(countryName1.name());
        System.out.println(countryName1.toCode());
    }
}
