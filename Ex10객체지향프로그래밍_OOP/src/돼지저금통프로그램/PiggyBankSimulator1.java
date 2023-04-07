package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator1 { // 사용자와 상호소통하는 역할

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===돼지 저금통===");
		
		//돼지 저금통 객체 생성
		PiggyBank1 pg1 = new PiggyBank1();
		
		while(true) {
		
		//입금기능 메소드 호출
		System.out.print("입금할 금액 입력 : ");
		pg1.deposit(sc.nextInt());
		
		//출금 기능 메소드 호출
		System.out.print("출금할 금액 입력 : ");
		pg1.withdraw(sc.nextInt());
		
		//잔액확인 메소드 호출
		int m = pg1.showMoney();
		System.out.println(m + "원 남았습니다.");
		
		}
	}

}
