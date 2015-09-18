package com.practice.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/solve-me-second
 * @author Kuldeep
 *
 */
public class SolveMeSecond {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numberOfTestCases;
		numberOfTestCases = in.nextInt();
		for (int i = 0; i < numberOfTestCases; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			System.out.println(sum(a,b));
		}
		in.close();
	}
	static int sum(int a,int b){
		return a+b;
	}
}
