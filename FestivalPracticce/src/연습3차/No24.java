package 연습3차;

import java.util.Scanner;

public class No24 {

	public static void main(String[] args) {
		
		String smallNum = "";
		int num ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int N = sc.nextInt();
		System.out.print("X 입력 >> ");
		int X = sc.nextInt();
		
		for(int i = 1 ; i <= N ; i++) {
			System.out.print(i + "번째 정수 입력 >> ");
			num = sc.nextInt();
			
			if(num < X) {
				smallNum += num + " ";
			}
		}

		System.out.println("결과 >> " + smallNum);
	}

}
