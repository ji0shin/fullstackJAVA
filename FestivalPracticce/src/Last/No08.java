package Last;

import java.util.Scanner;

public class No08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int numUp;
		
		if(num % 10 >= 5) {
			numUp = (num / 10 + 1) * 10;
		}else {
			numUp = (num / 10) * 10;
		}
		
		System.out.println("반올림 수 : " + numUp);

	}

}
