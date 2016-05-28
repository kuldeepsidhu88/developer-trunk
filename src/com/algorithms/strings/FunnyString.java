package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/funny-string
 * 
 * @author Kuldeep
 * 
 */
public class FunnyString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String string = in.next();
			String reverseString = new StringBuilder(string).reverse().toString();

			char[] s = string.toCharArray();
			char[] rev = reverseString.toCharArray();
			boolean notFunny = false;
			for (int j = 1; j < s.length; j++) {
				int diff = Math.abs(s[j] - s[j - 1]);
				int diffRev = Math.abs(rev[j] - rev[j - 1]);

				if (diff != diffRev) {
					notFunny = true;
				}
			}

			if (notFunny) {
				System.out.println("Not Funny");
			} else {
				System.out.println("Funny");
			}

		}
		in.close();
	}
}
