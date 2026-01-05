package multiExample;

import java.util.*;

public class MultiArrTest04 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
				}; 
		
		int sum = 0;
		int sum2 = 0;
		int sum3 = 0;
		int total = 0;
		int total2 = 0;
		int total3 = 0;
		int total4 = 0;
		
			for(int i = 0; i<arr.length; i++) {
				for(int j =0; j<arr[i].length; j++) {
					if(i==0) {
						sum += arr[i][j];
						
					}else if(i==1) {
						sum2 += arr[i][j];
						
					}else if(i==2) {
						sum3 += arr[i][j];
					}
				}
			}
			System.out.println(sum);
			System.out.println(sum2);
			System.out.println(sum3);
			
			for(int i = 0; i<arr.length; i++) {
				for(int j =0; j<arr[i].length; j++) {
					if(j==0) {
						total += arr[i][j];
						
					}else if(j==1) {
						total2 += arr[i][j];
						
					}else if(j==2) {
						total3 += arr[i][j];
					}else {
						total4 += arr[i][j];
					}
				}
			}
			System.out.println(total);
			System.out.println(total2);
			System.out.println(total3);
			System.out.println(total4);
		
		}
	}

