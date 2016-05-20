package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/kaprekar-numbers
 * 
 * @author Kuldeep
 * 
 */
public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int min = in.nextInt();
		int max = in.nextInt();
		for (int num = min; num < max; num++) {
			// int num = 45;
			int numLength = String.valueOf(num).length();

			long square = num * num;
			int squareLength = String.valueOf(square).length();
			long lastDigits = Integer.parseInt(String.valueOf(square).substring(squareLength - numLength));
			long firstDigits = Integer.parseInt(String.valueOf(square).substring(0, numLength));
			long sum = lastDigits + firstDigits;
			if (sum == num) {
				System.out.print(num+" ");
			}
		}
		in.close();
	}
}
