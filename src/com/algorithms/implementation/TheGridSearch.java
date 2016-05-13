package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/the-grid-search
 * 
 * @author Kuldeep
 * 
 */
public class TheGridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int R = in.nextInt();
			int C = in.nextInt();
			String G[] = new String[R];
			for (int G_i = 0; G_i < R; G_i++) {
				G[G_i] = in.next();
			}
			int r = in.nextInt();
			int c = in.nextInt();
			String P[] = new String[r];
			for (int P_i = 0; P_i < r; P_i++) {
				P[P_i] = in.next();
			}

			int[][] grid = new int[R][C];
			int[][] box = new int[r][c];

			for (int i = 0; i < R; i++) {
				for (int j = 0; j < C; j++) {
					grid[i][j] = Character.getNumericValue(G[i].charAt(j));
				}
			}

			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					box[i][j] = Character.getNumericValue(P[i].charAt(j));
				}
			}
			//System.out.println("DONE");
			if (gridSearch(grid, box, R, C, r, c)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		in.close();
	}

	public static boolean gridSearch(int[][] grid, int[][] box, int R, int C, int r, int c) {
		boolean matchFound = false;

		for (int gridRow = 0; gridRow <= R - r; gridRow++) {
			for (int gridCol = 0; gridCol <= C - c; gridCol++) {
				if (grid[gridRow][gridCol] == box[0][0]) {
					//System.out.println("[" + gridRow + "][" + gridCol + "]");

					for (int boxRow = 0; boxRow < r; boxRow++) {
						for (int boxCol = 0; boxCol < c; boxCol++) {
							int boxNum = box[boxRow][boxCol];
							int gridNum = grid[gridRow + boxRow][gridCol + boxCol]; 
							if ( boxNum == gridNum) {
								matchFound = true;
							} else {
								matchFound = false;
								break;
							}
						}
						if(!matchFound)
							break;
					}
					if(matchFound)
						break;
				}
				
			}
			if(matchFound)
				break;
			
		}

		return matchFound;

	}
}
