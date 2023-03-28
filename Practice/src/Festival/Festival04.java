package Festival;

import java.util.Scanner;

public class Festival04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("총금액 입력 : ");
		int total = sc.nextInt();
		
		System.out.println();
		System.out.print("잔돈 : " + total + "원\n");
		
		int manwon = total / 10000 ;
		total -= manwon * 10000;
		int ochunwon = total / 5000 ;
		total -= ochunwon * 5000;
		int chunwon = total / 1000;
		total -= chunwon * 1000;
		int obakwon = total / 500;
		total -= obakwon * 500;
		int bakwon = total / 100;
		total -= bakwon * 100;
		
		System.out.println("10000원 : " + manwon + "개");
		System.out.println("5000원 : " + ochunwon + "개");
		System.out.println("1000원 : " + chunwon + "개");
		System.out.println("500원 : " + obakwon + "개");
		System.out.println("100원 : " + bakwon + "개");
		
	}

}
