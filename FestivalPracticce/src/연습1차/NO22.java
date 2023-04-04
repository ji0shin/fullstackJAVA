package 연습1차;

public class NO22 { // 6분 5초

	public static void main(String[] args) {
		
		//    *
		for(int j = 1 ; j <= 5 ; j++) {
			for(int i = 1 ; i <= 5-j ; i++) {
				System.out.print(" ");
			}
			for(int i = 1 ; i <= j ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
