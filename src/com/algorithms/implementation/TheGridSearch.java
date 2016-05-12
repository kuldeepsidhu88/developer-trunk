package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/the-grid-search
 * @author Kuldeep
 *
 */
public class TheGridSearch {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String G[] = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String P[] = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            String result="NO";
            boolean found = false;
            for(int i=0,j=0;i<R;i++){
            	String row = G[i];
            	if(found && !row.contains(P[j]))
            		break;
            	if(row.contains(P[j])){
            		j++;
            		found=true;
            	}
            	if(j==r){
            		result = "YES";
            		break;
            	}
            }
            System.out.println(result);
        }
        in.close();
    }
}
