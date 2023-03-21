
public class Ex01산술연산 {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 7;
		float num3 = 10f;
		float num4 = 7f;
		
		//정수와 정수 연산시에는 무조건 결과는 정수로 나온다.
		System.out.println(num1/num2);
		//실수와 실수 연산시에는 무조건 결과는 실수로 나온다. 
		//부동소수점 사용하므로 실수 연산시에는 오차가 발생할 수 있다. 
		System.out.println(num3/num4);
		//정수와 실수 연산시에는 무조건 결과는 실수로 나온다. 
		System.out.println(num1/num4);
		System.out.println(num3%num4);
		
		//문자열과 문자열 연산시 무조건 결과는 문자열로 나온다. 
		//문자열은 더하기 연산밖에 할 수 없음.
		
		//정수와 문자열 연산시 무조건 결과는 문자열로 나온다. 
		
		//산순연산은 일반적인 순서에 따름. 
		//괄호 > 곱하기/나누기 > 맨 왼쪽부터

		
		int num5 = 7;
		int num6 = 3;
		
		//더하기
		System.out.println("더한 결과 : " + (num5 + num6));
		//빼기
		System.out.println("빼기 결과 : " + (num5 - num6));
		//곱하기
		System.out.println("곱하기 결과: " + num5 * num6);
		//나누기
		System.out.println("나누기 결과 : " + ((double)num5 / num6));
		
	}

}
