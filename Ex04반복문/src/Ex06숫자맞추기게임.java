import java.util.Random;
import java.util.Scanner;

public class Ex06숫자맞추기게임 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======1부터 100 사이 숫자 맞추기 게임!======");
		int number = rd.nextInt(100) + 1;
		
		while(true) {
			System.out.print("1과 100사이의 정수를 입력하세요 >>");
			int answer = sc.nextInt();
			
			if(answer == number) {
				System.out.println(number + " 정답입니다!!!");
				break;
			}else if(answer < number) {
				System.out.println("더 큰 수로 다시 시도 해보세요");
			}else {
				System.out.println("더 작은 수로 다시 시도 해보세요");
			}
		}

	}

}
