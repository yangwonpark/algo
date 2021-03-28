package chap02;

import java.util.Scanner;

public class Copy {

	static void copy(int[] a, int[] b) {
		int len;
		
		if(a.length <= b.length) {
			len = a.length;
		} else {
			len = b.length;
		}
		
		for(int i = 0; i < len; i++) {
			a[i] = b[i];	
		}
		
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a 크기는 : ");
		int length_a = sc.nextInt();
		int[] a = new int[length_a];
		for (int i = 0; i < length_a; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("b 크기는 : ");
		int length_b = sc.nextInt();
		int[] b = new int[length_b];
		for (int i = 0; i < length_b; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		
		sc.close();
	}
}
