package 연습1차;

public class Bonus6 {

	public static void main(String[] args) { //약 4분
		
		int base = 2;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);

	}

	public static int powerN(int base, int n) {
		int num = 1;
		for(int i = 1; i <= n ; i++) {
			num *= base;
		}
		return num;
	}
}
