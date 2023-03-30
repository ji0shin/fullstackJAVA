import java.util.Scanner;

public class Ex05while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();
			System.out.print("연산자(+/-) : ");
			String operator = sc.next();
			
			int result = 0;
			
			if(operator.equals("+")) {
				result = num1 + num2;
			}else if(operator.equals("-")) {
				result = num1 - num2;
			}

			System.out.printf("%d %s %d = %d\n", num1, operator, num2, result);
			
			System.out.print("계속하시겠습니까? (Y/N)");
			String yn = sc.next();
			
			if(yn.equals("N")) {
				System.out.println("종료");
				break;
			}else if(yn.equals("N")) {
				
			}
		}
		

	}

}
