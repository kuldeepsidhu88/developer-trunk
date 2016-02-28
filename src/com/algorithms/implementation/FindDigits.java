package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/find-digits
 * @author Kuldeep
 *
 */
public class FindDigits {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		while(size>0){
			String num = in.next();
			Integer number = Integer.parseInt(num);
			int digits = 0;
			for (int i = 0; i < num.length(); i++) {
				int n = Integer.parseInt(String.valueOf(num.charAt(i)));
				if(n != 0 && number%n == 0){
					digits++;
				}
			}
			System.out.println(digits);
			size--;
		}
		in.close();
	}
}
