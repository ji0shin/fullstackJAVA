import java.util.Scanner;

public class Ex10switch문1 {
	public static void main(String[] args) {
		
		// 넣을 금액을 입력하고 메뉴를 고른 뒤 잔돈 출력
		// 입력한 금액이 선택한 메뉴의 가격보다 적으면 "돈이 부족해요" 출력
		// 잔돈을 출력할 때 천원/오백원/백원을 몇 개 줘야 하는지 계산하여 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		System.out.println("-- 메뉴 --");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		//메뉴 번호를 menuNum 변수로 입력 받음
		int menuNum = sc.nextInt();
		
		//각각의 음료 가격을 변수로 지정하고 가격 할당
		int priceCoke = 1800 ;
		int priceAde = 2000 ; 
		int priceSoda = 1200 ;
		
		//특정 메뉴별 가격을 변수로 지정 (switch문 사용을 위해)
		int priceMenu = 0 ;
		
		//메뉴번호에 따라서 priceMunu에 메뉴 번호에 해당하는 음료의 가격 값을 할당
		//1번을 선택하면 priceMenu는 1800원(priceCoke), 2번 선택시 2000원(priceAde), 3번 선택시 1200원(priceSoda)로 값 할당
		switch(menuNum) {
		case 1 :
			priceMenu = priceCoke ; 
			break;
		case 2 : 
			priceMenu = priceAde ;
			break;
		case 3 :
			priceMenu = priceSoda ; 
			break;
		}
		
		//잔돈을 변수로 저장하고 값 계산 (넣은돈 - 내가 선택한 음료의 가격)
		int changes = money - priceMenu ; //잔돈
		
		// if문 (만약 내가 넣은 돈이 내가 선택한 음료의 가격보다 크다면) 
		// 참일때 실행문 : 잔돈 change와 잔돈의 개수 출력
		// 거짓일 때 실행문 : 돈이 부족해요 출력
		
		// 잔돈 구하는 법 
		// chunwon(천원짜리개수) = 잔돈을 1000으로 나눴을 때의 몫
		// 위의문 처리 후 잔돈은 기존 잔돈에서 천원짜리 개수 * 1000을 뺀 값이 됨
		// obakwon(오백원짜리개수)  = 천원 잔돈을 뺀 금액을 500으로 나눴을 때의 몫
		// 위의문 처리 후 잔돈은 기존 잔돈에서 오백원짜리 개수 * 500을 뺀 값이 됨
		// bakwon(백원짜리개수) = 천원, 오백원 뺀 금액을 100으로 나눴을 때의 몫
		
		if(money >= priceMenu) {
			System.out.println("잔돈 : " + changes);
			int chunwon = changes / 1000 ;
			System.out.println("천원 : " + chunwon);
			changes -= chunwon * 1000 ;
			int obakwon = changes / 500 ;
			System.out.println("오백원 : " + obakwon);
			changes -= obakwon * 500 ;
			int bakwon = changes / 100 ;
			System.out.println("백원 : " + bakwon);
		}else {
			System.out.println("돈이 부족해요 ㅠ-ㅠ");
		}
		
		
		
	}
}
