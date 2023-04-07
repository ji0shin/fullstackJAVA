package Last;

public class No28 {

	public static void main(String[] args) {
		
		String str = "01011000";
		int deciNum = 0;
		int multi = 1;
		String[] binary = str.split("");
		
		for(int i = binary.length - 1 ; i >= 0 ; i--) {
			if(binary[i].equals("1")) {
				deciNum += 1 * multi;
			}
			multi *= 2;
		}
		
		System.out.println(str + "(2) = " + deciNum + "(10)");

	}

}
