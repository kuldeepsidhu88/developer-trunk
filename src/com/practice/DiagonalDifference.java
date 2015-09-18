package com.practice;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/diagonal-difference
 * @author Kuldeep
 *
 */
public class DiagonalDifference {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int matrix[][] = new int [size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				matrix[i][j]=in.nextInt();
			}
		}
		int diagonalOneSum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i==j) {
					diagonalOneSum = diagonalOneSum + matrix[i][j];
				}
			}
		}
		int diagonalTwoSum = 0;
		int i =0;
		int j = size-1;
		while (i<size && j>=0){
			diagonalTwoSum = diagonalTwoSum + matrix[i][j];
			j--;
			i++;
		}
		
		System.out.println(Math.abs(diagonalOneSum - diagonalTwoSum));
		in.close();
	}
}
