package 연습1차;

import java.util.Scanner;

public class NO02 { // 4분 4초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int hourWage = 5000;
		double totalWage = 0;
		System.out.print("일한시간을 입력하세요 : ");
		int workTime = sc.nextInt();
		
		if(workTime > 8) {
			totalWage = (8*hourWage) + (workTime-8)*(hourWage*1.5);
		}else {
			totalWage = workTime * hourWage ;
		}
		
		System.out.println("총 임금은 " + (int)totalWage + "입니다.");
		

	}

}
