package multiExample;

import java.util.*;

public class MultiArrTest03 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
			int[][] arr = new int[3][3];
			int cnt =1;

			int q = 0;
			int w = 0;
			int e = 0;
			int r = 0;
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt * 10;
					cnt++;
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			System.out.print("변경할 행의 좌표를 입력하세요 >> ");
			q = scan.nextInt();
			System.out.print("변경할 열의 좌표를 입력하세요 >> ");
			w = scan.nextInt();
			System.out.println(arr[q][w]);
			int change = arr[q][w]; // 첫번째 좌표
			
			System.out.print("바꿀 행의 좌표를 입력하세요 >> ");
			e = scan.nextInt();
			System.out.print("바꿀 열의 좌표를 입력하세요 >> ");
			r = scan.nextInt();
			System.out.println(arr[e][r]);
			int change2 = arr[e][r]; // 두번째 좌표
			arr[q][w] = change2; // 처음 지정한 좌표는 두번째 좌표로
			arr[e][r] = change;  // 두번째 지정한 좌표는 첫번째 좌표로
			
			//자료구조의 stack 을 이용한 교환로직 
			// temp=0; 
			// 1 2 쓰고 1을 temp에 담고 1번 좌표는 2번 좌표로, 2번 좌표는 temp로
			
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					System.out.print(arr[i][j]+" ");
					
				}
				System.out.println();
			}
			scan.close();
		};
	}

