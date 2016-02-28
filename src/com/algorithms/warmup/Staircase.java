package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/staircase
 * @author Kuldeep
 *
 */
public class Staircase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();
		for (int i = 0; i < height; i++) {
			int spacesLength = height-i-1;
			int hashLength = i+1;
			while(spacesLength>0){
				System.out.print(" ");
				spacesLength--;
			}
			while(hashLength>0){
				System.out.print("#");
				hashLength--;
			}
			System.out.println();
		}
		in.close();
	}
}

