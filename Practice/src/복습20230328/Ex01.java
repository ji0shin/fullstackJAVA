package 복습20230328;

public class Ex01 {

	public static void main(String[] args) {
		
		for(int i = 21 ; i <= 57 ; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 96 ; i >= 53 ; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 21 ; i <= 57 ; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}

	}

}
