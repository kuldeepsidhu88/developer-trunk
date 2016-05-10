package com.algorithms.implementation;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Link - https://www.hackerrank.com/challenges/service-lane
 * @author Kuldeep
 *
 */
public class ServiceLane {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int width_i=0; width_i < n; width_i++){
            width[width_i] = in.nextInt();
        }
        for(int a0 = 0; a0 < t; a0++){
            int i = in.nextInt();
            int j = in.nextInt();
            int subArray[] = Arrays.copyOfRange(width, i, j+1);
            Arrays.sort(subArray);
            System.out.println(subArray[0]);
            
        }
        
        in.close();
    }

}
