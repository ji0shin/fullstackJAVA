package Last;

public class No13 {

	public static void main(String[] args) {
		
		String score = "A,A,C,C,D,A,C,F,D,D,F";
		String[] arr = score.split(",");
		int[] arrNum = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].equals("A")) {
				arrNum[0]++;
			}else if (arr[i].equals("B")){
				arrNum[1]++;
			}else if (arr[i].equals("C")) {
				arrNum[2]++;
			}else if (arr[i].equals("D")) {
				arrNum[3]++;
			}else {
				arrNum[4]++;
			}
		}
		
		System.out.println("A : " + arrNum[0]);
		System.out.println("B : " + arrNum[1]);
		System.out.println("C : " + arrNum[2]);
		System.out.println("D : " + arrNum[3]);
		System.out.println("F : " + arrNum[4]);

	}

}
