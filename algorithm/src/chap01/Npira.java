package chap01;

public class Npira {

	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		npira(9);
	}
}
