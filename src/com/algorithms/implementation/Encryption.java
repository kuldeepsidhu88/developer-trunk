package com.algorithms.implementation;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/encryption
 * 
 * @author Kuldeep
 * 
 */
public class Encryption {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		s = s.replace(" ", "");
		int length = s.length();

		int rows = (int) Math.floor(Math.sqrt(length));
		int columns = (int) Math.ceil(Math.sqrt(length));

		if(rows*columns<length){
			rows=columns=Math.max(rows, columns);
		}
		
		char[][] encryptionArray = new char[rows][columns];
		int temp = 0;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				encryptionArray[i][j] = s.charAt(temp);
				temp++;
				if (temp == length)
					break;
			}
			if (temp == length)
				break;
		}

		for (int i = 0; i < columns; i++) {
			for (int j = 0; j < rows; j++) {
				if (encryptionArray[j][i] != '\u0000') {
					System.out.print(encryptionArray[j][i]);
				}
			}
			System.out.print(" ");
		}
		in.close();
	}
}
