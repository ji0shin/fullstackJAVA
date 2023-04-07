package Last;

import java.util.Scanner;

public class Bo06 {

	public static void main(String[] args) {
		
		int base = 10;
		int n = 2;
		int result = powerN(base, n);
		System.out.println("결과 확인 : " + result);
		
	}
	
	public static int powerN(int base, int n) {
		int N = 1;
		for(int i = 1; i<= n ; i++) {
			N *= base;
		}
		
		return N;
	}

}
