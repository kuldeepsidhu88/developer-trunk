package com.algorithms.strings;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/bear-and-steady-gene
 * 
 * @author Kuldeep
 * 
 */
public class BearAndSteadyGene {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		String s = in.next();
		int[] chars = countNumberOfCharacters(s);
		int length = s.length();

		int limit = size / 4;

		int As = chars[0] - limit;
		int Cs = chars[1] - limit;
		int Gs = chars[2] - limit;
		int Ts = chars[3] - limit;

		boolean Aflag = false;
		boolean Cflag = false;
		boolean Gflag = false;
		boolean Tflag = false;

		int minLengthSubstring = 0;
		if (As > 0) {
			minLengthSubstring += As;
			Aflag = true;
		}
		if (Cs > 0) {
			minLengthSubstring += Cs;
			Cflag = true;
		}
		if (Gs > 0) {
			minLengthSubstring += Gs;
			Gflag = true;
		}
		if (Ts > 0) {
			minLengthSubstring += Ts;
			Tflag = true;
		}
		if (minLengthSubstring == 0) {
			System.out.println("0");
			in.close();
			return;
		}

		while (minLengthSubstring < length) {
			boolean found = false;
			for (int i = 0; i <= length - minLengthSubstring; i++) {

				String subString = s.substring(i, i + minLengthSubstring);
				// System.out.println(subString);
				int subStringChars[] = countNumberOfCharacters(subString);

				if (Aflag) {
					subStringChars[0] = subStringChars[0] - As;
				}
				if (Cflag) {
					subStringChars[1] = subStringChars[1] - Cs;
				}
				if (Gflag) {
					subStringChars[2] = subStringChars[2] - Gs;
				}
				if (Tflag) {
					subStringChars[3] = subStringChars[3] - Ts;
				}

				if (subStringChars[0] >= 0 && subStringChars[1] >= 0 && subStringChars[2] >= 0
						&& subStringChars[3] >= 0) {
					found = true;
					// System.out.println(subString);
					break;
				}
			}
			if (found) {
				break;
			}
			minLengthSubstring++;
		}
		System.out.println(minLengthSubstring);
		in.close();

	}

	public static int[] countNumberOfCharacters(String s) {
		int[] chars = new int[4];
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char ch = s.charAt(i);
			if (ch == 'A') {
				chars[0]++;
			}
			if (ch == 'C') {
				chars[1]++;
			}
			if (ch == 'G') {
				chars[2]++;
			}
			if (ch == 'T') {
				chars[3]++;
			}
		}

		return chars;
	}
}
