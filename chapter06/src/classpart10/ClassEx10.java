package classpart10;

import java.util.Random;

public class ClassEx10 {
	
	public void test(int[] x) {
		Random ran = new Random();
		System.out.print("[ ");
		for(int i = 0; i<x.length; i++) {
			x[i] = ran.nextInt(100)+1;
			System.out.print(x[i]+" ");
		}System.out.print("]");
	}
	public int sum(int[] x) {
		int result = 0;
		for(int i = 0; i<x.length; i++) {
			result += x[i];
		}
		return result;
	}
	public double avg(int[] x) {
		double result = 0;
		double result2 = 0;
		for(int i = 0; i<x.length; i++) {
			result += x[i];
			result2 = result/5;
		}
		return result2;
	}
	public int max(int[] x) {
		int max = 0;
		for(int i = 0; i<x.length; i++) {
			if(x[i] > max) {
				max = x[i];
			}
		}
		return max;
	}
	public int min(int[] x) {
		int min = x[0];
		for(int i = 0; i<x.length; i++) {
			if(x[i] < min) {
				min = x[i];
			}
		}
		return min;
	}
}
