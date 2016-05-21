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
		StringBuilder sb = new StringBuilder();
		for (int num = min; num <= max; num++) {
			// int num = 45;
			int numLength = String.valueOf(num).length();

			long square = (long)Math.pow(num, 2.0);
			int squareLength = String.valueOf(square).length();
			long firstDigits = 0;
			long lastDigits = 0;
			
			if(num==1 || num==9){
				sb.append(num+" ");
				continue;
			}
			
			try {
				if (squareLength >= numLength) {
					lastDigits = Integer.parseInt(String.valueOf(square).substring(squareLength - numLength));
					firstDigits = Integer.parseInt(String.valueOf(square).substring(0, squareLength - numLength));
				}
					
			} catch (Exception ex) {
				//System.out.println("Error in number : " + num);
			}
			long sum = lastDigits + firstDigits;
			if (sum == num) {
				sb.append(num + " ");
			}

		}
		if (sb.length() == 0) {
			System.out.println("INVALID RANGE");
		} else {
			System.out.println(sb);
		}
		in.close();
	}
}
