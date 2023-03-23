import java.util.Scanner;

public class Ex03ifelse문 {

	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.print("총 금액 : ");
		int total = sc.nextInt();
		System.out.print("사람 명 수 : ");
		int n = sc.nextInt();
		
		if(total / n >= 10000) {
			System.out.println("10000원 이상 지불");
		}else {
			System.out.println("10000원 미만 지불");
		}
		
		//정보처리기사의 각 과목의 정답 개수를 입력받아 변수에 할당
		//한 과목이라도 8개 미만인 경우 "불합격입니다"를 출력
		//총 개수가 60개 이상이면 "합격입니다"를 출력
		System.out.print("소프트웨어 설계 : ");
		int score1 = sc.nextInt();
		System.out.print("소프트웨어 개발 : ");
		int score2 = sc.nextInt();
		System.out.print("데이터베이스 구축 : ");
		int score3 = sc.nextInt();
		System.out.print("프로그래밍 언어 활용 : ");
		int score4 = sc.nextInt();
		System.out.print("정보시스템 구축 관리 : ");
		int score5 = sc.nextInt();
		
		//합격 조건
		//1. 각 과목의 개수가 모두 8 이상
		//2. 과목의 총 합이 60 이상 → 두 조건 모두 해당
		
		int totalScore = score1 + score2 + score3 + score4 + score5;
		if ((score1 >= 8 && score2 >= 8 && score3 >= 8 && score4 >= 8 && score5 >= 8) && totalScore >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
			}
		
		if (score1 >= 8 && score2 >= 8 && score3 >= 8 && score4 >= 8 && score5 >= 8) {
			if (totalScore >= 60) {
			System.out.println("합격");
			} else {
				System.out.println("불합격"); 
				//중첩 if문에서 내부에 있는 if가 거짓이라고 해서 바깥 if문의 else로 넘어가지 않음.
				//따라서 안쪽에서 else문을 꼭 작성해야 함
				}
		} else {
			System.out.println("불합격");
			}
		
	}
		
}
