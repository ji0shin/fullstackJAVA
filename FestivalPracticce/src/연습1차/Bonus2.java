package 연습1차;

public class Bonus2 {

	public static void main(String[] args) { // 4분 53초
		
		System.out.println(getMiddle("power"));

	}
	
	public static String getMiddle(String word) {
		
		String[] array = word.split("");
		
		int middle = array.length / 2;
		
		if(array.length % 2 == 1) {
			return array[middle] + "";
		}else {
			return array[middle-1] + array[middle] + "";
		}
	
	}

}
