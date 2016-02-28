package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/library-fine
 * @author Kuldeep
 *
 */
public class LibraryFine {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int fine = 0;
		int rDay = in.nextInt();
		int rMonth = in.nextInt();
		int rYear = in.nextInt();
		int eDay = in.nextInt();
		int eMonth = in.nextInt();
		int eYear = in.nextInt();
		
		if(eYear >= rYear){
			if(eYear == rYear){
				if(eMonth >= rMonth){
					if(eMonth==rMonth){
						if(eDay<rDay){
							fine = 15*(rDay-eDay);
						}
					}
				}else{
					fine = 500*(rMonth-eMonth);
				}
			}
		}else{
			fine = 10000;
		}
		System.out.println(fine);
		in.close();
	}
}
