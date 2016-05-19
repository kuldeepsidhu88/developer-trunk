package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/acm-icpc-team
 * 
 * @author Kuldeep
 * 
 */
public class ACMICPCTeam {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int noOfStudents = in.nextInt();
		int noOfTopics = in.nextInt();
		String topics[] = new String[noOfStudents];
		for (int topic_i = 0; topic_i < noOfStudents; topic_i++) {
			topics[topic_i] = in.next();
		}
		
		int max = 0;
		int number = 0;
		for (int i = 0; i < noOfStudents; i++) {
			for (int k = i+1; k < noOfStudents; k++) {
				//char[] stuOne = topics[i].toCharArray(); int[] a
				//char[] stuTwo = topics[k].toCharArray(); int[] b
				char[] result = new char[noOfTopics];
				
				for (int j = 0; j < noOfTopics; j++) {
					/*if (stuOne[j] == '1' || stuTwo[j] == '1') {
						result[j] = '1';
					} else {
						result[j] = '0';
					}
					*/
					
					if (topics[i].charAt(j) == '1' || topics[k].charAt(j) == '1') { // a[i]|b[i]
						result[j] = '1';
					} else {
						result[j] = '0';
					}
				}

				String res = String.valueOf(result);
				
				int noOfOccurences = res.length() - res.replace("1", "").length();
				if(noOfOccurences>max){
					max=noOfOccurences;
					number=0;
				}
				if(noOfOccurences==max){
					number++;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(number);

		in.close();
	}
	
}
