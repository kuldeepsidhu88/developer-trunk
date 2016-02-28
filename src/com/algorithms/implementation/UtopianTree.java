package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/utopian-tree
 * @author Kuldeep
 *
 */
public class UtopianTree {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		for (int i = 0; i < size; i++) {
			int length = 1;
			int cycles = in.nextInt();
			for(int j=1;j<=cycles;j++){
				if(j%2 != 0){
					length = length*2;
				}else{
					length = length+1;
				}
			}
			System.out.println(length);
		}
		in.close();
	}
}
