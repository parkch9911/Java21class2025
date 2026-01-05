package multiExample;

import java.util.*;

public class MultiArrTest02 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		int cnt = 1; //누적
		int tot = 0; //총계
		// 
		int cnt2 = 1;
		int tot2 = 0;
		int res = 0;
		// 
		int cnt3 =1;
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt * 10;
					cnt++;
					// 1번 문제
					System.out.print(arr[i][j]+" ");
					tot += arr[i][j];
					}		
				System.out.println();
				}
			// 2번 문제
			System.out.println("총합 : "+tot);	
			
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt2 * 10;
					cnt2++;
					if(arr[i][j]%4 == 0) {
						System.out.print(arr[i][j]+" ");
						tot2++;
						res+= arr[i][j];
						}
					}
				}
			// 3번문제
			System.out.println();
			System.out.println("4의 배수의 개수 : "+tot2+"개");
			// 4번 문제
			System.out.println("4의 배수의 총 합 : " + res);
			
			int a = 0;
			int b = 0;
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt3 * 10;
					cnt3++;
					System.out.print("행의 좌표를 입력하세요 >>");
					a = scan.nextInt();
					System.out.print("열의 좌표를 입력하세요 >>");
					b = scan.nextInt();
				break;
				}
				break;
				}
			// 5번 문제 
			System.out.print("값 출력 : " + arr[a][b]+" ");
			int cnt4 =1;
			int cnt5 =1;
			int q = 0;
			int w = 0;
			int e = 0;
			int r = 0;
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt4 * 10;
					cnt4++;
					System.out.print("\n변경할 행의 좌표를 입력하세요 >>");
					q = scan.nextInt();
					System.out.print("변경할 열의 좌표를 입력하세요 >>");
					w = scan.nextInt();
					System.out.print("변경 할 좌표 : " + q+","+w +" / 값 :  "+ arr[q][w]);
					break;
				}
				break;
			}
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt5 * 10;
					cnt5++;
					System.out.print("\n바꿀 행의 좌표를 입력하세요 >>");
					q = scan.nextInt();
					System.out.print("바꿀 열의 좌표를 입력하세요 >>");
					w = scan.nextInt();
					System.out.print("변경 할 좌표 : " + e+","+r +" / 값 :  "+ arr[e][r]);
					break;
				}
				break;
			}
			for(int i = 0; i<arr.length; i++) {
				for(int j = 0; j<arr[i].length; j++) {
					arr[i][j] = cnt5 * 10;
					cnt5++;
					arr[q][w] = arr[e][r];
					arr[e][r] = arr[q][w];
					System.out.print(arr[i][j]+" ");
				}
				
			}
			
			
		};
	}

