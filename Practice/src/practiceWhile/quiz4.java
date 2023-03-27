package practiceWhile;

import java.util.Scanner;

public class quiz4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재 몸무게 : ");
		int currentWeight = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goalWeight = sc.nextInt();
		
		int weeks = 1;
		while(true) {
			System.out.print(weeks + "주차 감량 몸무게 : ");
			int loseWeight = sc.nextInt();
			currentWeight -= loseWeight ;
			weeks++;
			
		
			if(currentWeight <= goalWeight) {
				System.out.println("최종몸무게 : " + currentWeight);
				System.out.println("축하합니다!!!");
				break;
			}
		}

		// in ---> console에 입력
		// out ---> console에 출력
		
		//1. 입력하는 도구 가져오기
		Scanner sc2 = new Scanner(System.in);
		
		//2. 현재몸무게 : --> 출력문
		//오른쪽에 사용자로부터 입력받기
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		
		//3. 목표몸무게 :  --> 출력문
		//오른쪽에 사용자로부터 입력받기
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		//4. 출력문
		//오른쪽에 사용자로부터 입력받기
		//4번은 반복이 된다 --> 목표 몸무게에 도달할 때까지 반복
		
		int week = 1;
		
		while(true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			int minus = sc.nextInt();
			week++;
			//현재몸무게(now) = 현재 몸무게(now) - 감량한 몸무게(minus)
			now -= minus ;
			// 종료조건
			// : now가 목표몸무게에 도달했는지 (작거나 같은지) ㅣ while문을 종료
			if(now <= goal) {
				break;
			}
		}
		//5. 반복문이 종료되면 출력문
		System.out.println(now + "kg 달성! 축하합니다!!!");
	}

}
