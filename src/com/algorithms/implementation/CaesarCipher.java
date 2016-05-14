package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/caesar-cipher-1
 * 
 * @author Kuldeep
 * 
 */
public class CaesarCipher {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int k = in.nextInt();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			int ch = s.charAt(i);
			// A=65 Z=90 a=97 z=122
			if (ch >= 65 && ch <= 90) {
				ch = ch + k%26;
				while (ch > 90) {
					ch = ch - 26;
				}
			} else if (ch >= 97 && ch <= 122) {
				ch = ch + k%26;
				while (ch > 122) {
					ch = ch - 26;
				}

			}
			sb.append((char) ch);
		}
		System.out.println(sb);
		in.close();
	}
}
