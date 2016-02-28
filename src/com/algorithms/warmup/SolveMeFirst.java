package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/solve-me-first
 * @author Kuldeep
 *
 */
public class SolveMeFirst {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int b;
		a = in.nextInt();
		b = in.nextInt();
		int sum;
		sum = sum(a,b);
		System.out.println(sum);
		in.close();
	}
	static int sum(int a,int b){
		return a+b;
	}
}
