package Festival;

import java.util.Scanner;

public class Festival09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int numInput = sc.nextInt();
	     
		int roundUp = 0;
		if(numInput % 10 > 5) {
			roundUp = (numInput / 10 + 1) * 10;
		}else {
			roundUp = (numInput / 10) * 10;
		}
				
		System.out.print("반올림 수 : " + roundUp);

	}

}
