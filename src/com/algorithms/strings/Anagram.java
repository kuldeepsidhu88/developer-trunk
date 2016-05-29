package com.algorithms.strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/anagram
 * 
 * @author Kuldeep
 * 
 */
public class Anagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			String s = in.next();
			if (s.length() % 2 != 0) {
				System.out.println("-1");
			} else {
				char[] charArray = s.toCharArray();
				char[] first = Arrays.copyOfRange(charArray, 0, charArray.length / 2);
				char[] second = Arrays.copyOfRange(charArray, charArray.length / 2, charArray.length);

				int sum = 0;
				for (int j = 0; j < second.length; j++) {
					int result = searchArray(first, second[j]);
					sum += result;
				}

				System.out.println(first.length - sum);
			}
		}
		in.close();
	}

	public static int searchArray(char first[], char letter) {
		for (int i = 0; i < first.length; i++) {
			if (first[i] == letter) {
				first[i] = '1';
				return 1;
			}
		}
		return 0;
	}
}
