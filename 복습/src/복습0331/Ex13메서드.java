package 복습0331;

public class Ex13메서드 {

	public static void main(String[] args) {
		
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과확인 : " + result);

	}
	
	public static int powerN(int base, int n) {
		int power = 1;
		for(int i = 1; i <= n ; i++) {
			power *= base;
		}
		return power ;
	}

}
