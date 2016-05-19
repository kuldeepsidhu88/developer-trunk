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
			for (int k = i + 1; k < noOfStudents; k++) {

				int[] stuOneInt = stringToIntArray(topics[i]);
				int[] stuTwoInt = stringToIntArray(topics[k]);

				int noOfOccurences = 0;

				for (int j = 0; j < noOfTopics; j++) {
					int num = stuOneInt[j] | stuTwoInt[j];
					if (num == 1)
						noOfOccurences++;
				}

				if (noOfOccurences > max) {
					max = noOfOccurences;
					number = 0;
				}
				if (noOfOccurences == max) {
					number++;
				}
			}
		}

		System.out.println(max);
		System.out.println(number);

		in.close();
	}

	public static int[] stringToIntArray(String number) {
		int length = number.length();
		int[] result = new int[length];
		for (int i = 0; i < length; i++) {
			result[i] = Character.getNumericValue(number.charAt(i));
		}
		return result;
	}

}
