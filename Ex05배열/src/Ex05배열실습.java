import java.util.Scanner;

public class Ex05배열실습 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//1. 크기가 5인 정수형 데이터를 저장할 수 있는 배열 생성
		//   → 그 배열의 참조값(주소값)을 저장할 레퍼런스 변수까지 선언
		int[] score = new int[5];
		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			score[i] = sc.nextInt();
		}
		
		System.out.print("입력된 점수 : ");
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print(score[i] + " ");
		}
		
		// 확장 for문(for~each문)
		// : 배열, List 구조에서 쓰일 수 있는 반복문
		// for(배열의 0번 인덱스에 있는 값부터 임시로 저장할 변수:배열의 레퍼런스변수 이름)
		System.out.print("\n확장 for문 사용 : ");
		for(int a:score) {
			// a라는 이름의 변수를 만들고, score[i] 값을 할당
			System.out.print(a + " ");
		}
		
		int max = score[0]; // 내가 지금까지 본 점수 중 최고 점수
		int min = score[0]; // 내가 지금까지 본 점수 중 최저 점수
		int sum = 0; //누적합
		for(int a : score) {
			sum += a;
			if(a > max) { //최고점수
				max =  a;
			}
			if(a < min) {
				min = a;
			}
		}
		System.out.println("\n최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.printf("평균 : %.2f", sum/(double)score.length);
		
	}

}
