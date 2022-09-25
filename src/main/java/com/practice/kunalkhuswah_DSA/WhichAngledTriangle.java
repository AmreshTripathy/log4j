package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class WhichAngledTriangle {

	  public static void triangle(int a,int b, int c) {
	    if((a*a) < (b*b + c*c)){
	      System.out.println(1);
	    }else if((a*a) == (b*b + c*c)){
	      System.out.println(2);
	    }else if((a*a) > (b*b + c*c)){
	      System.out.println("3");
	    }
	  }
	  
		public static void main (String[] args) throws java.lang.Exception
		{
		Scanner sc = new Scanner(System.in);
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = sc.nextInt();
	    int highest = 0;
	    
	    if(a>b && a>c){
	      highest = a;
	      triangle(highest,b,c);
	    }else if(b>a && b>c) {
	      highest = b;
	      triangle(highest,a,c);
	    }else {
	      highest = c;
	      triangle(highest,a,b);
	    }
	}
}
