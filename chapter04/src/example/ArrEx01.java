package example;

public class ArrEx01 {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		// 1번문제
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		//10 20 30 40 50 
		
		System.out.print("\n");
		// 2번 문제
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%4 ==0) {
				System.out.print(arr[i]+" ");
			}
		} 
		//20 40 
		
		System.out.print("\n");
		// 3번 문제
		int sum = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%4 ==0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
		// 60

		// 4번 문제
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%4 ==0) {
				count++;
			}
		}
		System.out.println(count);
		// 2
		
		// 5번 문제
		int count2 = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2 ==0) {
				count2++;
			}
		}
		System.out.println(count2);
		// 5
	}

}
