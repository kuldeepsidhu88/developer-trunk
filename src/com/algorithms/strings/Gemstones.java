package com.algorithms.strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Link - https://www.hackerrank.com/challenges/gem-stones
 * 
 * @author Kuldeep
 * 
 */
public class Gemstones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] composition = new String[n];

		for (int i = 0; i < n; i++) {
			composition[i] = in.next();
		}
		char[] firstComposition = composition[0].toCharArray();
		Set<Character> gemstones = new HashSet<>();

		for (int i = 0; i < firstComposition.length; i++) {
			char c = firstComposition[i];
			boolean gemstone = true;
			for (int j = 0; j < composition.length; j++) {
				if (!composition[j].contains(String.valueOf(c))) {
					gemstone = false;
					break;
				}
			}
			if (gemstone) {
				gemstones.add(c);
			}
		}
		System.out.println(gemstones.size());
		in.close();
	}
}
