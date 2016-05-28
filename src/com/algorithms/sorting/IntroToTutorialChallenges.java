package com.algorithms.sorting;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/tutorial-intro
 * 
 * @author Kuldeep
 * 
 */
public class IntroToTutorialChallenges {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int size = in.nextInt();
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == num) {
				System.out.println(i);
				break;
			}
		}
		in.close();
	}
}
