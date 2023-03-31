import java.util.Scanner;

public class Ex07배열실습1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] answer = {1, 4, 3, 2, 1}; //실제답
		int[] input = new int[5]; //사용자가 입력한 답 저장
		
		// 하나의 for문으로 작성하기
		int score = 0;
		String check = "";
		for(int i = 0 ; i < input.length ; i++) {
			input[i] = sc.nextInt();
			
			if(answer[i] == input[i]) { //같을경우
				check += "O " ;
				score += 20;
			}else { //다를경우
				check += "X ";
			}
		}
		
		System.out.println(check);		
		System.out.println("총 점 : " + score);
	}

}
