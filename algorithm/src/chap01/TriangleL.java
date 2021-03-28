package chap01;

public class TriangleL {

	static void triangleLB(int n) {
		// 왼쪽 아래 직각
		System.out.println("왼쪽 아래 직각");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	static void triangleLU(int n) {
		// 왼쪽 위 직각
		System.out.println("왼쪽 위 직각");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	static void triangleRB(int n) {
		// 오른쪽 아래 직각
		System.out.println("오른쪽 아래 직각");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		// 오른쪽 위 직각
		System.out.println("오른쪽 위 직각");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		triangleLB(5);
		System.out.println();
		triangleLU(5);
		System.out.println();
		triangleRB(5);
		System.out.println();
		triangleRU(5);
	}
}
