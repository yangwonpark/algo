package chap01;

import java.util.Scanner;

public class Gauss {
	
	// ���콺�� ����
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1 ���� n������ ���� ���� ���Ͻÿ� ");
		
		System.out.print("n : ");
		int n = sc.nextInt();

		int sum = 0;
		
		if (n % 2 == 0) {
			sum = (1 + n) * (n / 2);
		} else {
			sum = n * ((n-1) / 2) + n; 
		}
		
		System.out.print("�� : " + sum);
		
		sc.close();
	}
}
