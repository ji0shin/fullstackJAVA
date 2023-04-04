package 연습3차;

import java.util.Random;

public class No18 {

	public static void main(String[] args) {
	
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i = 0 ; i < 6 ; i++) {
			lotto[i] = rd.nextInt(45)+1;
			
			for(int j = 0 ; j <= i - 1 ; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.println("행운의숫자 : " + lotto[i]);
		}

	}

}
