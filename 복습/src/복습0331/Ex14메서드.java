package 복습0331;

public class Ex14메서드 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));

	}
	
	public static String getMiddle(String data) {
		int middle = data.length() / 2; 
		if(data.length() % 2 == 1) {
			return "" + data.charAt(middle);
		}else {
			return "" + data.charAt(middle - 1) + data.charAt(middle);
		}
	}

}
