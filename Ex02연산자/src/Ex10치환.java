
public class Ex10치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		
		String temp = left;
		left = right;
		right = temp;
		
		System.out.println(left); //blue
		System.out.println(right); //red
	

	}

}
