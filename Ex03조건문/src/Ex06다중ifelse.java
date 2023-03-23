import java.util.Scanner;

public class Ex06다중ifelse {

	public static void main(String[] args) {
		
		//현재 카드 잔액과 탑승자가 성인/청소년/어린이 인지 입력한 후 
		//잔액이 충분한 경우에는 인사말을 출력하고
		//부족한 경우에는 "잔액이 부족합니다"를 출력
		//성인 - 감사합니다(1800원)
		//청년 - 반갑습니다(1500원)
		//어린이 - 안녕하세요(1000원)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("잔액 : ");
		int balance = sc.nextInt();
		System.out.print("성인/청소년/어린이 : ");
		String people = sc.next();
		
		//내가 푼거
		//프로그래밍은 중복되는 코드가 많은 걸 싫어한다. 
		//포괄적인 조건을 먼저 작성한 후 작은 조건 작성하기
		
		if(people.equals("성인") && balance >= 1800) {
			System.out.println("감사합니다");
		}else if(people.equals("청소년") && balance >= 1500) {
			System.out.println("반갑습니다");
		}else if(people.equals("어린이") && balance >= 1000) {
			System.out.println("안녕하세요");
		}else {
			System.out.println("잔액이 부족합니다");
		}
	}
}
