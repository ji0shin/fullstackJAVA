import java.util.Scanner;

public class Ex08삼항연산 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//프로그램에서 바뀔 수 있는 값이 있으면 변수를 사용하는 것이 효율적임
		int hourlyWage = 9000;
		
		System.out.print("노동시간을 입력하세요 : ");
		int workoutTime = sc.nextInt();
		
		int overtime = workoutTime - 8;
		
		double wage = (workoutTime > 8) ? (hourlyWage * 8) + (hourlyWage * 1.5 * overtime) : hourlyWage * workoutTime ;
		// 실수에서 정수 형변환은 절대 자동 형변화 해주지 않음. 같은 크기더라도 실수의 표현 범위가 더 넓기 때문에
		System.out.println("총 임금은 " + (int)wage + "원 입니다");
		System.out.printf("총 임금은 %.0f원 입니다", wage); //소수점 0번까지 출력할 때
	}

}

// ctrl + shift + f : 들여쓰기 자동정렬