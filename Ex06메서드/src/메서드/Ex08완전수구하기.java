package 메서드;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		
		int num1 = 12;
		int num2 = 2;
		boolean divisor = isDivisor(num1, num2);
		// num2가 num1의 약수인지 아닌지?
		// num1이 num2의 배수인지 아닌지?
		// num2가 num1을 나누어 떨어지게 하는지?
		System.out.println(divisor);
		
		getDivisor(10);
		getDivisor(16);
		getDivisor(24);
		
		int num = 10;
		int result = getSumOfDivisors(num);
		
		System.out.println(num + "의 약수의 합 : " + result);
		
		// 완전수인지 아닌지 판단해주는 isPerfectNumber()
		// 완전수란? : 자기자신을 제외한 약수의 합이 자기 자신과 같은 수 
		// ex. 6 (1, 2, 3, 6) 28(1, 2, 4, 7, 14, 28)
		// 결과값은 true, false
		int num3 = 28;
		boolean result2 = isPerfectNumber(num3);
		System.out.println(result2);
		

	}
	
	//1. isDivisor() : 매개변수 int 2개, 리턴타입 boolean
	public static boolean isDivisor(int num1, int num2) {
		// num2가 num1을 나누어 떨어지게 하는지 판단
		if(num1 % num2 == 0) {
			return true;
		}else {
			return false;
		}
		// is라는 키워드가 붙은 메서드는 결과값(리턴타입)이 boolean
	}
	
	//2. getDivisor() : 출력하는 기능을 가지고 있다(void), 매개변수 int 1개
	public static void getDivisor(int num1) {
		
		System.out.print(num1 + "의 약수 : ");
		for(int num2 = 1 ; num2 <= num1 ; num2++) {
			if(isDivisor(num1, num2)) {
//			if(num1 % num2 == 0) { 
				System.out.print(num2 + " ");
			}
		}
		System.out.println();
	}

	//3. getSumOfDivisors() : 매개변수 int 1개, 리턴타입 int
	public static int getSumOfDivisors(int num) {
		int sum = 0; // 약수들의 합이 들어갈 공간
		for(int i = 1 ; i <= num/2 ; i++) { // 시간복잡도 줄이기
			if(isDivisor(num, i)) {
				sum += i;
			}
		}
		return sum + num;
	}

	//4. isPerfectNumber()
	public static boolean isPerfectNumber(int num) {
		if(getSumOfDivisors(num) - num == num) {
			return true;
		}else {
			return false;
		}
	}
	
}
