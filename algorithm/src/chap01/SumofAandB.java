package chap01;


public class SumofAandB {

	static int sumof(int a, int b) {
		
		int sum = 0;
		
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		int sum = sumof(1,11);
		
		System.out.println(sum);
	}
	
}
