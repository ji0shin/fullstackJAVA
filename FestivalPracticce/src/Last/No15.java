package Last;

import java.util.Scanner;

public class No15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		int seq = 1;
		for(int i = 0; i < num ; i++) {
			seq += i;
			System.out.print(seq + " ");
		}

	}

}
