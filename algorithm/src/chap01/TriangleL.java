package chap01;

public class TriangleL {

	static void triangleLB(int n) {
		// ���� �Ʒ� ����
		System.out.println("���� �Ʒ� ����");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	
	static void triangleLU(int n) {
		// ���� �� ����
		System.out.println("���� �� ����");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	static void triangleRB(int n) {
		// ������ �Ʒ� ����
		System.out.println("������ �Ʒ� ����");
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
		// ������ �� ����
		System.out.println("������ �� ����");
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
