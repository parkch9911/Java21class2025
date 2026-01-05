package multiExample;

import java.util.*;

public class MultiArrTest05 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
				}; 
		
			for(int i = 0; i<arr.length; i++) {
				int raw = 0;
				for(int j =0; j<arr[i].length; j++) {
						raw += arr[i][j];	
					}
				System.out.print(raw+" ");
				
				}
			System.out.println();
			for(int j = 0; j<arr[0].length; j++) {  // j = 0 1 2 3
				int col = 0;
				for(int i =0; i<arr.length; i++) { // i =  0 1 2
						col += arr[i][j];
					}
				System.out.print(col+" ");
				}
			}
		
		}

