package Festival;

import java.util.Scanner;

public class Festival01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goalWeight = sc.nextInt();
		
		int week = 1;
		
		while(true) {
			
			if(currentWeight <= goalWeight) {
				System.out.println(currentWeight + "kg 달성!! 축하합니다!");
				break;
			}
				
			System.out.print(week + "주차 감량 몸무게 : ");
			int loseWeight = sc.nextInt();
			currentWeight -= loseWeight;
			

		}

	}

}
