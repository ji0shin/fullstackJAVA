import java.util.Scanner;

public class Ex10switch문 {

	public static void main(String[] args) {
		// 넣을 금액을 입력하고 메뉴를 고른 뒤 잔돈 출력
		// 입력한 금액이 선택한 메뉴의 가격보다 적으면 "돈이 부족해요" 출력
		// 잔돈을 출력할 때 천원/오백원/백원을 몇 개 줘야 하는지 계산하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("-- 메뉴 --");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		int menu = sc.nextInt();
		
		int changesCoke = money - 1800 ;
		int changesPowerade = money - 2000 ;
		int changesSparkling = money - 1200 ;
		
		switch(menu) {
		case 1 : 
			if(money < 1800) {
				System.out.println("돈이 부족해요 ㅠ-ㅠ");
			}else {
				System.out.println("잔돈 : " + changesCoke + "원");
				System.out.println("천원 : " + changesCoke / 1000);
				System.out.println("오백원 : " + changesCoke % 1000 / 500);
				System.out.println("백원 : " + changesCoke % 1000 % 500 / 100);	
			}
			break;
		case 2 : 
			if(money < 2000) {
				System.out.println("돈이 부족해요 ㅠ-ㅠ");
			}else {
				System.out.println("잔돈 : " + changesPowerade + "원");
				System.out.println("천원 : " + changesPowerade / 1000);
				System.out.println("오백원 : " + changesPowerade % 1000 / 500);
				System.out.println("백원 : " + changesPowerade % 1000 % 500 / 100);
			}
			break;
		case 3 :
			if(money < 1200) {
				System.out.println("돈이 부족해요 ㅠ-ㅠ");
			}else {
				System.out.println("잔돈 : " + changesSparkling + "원");
				System.out.println("천원 : " + changesSparkling / 1000);
				System.out.println("오백원 : " + changesSparkling % 1000 / 500);
				System.out.println("백원 : " + changesSparkling % 1000 % 500 / 100);
			}
			break;
		}
	}
}
