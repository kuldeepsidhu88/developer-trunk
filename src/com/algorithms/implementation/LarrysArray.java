package com.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/larrys-array
 * 
 * @author Kuldeep
 * 
 */
public class LarrysArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			int size = in.nextInt();
			int a[] = new int[size];

			for (int j = 0; j < size; j++) {
				a[j] = in.nextInt();
			}
			int m = 200;
			while (m > 0) {
				soultion(a);
				for (int k = 0; k < a.length; k++) {
					System.out.print(a[k] + " ");
				}
				System.out.println();
				m--;
			}
			/*
			 * if (isSorted(a)) { System.out.println("YES"); } else {
			 * System.out.println("NO"); }
			 */

		}
		in.close();
	}

	public static void soultion(int a[]) {
		int length = a.length;
		boolean isSorted = false;
		for (int i = 0; i < length - 2; i++) {
			int subset[] = Arrays.copyOfRange(a, i, i + 3);

			if (isSorted(subset)) {
				isSorted = true;
				continue;
			} else {
				int rotation = 3;
				while (rotation > 0) {
					if (rotate(subset)) {
						a[i] = subset[0];
						a[i + 1] = subset[1];
						a[i + 2] = subset[2];
						isSorted = true;
						continue;
					} else {
						isSorted = false;
						rotation--;
					}
				}
				/*
				 * if (!isSorted) { break; }
				 */
			}
		}
	}

	public static boolean rotate(int subset[]) {
		boolean res = false;
		int temp = subset[0];
		for (int i = 0; i < subset.length - 1; i++) {
			subset[i] = subset[i + 1];
		}
		subset[subset.length - 1] = temp;
		if (isSorted(subset)) {
			res = true;
		}
		return res;
	}

	public static boolean isSorted(int a[]) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] > a[i + 1]) {
				return false;
			}
		}
		return true;
	}
}
