package 복습0331;

import java.util.Scanner;

public class 배열실습6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] correct = {1,4,3,2,1};
		int[] input = new int[5];
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		for(int i = 0 ; i < correct.length ; i++) {
			System.out.print(i + 1 + "번답 >> ");
			int inputCorrect = sc.nextInt();
			input[i] = inputCorrect;
		}
		
		System.out.println("정답확인");
		
		int score = 0;
		
		for(int i = 0 ; i < correct.length ; i++) {
			if(input[i] == correct[i]) {
				System.out.print("O ");
				score += 20;
			}else {
				System.out.print("X ");
			}
		}
		
		System.out.println("총 점 : " + score);
	}

}
