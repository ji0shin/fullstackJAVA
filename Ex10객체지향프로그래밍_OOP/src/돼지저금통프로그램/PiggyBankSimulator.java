package 돼지저금통프로그램;

import java.util.Scanner;

public class PiggyBankSimulator {

	
	public static void main(String[] args) {
		// 돼지 저금통 객체 생성
		
		Scanner sc = new Scanner(System.in);
		int menu;
		PiggyBank pb = new PiggyBank();
		 
		System.out.println("========= 돼지 저금통 ========");
		
		while(true) {
			System.out.print("[1]입금 [2]출금 [3]잔액확인 >> ");
			menu = sc.nextInt();
			
			if(menu==1) {
				// 입금기능 메소드 호출
				pb.deposit(sc.nextInt());
			}else if(menu==2) {
				// 출금기능 메소드 호출
				pb.withdraw(sc.nextInt());
			}else if(menu==3) {
				// 잔액확인 메소드 호출
				pb.showMoney();
			}else {
				break;
			}
		}

	}

}
