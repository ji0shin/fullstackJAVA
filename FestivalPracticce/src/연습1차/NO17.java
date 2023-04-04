package 연습1차;

import java.util.Scanner;

public class NO17 { // 4분 14초

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		String timesThree = "";
		while(true) {
			System.out.print(i + "번째 정수 입력 >> ");
			int num = sc.nextInt();
			i++;
			
			if(num % 3 == 0) {
				timesThree += num + " ";
			}
			
			if(i>10) {
				break;
			}
		}
		System.out.println("3의 배수 : " + timesThree);

	}

}
