package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/cavity-map
 * @author Kuldeep
 *
 */
public class CavityMap {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String grid[] = new String[n];
        for(int grid_i=0; grid_i < n; grid_i++){
            grid[grid_i] = in.next();
        }
        
        String gridNew[][] = new String[n][n];
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				gridNew[i][j] = String.valueOf(grid[i].charAt(j));
			}
		}
        
        for (int i = 1; i < n-1; i++) {
			for (int j = 1; j < n-1; j++) {
				int cavity = Character.getNumericValue(grid[i].charAt(j));
				int left = Character.getNumericValue(grid[i].charAt(j-1));
				int right = Character.getNumericValue(grid[i].charAt(j+1));
				int above = Character.getNumericValue(grid[i-1].charAt(j));
				int below = Character.getNumericValue(grid[i+1].charAt(j));

				if(cavity>left && cavity>right && cavity>above && cavity>below){
					///System.out.println(cavity);
					//System.out.println("[" + i + "][" + j + "]");
					gridNew[i][j]="X";
				}
			}
			//System.out.println();
		}
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(gridNew[i][j]);
			}
			System.out.println();
		}
        
        in.close();
    }

}
