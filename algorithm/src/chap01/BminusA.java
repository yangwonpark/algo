package chap01;

import java.util.Scanner;

public class BminusA {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("a : ");
		int a = sc.nextInt();
		int b;
		
		do {
			System.out.print("b : ");
			b = sc.nextInt();
			System.out.println("a���� ū ���� �Է��ض�");
		} while(b <= a);
		
		System.out.println("b - a : " + (b - a));
		
		sc.close();
	}
	
	
	
}
