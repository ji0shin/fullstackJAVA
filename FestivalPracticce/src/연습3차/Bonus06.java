package 연습3차;

public class Bonus06 {

	public static void main(String[] args) {
		
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
	}
	
	public static int powerN(int base, int n) {
		
		int value = 1;
		for(int i = 1 ; i <= n ; i++) {
			value *= base;
		}
		return value;
	}

}
