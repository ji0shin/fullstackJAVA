package practiceJava;

public class Practice0323_5 {

	public static void main(String[] args) {
		// 다음 코드의 실행 결과는 ? 아무것도 출력되지 않는다. 
		
		int i = 4;
		if (i % 2 == 0) 
			if (i % 3 == 0) {
				System.out.println("6의 배수");
			}
		else {
			System.out.println("홀수");
		}
		
		//위의 코드를 올바르게 수정
		//i가 6의 배수인 경우 "6의 배수", i가 홀수인 경우 "홀수" 출력, 그 외에는 아무것도 출력되지 않게
		
//		int j = 12;
//		if (j % 2 == 0) {
//			if (j % 3 == 0) {
//				System.out.println("6의 배수");
//			}
//		}else {
//			System.out.println("홀수");
//		}
		
	}
	
}
