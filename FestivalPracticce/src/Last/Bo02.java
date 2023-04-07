package Last;

public class Bo02 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("apple"));

	}

	public static String getMiddle(String data) {
		int mid = data.length() / 2;
		
		if(data.length() % 2 == 1) {
			return "" + data.charAt(mid);
		}else {
			return "" + data.charAt(mid - 1) + data.charAt(mid);
		}
	}
}
