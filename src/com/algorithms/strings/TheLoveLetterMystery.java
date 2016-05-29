package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/the-love-letter-mystery
 * 
 * @author Kuldeep
 * 
 */
public class TheLoveLetterMystery {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			char charArray[] = s.toCharArray();
			int len = charArray.length;

			int operations = 0;
			for (int j = 0; j < len / 2; j++) {
				int first = charArray[j];
				int last = charArray[len - j - 1];

				operations = operations + Math.abs(first - last);
			}

			System.out.println(operations);
		}
		in.close();
	}
}
