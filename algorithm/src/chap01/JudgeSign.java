package chap01;

import java.util.Scanner;

public class JudgeSign {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		
		int n = sc.nextInt();
		
		if (n > 0) {
			System.out.println("���");
		}
		else if (n < 0) {
			System.out.println("����");
		}
		else {
			System.out.println("0");
		}
		
		sc.close();
	}
}
