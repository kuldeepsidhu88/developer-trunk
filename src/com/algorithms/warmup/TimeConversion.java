package com.algorithms.warmup;

import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/time-conversion
 * @author Kuldeep
 *
 */
public class TimeConversion {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String time = in.next();
		int length = time.length();
		if(time.substring(length-2,length).equals("AM") && Integer.parseInt(time.substring(0, 2)) == 12){
			time = time.replace(time.substring(0, 2),"00");
			time = time.substring(0,length-2);
			System.out.println(time);
		}
		else if(time.substring(length-2,length).equals("PM") && Integer.parseInt(time.substring(0, 2)) == 12){
			time = time.substring(0,length-2);
			System.out.println(time);
		}
		else if(time.substring(length-2,length).equals("PM") && Integer.parseInt(time.substring(0, 2)) < 12){
			int hour = Integer.parseInt(time.substring(0, 2)) + 12;
			time = time.replace(time.substring(0, 2),""+ hour);
			time = time.substring(0,length-2);
			System.out.println(time);
		}
		else{
			time = time.substring(0,length-2);
			System.out.println(time);
		}
		
		in.close();
	}
}