import java.util.Scanner;

public class Ex03while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int sum = 0;
		
		//while문
		
		while(input != -1) {
			System.out.print("숫자 입력 : ");
			sum += input;
			input = sc.nextInt();
		}
		
		System.out.println("누적결과 : " + sum);
		
		//쌤이푼거
		int sum3 = 0; //지금까지 입력한 모든 수의 합 저장(누적합)
		int odd = 0; //홀수 개수 저장
		int even = 0; //짝수 개수 저장
		
		while(true) {
			input = sc.nextInt();
			
			if(input == -1) {
				break; //만나는 순간 반복문 나감!
			}
			
			if(input % 2 == 1) {//홀수
				odd++ ;
			}else {//나머지가 0일때 -> 짝수일때
				even++ ;
			}
			sum3 += input ; //sum = sum + input
		}
		System.out.println("누적결과 : " + sum3);
		System.out.println("짝수개수 : " + even);
		System.out.println("홀수개수 : " + odd);

		//do~while문
		
		int sum2 = 0;
		
		do {
			System.out.print("숫자 입력 : ");
			input = sc.nextInt();
			if(input == -1) break;
			sum2 += input;
		}while(input != -1);
		
		System.out.println("누적결과 : " + sum2);
	}

}
