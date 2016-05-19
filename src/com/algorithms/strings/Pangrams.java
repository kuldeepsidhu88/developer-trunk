package com.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Link - https://www.hackerrank.com/challenges/pangrams
 * 
 * @author Kuldeep
 * 
 */
public class Pangrams {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int length = s.length();
		s = s.toLowerCase();
		Set<Character> chars = new HashSet<>();

		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (c >= 90 && c <= 122) {
				chars.add(c);
			}
		}

		if (chars.size() == 26) {
			System.out.println("pangram");
		} else {
			System.out.println("not pangram");
		}

		in.close();
	}
}
