package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/angry-professor
 * @author Kuldeep
 *
 */
public class AngryProfessor {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = in.nextInt();
		for(int i=0;i<testCases;i++){
			int totalStudents = in.nextInt();
			int reqStudents = in.nextInt();
			int enteredStudents = 0;
			while(totalStudents>0){
				int studentTime = in.nextInt();
				if(studentTime<=0){
					enteredStudents++;
				}
				totalStudents--;
			}
			if(enteredStudents<reqStudents){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		in.close();
	}
}
