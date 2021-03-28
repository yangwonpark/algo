package chap01;

import java.util.Scanner;

public class Gauss {
	
	// 가우스의 덧셈
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 부터 n까지의 정수 합을 구하시오 ");
		
		System.out.print("n : ");
		int n = sc.nextInt();

		int sum = 0;
		
		if (n % 2 == 0) {
			sum = (1 + n) * (n / 2);
		} else {
			sum = n * ((n-1) / 2) + n; 
		}
		
		System.out.print("합 : " + sum);
		
		sc.close();
	}
}
