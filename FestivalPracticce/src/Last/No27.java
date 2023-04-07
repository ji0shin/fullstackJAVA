package Last;

import java.util.Scanner;

public class No27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("==== 채점하기 ====");
		String s = sc.next();
		
		String[] sArr = s.split("");
		int score = 1;
		int total = 0;
		for(int i = 0; i < sArr.length ; i++) {
			if(sArr[i].equals("X")) {
				score = 1;
			}else {
				total += score++;
			}
		}
		
		System.out.println(total);
	}

}
