package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/game-of-thrones
 * 
 * @author Kuldeep
 * 
 */
public class GameOfThrones1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int alphabets[] = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int c = s.charAt(i);
			int index = c - 97;
			alphabets[index]++;
		}

		int oddLetters = 0;
		for (int i = 0; i < 26; i++) {
			if (alphabets[i] % 2 != 0) {
				oddLetters++;
			}
		}

		if (oddLetters > 1) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		in.close();
	}
}
