package Festival;

import java.util.Scanner;

public class Festival11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("n 입력 : ");
		int nInput = sc.nextInt();
		int sequence = 1;
		
		for(int i = 0 ; i < nInput ; i++) {
			sequence += i;
			System.out.print(sequence + " ");
		}

//		1 = 
//		2 = 1+1
//		4 = 2+2
//		7 = 4+3
//		N(n) = N(n-1)+n
	}

}
