package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//자료형변환 : casting
		/* 자료형 (변수의 타입)
		 * a=b : a의 자료형과 b의 자료형이 맞지않는다면 오류
		 * 자료형 변환을 통해 양쪽의 자료형을 변환을 맞춰주는 역할
		 * 
		 * 자동 자료형 변환 : 생략해도 문제가 되지않는 상황
		 * 같은 형의 크기가 큰 자료형 = 같은 형의 크키가 작은 자료형
		 * 
		 * 명시적 자료형 변환 : 리터럴 값 앞에 (타입)을 적어서 변환함
		 */
		
		byte a = 10;
		int num = a; // 자동자료형변환
	
		double num1 = 10.1;
		num = (int)num1; // 명시적 자료형 변환, 해당 케이스는 소수점이 날아감
		System.out.println(num);
		
		double d = 1/(double)2;
		System.out.println(d);
	
	}

}
