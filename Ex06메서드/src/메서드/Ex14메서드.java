package 메서드;

public class Ex14메서드 {

	public static void main(String[] args) {
		
		System.out.println(getMiddle("power"));
		System.out.println(getMiddle("test"));
		System.out.println(getMiddle2("power"));
		System.out.println(getMiddle2("test"));
	
	}
	//words.length() 사용
	public static String getMiddle(String words) {
		
		int numberOfWords = words.length();
		int middle = numberOfWords / 2;
		
		if(numberOfWords % 2 == 1) {
			return "" + words.charAt(middle);
			//"" + int/char : 뒤에 있는 데이터 타입이 자동으로 String 형변환
					// String.valueOf(words.charAt(middle));
		}else {
			return "" + words.charAt(middle - 1) + words.charAt(middle);
			// string은 char의 배열 형태로 인덱스 0부터 시작
					//String.valueOf(words.charAt(middle - 1)) + String.valueOf(words.charAt(middle));
		}
	}
	
	// 배열 사용
	public static String getMiddle2(String words) {
		String[] wordsArray = words.split("");
		
		int middle2 = wordsArray.length / 2;
		
		if(wordsArray.length % 2 == 0) {
			return wordsArray[middle2 - 1] + wordsArray[middle2];
		}else {
			return wordsArray[middle2];
		}
	}
}
