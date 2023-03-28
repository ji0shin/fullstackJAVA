import java.util.Scanner;

public class Ex04for문 {

	public static void main(String[] args) {
		// 입력 받은 정수의 약수를 구하세요.
		// 약수의 특징
		// 1. 약수는 자기 자신보다 큰 숫자는 없다
		// 2. 모든 숫자들의 가장 작은 약수는 1
		// 3. 나눴을 때 나머지가 0
		// 4. 자기 자신을 2로 나눈 것이 2번째로 큰 약수 (자기 자신의 절반 ~ 자기 자신 사이에는 약수가 존재하지 않음) 
		//    -> 자신의 절반까지만 반복하고 자기 자신만 마지막에 출력하면 실행 시간을 줄일 수 있음
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		System.out.print(num + "의 약수 : ");
		
		
		for(int i = 1 ; i <= num ; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
