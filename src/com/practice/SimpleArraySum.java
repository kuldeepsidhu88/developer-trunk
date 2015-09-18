package com.practice;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/simple-array-sum
 * @author Kuldeep
 *
 */
public class SimpleArraySum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int sum=0;
		for(int i=0;i<length;i++){
			int element = in.nextInt();
			sum = sum+element;
		}
		System.out.println(sum);
		in.close();
	}
}
