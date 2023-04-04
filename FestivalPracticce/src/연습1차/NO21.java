package 연습1차;

import java.util.Arrays;
import java.util.Random;

public class NO21 {

	public static void main(String[] args) { // 다시 풀기
		
		int[] point = {11, 2, 6, 5};
		int[] minPoint = new int[2];
		int minDistance = (point[0] - point[1]) * (point[0] - point[1]);
		
		for(int i = 0 ; i < point.length ; i++) {
			for(int j = i + 1; j < point.length ; j++) {
				if(minDistance > (point[i] - point[j])*(point[i] - point[j])) {
					minDistance = (point[i] - point[j])*(point[i] - point[j]);
					minPoint[0] = i;
					minPoint[1] = j;
				}
			}
		}
		
		System.out.println("result = " + Arrays.toString(minPoint));
		
		

	}

}
