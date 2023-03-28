
public class Ex01for문 {

	public static void main(String[] args) {
		
		//for문을 사용해서 21에서 57까지 출력
		for(int i = 21 ; i <= 57 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//for문을 사용하여 96에서 53까지 출력
		for(int i = 96 ; i >= 53 ; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//for문을 사용하여 21에서 57까지의 수 중 홀수만 출력
		//3-1 보폭
		for(int i = 21 ; i <= 57 ; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//3-2 판단(조건식)
		for(int i = 21 ; i <= 57 ; i++) {
			if(i % 2 != 0) {
				System.out.print(i + " ");	
			}
		}
	}
}
