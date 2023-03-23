import java.util.Scanner;

public class Ex02if문 {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		//입력받은 값이 3의 배수이거나 5의 배수이면 "3 또는 5의 배수입니다" 출력
		System.out.print("숫자입력 : ");
		int inputNum = sc.nextInt();
		
		int num1 = 3;
		int num2 = 5;
		if(inputNum % num1 == 0 || inputNum % num2 == 0) {
			System.out.printf("%d 또는 %d의 배수입니다\n", num1, num2);
		}

		//평균이 80점 보다 높으면 "합격" 출력
		//평균이 80보다 낮거나 같으면 "불합격" 출력
		System.out.print("JAVA 점수 입력 : ");
		int javaScore = sc.nextInt();
		System.out.print("Python 점수 입력 : ");
		int phyScore = sc.nextInt();
		System.out.print("Android 점수 입력 : ");
		int andScore = sc.nextInt();
		
		double avg = (javaScore + phyScore + andScore) / 3.0;
				
		if(avg > 80) {  //정수형과 실수형 비교 가능. 정수를 실수로 변경 후 비교
			System.out.println("합격");
		}else { //위 경우에 해당하는 경우가 아닌 경우 실행
			System.out.println("불합격");
		}
		
		System.out.println("맨아랫줄");
	}

}
