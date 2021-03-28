package chap02;

import java.util.Scanner;

public class MaxOfArray {
	
	static int maxOf(int[] a) {
		// 일단 첫번째 배열 요소를 max로 잡고 얘를 가지고 모든 요소의 크기를 비교한다
		int max = a[0];
		
		for(int i = 1; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키의 최댓값을 구합니다.");

		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("height[" + i + "] : ");
			height[i] = sc.nextInt();
		}
		
		System.out.println("최댓값은 " + maxOf(height) + "입니다.");
		
		sc.close();
	}
}
