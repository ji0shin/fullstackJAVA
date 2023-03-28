package 이중for문;

public class Ex06별찍기 {

	public static void main(String[] args) {
		//    *
		//   **
		//  ***
		// ****
		//*****

		for(int k = 1 ; k <= 5 ; k++) {
			for(int i = 5-k ; i >= 0 ; i--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= k ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		//    *
//		for(int i = 4 ; i >= 0 ; i--) {
//			System.out.print(" ");
//		}
//		for(int j = 1 ; j <= 1 ; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//   **
//		for(int i = 3 ; i >= 0 ; i--) {
//			System.out.print(" ");
//		}
//		for(int j = 1 ; j <= 2 ; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//  ***
//		for(int i = 2 ; i >= 0 ; i--) {
//			System.out.print(" ");
//		}
//		for(int j = 1 ; j <= 3 ; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		// ****
//		for(int i = 1 ; i >= 0 ; i--) {
//			System.out.print(" ");
//		}
//		for(int j = 1 ; j <= 4 ; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//		
//		//*****
//		for(int i = 0 ; i >= 0 ; i--) {
//			System.out.print(" ");
//		}
//		for(int j = 1 ; j <= 5 ; j++) {
//			System.out.print("*");
//		}
//		System.out.println();


	}

}
