import java.util.Random;
import java.util.Scanner;

public class Ex06while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		int success = 0;
		int fail = 0;
		
		while(true) {
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
					
			System.out.print(num1 + " + " + num2 + " = " );
			int answer = sc.nextInt();
			
			if(answer == num1 + num2) {
				System.out.println("Success!");
				success++;
			}else {
				System.out.println("Fail!");
				fail++;
			}
			
			System.out.print("계속하시겠습니까? ");
			String yn = sc.next();
			
			if(yn.equals("N")) {
				break;
			}
		}
		System.out.println("종료!");
		System.out.println("맞춘개수 : " + success);
		System.out.println("틀린개수 : " + fail);
	}

}
