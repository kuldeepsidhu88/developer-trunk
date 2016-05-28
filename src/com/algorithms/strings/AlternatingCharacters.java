package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/alternating-characters
 * 
 * @author Kuldeep
 * 
 */
public class AlternatingCharacters {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			int deletions = 0;

			char[] letters = s.toCharArray();
			char temp = letters[0];
			for (int j = 1; j < letters.length; j++) {
				char c = letters[j];
				if (c == temp) {
					deletions++;
				} else {
					temp = c;
				}
			}
			System.out.println(deletions);
		}
		in.close();
	}
}
