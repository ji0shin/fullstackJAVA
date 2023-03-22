import java.util.Scanner;

public class Ex06삼항연산 {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.println("두 수의 차 : " + ((num1 - num2 > 0) ? num1 - num2 : num2 - num1 ));
		
		int substract = ((num1 - num2 > 0) ? num1 - num2 : num2 - num1 );
		System.out.println("두 수의 차 : " + substract);
		
		int result = num1 - num2; // 뺀 값을 조건식에 넣어서 작성한 결과
		System.out.println("두 수의 차 : " + ((result >= 0) ? result : -result));

	}

}
