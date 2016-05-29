package com.algorithms.strings;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/palindrome-index
 * 
 * @author Kuldeep
 * 
 */
public class PalindromeIndex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			int len = s.length();

			int index = -1;
			for (int j = 0; j < len / 2; j++) {
				char first = s.charAt(j);
				char last = s.charAt(len - 1 - j);

				if (first == last) {
					continue;
				} else {
					if (isPalindrome(s.substring(0, j) + s.substring(j + 1, len))) {
						index = j;
						break;
					}
					if (isPalindrome(s.substring(0, len - 1 - j) + s.substring(len - 1 - j + 1, len))) {
						index = len - 1 - j;
						break;
					}
				}
			}
			System.out.println(index);
		}
		in.close();
	}

	public static boolean isPalindrome(String s) {
		char[] c = s.toCharArray();

		int len = c.length;
		for (int i = 0; i < len / 2; i++) {
			if (c[i] != c[len - 1 - i]) {
				return false;
			}
		}
		return true;
	}
}
