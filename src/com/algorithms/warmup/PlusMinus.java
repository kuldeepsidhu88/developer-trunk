package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/plus-minus
 * @author Kuldeep
 *
 */
public class PlusMinus {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		int positive = 0;
		int negative = 0;
		int zeros = 0;
		for(int i=0;i<size;i++){
			int num = in.nextInt();
			if(num>0)
				positive++;
			if(num<0)
				negative++;
			if(num==0)
				zeros++;
		}
		System.out.println(String.format("%,.3f",(float)positive/size));
		System.out.println(String.format("%,.3f",(float)negative/size));
		System.out.println(String.format("%,.3f",(float)zeros/size));
		in.close();
	}
}
