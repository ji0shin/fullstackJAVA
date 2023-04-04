package 연습1차;

import java.util.Scanner;

public class NO27 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("==== 채점하기 ====");
		String score = sc.next();
		
		String[] array = score.split("") ;
		
		int sum = 0;
		int accum = 1;
		
		for(int i = 0 ; i < array.length ; i++) {
			if(array[i].equals("X")) {
				accum = 1;
			}else {
				sum += accum;
				accum++;
			}
		}
		
		System.out.println(sum);
		
		

	}

}
