package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/bear-and-workbook
 * @author Kuldeep
 *
 */
public class LisaWorkbook {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int noOfChapters = in.nextInt();
		int problemsPerPage = in.nextInt();
		int chapters[] = new int[noOfChapters];
		
		for(int i=0;i<noOfChapters;i++){
			chapters[i]=in.nextInt();
		}
		
		int currentPageNo=0;
		int specialProblems=0;
		for(int i=0;i<noOfChapters;i++){
			int noOfProblems = chapters[i];
			int minProb = 0;
			int maxProb = 0;
			while(maxProb<noOfProblems){
				currentPageNo++;
				minProb=maxProb+1;
				maxProb = maxProb + problemsPerPage;
				if(maxProb>noOfProblems)
					maxProb=noOfProblems;
				
				if(currentPageNo>=minProb && currentPageNo<=maxProb){
					specialProblems++;
				}
				
			}
		}
		System.out.println(specialProblems);
		in.close();
		
	}
}
