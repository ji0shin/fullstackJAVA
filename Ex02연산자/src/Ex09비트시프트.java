
public class Ex09비트시프트 {

	public static void main(String[] args) {
		
		//비트연산자, 시프트연산자 -> 연산을 빠르게 하고 싶을 때 사용 (은행) : 이진수를 기반으로 연산
		
		int a = 9; // 우리가 일반적으로 쓰는 숫자는 10진수 -> 컴퓨터가 바로 이해할 수 없음 (컴퓨터는 이진수) -> 따라서 이진수로 변환해야함
		
		//비트연산 : &(and)  |(or)  ^(xor)  ~(not)
		int b = 9;   //1001(2)
		int c = 11;  //1011(2)
		
		//같은 자리수가 하나라도 0이면 false(0)
		System.out.println(b&c);
		
		//같은 자리수가 하나라도 1이면 true(1)
		System.out.println(b|c);
		
		//같은 자리수가 같으면 false(0) 다르면 true(1)
		System.out.println(b^c);
		
		int d = 6; //0110
		System.out.println(~d);
		
		//시프트연산 : 비트를 옮겨주는 연산
		//<<(비트가 왼쪽으로 옮겨짐),  >>(비트가 오른쪽으로 옮겨짐)
		System.out.println(3<<2);
		//3 -> 11(2) 비트를 왼쪽으로 2칸씩 움직인다 -> 1100(2)
	}

}
