package Festival;

import java.util.Scanner;

public class Festival05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 개수 : ");
		int row = sc.nextInt();
		
		for(int j = 1 ; j <= row ; j++) {
			for(int i = 1 ; i <= j ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
