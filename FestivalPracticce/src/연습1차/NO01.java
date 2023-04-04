package 연습1차;

import java.util.Scanner;

public class NO01 { //4분 45초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int currentWeight = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goalWeight = sc.nextInt();
		int week = 1;
		while(true) {
			
			System.out.print(week + "주차 감량 몸무게 : ");
			int losedWeight = sc.nextInt();
			week++;
			currentWeight -= losedWeight;
			
			if(currentWeight <= goalWeight) {
				System.out.printf("%dkg 달성!! 축하합니다!", currentWeight);
				break;
			}
		}
		

	}

}
