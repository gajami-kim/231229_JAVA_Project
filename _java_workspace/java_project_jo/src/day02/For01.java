package day02;

public class For01 {

	public static void main(String[] args) {
		/* 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 * for, while, do~while
		 * 	 - for, while 동작방식이 같음
		 * 		=> 조건식이 맞지않으면 한번도 실행되지 않을 수 있음 / 조건검사 -> 실행
		 * 	 - do~while
		 * 		 => 조건에 맞지 않아도 한번은 무조건 실행 / 실행 -> 조건검사
		 * 
		 * for(1초기화; 2,5,8조건식; 4,7증감식) {
		 *   3,6실행문;
		 *  }
		 *  - 초기화 : 조건식이나 실행문에서 사용할 변수를 초기화 / 생략가능 / 여러변수 초기화 가능(보통은 하나) / 처음 1번만 실행
		 *  - 조건식 : 반복문의 반복을 결정하는 식 (true, false형태) true만 반복 / 생략가능
		 *  - 증감식 : 조건식에서 사용할 변수를 증가시키거나 감소시켜 반복횟수를 조절 / 생략가능
		 */
		
		//1부터 10까지 출력
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		// 현 상태의 i의 값은 11
		System.out.println();//줄바꿈
		
		//10부터 1까지 출력
		for(int i=10; i>=1; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		//2부터 10까지 짝수만 출력
		//me
		for(int i=1; i<=10; i++) {
			if(i%2==0)
			System.out.print(i+" ");
		}
		
		System.out.println();
		//ssam 다양한 예시
		for (int i=2; i<=10; i+=2)/*i+=2 => i=i+2*/ {
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i=1; i<=5; i++) {
			System.out.print((i*2)+" ");
		}
		System.out.println();
		int num = 0;
		for (int i=1; i<=5; i++) {
			num = num+2;
			System.out.print(num+" ");
		}
		System.out.println();
		for (int i=1; i<=10; i++) {
			System.out.print((i%2==0)? i+" ":"");
		}
		System.out.println();
		
		//1부터 10까지의 합계를 출력
		int j=0;
		for (int i=1; i<=10; i++) {
			j = j+i; 
		}
		System.out.print(j);
	}

}
