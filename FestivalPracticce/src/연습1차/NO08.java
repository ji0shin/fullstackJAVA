package 연습1차;

import java.util.Scanner;

public class NO08 { // 2분 34초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		int roundNum = 0;
		if(num % 10 >= 5) {
			roundNum = (num / 10 + 1) * 10;
		}else {
			roundNum = (num / 10) * 10;
		}
		
		System.out.println("반올림수 : " + roundNum);
	}

}
