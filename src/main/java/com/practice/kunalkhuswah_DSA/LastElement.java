package com.practice.kunalkhuswah_DSA;

import java.util.ArrayList;

class LastElement{
 
public static void main(String[] args)
{
    String str = "GeeksforGeeks";
 
    ArrayList<Character> lis = new ArrayList<Character>();
    for (int i = 0; i < str.length(); i++)
    {
        int flag = 0;
        
        for (int j = 0; j < str.length(); j++)
        {
            // checking if two characters are equal
            if (str.charAt(i) == str.charAt(j) && i != j)
            {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
        	lis.add(str.charAt(i));
    }
    System.out.println(lis.get(lis.size()-1)
    		
    		
    		
    		
    		);
}
}