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
			int[] oneAlphabets = new int[26];
			int[] twoAlphabets = new int[26];

			boolean substringFlag = false;
			for (int j = 0; j < one.length(); j++) {
				int index = one.charAt(j) - 97;
				oneAlphabets[index]++;
			}
			for (int j = 0; j < two.length(); j++) {
				int index = two.charAt(j) - 97;
				twoAlphabets[index]++;
			}

			for (int j = 0; j < 26; j++) {
				if (oneAlphabets[j] != 0 && twoAlphabets[j] != 0) {
					substringFlag = true;
					break;
				} else {
					substringFlag = false;

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
