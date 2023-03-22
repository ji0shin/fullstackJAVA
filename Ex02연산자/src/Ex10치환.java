
public class Ex10치환 {

	public static void main(String[] args) {
		
		String left = "red";
		String right = "blue";
		
//		String temp = left;
//		left = right;
//		right = temp;
		
		String temp; //임시 저장 공간을 선언 (초기화를 안함)
		String temp1 = null; //작성해도 됨 (빈 값을 넣은 것)
		String temp2 = ""; // 문자열을 넣은 것
//		int temp2 = null; //사용 불가능. null은 레퍼런스 타입에서만 사용 가능
		temp = right; //left : red, temp : blue, right : blue
		right = left; //left : red, temp : blue, right : red
		left = temp; //left : blue, temp : blue, right : red
		
		System.out.println(left); //blue
		System.out.println(right); //red
		
	}
}
