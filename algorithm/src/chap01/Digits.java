package chap01;

import java.util.Scanner;

public class Digits {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("2�ڸ��� ���� �Է�");
		
		do {
			System.out.print("�Է� : ");
			num = sc.nextInt();
		} while (num < 10 || num > 99);
		
		System.out.print(num);
		
		sc.close();
	}
}
