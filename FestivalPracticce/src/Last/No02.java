package Last;

import java.util.Scanner;

public class No02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		int hourWage = 5000;
		double total = 0;
		
		if(time > 8) {
			total = (time - 8)*(1.5*hourWage) + (8*hourWage);
		}else {
			total = hourWage * time;
		}
		
		System.out.println("총 임금은 " + (int)total + "원 입니다. ");

	}

}
