package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/chocolate-feast
 * @author Kuldeep
 *
 */
public class ChocolateFeast {
	
	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        for(int a0 = 0; a0 < t; a0++){
	            int n = in.nextInt();
	            int c = in.nextInt();
	            int m = in.nextInt();
	            
	            int noOfChocolates = n/c;
	            int noOfWrappers = noOfChocolates;

	            while(noOfWrappers>=m){
	            	int temp = noOfWrappers/m;
	            	noOfChocolates = noOfChocolates+temp;
	            	noOfWrappers = noOfWrappers%m+temp;
	            }
	           
	            System.out.println(noOfChocolates);
	        }
	        
	        in.close();
	}

}
