package 연습3차;

import java.util.Arrays;

public class No28 {

	public static void main(String[] args) {
		
		String str = "01001101";
		
		String[] binary = new String[str.length()];
		
		binary = str.split("");
		int deci = 0;
		int multi = 1;
		
		for(int i = binary.length - 1 ; i >= 0 ; i--) {
			if(binary[i].equals("1")) {
				deci += multi;
				
			}
			multi *= 2;
		}
		
		System.out.println(str + "(2) = " + deci + "(10)");

	}

}
