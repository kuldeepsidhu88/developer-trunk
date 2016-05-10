package com.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/cut-the-sticks
 * @author Kuldeep
 *
 */
public class CutTheSticks {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        while(arr[n-1]>0){
	        int smallestStick = 0;
	        int numberOfSticksCut = 0;
	        for(int i=0; i < n; i++){
	        	if(arr[i]>0){
	        		smallestStick=arr[i];
	        		break;
	        	}
	        }
	        for(int i=0; i < n; i++){
	            arr[i] = arr[i]-smallestStick;
	            if(arr[i]>=0){
	            	numberOfSticksCut++;
	            }else{
	            	arr[i]=-1;
	            }
	        }
	        System.out.println(numberOfSticksCut);
        }
        in.close();
    }
}
