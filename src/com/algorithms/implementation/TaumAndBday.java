package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/taum-and-bday
 * 
 * @author Kuldeep
 * 
 */
public class TaumAndBday {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			long b = in.nextLong();
			long w = in.nextLong();
			long x = in.nextLong();
			long y = in.nextLong();
			long z = in.nextLong();

			long blackToWhiteCost = x + z;
			long whiteToBlackCost = y + z;
			long total = 0;

			if (x > whiteToBlackCost) {
				total = total + b * (y + z);
			} else {
				total = total + b * x;
			}

			if (y > blackToWhiteCost) {
				total = total + w * (x + z);
			} else {
				total = total + w * y;
			}

			System.out.println(total);
		}
		in.close();

	}
}
