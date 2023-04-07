package Last;

import java.util.Scanner;

public class No17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		String s = "";
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + "번째 정수 입력>>");
			num = sc.nextInt();
			
			if(num % 3 == 0) {
				s += num + " ";
			}
		}
		
		System.out.println("3의 배수 : " + s);

	}

}
