package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/two-strings
 * 
 * @author Kuldeep
 * 
 */
public class TwoStrings {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String one = in.next();
			String two = in.next();
			int length = one.length();
			boolean substringFlag = false;
			for (int j = 0; j < length; j++) {
				String substring = String.valueOf(one.charAt(j));
				if (two.contains(substring)) {
					substringFlag = true;
					break;
				}
			}

			if (substringFlag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}
}
