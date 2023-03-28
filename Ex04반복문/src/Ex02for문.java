import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. 1~100까지 중 3의 배수를 출력하세요.
		//판단
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//보폭
		for(int i = 3 ; i <= 100 ; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//2. 1~100까지 중 3의 배수이면서 5의 배수를 출력하세요.
		for(int i = 1 ; i <= 100 ; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		//3. 한 개의 자연수를 입력 받아 그 수의 배수를 차례로 10개 출력하는 프로그램을 작성하시오.
		System.out.print("1개의 자연수 입력 >> ");
		int input = sc.nextInt();
		
		for(int j = 1 ; j <= 10 ; j++) {
			System.out.print((input * j) + " ");
		}
	}
}
