package Festival;

import java.util.Scanner;

public class Festival02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int inputWorktime = sc.nextInt();
		double totalWage = 0 ;
		int hourWage = 5000;
		
		if(inputWorktime > 8) {
			totalWage = 8 * hourWage + (hourWage * 1.5) * (inputWorktime - 8) ;
		}else {
			totalWage = inputWorktime * hourWage ;
		}
		System.out.println("총 입금은 " + (int)totalWage + "원 입니다.");

	}

}
