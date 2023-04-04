package 연습1차;

import java.util.Scanner;

public class NO04_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int money = sc.nextInt();
		
		System.out.println("잔돈 : " + money);
		
		int man = money / 10000;
		int ochun = money % 10000 / 5000;
		int chun = money % 10000 % 5000 / 1000;
		int obak = money % 10000 % 5000 % 1000 / 500;
		int bak = money % 10000 % 5000 % 1000 % 500 / 100;
		
		System.out.print("10000원 : " + man + "개");
		System.out.printf("5000원 : %d개\n", ochun);
		System.out.printf("1000원 : %d개\n", chun);
		System.out.printf("500원 : %d개\n", obak);
		System.out.printf("100원 : %d개\n", bak);
		
		
		
		
	}

}
