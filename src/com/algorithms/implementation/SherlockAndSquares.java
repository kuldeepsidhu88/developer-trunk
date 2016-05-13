package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/sherlock-and-squares
 * @author Kuldeep
 *
 */
public class SherlockAndSquares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		while(testCases>0){
			long min = sc.nextInt();
			long max = sc.nextInt();
			long minSq = (long)Math.sqrt(min);
			long maxSq = (long)Math.sqrt(max);
			long result = 0;
			if(min == max){
				if(minSq*minSq==min)
					result=1;
			} else{
				result = maxSq-minSq;
				if(minSq*minSq == min) 
					result++;
			}
			System.out.println(result);
			testCases--;
		}
		sc.close();
	}

}
