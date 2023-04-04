
public class test {

	public static void main(String[] args) {
		int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) { // 짝수인 경우 음수로 바꿔줍니다.
                sum -= i;
            } else { // 홀수인 경우 양수로 더해줍니다.
                sum += i;
            } 

        }System.out.println("1 -2 3 -4 5 -6 7 -8 9 -10... " );
        System.out.println("결과 : " + sum);

	}

}
