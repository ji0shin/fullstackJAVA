package Last;

import java.util.Random;

public class No18 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int[] lotto = new int[6];
		
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = rd.nextInt(45)+1;
			
			for(int j = 0 ; j < i ; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
		
		for(int j = 0 ; j < lotto.length ; j++) {
			System.out.println("행운의 숫자 : " + lotto[j]);
		}

	}

}
