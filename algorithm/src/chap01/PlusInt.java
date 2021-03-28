package chap01;

import java.util.Scanner;

public class PlusInt {

	// 양의 정수의 자릿수 출력
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		System.out.print("양의 정수를 입력 : ");
		int num = sc.nextInt();
		
		while(num > 0) {
			num = num / 10;
			cnt++;
		}
		
		System.out.print("자릿수는 " + cnt);
		
		sc.close();
	}
}
