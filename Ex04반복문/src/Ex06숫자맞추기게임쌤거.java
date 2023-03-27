import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임쌤거 {

	public static void main(String[] args) {

		// 1. 기능들 가져오기
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		//Ctrl + Shift + o : 기능을 한꺼번에 import하는 단축키
		
		// 2. 출력문 ---> 1번만
		System.out.println("======1부터 100 사이 숫자 맞추기 게임======");
		
		// 랜덤한 숫자 한 개 --->  답
		int answer = rd.nextInt(100) + 1 ;
		
		// 반복이 되어지는 부분
		// 3. 출력문 : 입력
		
		while(true) {
			System.out.print("1부터 100사이의 정수를 입력하세요 >> ");
			int num = sc.nextInt();
			// 입력한 값이 랜덤 숫자와 일치하는지 판단
			if(answer == num) {
				System.out.println("정답입니다.");
				break;
			}else if(answer > num) {
				System.out.println("더 작은 수로 다시 시도해 보세요");
			}else {
				System.out.println("더 큰 수로 다시 시도해 보세요");
			}
		}
	}
}
