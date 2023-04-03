import java.util.Scanner;

public class Ex04비정방형배열실습1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] score = new int[4][];
		score[0] = new int[3];
		score[1] = new int[5];
		score[2] = new int[4];
		score[3] = new int[6];
		
		int[] total = new int[4];
		int[] avg = new int[4];
		
		for(int j = 0 ; j < score.length ; j++) {
			System.out.println(j+1 + "반 점수 입력");
			for(int i = 0 ; i < score[j].length ; i++) {
				System.out.printf("%d반 %d번째 학생 점수 >> ", j+1, i+1);
				score[j][i] = sc.nextInt();
				total[j] += score[j][i];
			}
		}
		
		for(int j = 0 ; j < score.length ; j++) {
			System.out.print(j + 1 + "반 >> ");
			for(int i = 0 ; i < score[j].length ; i++) {
				System.out.print(score[j][i] + " ");
			}
			System.out.println("\n총점 : " + total[j] + " 평균 : " + (double)total[j]/score[j].length);
		}	
	}
}
