package com.algorithms.sorting;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/insertionsort1
 * 
 * @author Kuldeep
 * 
 */
public class InsertionSortPart1 {

	public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		int num = ar[ar.length - 1];
		boolean sorted = false;
		for (int i = ar.length - 2; i >= 0; i--) {
			if (ar[i] > num) {
				ar[i + 1] = ar[i];
			} else {
				ar[i + 1] = num;
				sorted = true;
			}
			printArray(ar);
			if (sorted) {
				break;
			}
		}
		if (ar[0] > num) {
			ar[0] = num;
			printArray(ar);
		}

	}

	/* Tail starts here */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int[] ar = new int[s];
		for (int i = 0; i < s; i++) {
			ar[i] = in.nextInt();
		}
		insertIntoSorted(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}
