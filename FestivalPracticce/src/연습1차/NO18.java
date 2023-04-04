package 연습1차;

import java.util.Random;

public class NO18 {

	public static void main(String[] args) { // 12분 2초 다시풀기
		
		Random rd = new Random();
		
		int[] lotto = new int[6];
		
		for(int i = 0 ; i < lotto.length ; i++) {
			lotto[i] = rd.nextInt(43) + 1;
		}
		
		for(int i = 0 ; i < lotto.length ; i++) {
			for(int j = i + 1 ; j < lotto.length ; j++) {
				if(lotto[i] == lotto[j]) {
					lotto[i] = rd.nextInt(43)+1;
				}
			}
			System.out.println("행운의숫자 : " + lotto[i]);
		}
	}

}
