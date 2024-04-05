package day08;

public class Method07 {

	public static void main(String[] args) {
		/* 메서드를 이용해 로또번호를 생성, 리턴하여 출력
		 */
		
		int lotto[] = new int[7]; // 당첨번호
		int user[] = new int[6]; // 사용자 번호
		System.out.print("선택된 로또 번호 > ");
		printArray(random(user));
		System.out.println();
		System.out.print("당첨 로또 번호 > ");
		printArray(random(lotto));
	}
	
	/* 배열을 매개변수로 받아 1~45까지 랜덤수를 채워서(같은 수 없이) 생성 return x
	 */
	public static int[] random(int lotto[]) {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					j--;
					break; //아직 중복값 생김
				}
			}
		}
		return lotto;
	}

	
	/* 배열을 매개변수로 받아 배열을 출력하는 메서드
	 */
	public static void printArray(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
		
	
	/* 중복확인메서드
	 * 매개변수 : 배열, 값
	 * 값이 배열안에 있으면 true, 없으면 false 리턴
	 */
	//렌덤값을 넣으면서 차례대로 전에 뽑힌 숫자와 중복인지 판단하는 방법
	
	
	
	
	
}
