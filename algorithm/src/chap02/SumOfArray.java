package chap02;

import java.util.Scanner;

public class SumOfArray {

	static int sumOf(int[] a) {
		int sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기 : ");
		int len = sc.nextInt();
		
		int[] a = new int[len];
		
		for(int i = 0; i < len; i++) {
			System.out.print("x[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		int result = sumOf(a);
		
		System.out.println("result : " + result);
		sc.close();
	}
}
