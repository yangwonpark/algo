package chap01;

import java.util.Scanner;

public class PlusInt {

	// ���� ������ �ڸ��� ���
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		
		System.out.print("���� ������ �Է� : ");
		int num = sc.nextInt();
		
		while(num > 0) {
			num = num / 10;
			cnt++;
		}
		
		System.out.print("�ڸ����� " + cnt);
		
		sc.close();
	}
}
