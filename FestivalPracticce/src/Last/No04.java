package Last;

import java.util.Scanner;

public class No04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		
		System.out.println("잔돈 : " + total);
		
		int man = total / 10000;
		int ochun = total % 10000 / 5000;
		int chun = total % 10000 % 5000 / 1000;
		int obak = total % 10000 % 5000 % 1000 / 500;
		int bak = total % 10000 % 5000 % 1000 % 500 / 100;
		
		System.out.println("10000원 : " + man + "개");
		System.out.println("5000원 : " + ochun + "개");
		System.out.println("1000원 : " + chun + "개");
		System.out.println("500원 : " + obak + "개");
		System.out.println("100원 : " + bak + "개");

	}

}
