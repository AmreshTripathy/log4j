package com.practice.project;
/*
 * @Amresh Tripathy
 */

import java.util.Date;

public class Bill {
    public static void main(String[] args) {
        String countryName = "ind";
        countryName = countryName.toUpperCase();

        CountryName countryName1 = CountryName.valueOf(countryName);
        System.out.println(countryName1.name());
        System.out.println(countryName1.toCode());

        int counter = 1;
        char ch = 'A';

        int columns = 10;

        for (int count = 1; count <= 100; count++) {

            if (columns == (ch - 'A')) {
                counter++;
                ch = 'A';
            }
             else if ((ch - 'A') >= 26){
                ch = 'A';
                counter++;
            }

            String seatNo = counter + (String.valueOf(ch++));
            System.out.println(seatNo);
        }

        System.out.println(new Date());
    }
}
