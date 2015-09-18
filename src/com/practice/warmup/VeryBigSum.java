package com.practice.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/a-very-big-sum
 * @author Kuldeep
 *
 */
public class VeryBigSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		long sum = 0L;
		for(int i=0;i<size;i++){
			long arg = in.nextLong();
			sum = sum+arg;
		}
		System.out.println(sum);
		in.close();
	}
}
