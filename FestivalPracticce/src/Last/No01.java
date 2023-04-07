package Last;

import java.util.Scanner;

public class No01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재몸무게 : ");
		int current = sc.nextInt();
		System.out.print("목표몸무게 : ");
		int goal = sc.nextInt();
		int week = 1;
		int losed;
		while(true) {
			System.out.print(week + "주차 감량 몸무게 : ");
			losed = sc.nextInt();
			current -= losed;
			
			if(current <= goal) {
				break;
			}
		}
		
		System.out.println(current + "kg 달성!! 축하합니다!");

	}

}
