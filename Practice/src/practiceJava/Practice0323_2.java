package practiceJava;

import java.util.Scanner;

public class Practice0323_2 {

	public static void main(String[] args) {
		
		//입력된 수가 3의 배수인지 판별하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수를 입력하시오: ");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}

	}

}
