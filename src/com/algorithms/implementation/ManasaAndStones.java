package com.algorithms.implementation;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ManasaAndStones {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		while (testCases > 0) {
			int stones = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			Set<Integer> result = new TreeSet<>();

			for (int i = 0; i < stones; i++) {
				int lastStone = a * i + b * (stones - 1 - i);
				result.add(lastStone);
			}
			for (Integer num : result) {
				System.out.print(num + " ");
			}
			System.out.println();
			testCases--;
		}
		in.close();
	}
}
