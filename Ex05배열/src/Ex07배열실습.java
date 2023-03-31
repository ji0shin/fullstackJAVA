import java.util.Arrays;
import java.util.Scanner;

public class Ex07배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] correct = {1, 4, 3, 2, 1};
		int[] inputCorrect = new int[correct.length];
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i = 0 ; i < correct.length ; i++) {
			System.out.print(i + 1 + "번답 >>");
			int input = sc.nextInt();
			inputCorrect[i] = input;
		}
		
		System.out.println("정답확인");
		
		int score = 0;
		
		for(int i = 0 ; i < correct.length ; i++) {
			if(inputCorrect[i] == correct[i]) {
			System.out.print("O ");	
			score += 20;
			}else {
				System.out.print("X ");
			}
		}
		System.out.println("총 점 : " + score);

		
		

	}

}
