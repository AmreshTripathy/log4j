package com.practice.kunalkhuswah_DSA;

import java.util.Scanner;

/*
 * @Amresh Tripathy
 */

public class ASimpleFraction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.print(divide(a, b));
		sc.close();
	}

	private static String divide(int a, int b) {

		double d = Double.valueOf(a) / Double.valueOf(b);

		String s = (String.valueOf(d)).split("\\.")[1];

		if (s.equals("0")) {
			return String.valueOf((int) d);
		}

		StringBuilder sb = new StringBuilder();

//		for(int i = 0; i < s.length(); i++) {
//			if(sb.indexOf(s.charAt(i) + "") < 0) {
//				sb.append(s.charAt(i) + "");
//			}else if(sb1.indexOf(s.charAt(i) + "") < 0) {
//				sb1.append(s.charAt(i)+"");
//			}
//		}

		String s1 = "";
		int count_loop = 0;

		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i) + "");
			int count = 0;
			boolean found = false;
			int start = i + 1 + count;

			while (count < s.length() && start < s.length()) {
				int end = start + sb.length();
				if (end < s.length()) {
					if (sb.toString().equals(s.substring(start, end))) {
						found = true;
					} else {
						found = false;
						break;
					}
				}
				start = end;
				count++;
			}
			if(found){
				s1 = sb.toString();
				break;
			}
			if(i == s.length()-1 && !found) {
				sb = new StringBuilder();
				i = count_loop + 1;
			}

		}
		int index = 0;
		if (s.indexOf(s1) >= 0) {
			index = s.indexOf(s1);
		}

		if (s1.isEmpty()) {
			return String.valueOf(d);
		}

		sb = new StringBuilder();
		sb.append((String.valueOf(d)).split("\\.")[0] + ".");
		sb.append(s.substring(0, index));
		sb.append("(");
		sb.append(s1);
		sb.append(")");

		return sb.toString();
	}
}
