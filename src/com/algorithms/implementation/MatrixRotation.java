package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/matrix-rotation-algo
 * 
 * @author Kuldeep
 * 
 */
public class MatrixRotation {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int rows = in.nextInt();
		int columns = in.nextInt();
		long rotateTimes = in.nextLong();

		long[][] matrix = new long[rows][columns];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();

		int rotatesNeeded = Math.min(rows, columns) / 2;
		long divNum = 2*((rows-1)+(columns-1));

		for (int i = 0; i < rotatesNeeded; i++) {
			long rotation = rotateTimes%(divNum - 8*i);
			while (rotation > 0) {
				int j = i;
				long tempNum = matrix[i][j];
				int colTrack = j;
				while (j < columns - 1 - colTrack) {
					matrix[i][j] = matrix[i][j + 1];
					j++;
				}
				int rowTrack = i;
				while (i < rows - 1 - rowTrack) {
					matrix[i][j] = matrix[i + 1][j];
					i++;
				}
				while (j > 0 + colTrack) {
					matrix[i][j] = matrix[i][j - 1];
					j--;
				}
				while (i > 0 + rowTrack) {
					matrix[i][j] = matrix[i - 1][j];
					i--;
				}
				matrix[i + 1][j] = tempNum;
				
				rotation--;
			}

		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}
}
