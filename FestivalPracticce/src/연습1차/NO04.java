package 연습1차;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class NO04 { // 다시풀기

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 금액 입력 : ");
		int balance = sc.nextInt();
		
		System.out.println("잔돈 : " + balance);

		int manCount = balance / 10000 ;
		int ochunCount = balance % 10000 / 5000;
		int chunCount = balance % 10000 % 5000 / 1000;
		int obakCount = balance % 10000 % 5000 % 1000 / 500;
		int bakCount = balance % 10000 % 5000 % 1000 % 500 / 100;
		
		System.out.println("10000원 : " + manCount + "개");
		System.out.println("5000원 : " + ochunCount + "개");
		System.out.println("1000원 : " + chunCount + "개");
		System.out.println("500원 : " + obakCount + "개");
		System.out.println("100원 : " + bakCount + "개");
	}

}
