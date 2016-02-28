package com.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/extra-long-factorials
 * @author Kuldeep
 *
 */
public class ExtraLongFactorial {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		BigInteger factorial = factorial(BigInteger.valueOf(num));
		System.out.println(factorial);
		in.close();
	}
	
	static BigInteger factorial(BigInteger num){
		if(num.intValue()==0 || num.intValue()==1){
			return BigInteger.valueOf(1);
		}else{
			return num.multiply(factorial(num.subtract(BigInteger.valueOf(1))));
		}
	}
}
