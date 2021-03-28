package chap02;

import java.util.Scanner;

public class ReverseArray {
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length / 2; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j] + " ");
			}
			System.out.println();
			swap(a, i, a.length - i - 1);
			System.out.println("a[" + i + "]��(��) a[" + (a.length - i - 1) + "]�� ��ȯ�մϴ�.");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		
		reverse(x);
		
		for(int i = 0; i < num; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		
		sc.close();
	}
}
