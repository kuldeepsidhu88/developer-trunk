package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/make-it-anagram
 * 
 * @author Kuldeep
 * 
 */
public class MakeItAnagram {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String strOne = in.next();
		String strTwo = in.next();

		char[] one = strOne.toCharArray();
		char[] two = strTwo.toCharArray();

		int matchingChars = 0;
		for (int i = 0; i < one.length; i++) {
			int result = searchArray(two, one[i]);
			matchingChars += result;
		}
		int deletions = (one.length - matchingChars) + (two.length - matchingChars);
		System.out.println(deletions);

		in.close();
	}

	public static int searchArray(char[] array, char letter) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == letter) {
				array[i] = 1;
				return 1;
			}
		}
		return 0;
	}
}
