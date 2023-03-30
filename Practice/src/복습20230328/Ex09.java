package 복습20230328;

public class Ex09 {

	public static void main(String[] args) {
		
		for(int n = 1 ; n <= 5 ; n++) {
			for(int i = 5-n ; i >= 0 ; i--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= n ; j++) {
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
		
		String a = 10 + 7 + "" + 8 + 2;
		String b = 8 + "" + 2 + (6+4);
		String c = "" + 5 + (5 + "3") + 2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
