package com.practice.kunalkhuswah_DSA;

import java.util.Arrays;
import java.util.List;

/*
 * @Amresh Tripathy
 */

public class ListReferenceTypeCheck {
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,3,5,9);
		List<Integer> b = a;
		a.set(0, 2);
		System.out.println(b);
		
	}
}
