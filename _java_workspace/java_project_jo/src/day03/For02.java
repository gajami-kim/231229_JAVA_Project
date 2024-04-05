package day03;

public class For02 {

	public static void main(String[] args) {
		/* 1~10까지 출력
		 */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//if 써서 1부터 10까지 짝수만 출력
		for(int i=1; i<=10; i++) {
			if(i%2==0)
			System.out.print(i+" ");
		}
		System.out.println();
		
		//1부터 10까지 합계를 구하기
		int j=0;  // 지역변수는 반드시 초기화 해야함 / 초기화 기본값 숫자=0, 문자=null
		for(int i=1; i<=10; i++) {
			j = j+i; // j+=i;
		}
		System.out.print(j);
		System.out.println();
		
		//1부터 10까지의 짝수합과 홀수합을 출력
		int a=0;
		int b=0;
		for(int i=1; i<=10; i++) {
			if(i%2==0) {
				a = a+i;
			} else {
				b = b+i;
			}
		}
		System.out.println("짝수 합: "+a);
		System.out.println("홀수 합: "+b);
		
		
	}
}
