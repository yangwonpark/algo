package chap01;

import java.util.Scanner;

public class Triangle {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ���");
		
		do {
			System.out.print("�� ��? : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
