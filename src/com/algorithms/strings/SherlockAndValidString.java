package com.algorithms.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/sherlock-and-valid-string
 * 
 * @author sikuldee
 * 
 */
public class SherlockAndValidString {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();

		int[] alphabets = new int[26];

		for (int i = 0; i < s.length(); i++) {
			int index = s.charAt(i) - 97;
			alphabets[index]++;
		}

		Arrays.sort(alphabets);
		List<Integer> counts = new ArrayList<>();
		int temp = alphabets[alphabets.length - 1];
		int count = 0;
		for (int i = alphabets.length - 1; i >= 0; i--) {
			int num = alphabets[i];
			if (num == 0) {
				counts.add(count);
				break;
			}
			if (temp == num) {
				count++;
			} else {
				counts.add(count);
				count = 1;
				temp = num;
			}
		}

		if (counts.size() == 1) {
			System.out.println("YES");
		} else if (counts.size() == 2) {
			if (counts.get(0) == 1 || counts.get(1) == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}

		in.close();
	}
}
