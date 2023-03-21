package 입출력;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		
		String name = "홍길동";
		name = sc.next();
		/*
		 * try { name = sc.next(); }catch(InputMismatchException e) {
		 * System.out.println("문자를 입력하세요!"); }
		 */
		
		
		System.out.print("나이 : ");
		
		int age = 0;
		try {
			age = sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("숫자를 입력하세요!");
			
		}
		
//		System.out.print("이름은 " + name + "이고 나이는 " + age + "입니다");
		System.out.printf("이름은 %s 이고 나이는 %d입니다", name, age);
		
		sc.close();
	}

}
