package Festival;

import java.util.Scanner;

public class Festival07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("행 개수 : ");
		int row = sc.nextInt();
		
		for(int j = row ; j >= 1 ; j--) {
			for(int i = j ; i>=1 ; i--) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
