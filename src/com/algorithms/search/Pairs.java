package com.algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/pairs
 * 
 * @author Kuldeep
 * 
 */
public class Pairs {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int res;

		String n = in.nextLine();
		String[] n_split = n.split(" ");

		int _a_size = Integer.parseInt(n_split[0]);
		int _k = Integer.parseInt(n_split[1]);

		int[] _a = new int[_a_size];
		int _a_item;
		String next = in.nextLine();
		String[] next_split = next.split(" ");

		for (int _a_i = 0; _a_i < _a_size; _a_i++) {
			_a_item = Integer.parseInt(next_split[_a_i]);
			_a[_a_i] = _a_item;
		}

		res = pairs(_a, _k);
		System.out.println(res);
		in.close();
	}

	public static int pairs(int a[], int k) {
		int res = 0;

		Arrays.sort(a);
		int length = a.length;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length;) {
				int first = a[i];
				int second = a[j];
				int diff = second - first;
				if (diff == k) {
					res++;
					j++;
				} else if (diff < k) {
					j++;
				} else {
					break;
				}
			}
		}
		return res;
	}
}
